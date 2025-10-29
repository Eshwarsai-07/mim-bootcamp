import https from "https";
import fs from "fs";

const options = {
  key: fs.readFileSync("server.key"),
  cert: fs.readFileSync("server.crt"),
};

https
  .createServer(options, (req, res) => {
    res.writeHead(200);
    res.end("Hello from secure HTTPS server!");
  })
  .listen(8443, () => console.log("Server running at https://localhost:8443"));

