package a;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4993a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ tzi i;

    public cum0(tzi tziVar, int i) {
        this.i = tziVar;
        this.f4993a = i;
    }

    public final void a() {
        long jF;
        if (((ulo) this.i.b).s() != 2 || !((ulo) this.i.b).r() || ((ulo) this.i.b).t() != 0) {
            if (this.g) {
                ((q9o0) this.i.g).g(1);
            }
            this.g = false;
            return;
        }
        bmq0 bmq0VarN = ((ulo) this.i.b).n();
        Object objL = bmq0VarN.p() ? null : bmq0VarN.l(((ulo) this.i.b).k());
        int iH = ((ulo) this.i.b).h();
        int i = ((ulo) this.i.b).i();
        ulo uloVar = (ulo) this.i.b;
        uloVar.c0();
        if (uloVar.z()) {
            yx90 yx90Var = uloVar.n0;
            jF = yx90Var.k.equals(yx90Var.b) ? vtt0.Y(uloVar.n0.q) : uloVar.q();
        } else {
            jF = uloVar.f();
        }
        long jMax = Math.max(0L, jF - ((ulo) this.i.b).l());
        ulo uloVar2 = (ulo) this.i.b;
        uloVar2.c0();
        long jMax2 = Math.max(0L, vtt0.Y(uloVar2.n0.r) - jMax);
        if (objL != null && iH == -1) {
            jF -= vtt0.Y(bmq0VarN.g(objL, (amq0) this.i.f).e);
        }
        ((l9o0) this.i.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.g && Objects.equals(objL, this.b) && iH == this.c && i == this.d && jF == this.e && jMax2 == this.f) {
            long j = jElapsedRealtime - this.h;
            int i2 = this.f4993a;
            if (j >= i2) {
                ((qlo) this.i.d).f28944a.X(new dlo(2, new gum0(1, i2), 1003));
                return;
            }
            return;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = objL;
        this.c = iH;
        this.d = i;
        this.e = jF;
        this.f = jMax2;
        ((q9o0) this.i.g).g(1);
        ((q9o0) this.i.g).f28360a.sendEmptyMessageDelayed(1, this.f4993a);
    }
}
