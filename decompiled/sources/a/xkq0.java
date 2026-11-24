package a;

/* JADX INFO: loaded from: classes.dex */
public final class xkq0 implements mn30, ln30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn30 f41040a;
    public final long b;
    public ln30 c;

    public xkq0(mn30 mn30Var, long j) {
        this.f41040a = mn30Var;
        this.b = j;
    }

    @Override // a.ggi0
    public final void a(hgi0 hgi0Var) {
        ln30 ln30Var = this.c;
        ln30Var.getClass();
        ln30Var.a(this);
    }

    @Override // a.hgi0
    public final long b() {
        long jB = this.f41040a.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB + this.b;
    }

    @Override // a.mn30
    public final long c(long j, gvh0 gvh0Var) {
        long j2 = this.b;
        return this.f41040a.c(j - j2, gvh0Var) + j2;
    }

    @Override // a.mn30
    public final long d(long j) {
        long j2 = this.b;
        return this.f41040a.d(j - j2) + j2;
    }

    @Override // a.hgi0
    public final boolean e() {
        return this.f41040a.e();
    }

    @Override // a.ln30
    public final void f(mn30 mn30Var) {
        ln30 ln30Var = this.c;
        ln30Var.getClass();
        ln30Var.f(this);
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        xq00 xq00Var = new xq00();
        long j = yq00Var.f43053a;
        xq00Var.b = yq00Var.b;
        xq00Var.c = yq00Var.c;
        xq00Var.f41291a = j - this.b;
        return this.f41040a.g(new yq00(xq00Var));
    }

    @Override // a.mn30
    public final long h() {
        long jH = this.f41040a.h();
        if (jH == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jH + this.b;
    }

    @Override // a.mn30
    public final long j(fmo[] fmoVarArr, boolean[] zArr, ixg0[] ixg0VarArr, boolean[] zArr2, long j) {
        ixg0[] ixg0VarArr2 = new ixg0[ixg0VarArr.length];
        int i = 0;
        while (true) {
            ixg0 ixg0Var = null;
            if (i >= ixg0VarArr.length) {
                break;
            }
            wkq0 wkq0Var = (wkq0) ixg0VarArr[i];
            if (wkq0Var != null) {
                ixg0Var = wkq0Var.f39320a;
            }
            ixg0VarArr2[i] = ixg0Var;
            i++;
        }
        mn30 mn30Var = this.f41040a;
        long j2 = this.b;
        long j3 = mn30Var.j(fmoVarArr, zArr, ixg0VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ixg0VarArr.length; i2++) {
            ixg0 ixg0Var2 = ixg0VarArr2[i2];
            if (ixg0Var2 == null) {
                ixg0VarArr[i2] = null;
            } else {
                ixg0 ixg0Var3 = ixg0VarArr[i2];
                if (ixg0Var3 == null || ((wkq0) ixg0Var3).f39320a != ixg0Var2) {
                    ixg0VarArr[i2] = new wkq0(ixg0Var2, j2);
                }
            }
        }
        return j3 + j2;
    }

    @Override // a.mn30
    public final void k() {
        String str = vtt0.f38024a;
        this.f41040a.k();
    }

    @Override // a.mn30
    public final void l() {
        this.f41040a.l();
    }

    @Override // a.mn30
    public final void m(long j) {
        this.f41040a.m(j - this.b);
    }

    @Override // a.mn30
    public final dcs0 p() {
        return this.f41040a.p();
    }

    @Override // a.mn30
    public final void r(ln30 ln30Var, long j) {
        this.c = ln30Var;
        this.f41040a.r(this, j - this.b);
    }

    @Override // a.hgi0
    public final long s() {
        long jS = this.f41040a.s();
        if (jS == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jS + this.b;
    }

    @Override // a.hgi0
    public final void v(long j) {
        this.f41040a.v(j - this.b);
    }
}
