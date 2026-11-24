package okhttp3.internal.platform.android;

import a.hny;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/platform/android/AndroidSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final boolean a(SSLSocket sSLSocket) {
        return c.x(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final SocketAdapter b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                hny.n(cls, "No OpenSSLSocketImpl superclass of socket of type ");
                return null;
            }
        }
        return new AndroidSocketAdapter(superclass);
    }
}
