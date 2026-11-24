package okhttp3.internal.platform.android;

import a.qg9;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConscryptSocketAdapter$Companion$factory$1 f46214a = new ConscryptSocketAdapter$Companion$factory$1();
    public static final boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, Companion.class.getClassLoader());
            if (Conscrypt.isAvailable() && Companion.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        return b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void c(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform platform = Platform.f46208a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.a(list).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String d(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
