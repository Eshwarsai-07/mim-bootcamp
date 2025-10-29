# 🧩 Bootcamp Progress Checklist ✅

## Section 1–3: PKI & Certificate Operations

- ✅ Installed OpenSSL, Node.js, Java JDK  
- ✅ Generated private and public keys  
- ✅ Created CSR and self-signed certificate  
- ✅ Set up Root CA and issued server certificate  
- ✅ Exported PKCS#12 (.pfx) bundle  
- ✅ Revoked certificate and generated CRL  
- ✅ Organized repository with logs and documentation  

---

## Section 4: OpenSSL – File & Data Signing

- ✅ Created a plaintext file for signing and encryption  
- ✅ Digitally signed file using private key (`openssl dgst -sha256 -sign`)  
- ✅ Verified signature using public key (`openssl dgst -sha256 -verify`)  
- ✅ Encrypted file using AES-256-CBC symmetric encryption  
- ✅ Decrypted file back to original plaintext  
- ✅ Generated timestamp request (`openssl ts -query -data`)  
- ✅ Organized outputs inside `scripts/file_signing_lab/`  
- ✅ Logged all OpenSSL commands to `openssl_commands.log`  
- ✅ Committed and pushed updates to GitHub  

---

## Section 5: jarsigner – Java Artifact Signing

- ✅ Downloaded sample JAR (`json-20240303.jar`)  
- ✅ Created Java keystore and RSA keypair using `keytool`  
- ✅ Signed JAR file with `jarsigner`  
- ✅ Verified signature and certificate details with  
  ```bash
  jarsigner -verify -verbose -certs myapp.jar

---

## Section 6: SSH Key & Local CA Simulation

- ✅ Generated SSH key pair using: ssh-keygen -t rsa -b 4096
- ✅ Added SSH public key to GitHub account
- ✅ Tested SSH connection: ssh -T git@github.com
- ✅ Configured Git to use SSH instead of HTTPS
- ✅ Created Local Root CA using OpenSSL (rootCA.key and rootCA.crt)
- ✅ Issued a subordinate (server) certificate signed by the Root CA
- ✅ Verified certificate chain and validity
- ✅ Stored all CA and SSH artifacts inside scripts/ca_lab/
- ✅ Committed and pushed updates to GitHub

---

## Section 7: HTTPS Lab – Local Testing

- ✅ Generated key.pem and cert.pem using OpenSSL:
   openssl req -x509 -newkey rsa:2048 -keyout key.pem -out cert.pem -days 365 -nodes -subj \"/CN=localhost\"
- ✅ Tested HTTPS server via OpenSSL:
   openssl s_server -key key.pem -cert cert.pem -port 8443 -WWW
- ✅ Verified SSL handshake with:
   openssl s_client -connect localhost:8443
- ✅ Accessed https://localhost:8443 in browser (accepted “Not Secure” warning)
- ✅ Verified HTTPS connection successfully established
- ✅  Imported cert.pem into trusted root certificate store
- ✅ Committed and pushed HTTPS lab results to GitHub
