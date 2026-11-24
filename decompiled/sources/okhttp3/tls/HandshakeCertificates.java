package okhttp3.tls;

import a.c99;
import a.qx3;
import a.twn;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.internal.InsecureAndroidTrustManager;
import okhttp3.tls.internal.TlsUtil;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/tls/HandshakeCertificates;", "", "Builder", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HandshakeCertificates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509KeyManager f46237a;
    public final X509TrustManager b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/HandshakeCertificates$Builder;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HeldCertificate f46238a;
        public X509Certificate[] b;
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public final HandshakeCertificates a() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
            List listJ = _UtilJvmKt.j(this.d);
            HeldCertificate heldCertificate = this.f46238a;
            if (heldCertificate != null && heldCertificate.f46239a.getPrivate().getFormat() == null) {
                throw new KeyStoreException("unable to support unencodable private key");
            }
            X509Certificate[] x509CertificateArr = this.b;
            if (x509CertificateArr == null) {
                x509CertificateArr = new X509Certificate[0];
            }
            X509Certificate[] x509CertificateArr2 = (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length);
            char[] cArr = TlsUtil.f46242a;
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, cArr);
            if (heldCertificate != null) {
                Certificate[] certificateArr = new Certificate[x509CertificateArr2.length + 1];
                certificateArr[0] = heldCertificate.b;
                qx3.i(0, 0, 12, x509CertificateArr2, certificateArr);
                keyStore.setKeyEntry("private", heldCertificate.f46239a.getPrivate(), cArr, certificateArr);
            }
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(Intrinsics.d(keyStore.getProvider().getName(), "BC") ? "PKIX" : KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, cArr);
            KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
            keyManagers.getClass();
            if (keyManagers.length == 1) {
                KeyManager keyManager = keyManagers[0];
                if (keyManager instanceof X509KeyManager) {
                    X509KeyManager x509KeyManager = (X509KeyManager) keyManager;
                    ArrayList arrayList = this.c;
                    listJ.getClass();
                    KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore2.load(null, cArr);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        keyStore2.setCertificateEntry(twn.m(i, "cert_"), (Certificate) arrayList.get(i));
                    }
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init(keyStore2);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    trustManagers.getClass();
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager insecureAndroidTrustManager = (X509TrustManager) trustManager;
                            if (!listJ.isEmpty()) {
                                Platform platform = Platform.f46208a;
                                insecureAndroidTrustManager = new InsecureAndroidTrustManager(insecureAndroidTrustManager, listJ);
                            }
                            return new HandshakeCertificates(x509KeyManager, insecureAndroidTrustManager);
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    string.getClass();
                    c99.v("Unexpected trust managers: ".concat(string));
                    return null;
                }
            }
            String string2 = Arrays.toString(keyManagers);
            string2.getClass();
            c99.v("Unexpected key managers:".concat(string2));
            return null;
        }
    }

    public HandshakeCertificates(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager) {
        this.f46237a = x509KeyManager;
        this.b = x509TrustManager;
    }
}
