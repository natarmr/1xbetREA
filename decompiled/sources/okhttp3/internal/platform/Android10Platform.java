package okhttp3.internal.platform;

import a.a7;
import a.aw2;
import a.gl5;
import a.qg9;
import a.tx3;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.net.ssl.EchConfigList;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.text.Regex;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.Android17SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "Lokhttp3/internal/platform/ContextAwarePlatform;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Android10Platform extends Platform implements ContextAwarePlatform {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        int i = Build.VERSION.SDK_INT;
        List listZ = tx3.z(new SocketAdapter[]{i >= 37 ? new Android17SocketAdapter() : null, i >= 29 ? new Android10SocketAdapter() : null, new DeferredSocketAdapter(AndroidSocketAdapter.e), new DeferredSocketAdapter(ConscryptSocketAdapter.f46214a), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f46213a)});
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
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
    public final EchRetryPlan g(SSLException sSLException) throws EOFException {
        String publicHostname;
        qg9 qg9VarM;
        byte[] bytes;
        if (Build.VERSION.SDK_INT >= 37 && aw2.h(sSLException) && (publicHostname = aw2.e(sSLException).getPublicHostname()) != null) {
            Regex regex = EchRetryPlan.c;
            EchConfigList retryConfigList = aw2.e(sSLException).getRetryConfigList();
            if (retryConfigList == null || (bytes = retryConfigList.toBytes()) == null) {
                qg9VarM = null;
            } else {
                qg9 qg9Var = qg9.d;
                qg9VarM = gl5.m(bytes);
            }
            String strB = _HostnamesCommonKt.b(publicHostname);
            if (strB != null && !_HostnamesCommonKt.f46120a.g(strB) && !EchRetryPlan.c.g(strB)) {
                return new EchRetryPlan(qg9VarM, publicHostname);
            }
        }
        return null;
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
    public final Object i() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.i();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean j(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void k(int i, String str, Throwable th) {
        if (i == 5) {
            boolean z = AndroidPlatform.e;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = AndroidPlatform.e;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void l(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.l(obj, str);
        } else {
            obj.getClass();
            a7.k(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext m() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.m();
    }
}
