package okhttp3.internal.platform.android;

import a.csj;
import a.qg9;
import android.net.ssl.EchConfigList;
import android.net.ssl.InvalidEchDataException;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/Android17SocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Android17SocketAdapter implements SocketAdapter {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/android/Android17SocketAdapter$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        Platform platform = Platform.f46208a;
        return Build.VERSION.SDK_INT >= 37;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void c(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) throws IOException {
        EchConfigList echConfigListFromBytes;
        list.getClass();
        SSLSockets.setUseSessionTickets(sSLSocket, true);
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Platform platform = Platform.f46208a;
            sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
            if (str == null || qg9Var == null) {
                return;
            }
            try {
                echConfigListFromBytes = EchConfigList.fromBytes(qg9Var.w());
            } catch (InvalidEchDataException unused) {
                echConfigListFromBytes = null;
            }
            if (echConfigListFromBytes != null) {
                SSLSockets.setEchConfigList(sSLSocket, echConfigListFromBytes);
            }
        } catch (IllegalArgumentException e) {
            csj.c("Android internal error", e);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String d(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }
}
