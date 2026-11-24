package okhttp3;

import kotlin.Metadata;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/WebSocketListener;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WebSocketListener {
    public void a(WebSocket webSocket, int i, String str) {
        webSocket.getClass();
        str.getClass();
    }

    public void c(WebSocket webSocket, Throwable th, Response response) {
    }

    public void e(WebSocket webSocket, Response response) {
    }

    public void d(RealWebSocket realWebSocket, String str) {
    }

    public void b(RealWebSocket realWebSocket, int i, String str) {
    }
}
