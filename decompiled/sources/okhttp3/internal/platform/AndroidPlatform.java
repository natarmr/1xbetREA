package okhttp3.internal.platform;

import a.csj;
import a.qg9;
import a.tx3;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Lokhttp3/internal/platform/ContextAwarePlatform;", "CustomTrustRootIndex", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidPlatform extends Platform implements ContextAwarePlatform {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f46207a;
        public final Method b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f46207a = x509TrustManager;
            this.b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object objInvoke = this.b.invoke(this.f46207a, x509Certificate);
                objInvoke.getClass();
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return this.f46207a.equals(customTrustRootIndex.f46207a) && this.b.equals(customTrustRootIndex.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46207a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f46207a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public AndroidPlatform() {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = AndroidLog.f46210a;
            AndroidLog.a(5, OkHttpClient.class.getName(), "unable to load android socket classes", e2);
            standardAndroidSocketAdapter = null;
        }
        List listZ = tx3.z(new SocketAdapter[]{standardAndroidSocketAdapter, new DeferredSocketAdapter(AndroidSocketAdapter.e), new DeferredSocketAdapter(ConscryptSocketAdapter.f46214a), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f46213a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listZ) {
            if (((SocketAdapter) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getC() {
        return this.c;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final void b(Context context) {
        this.c = context;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex d(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        Object next;
        list.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).a(sSLSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.c(sSLSocket, str, list, qg9Var);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            csj.c("Exception in connect", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String h(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).a(sSLSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.d(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean j(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void k(int i, String str, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext m() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.m();
    }
}
