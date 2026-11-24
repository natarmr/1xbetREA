package okhttp3.internal.platform.android;

import a.qg9;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/internal/platform/android/SocketAdapter;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SocketAdapter {
    boolean a(SSLSocket sSLSocket);

    boolean b();

    void c(SSLSocket sSLSocket, String str, List list, qg9 qg9Var);

    String d(SSLSocket sSLSocket);
}
