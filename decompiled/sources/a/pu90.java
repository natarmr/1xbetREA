package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class pu90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27604a;
    public int b;
    public long c = 0;
    public long d = qu90.b;
    public long e = 0;

    public abstract int c0(w12 w12Var);

    public int d0() {
        return (int) (this.c & 4294967295L);
    }

    public int e0() {
        return (int) (this.c >> 32);
    }

    public final void g0() {
        this.f27604a = l1e0.d((int) (this.c >> 32), p4e.k(this.d), p4e.i(this.d));
        int iD = l1e0.d((int) (this.c & 4294967295L), p4e.j(this.d), p4e.h(this.d));
        this.b = iD;
        int i = this.f27604a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iD - ((int) (j & 4294967295L))) / 2)));
    }

    public void l0(long j, float f, dfv dfvVar) {
        n0(j, f, null);
    }

    public Object n() {
        return null;
    }

    public abstract void n0(long j, float f, Function1 function1);

    public final void p0(long j) {
        if (qkx.a(this.c, j)) {
            return;
        }
        this.c = j;
        g0();
    }

    public final void u0(long j) {
        if (p4e.c(this.d, j)) {
            return;
        }
        this.d = j;
        g0();
    }
}
