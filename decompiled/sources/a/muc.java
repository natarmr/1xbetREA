package a;

/* JADX INFO: loaded from: classes.dex */
public final class muc implements mn30, ln30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn30 f22408a;
    public ln30 b;
    public luc[] c = new luc[0];
    public long d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public ouc j;

    public muc(mn30 mn30Var, boolean z, long j, long j2, int i) {
        this.f22408a = mn30Var;
        this.d = z ? j : -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = j;
        this.i = j2;
    }

    @Override // a.ggi0
    public final void a(hgi0 hgi0Var) {
        ln30 ln30Var = this.b;
        ln30Var.getClass();
        ln30Var.a(this);
    }

    @Override // a.hgi0
    public final long b() {
        long jB = this.f22408a.b();
        if (jB != Long.MIN_VALUE) {
            long j = this.i;
            if (j == Long.MIN_VALUE || jB < j) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // a.mn30
    public final long c(long j, gvh0 gvh0Var) {
        long j2 = this.h;
        if (j == j2) {
            return j2;
        }
        long j3 = vtt0.j(gvh0Var.f11974a, 0L, j - j2);
        long j4 = gvh0Var.b;
        long j5 = this.i;
        long j6 = vtt0.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != gvh0Var.f11974a || j6 != gvh0Var.b) {
            gvh0Var = new gvh0(j3, j6);
        }
        return this.f22408a.c(j, gvh0Var);
    }

    @Override // a.mn30
    public final long d(long j) {
        this.d = -9223372036854775807L;
        for (luc lucVar : this.c) {
            if (lucVar != null) {
                lucVar.c = false;
            }
        }
        long jD = this.f22408a.d(j);
        long j2 = this.h;
        long j3 = this.i;
        long jMax = Math.max(jD, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // a.hgi0
    public final boolean e() {
        return this.f22408a.e();
    }

    @Override // a.ln30
    public final void f(mn30 mn30Var) {
        if (this.j != null) {
            return;
        }
        ln30 ln30Var = this.b;
        ln30Var.getClass();
        ln30Var.f(this);
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        return this.f22408a.g(yq00Var);
    }

    @Override // a.mn30
    public final long h() {
        if (i()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.g = j;
            long jH = h();
            return jH != -9223372036854775807L ? jH : j;
        }
        long jH2 = this.f22408a.h();
        if (jH2 != -9223372036854775807L) {
            long j2 = this.h;
            long j3 = this.i;
            long jMax = Math.max(jH2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.g) {
                this.g = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    public final boolean i() {
        return (this.d == -9223372036854775807L || this.e) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    @Override // a.mn30
    public final long j(fmo[] fmoVarArr, boolean[] zArr, ixg0[] ixg0VarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        fmo fmoVar;
        this.c = new luc[ixg0VarArr.length];
        ixg0[] ixg0VarArr2 = new ixg0[ixg0VarArr.length];
        int i = 0;
        while (true) {
            ixg0 ixg0Var = null;
            if (i >= ixg0VarArr.length) {
                break;
            }
            luc[] lucVarArr = this.c;
            luc lucVar = (luc) ixg0VarArr[i];
            lucVarArr[i] = lucVar;
            if (lucVar != null) {
                ixg0Var = lucVar.f20667a;
            }
            ixg0VarArr2[i] = ixg0Var;
            i++;
        }
        long j2 = this.f22408a.j(fmoVarArr, zArr, ixg0VarArr2, zArr2, j);
        long j3 = this.i;
        long jMax = Math.max(j2, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= ixg0VarArr.length) {
                break;
            }
            ixg0 ixg0Var2 = ixg0VarArr2[i2];
            luc[] lucVarArr2 = this.c;
            if (ixg0Var2 == null) {
                lucVarArr2[i2] = null;
            } else {
                luc lucVar2 = lucVarArr2[i2];
                if (lucVar2 == null || lucVar2.f20667a != ixg0Var2) {
                    if (i()) {
                        if (j2 < j) {
                            z2 = true;
                        } else if (j2 == 0 || (fmoVar = fmoVarArr[i2]) == null) {
                            z2 = false;
                        } else {
                            androidx.media3.common.b bVarR = fmoVar.r();
                            z2 = !mg40.a(bVarR.p, bVarR.l);
                        }
                        z = z2;
                    }
                    luc[] lucVarArr3 = this.c;
                    ixg0 ixg0Var3 = ixg0VarArr2[i2];
                    ixg0Var3.getClass();
                    lucVarArr3[i2] = new luc(this, ixg0Var3, z);
                    z3 |= z;
                }
            }
            ixg0VarArr[i2] = this.c[i2];
            i2++;
        }
        this.d = z3 ? jMax : -9223372036854775807L;
        if (this.f) {
            this.e = true;
        }
        return jMax;
    }

    @Override // a.mn30
    public final void k() {
        this.f = true;
        this.f22408a.k();
    }

    @Override // a.mn30
    public final void l() throws ouc {
        ouc oucVar = this.j;
        if (oucVar != null) {
            throw oucVar;
        }
        this.f22408a.l();
    }

    @Override // a.mn30
    public final void m(long j) {
        this.f22408a.m(j);
    }

    @Override // a.mn30
    public final dcs0 p() {
        return this.f22408a.p();
    }

    @Override // a.mn30
    public final void r(ln30 ln30Var, long j) {
        this.b = ln30Var;
        this.f22408a.r(this, j);
    }

    @Override // a.hgi0
    public final long s() {
        long jS = this.f22408a.s();
        if (jS != Long.MIN_VALUE) {
            long j = this.i;
            if (j == Long.MIN_VALUE || jS < j) {
                return jS;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // a.hgi0
    public final void v(long j) {
        this.f22408a.v(j);
    }
}
