package a;

/* JADX INFO: loaded from: classes.dex */
public final class bo80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2921a;
    public y9q0 b;
    public mrq c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public w6k i;
    public s03 j;
    public boolean k;
    public long l;
    public og40 m;
    public ao80 n;
    public k6z o;
    public long p;
    public int q;
    public int r;
    public long s;

    public bo80(String str, y9q0 y9q0Var, mrq mrqVar, int i, boolean z, int i2, int i3) {
        this.f2921a = str;
        this.b = y9q0Var;
        this.c = mrqVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = edx.b;
        this.h = edx.f7642a;
        this.l = 0L;
        if (!(true & true)) {
            zcx.a("width and height must be >= 0");
        }
        this.p = r4e.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(bo80 bo80Var, long j, k6z k6zVar) {
        y9q0 y9q0Var = bo80Var.b;
        og40 og40Var = bo80Var.m;
        w6k w6kVar = bo80Var.i;
        w6kVar.getClass();
        og40 og40VarF = t9x.F(og40Var, k6zVar, y9q0Var, w6kVar, bo80Var.c);
        bo80Var.m = og40VarF;
        return og40VarF.a(bo80Var.g, j);
    }

    public final int a(int i, k6z k6zVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = r4e.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, k6zVar);
        }
        ao80 ao80VarE = e(k6zVar);
        long jD = u7x.D(jA, this.e, this.d, ao80VarE.e());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iJ = jtm0.j(new s03((v03) ao80VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jD).f);
        int iJ2 = p4e.j(jA);
        if (iJ < iJ2) {
            iJ = iJ2;
        }
        this.q = i;
        this.r = iJ;
        return iJ;
    }

    public final boolean b(long j, k6z k6zVar) {
        ao80 ao80Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, k6zVar) : j;
        s03 s03Var = this.j;
        boolean z2 = false;
        if (s03Var != null && (ao80Var = this.n) != null && !ao80Var.b() && k6zVar == this.o && (p4e.c(jF, this.p) || (p4e.i(jF) == p4e.i(this.p) && p4e.k(jF) == p4e.k(this.p) && p4e.h(jF) >= s03Var.f && !s03Var.d.d))) {
            if (!p4e.c(jF, this.p)) {
                s03 s03Var2 = this.j;
                s03Var2.getClass();
                long jD = r4e.d(jF, (((long) jtm0.j(Math.min(s03Var2.f31393a.i.c(), s03Var2.c()))) << 32) | (((long) jtm0.j(s03Var2.f)) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= s03Var2.c() && ((int) (4294967295L & jD)) >= s03Var2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        ao80 ao80VarE = e(k6zVar);
        long jD2 = u7x.D(jF, this.e, this.d, ao80VarE.e());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        s03 s03Var3 = new s03((v03) ao80VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jD2);
        this.p = jF;
        int iJ = jtm0.j(s03Var3.c());
        float f = s03Var3.f;
        long jD3 = r4e.d(jF, (((long) jtm0.j(f)) & 4294967295L) | (((long) iJ) << 32));
        this.l = jD3;
        if (this.d != 3 && (((int) (jD3 >> 32)) < s03Var3.c() || ((int) (jD3 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = s03Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = r4e.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(w6k w6kVar) {
        long jA;
        w6k w6kVar2 = this.i;
        if (w6kVar != null) {
            int i = edx.b;
            jA = edx.a(w6kVar.getDensity(), w6kVar.v0());
        } else {
            jA = edx.f7642a;
        }
        if (w6kVar2 == null) {
            this.i = w6kVar;
            this.h = jA;
        } else if (w6kVar == null || this.h != jA) {
            this.i = w6kVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final ao80 e(k6z k6zVar) {
        ao80 v03Var = this.n;
        if (v03Var == null || k6zVar != this.o || v03Var.b()) {
            this.o = k6zVar;
            String str = this.f2921a;
            y9q0 y9q0VarA = afn0.A(this.b, k6zVar);
            iun iunVar = iun.f15405a;
            w6k w6kVar = this.i;
            w6kVar.getClass();
            v03Var = new v03(str, y9q0VarA, iunVar, iunVar, this.c, w6kVar, this.e);
        }
        this.n = v03Var;
        return v03Var;
    }

    public final String toString() {
        return brm0.k(this.s, ", constraints=$)", b1j.n("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", edx.b(this.h), ", history="));
    }
}
