package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r8z implements kbz {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30051a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final k6z e;
    public final int f;
    public final int g;
    public final List h;
    public final long i;
    public final Object j;
    public final dbz k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public int t = Integer.MIN_VALUE;
    public int u;
    public int v;
    public final long w;
    public long x;
    public int y;
    public int z;

    public r8z(int i, Object obj, boolean z, int i2, int i3, k6z k6zVar, int i4, int i5, List list, long j, Object obj2, dbz dbzVar, long j2, int i6, int i7) {
        int i8;
        long j3;
        long j4;
        this.f30051a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = k6zVar;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = j;
        this.j = obj2;
        this.k = dbzVar;
        this.l = j2;
        this.m = i6;
        this.n = i7;
        int size = list.size();
        int iMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            pu90 pu90Var = (pu90) list.get(i9);
            iMax = Math.max(iMax, this.c ? pu90Var.b : pu90Var.f27604a);
        }
        this.o = iMax;
        boolean z2 = this.c;
        if (z2) {
            this.s = i3;
            this.q = iMax;
            i8 = this.d;
            this.p = i8;
            this.r = 0;
        } else {
            this.s = 0;
            i8 = this.d;
            this.q = i8;
            this.p = iMax;
            this.r = i3;
        }
        if (z2) {
            j3 = ((long) i8) << 32;
            j4 = iMax;
        } else {
            j3 = ((long) iMax) << 32;
            j4 = i8;
        }
        this.w = j3 | (j4 & 4294967295L);
        this.x = 0L;
        this.y = -1;
        this.z = -1;
    }

    @Override // a.kbz
    public final void a(int i, int i2, int i3, int i4) {
        o(i, i2, i3, i4, -1, -1);
    }

    @Override // a.kbz
    public final int b() {
        return this.n;
    }

    @Override // a.kbz
    public final int c() {
        return this.q;
    }

    @Override // a.kbz
    public final long d() {
        return this.l;
    }

    @Override // a.kbz
    public final void e() {
        this.A = true;
    }

    @Override // a.kbz
    public final int f() {
        return this.r;
    }

    @Override // a.kbz
    public final List g() {
        return this.h;
    }

    @Override // a.kbz
    public final int getIndex() {
        return this.f30051a;
    }

    @Override // a.kbz
    public final Object getKey() {
        return this.b;
    }

    @Override // a.kbz
    public final int h() {
        return this.s;
    }

    @Override // a.kbz
    public final long i(int i) {
        return this.x;
    }

    @Override // a.kbz
    public final int j() {
        return this.m;
    }

    @Override // a.kbz
    public final int k() {
        return this.p;
    }

    public final int l(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final int m() {
        int i;
        int i2;
        if (this.c) {
            i = this.q;
            i2 = this.s;
        } else {
            i = this.p;
            i2 = this.r;
        }
        return i + i2;
    }

    public final void n(ou90 ou90Var, boolean z) {
        dfv dfvVar;
        if (this.t == Integer.MIN_VALUE) {
            adx.a("position() should be called first");
        }
        List list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pu90 pu90Var = (pu90) list.get(i);
            int i2 = this.u;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? pu90Var.b : pu90Var.f27604a);
            int i4 = this.v;
            long j = this.x;
            zaz zazVarA = this.k.a(i, this.b);
            if (zazVarA != null) {
                if (z) {
                    zazVarA.n = j;
                } else {
                    long jD = ikx.d(!ikx.b(zazVarA.n, 9223372034707292159L) ? zazVarA.n : j, ((ikx) ((hgk0) zazVarA.r).getValue()).f14950a);
                    if ((l(j) <= i3 && l(jD) <= i3) || (l(j) >= i4 && l(jD) >= i4)) {
                        zazVarA.b();
                    }
                    j = jD;
                }
                dfvVar = zazVarA.o;
            } else {
                dfvVar = null;
            }
            long jD2 = ikx.d(j, this.i);
            if (!z && zazVarA != null) {
                zazVarA.m = jD2;
            }
            if (z2) {
                if (dfvVar != null) {
                    ou90Var.e(pu90Var);
                    pu90Var.l0(ikx.d(jD2, pu90Var.e), 0.0f, dfvVar);
                } else {
                    ou90.G(ou90Var, pu90Var, jD2);
                }
            } else if (dfvVar != null) {
                ou90.C(ou90Var, pu90Var, jD2, dfvVar);
            } else {
                ou90.y(ou90Var, pu90Var, jD2);
            }
        }
    }

    public final void o(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.c;
        int i7 = z ? i4 : i3;
        this.t = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.e == k6z.b) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = ((long) i2) << 32;
            j2 = i;
        } else {
            j = ((long) i) << 32;
            j2 = i2;
        }
        this.x = (j2 & 4294967295L) | j;
        this.y = i5;
        this.z = i6;
        this.u = -this.f;
        this.v = i7 + this.g;
    }
}
