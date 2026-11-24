package okhttp3.tls.internal;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/InsecureExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InsecureExtendedTrustManager extends X509ExtendedTrustManager {
    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        x509CertificateArr.getClass();
        str.getClass();
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x509CertificateArr.getClass();
        str.getClass();
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x509CertificateArr.getClass();
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        x509CertificateArr.getClass();
        str.getClass();
        socket.getClass();
        throw null;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        x509CertificateArr.getClass();
        str.getClass();
        sSLEngine.getClass();
        throw null;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        x509CertificateArr.getClass();
        str.getClass();
        throw new CertificateException("Unsupported operation");
    }
}
