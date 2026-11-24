package a;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class asm0 implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            ibm0.j("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            q5w0.a(x509Certificate, str);
            return true;
        } catch (SSLException e) {
            ibm0.g("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
