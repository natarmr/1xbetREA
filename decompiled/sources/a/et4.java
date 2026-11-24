package a;

import android.os.Build;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class et4 extends WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft4 f8359a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ckk0 c;
    public final /* synthetic */ hzb0 d;

    public et4(ft4 ft4Var, String str, ckk0 ckk0Var, hzb0 hzb0Var) {
        this.f8359a = ft4Var;
        this.b = str;
        this.c = ckk0Var;
        this.d = hzb0Var;
    }

    @Override // okhttp3.WebSocketListener
    public final void b(RealWebSocket realWebSocket, int i, String str) {
        Object next;
        c0o c0oVar = lu4.d;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((lu4) next).f20656a != i);
        lu4 lu4Var = (lu4) next;
        if (lu4Var != null) {
            dub.w0(this.d, new mu4(lu4Var));
        }
        realWebSocket.f(1000, "Disconnected");
    }

    @Override // okhttp3.WebSocketListener
    public final void c(WebSocket webSocket, Throwable th, Response response) {
        this.d.e0(th);
    }

    @Override // okhttp3.WebSocketListener
    public final void d(RealWebSocket realWebSocket, String str) {
        Long l;
        Object value;
        String str2;
        String str3;
        ft4 ft4Var = this.f8359a;
        vby vbyVar = ft4Var.f10092a;
        at4 at4Var = ft4Var.c;
        ikk0 ikk0Var = (ikk0) vbyVar.b(ikk0.Companion.serializer(), str);
        hkk0 hkk0Var = ikk0Var.d;
        if (hkk0Var != null && (str3 = hkk0Var.f13214a) != null && str3.length() > 0) {
            at4Var.e = str3;
        }
        if (hkk0Var != null && (str2 = hkk0Var.g) != null) {
            at4Var.b = str2;
        }
        if (hkk0Var != null && (l = hkk0Var.h) != null) {
            long jLongValue = l.longValue() * 1000;
            p7m0 p7m0Var = ft4Var.f.f30868a;
            do {
                value = p7m0Var.getValue();
                ((Number) value).longValue();
            } while (!p7m0Var.m(value, Long.valueOf(jLongValue)));
        }
        String str4 = hkk0Var != null ? hkk0Var.f13214a : null;
        if (str4 == null) {
            str4 = "";
        }
        if (str4.length() > 0) {
            String str5 = ikk0Var.f14931a;
            at4Var.d = str5 != null ? str5 : "";
        }
        dub.w0(this.d, ikk0Var);
    }

    @Override // okhttp3.WebSocketListener
    public final void e(WebSocket webSocket, Response response) {
        String strD;
        ft4 ft4Var = this.f8359a;
        at4 at4Var = ft4Var.c;
        at4 at4Var2 = ft4Var.c;
        String str = at4Var.b;
        String str2 = str.length() == 0 ? null : str;
        vby vbyVar = ft4Var.f10092a;
        knf0 knf0Var = ft4Var.d;
        String str3 = str2 != null ? at4Var.d : null;
        String str4 = this.b;
        if (str4.length() == 0) {
            String strA = knf0Var.a();
            tgk.i();
            String str5 = Build.VERSION.RELEASE;
            tjk0 tjk0Var = new tjk0(strA, knf0Var.c(), str2, str3);
            String str6 = at4Var.f1417a.f32933a;
            bkk0[] bkk0VarArr = bkk0.f2753a;
            strD = vbyVar.d(ujk0.Companion.serializer(), new ujk0(str6, tjk0Var));
        } else {
            String strA2 = knf0Var.a();
            tgk.i();
            String str7 = Build.VERSION.RELEASE;
            zjk0 zjk0Var = new zjk0(strA2, knf0Var.c(), str4.substring(7), str2, str3);
            String str8 = at4Var.f1417a.f32933a;
            bkk0[] bkk0VarArr2 = bkk0.f2753a;
            strD = vbyVar.d(akk0.Companion.serializer(), new akk0(str8, zjk0Var));
        }
        webSocket.a(strD);
        if (at4Var2.b.length() == 0) {
            ft4Var.b(webSocket, this.c);
            at4Var2.c = true;
        }
    }
}
