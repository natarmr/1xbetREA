package a;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class y7a implements bmf0, xdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42144a;
    public final b14 b;
    public bev c;

    public y7a(long j) {
        this.f42144a = j;
        if (j <= 0) {
            jf4.o("Failed requirement.");
            throw null;
        }
        b14 b14Var = new b14();
        b14Var.f1789a = 0L;
        this.b = b14Var;
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) {
        long j2;
        long j3;
        b14 b14Var = this.b;
        do {
            j2 = b14Var.f1789a;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!b14.b.compareAndSet(b14Var, j2, j3));
        if (j3 == this.f42144a) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.c + " after " + j3 + " frames.");
            bev bevVar = this.c;
            bevVar.getClass();
            bevVar.v(true);
        }
    }

    @Override // a.xdv
    public final void f() {
        long j;
        b14 b14Var = this.b;
        do {
            j = b14Var.f1789a;
        } while (!b14.b.compareAndSet(b14Var, j, j != -1 ? 0L : -1L));
        bev bevVar = this.c;
        bevVar.getClass();
        bevVar.v(false);
        StringBuilder sb = new StringBuilder("Capture processing has been disabled for ");
        bev bevVar2 = this.c;
        bevVar2.getClass();
        sb.append(bevVar2);
        sb.append(" until ");
        sb.append(this.f42144a);
        sb.append(" frames have been completed.");
        Log.w("CXCP", sb.toString());
    }

    @Override // a.xdv
    public final void g() {
        this.b.f1789a = -1L;
        bev bevVar = this.c;
        bevVar.getClass();
        bevVar.v(false);
    }

    @Override // a.xdv
    public final void b() {
    }
}
