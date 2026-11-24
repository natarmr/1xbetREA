package a;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8427a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ tzi g;

    public eum0(tzi tziVar, int i) {
        this.g = tziVar;
        this.f8427a = i;
    }

    public final void a() {
        long jQ;
        tzi tziVar = this.g;
        amq0 amq0Var = (amq0) tziVar.f;
        q9o0 q9o0Var = (q9o0) tziVar.g;
        ulo uloVar = (ulo) tziVar.b;
        bmq0 bmq0VarN = uloVar.n();
        Object objL = bmq0VarN.p() ? null : bmq0VarN.l(uloVar.k());
        int iH = uloVar.h();
        int i = uloVar.i();
        long jL = uloVar.l();
        if (objL == null || iH != -1) {
            jQ = iH != -1 ? uloVar.q() : -9223372036854775807L;
        } else {
            bmq0VarN.g(objL, amq0Var);
            jL -= vtt0.Y(amq0Var.e);
            jQ = vtt0.Y(amq0Var.d);
        }
        boolean zY = uloVar.y();
        if (!zY || jQ == -9223372036854775807L || jL < jQ) {
            q9o0Var.g(3);
            if (zY && jQ != -9223372036854775807L) {
                uloVar.c0();
                q9o0Var.f28360a.sendEmptyMessageDelayed(3, (int) Math.ceil((jQ - jL) / uloVar.n0.o.f45148a));
            }
            this.e = false;
            return;
        }
        ((l9o0) tziVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i2 = this.f8427a;
        if (z && Objects.equals(objL, this.b) && iH == this.c && i == this.d) {
            if (jElapsedRealtime - this.f >= i2) {
                ((qlo) tziVar.d).f28944a.X(new dlo(2, new gum0(3, i2), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objL;
        this.c = iH;
        this.d = i;
        q9o0Var.g(3);
        q9o0Var.f28360a.sendEmptyMessageDelayed(3, i2);
    }
}
