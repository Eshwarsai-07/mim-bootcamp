# Bootcamp Progress Checklist ✅

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
- ✅ Verified signature and certificate details with `jarsigner -verify -verbose -certs`  
- ✅ Exported signer certificate to `mycert.cer`  
- ✅ (Optional) Applied timestamp authority (`-tsa http://timestamp.digicert.com`)  
- ✅ Organized outputs inside `scripts/jarsigner_lab/`  
- ✅ Created command log (`jarsigner_commands.log`) and verification report  
- ✅ Committed and pushed updates to GitHub  

---

## Next Steps
- 🔄 Section 6: SSH Key & Local CA Simulation  
- 🌐 Section 7: HTTPS Lab – Local Testing  
- 🧠 Complete quiz and add answers to `quiz.md`

