package a;

import android.os.Handler;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.TimeoutException;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class fuc extends WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ guc f10154a;

    public fuc(guc gucVar) {
        this.f10154a = gucVar;
    }

    @Override // okhttp3.WebSocketListener
    public final void a(WebSocket webSocket, int i, String str) {
        webSocket.getClass();
        str.getClass();
        Log.d("WebSocket", "onClosed code " + i + " cause: " + str);
        guc gucVar = this.f10154a;
        gucVar.g.set(false);
        Object dxbVar = i == 4001 ? new dxb() : new TimeoutException();
        aa40 aa40Var = (aa40) gucVar.f11921a.b;
        ejd ejdVar = aa40Var.d;
        if (ejdVar != null) {
            ejdVar.invoke(dxbVar);
        }
        aa40Var.a(false);
    }

    @Override // okhttp3.WebSocketListener
    public final void c(WebSocket webSocket, Throwable th, Response response) {
        Log.d("WebSocket", "onFailure throwable " + th + " response: " + response);
        guc gucVar = this.f10154a;
        gucVar.g.set(false);
        if (response != null && response.d == 401) {
            th = new voo();
        }
        aa40 aa40Var = (aa40) gucVar.f11921a.b;
        ejd ejdVar = aa40Var.d;
        if (ejdVar != null) {
            ejdVar.invoke(th);
        }
        aa40Var.a(false);
    }

    @Override // okhttp3.WebSocketListener
    public final void d(RealWebSocket realWebSocket, String str) {
        cnc cncVar;
        Log.d("WebSocket", "onMessage text: ".concat(str));
        aa40 aa40Var = (aa40) this.f10154a.f11921a.b;
        int iOptInt = new JSONObject(str).optInt("$type", -1);
        if (iOptInt != 3) {
            if (iOptInt != 4) {
                Log.d("SocketConnection", iOptInt + " is unsupported message type");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("target", "");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
            strOptString.getClass();
            if (strOptString.length() <= 0 || jSONObjectOptJSONObject == null || (cncVar = aa40Var.e) == null) {
                return;
            }
            cncVar.invoke(strOptString, jSONObjectOptJSONObject);
            return;
        }
        z940 z940Var = (z940) aa40Var.j.get(Integer.valueOf(new JSONObject(str).optInt("invocationId", -1)));
        if (z940Var == null) {
            return;
        }
        n5a n5aVar = z940Var.d;
        aa40 aa40Var2 = z940Var.f44000a;
        aa40Var2.j.remove(Integer.valueOf(z940Var.b));
        try {
            r4v0 r4v0Var = (r4v0) aa40Var2.f.b(z940Var.c, str);
            z46 z46Var = (z46) r4v0Var.f29857a;
            Integer num = z46Var != null ? z46Var.b : null;
            if (num != null && num.intValue() == 200) {
                e0g0 e0g0Var = j0g0.b;
                n5aVar.resumeWith(r4v0Var);
                return;
            }
            e0g0 e0g0Var2 = j0g0.b;
            n5aVar.resumeWith(new g0g0(new zhi0(str, new y940(num), (Integer) null, 12)));
        } catch (Exception e) {
            e0g0 e0g0Var3 = j0g0.b;
            n5aVar.resumeWith(new g0g0(e));
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void e(WebSocket webSocket, Response response) {
        Log.d("WebSocket", "onOpen response: " + response);
        guc gucVar = this.f10154a;
        gucVar.g.set(true);
        aa40 aa40Var = (aa40) gucVar.f11921a.b;
        mx2 mx2Var = aa40Var.l;
        Handler handler = aa40Var.k;
        handler.removeCallbacks(mx2Var);
        handler.post(mx2Var);
    }
}
