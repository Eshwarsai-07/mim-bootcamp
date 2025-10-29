import com.sun.net.httpserver.*;
import javax.net.ssl.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.security.KeyStore;

public class SimpleHttpsServer {
  public static void main(String[] args) throws Exception {
    int port = 9443;
    char[] passphrase = "changeit".toCharArray();

    KeyStore ks = KeyStore.getInstance("JKS");
    ks.load(new FileInputStream("keystore.jks"), passphrase);

    KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
    kmf.init(ks, passphrase);

    SSLContext sc = SSLContext.getInstance("TLS");
    sc.init(kmf.getKeyManagers(), null, null);

    HttpsServer server = HttpsServer.create(new InetSocketAddress(port), 0);
    server.setHttpsConfigurator(new HttpsConfigurator(sc));
    server.createContext("/", exchange -> {
      String response = "Hello from Java HTTPS Server!";
      exchange.sendResponseHeaders(200, response.length());
      exchange.getResponseBody().write(response.getBytes());
      exchange.close();
    });
    server.start();

    System.out.println("Server running at https://localhost:" + port);
  }
}

