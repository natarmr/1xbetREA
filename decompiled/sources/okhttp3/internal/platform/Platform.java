package okhttp3.internal.platform;

import a.c99;
import a.f99;
import a.hny;
import a.qg9;
import a.r3d;
import a.twn;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.ListeningPoint;
import android.javax.sip.message.Request;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Platform f46208a;
    public static final Logger b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "platform", "Lokhttp3/internal/platform/Platform;", "", Request.INFO, TokenNames.I, "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ArrayList a(List list) {
            ArrayList arrayListU = twn.u(list);
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayListU.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
            Iterator it = arrayListU.iterator();
            while (it.hasNext()) {
                arrayList.add(((Protocol) it.next()).f46107a);
            }
            return arrayList;
        }

        public static byte[] b(List list) {
            list.getClass();
            f99 f99Var = new f99();
            for (String str : a(list)) {
                f99Var.V(str.length());
                f99Var.c0(str);
            }
            return f99Var.N(f99Var.b);
        }
    }

    static {
        try {
            for (Map.Entry entry : AndroidLog.b.entrySet()) {
                AndroidLog.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        Platform android10Platform = Android10Platform.e ? new Android10Platform() : null;
        if (android10Platform == null) {
            android10Platform = AndroidPlatform.e ? new AndroidPlatform() : null;
        }
        if (android10Platform == null) {
            hny.s(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            f46208a = android10Platform;
            b = Logger.getLogger(OkHttpClient.class.getName());
        }
    }

    public static X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        trustManagers.getClass();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        string.getClass();
        c99.v("Unexpected default trust managers: ".concat(string));
        return null;
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        list.getClass();
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public EchRetryPlan g(SSLException sSLException) {
        return null;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public Object i() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean j(String str) {
        str.getClass();
        return true;
    }

    public void k(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void l(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(5, str, (Throwable) obj);
    }

    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance(ListeningPoint.TLS);
        sSLContext.getClass();
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
