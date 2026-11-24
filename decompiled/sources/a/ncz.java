package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ncz implements kbz {
    public final int[] A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23317a;
    public final List b;
    public final boolean c;
    public final xx7 d;
    public final yx7 e;
    public final k6z f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final dbz n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public boolean w;
    public int x = Integer.MIN_VALUE;
    public int y;
    public int z;

    public ncz(int i, List list, boolean z, xx7 xx7Var, yx7 yx7Var, k6z k6zVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, dbz dbzVar, long j2) {
        this.f23317a = i;
        this.b = list;
        this.c = z;
        this.d = xx7Var;
        this.e = yx7Var;
        this.f = k6zVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = dbzVar;
        this.o = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            pu90 pu90Var = (pu90) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? pu90Var.b : pu90Var.f27604a;
            iMax = Math.max(iMax, !z3 ? pu90Var.b : pu90Var.f27604a);
        }
        this.q = i5;
        this.v = iMax;
        this.A = new int[this.b.size() * 2];
        if (this.c) {
            this.u = this.j;
            this.s = i5;
            this.r = iMax;
            this.t = 0;
            return;
        }
        this.u = 0;
        this.s = iMax;
        this.r = i5;
        this.t = this.j;
    }

    @Override // a.kbz
    public final void a(int i, int i2, int i3, int i4) {
        o(i, i3, i4);
    }

    @Override // a.kbz
    public final int b() {
        return 1;
    }

    @Override // a.kbz
    public final int c() {
        return this.s;
    }

    @Override // a.kbz
    public final long d() {
        return this.o;
    }

    @Override // a.kbz
    public final void e() {
        this.w = true;
    }

    @Override // a.kbz
    public final int f() {
        return this.t;
    }

    @Override // a.kbz
    public final List g() {
        return this.b;
    }

    @Override // a.kbz
    public final int getIndex() {
        return this.f23317a;
    }

    @Override // a.kbz
    public final Object getKey() {
        return this.l;
    }

    @Override // a.kbz
    public final int h() {
        return this.u;
    }

    @Override // a.kbz
    public final long i(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.p;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.A;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // a.kbz
    public final int j() {
        return 0;
    }

    @Override // a.kbz
    public final int k() {
        return this.r;
    }

    public final int l(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final int m() {
        int i;
        int i2;
        if (this.c) {
            i = this.s;
            i2 = this.u;
        } else {
            i = this.r;
            i2 = this.t;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void n(ou90 ou90Var, boolean z) {
        dfv dfvVar;
        long j;
        if (this.x == Integer.MIN_VALUE) {
            adx.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pu90 pu90Var = (pu90) list.get(i);
            int i2 = this.y;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? pu90Var.b : pu90Var.f27604a);
            int i4 = this.z;
            long jI = i(i);
            zaz zazVarA = this.n.a(i, this.l);
            if (zazVarA != null) {
                if (z) {
                    zazVarA.n = jI;
                } else {
                    if (!ikx.b(zazVarA.n, 9223372034707292159L)) {
                        jI = zazVarA.n;
                    }
                    long jD = ikx.d(jI, ((ikx) ((hgk0) zazVarA.r).getValue()).f14950a);
                    if ((l(jI) <= i3 && l(jD) <= i3) || (l(jI) >= i4 && l(jD) >= i4)) {
                        zazVarA.b();
                    }
                    jI = jD;
                }
                dfvVar = zazVarA.o;
            } else {
                dfvVar = null;
            }
            if (this.g) {
                int i5 = this.x;
                if (z2) {
                    j = (((long) ((int) (jI >> 32))) << 32) | (((long) ((i5 - ((int) (jI & 4294967295L))) - (z2 ? pu90Var.b : pu90Var.f27604a))) & 4294967295L);
                } else {
                    j = (((long) ((int) (jI & 4294967295L))) & 4294967295L) | (((long) ((i5 - ((int) (jI >> 32))) - (z2 ? pu90Var.b : pu90Var.f27604a))) << 32);
                }
                jI = j;
            }
            long jD2 = ikx.d(jI, this.k);
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

    public final void o(int i, int i2, int i3) {
        int i4;
        this.p = i;
        boolean z = this.c;
        this.x = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            pu90 pu90Var = (pu90) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.A;
            if (z) {
                xx7 xx7Var = this.d;
                if (xx7Var == null) {
                    throw w6x.i("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = xx7Var.a(pu90Var.f27604a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = pu90Var.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                yx7 yx7Var = this.e;
                if (yx7Var == null) {
                    throw w6x.i("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = yx7Var.a(pu90Var.b, i3);
                i4 = pu90Var.f27604a;
            }
            i += i4;
        }
        this.y = -this.h;
        this.z = this.x + this.i;
    }
}
