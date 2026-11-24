package okhttp3.internal.platform.android;

import a.c99;
import a.qg9;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AndroidSocketAdapter implements SocketAdapter {
    public static final AndroidSocketAdapter$Companion$factory$1 e = new AndroidSocketAdapter$Companion$factory$1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f46212a;
    public final Method b;
    public final Method c;
    public final Method d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidSocketAdapter(Class cls) throws NoSuchMethodException {
        this.f46212a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return this.f46212a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        boolean z = AndroidPlatform.e;
        return AndroidPlatform.e;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void c(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        list.getClass();
        if (this.f46212a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                Platform platform = Platform.f46208a;
                method.invoke(sSLSocket, Platform.Companion.b(list));
            } catch (IllegalAccessException e2) {
                c99.l(e2);
            } catch (InvocationTargetException e3) {
                c99.l(e3);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String d(SSLSocket sSLSocket) {
        if (this.f46212a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e2) {
                c99.l(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    c99.l(e3);
                    return null;
                }
            }
        }
        return null;
    }
}
