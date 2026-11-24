package okhttp3.tls.internal;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/InsecureAndroidTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InsecureAndroidTrustManager implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f46241a;
    public final List b;

    public InsecureAndroidTrustManager(X509TrustManager x509TrustManager, List list) {
        this.f46241a = x509TrustManager;
        this.b = list;
        try {
            x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x509CertificateArr.getClass();
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
        X509Certificate[] acceptedIssuers = this.f46241a.getAcceptedIssuers();
        acceptedIssuers.getClass();
        return acceptedIssuers;
    }
}
