package org.hyperledger.fabric.sdk.security.certgen;

public interface TLSCertificateFactory {
    /***
     * Creates a TLS client certificate key pair
     * @return a TLSCertificateKeyPair
     */
    TLSCertificateKeyPair clientCert();

    /***
     * Creates a TLS server certificate key pair with the given DNS subject alternative name
     * @param subjectAlternativeName the DNS SAN to be encoded in the certificate
     * @return a TLSCertificateKeyPair
     */
    TLSCertificateKeyPair serverCert(String subjectAlternativeName);
}
