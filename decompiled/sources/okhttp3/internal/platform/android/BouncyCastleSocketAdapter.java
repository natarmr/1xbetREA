package okhttp3.internal.platform.android;

import a.qg9;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/BouncyCastleSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BouncyCastleSocketAdapter$Companion$factory$1 f46213a = new BouncyCastleSocketAdapter$Companion$factory$1();
    public static final boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/android/BouncyCastleSocketAdapter$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, Companion.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        return b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void c(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Platform platform = Platform.f46208a;
            parameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String d(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }
}
