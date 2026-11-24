package a;

import kotlin.Unit;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class suk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts4 f32825a;

    public /* synthetic */ suk(ts4 ts4Var) {
        this.f32825a = ts4Var;
    }

    public Unit a() {
        ckk0 ckk0Var = ckk0.d;
        ft4 ft4Var = this.f32825a.f;
        ft4Var.getClass();
        for (WebSocket webSocket : ft4Var.g) {
            webSocket.getClass();
            ft4Var.b(webSocket, ckk0Var);
        }
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }
}
