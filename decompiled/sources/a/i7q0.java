package a;

/* JADX INFO: loaded from: classes.dex */
public final class i7q0 implements p5q0 {
    public o9q0 b;
    public final /* synthetic */ k7q0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14305a = true;
    public w4i0 c = m2a.g1;

    public i7q0(k7q0 k7q0Var) {
        this.d = k7q0Var;
    }

    @Override // a.p5q0
    public final void a(long j, w4i0 w4i0Var) {
        long j2;
        b9q0 b9q0VarD;
        b9q0 b9q0VarD2;
        k7q0 k7q0Var = this.d;
        if (k7q0Var.i() && ((blv) ((hgk0) k7q0Var.r).getValue()) == null) {
            k7q0Var.q(blv.c);
            k7q0Var.t = -1;
            this.f14305a = true;
            this.c = w4i0Var;
            k7q0Var.m();
            djz djzVar = k7q0Var.d;
            if (djzVar == null || (b9q0VarD2 = djzVar.d()) == null || !b9q0VarD2.c(j)) {
                j2 = j;
                djz djzVar2 = k7q0Var.d;
                if (djzVar2 != null && (b9q0VarD = djzVar2.d()) != null) {
                    int iN = k7q0Var.b.n(b9q0VarD.b(true, j2));
                    a8q0 a8q0VarB = k7q0.b(k7q0Var.l().f440a, s7n0.e(iN, iN));
                    k7q0Var.e(false);
                    omv omvVar = k7q0Var.k;
                    if (omvVar != null) {
                        ((tv90) omvVar).a(0);
                    }
                    k7q0Var.c.invoke(a8q0VarB);
                    k7q0Var.w = new o9q0(a8q0VarB.b);
                }
                this.f14305a = false;
            } else {
                if (k7q0Var.l().f440a.b.length() == 0) {
                    return;
                }
                k7q0Var.e(false);
                long jV = k7q0Var.v(a8q0.a(k7q0Var.l(), null, o9q0.b, 5), j, true, false, this.c, true, new pmv(0));
                j2 = j;
                k7q0Var.p = new o9q0(jV);
                this.b = new o9q0(jV);
            }
            k7q0Var.r(dmv.f6336a);
            k7q0Var.o = j2;
            k7q0Var.p(new ne60(j2));
            k7q0Var.q = 0L;
        }
    }

    @Override // a.p5q0
    public final void c() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    @Override // a.p5q0
    public final void e(long j) {
        b9q0 b9q0VarD;
        o9q0 o9q0Var;
        int iB;
        long jV;
        k7q0 k7q0Var = this.d;
        if (!k7q0Var.i() || k7q0Var.l().f440a.b.length() == 0) {
            return;
        }
        k7q0Var.q = ne60.f(k7q0Var.q, j);
        djz djzVar = k7q0Var.d;
        if (djzVar != null && (b9q0VarD = djzVar.d()) != null) {
            k7q0Var.p(new ne60(ne60.f(k7q0Var.o, k7q0Var.q)));
            if (k7q0Var.p == null) {
                ne60 ne60VarG = k7q0Var.g();
                ne60VarG.getClass();
                if (b9q0VarD.c(ne60VarG.f23370a)) {
                    o9q0Var = k7q0Var.p;
                    if (o9q0Var != null) {
                        iB = (int) (o9q0Var.f24893a >> 32);
                    } else {
                        iB = b9q0VarD.b(false, k7q0Var.o);
                    }
                    ne60 ne60VarG2 = k7q0Var.g();
                    ne60VarG2.getClass();
                    int iB2 = b9q0VarD.b(false, ne60VarG2.f23370a);
                    if (k7q0Var.p != null && iB == iB2) {
                        return;
                    }
                    a8q0 a8q0VarL = k7q0Var.l();
                    ne60 ne60VarG3 = k7q0Var.g();
                    ne60VarG3.getClass();
                    jV = k7q0Var.v(a8q0VarL, ne60VarG3.f23370a, false, false, this.c, true, new pmv(9));
                } else {
                    int iN = k7q0Var.b.n(b9q0VarD.b(true, k7q0Var.o));
                    qe60 qe60Var = k7q0Var.b;
                    ne60 ne60VarG4 = k7q0Var.g();
                    ne60VarG4.getClass();
                    e9d0 e9d0Var = iN == qe60Var.n(b9q0VarD.b(true, ne60VarG4.f23370a)) ? m2a.g1 : m2a.h1;
                    a8q0 a8q0VarL2 = k7q0Var.l();
                    ne60 ne60VarG5 = k7q0Var.g();
                    ne60VarG5.getClass();
                    jV = k7q0Var.v(a8q0VarL2, ne60VarG5.f23370a, false, false, e9d0Var, true, new pmv(9));
                }
            } else {
                o9q0Var = k7q0Var.p;
                if (o9q0Var != null) {
                    iB = (int) (o9q0Var.f24893a >> 32);
                } else {
                    iB = b9q0VarD.b(false, k7q0Var.o);
                }
                ne60 ne60VarG6 = k7q0Var.g();
                ne60VarG6.getClass();
                int iB3 = b9q0VarD.b(false, ne60VarG6.f23370a);
                if (k7q0Var.p != null) {
                }
                a8q0 a8q0VarL3 = k7q0Var.l();
                ne60 ne60VarG7 = k7q0Var.g();
                ne60VarG7.getClass();
                jV = k7q0Var.v(a8q0VarL3, ne60VarG7.f23370a, false, false, this.c, true, new pmv(9));
            }
            this.b = new o9q0(jV);
            if (!o9q0.a(k7q0Var.p, jV)) {
                this.f14305a = false;
            }
        }
        k7q0Var.u(false);
    }

    public final void f() {
        k7q0 k7q0Var = this.d;
        k7q0Var.q(null);
        k7q0Var.p(null);
        this.c = m2a.g1;
        k7q0Var.u(true);
        o9q0 o9q0Var = this.b;
        boolean zC = o9q0.c(o9q0Var != null ? o9q0Var.f24893a : k7q0Var.l().b);
        k7q0Var.r(zC ? dmv.c : dmv.b);
        djz djzVar = k7q0Var.d;
        if (djzVar != null) {
            ((hgk0) djzVar.m).setValue(Boolean.valueOf(!zC && cvm0.k(k7q0Var, true)));
        }
        djz djzVar2 = k7q0Var.d;
        if (djzVar2 != null) {
            ((hgk0) djzVar2.n).setValue(Boolean.valueOf(!zC && cvm0.k(k7q0Var, false)));
        }
        djz djzVar3 = k7q0Var.d;
        if (djzVar3 != null) {
            ((hgk0) djzVar3.o).setValue(Boolean.valueOf(zC && cvm0.k(k7q0Var, true)));
        }
        if (this.f14305a) {
            k7q0Var.n(k7q0Var.p);
        }
        k7q0Var.p = null;
    }

    @Override // a.p5q0
    public final void onCancel() {
        f();
    }

    @Override // a.p5q0
    public final void b() {
    }

    @Override // a.p5q0
    public final void d() {
    }
}
