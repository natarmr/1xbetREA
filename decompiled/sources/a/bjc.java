package a;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class bjc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa5 f2699a;
    public final ncs0 b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public bjc(int i, fa5 fa5Var, ncs0 ncs0Var, boolean z) {
        int i2 = fa5Var.d;
        this.f2699a = fa5Var;
        this.f = z;
        int iA = fa5Var.a();
        boolean z2 = true;
        if (iA != 1 && iA != 2) {
            z2 = false;
        }
        x0x.A(z2);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) fa5Var.b) * 1000000;
        long j2 = fa5Var.c;
        String str = vtt0.f38024a;
        this.e = vtt0.T(i2, j, j2, RoundingMode.DOWN);
        this.b = ncs0Var;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i2;
    }

    public final hvh0 a(int i) {
        return new hvh0((this.e / ((long) this.g)) * ((long) this.o[i]), this.n[i]);
    }

    public final evh0 b(long j) {
        if (this.l == 0) {
            hvh0 hvh0Var = new hvh0(0L, this.m);
            return new evh0(hvh0Var, hvh0Var);
        }
        int i = (int) (j / (this.e / ((long) this.g)));
        int iE = vtt0.e(this.o, i, true, true);
        if (this.o[iE] == i) {
            hvh0 hvh0VarA = a(iE);
            return new evh0(hvh0VarA, hvh0VarA);
        }
        hvh0 hvh0VarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.n.length ? new evh0(hvh0VarA2, a(i2)) : new evh0(hvh0VarA2, hvh0VarA2);
    }
}
