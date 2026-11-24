package a;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class fum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10171a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ tzi e;

    public fum0(tzi tziVar, int i) {
        this.e = tziVar;
        this.f10171a = i;
    }

    public final void a() {
        tzi tziVar = this.e;
        q9o0 q9o0Var = (q9o0) tziVar.g;
        ulo uloVar = (ulo) tziVar.b;
        int iT = uloVar.t();
        if (!uloVar.r() || uloVar.s() == 1 || uloVar.s() == 4 || iT == 0 || iT == 1) {
            if (this.c) {
                q9o0Var.g(4);
            }
            this.c = false;
            return;
        }
        ((l9o0) tziVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.f10171a;
        if (z && this.b == iT) {
            if (jElapsedRealtime - this.d >= i) {
                ((qlo) tziVar.d).f28944a.X(new dlo(2, new gum0(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iT;
        q9o0Var.g(4);
        q9o0Var.f28360a.sendEmptyMessageDelayed(4, i);
    }
}
