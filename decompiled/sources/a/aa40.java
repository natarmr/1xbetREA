package a;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class aa40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lvu0 f507a;
    public final OkHttpClient b;
    public jwd c;
    public ejd d;
    public cnc e;
    public final vby f;
    public long g;
    public boolean h;
    public final jw20 i;
    public final ConcurrentHashMap j;
    public final Handler k;
    public final mx2 l;
    public final n0o0 m;

    public aa40(lvu0 lvu0Var, OkHttpClient okHttpClient, jwd jwdVar, ejd ejdVar, cnc cncVar, vby vbyVar) {
        lvu0Var.getClass();
        okHttpClient.getClass();
        this.f507a = lvu0Var;
        this.b = okHttpClient;
        this.c = jwdVar;
        this.d = ejdVar;
        this.e = cncVar;
        this.f = vbyVar;
        this.i = new jw20((Object) this, (byte) 4);
        this.j = new ConcurrentHashMap();
        this.k = new Handler(Looper.getMainLooper());
        this.l = new mx2(this, (byte) 22);
        this.m = maz.b(new np30(this, (byte) 5));
    }

    public final void a(boolean z) {
        this.j.clear();
        this.h = false;
        this.k.removeCallbacks(this.l);
        RealWebSocket realWebSocket = ((guc) this.m.getValue()).f;
        if (realWebSocket != null) {
            realWebSocket.h();
        }
        if (z) {
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    public final void b(String str) throws IOException {
        guc gucVar = (guc) this.m.getValue();
        gucVar.getClass();
        str.getClass();
        RealWebSocket realWebSocket = gucVar.f;
        if (realWebSocket != null) {
            realWebSocket.a(str);
        } else {
            ohq.l("WebSocket connection is not created");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, Function1 function1, jiy jiyVar, zje zjeVar) {
        x940 x940Var;
        aa40 aa40Var;
        int i2;
        if (zjeVar instanceof x940) {
            x940Var = (x940) zjeVar;
            int i3 = x940Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x940Var.l = i3 - Integer.MIN_VALUE;
            } else {
                x940Var = new x940(this, zjeVar);
            }
        } else {
            x940Var = new x940(this, zjeVar);
        }
        Object objU = x940Var.j;
        wne wneVar = wne.f39444a;
        int i4 = x940Var.l;
        if (i4 == 0) {
            z1x.P(objU);
            aa40Var = this;
            zxt zxtVar = new zxt(aa40Var, i, jiyVar, function1, (yje) null);
            x940Var.i = i;
            x940Var.l = 1;
            objU = msm0.u(15000L, zxtVar, x940Var);
            if (objU == wneVar) {
                return wneVar;
            }
            i2 = i;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = x940Var.i;
            z1x.P(objU);
            aa40Var = this;
        }
        r4v0 r4v0Var = (r4v0) objU;
        if (r4v0Var != null) {
            return r4v0Var;
        }
        aa40Var.j.remove(new Integer(i2));
        throw new TimeoutException();
    }
}
