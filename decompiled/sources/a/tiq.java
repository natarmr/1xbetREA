package a;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class tiq extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0o0 f34017a = maz.b(new v9q(16));

    public static Certificate a(SslCertificate sslCertificate, Context context) {
        Object next;
        List list = (List) f34017a.getValue();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(((Number) it.next()).intValue())));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            Certificate certificate = (Certificate) next;
            certificate.getClass();
            if (Intrinsics.d(new SslCertificate((X509Certificate) certificate).getIssuedTo().getCName(), sslCertificate.getIssuedBy().getCName())) {
                return (Certificate) next;
            }
        }
        next = null;
        return (Certificate) next;
    }

    public static boolean b(SslCertificate sslCertificate, Context context) {
        Object g0g0Var;
        boolean z;
        sslCertificate.getClass();
        context.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            Certificate certificateA = a(sslCertificate, context);
            if (certificateA != null) {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArray != null ? new ByteArrayInputStream(byteArray) : null);
                certificateGenerateCertificate.getClass();
                X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
                if (Intrinsics.d(certificateA.getType(), "X.509")) {
                    ((X509Certificate) certificateA).checkValidity();
                }
                x509Certificate.verify(certificateA.getPublicKey());
                z = true;
            } else {
                z = false;
            }
            g0g0Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = Boolean.FALSE;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        return ((Boolean) g0g0Var).booleanValue();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        boolean zB;
        Context context;
        if (sslError == null || sslError.getPrimaryError() != 3 || webView == null || (context = webView.getContext()) == null) {
            zB = false;
        } else {
            SslCertificate certificate = sslError.getCertificate();
            certificate.getClass();
            zB = b(certificate, context);
        }
        if (!zB) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }
}
