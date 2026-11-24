package a;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6703a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ tzi h;

    public dum0(tzi tziVar, int i) {
        this.h = tziVar;
        this.f6703a = i;
    }

    public final void a() {
        tzi tziVar = this.h;
        q9o0 q9o0Var = (q9o0) tziVar.g;
        ulo uloVar = (ulo) tziVar.b;
        if (!uloVar.y()) {
            if (this.f) {
                q9o0Var.g(2);
            }
            this.f = false;
            return;
        }
        bmq0 bmq0VarN = uloVar.n();
        Object objL = bmq0VarN.p() ? null : bmq0VarN.l(uloVar.k());
        int iH = uloVar.h();
        int i = uloVar.i();
        long jL = uloVar.l();
        if (objL != null && iH == -1) {
            jL -= vtt0.Y(bmq0VarN.g(objL, (amq0) tziVar.f).e);
        }
        ((l9o0) tziVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i2 = this.f6703a;
        if (z && Objects.equals(objL, this.b) && iH == this.c && i == this.d && jL == this.e) {
            if (jElapsedRealtime - this.g >= i2) {
                ((qlo) tziVar.d).f28944a.X(new dlo(2, new gum0(2, i2), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iH;
        this.d = i;
        this.e = jL;
        q9o0Var.g(2);
        q9o0Var.f28360a.sendEmptyMessageDelayed(2, i2);
    }
}
