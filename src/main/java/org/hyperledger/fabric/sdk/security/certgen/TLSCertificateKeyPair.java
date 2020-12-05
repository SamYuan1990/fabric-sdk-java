package org.hyperledger.fabric.sdk.security.certgen;

public interface TLSCertificateKeyPair {
    /***
     * @return the certificate, in PEM encoding
     */
    byte[] getCertPEMBytes();

    /***
     * @return the certificate, in DER encoding
     */
    byte[] getCertDERBytes();

    /***
     * @return the key, in PEM encoding
     */
    byte[] getKeyPemBytes();
}
