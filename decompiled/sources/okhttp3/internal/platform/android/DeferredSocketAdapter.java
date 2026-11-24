package okhttp3.internal.platform.android;

import a.qg9;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeferredSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Factory f46215a;
    public SocketAdapter b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        boolean a(SSLSocket sSLSocket);

        SocketAdapter b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        this.f46215a = factory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return this.f46215a.a(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void c(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        list.getClass();
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            socketAdapterE.c(sSLSocket, str, list, qg9Var);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String d(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            return socketAdapterE.d(sSLSocket);
        }
        return null;
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.f46215a.a(sSLSocket)) {
                this.b = this.f46215a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
