package a;

/* JADX INFO: loaded from: classes.dex */
public final class g7q0 implements p5q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k7q0 f10829a;

    public g7q0(k7q0 k7q0Var) {
        this.f10829a = k7q0Var;
    }

    @Override // a.p5q0
    public final void a(long j, w4i0 w4i0Var) {
        b9q0 b9q0VarD;
        k7q0 k7q0Var = this.f10829a;
        long jA = h5i0.a(k7q0Var.j(true));
        djz djzVar = k7q0Var.d;
        if (djzVar == null || (b9q0VarD = djzVar.d()) == null) {
            return;
        }
        long jE = b9q0VarD.e(jA);
        k7q0Var.o = jE;
        k7q0Var.p(new ne60(jE));
        k7q0Var.q = 0L;
        k7q0Var.q(blv.f2811a);
        k7q0Var.u(false);
    }

    @Override // a.p5q0
    public final void c() {
        k7q0 k7q0Var = this.f10829a;
        k7q0Var.q(null);
        k7q0Var.p(null);
    }

    @Override // a.p5q0
    public final void d() {
        k7q0 k7q0Var = this.f10829a;
        k7q0Var.q(null);
        k7q0Var.p(null);
    }

    @Override // a.p5q0
    public final void e(long j) {
        b9q0 b9q0VarD;
        omv omvVar;
        k7q0 k7q0Var = this.f10829a;
        k7q0Var.q = ne60.f(k7q0Var.q, j);
        djz djzVar = k7q0Var.d;
        if (djzVar == null || (b9q0VarD = djzVar.d()) == null) {
            return;
        }
        k7q0Var.p(new ne60(ne60.f(k7q0Var.o, k7q0Var.q)));
        qe60 qe60Var = k7q0Var.b;
        ne60 ne60VarG = k7q0Var.g();
        ne60VarG.getClass();
        int iN = qe60Var.n(b9q0VarD.b(true, ne60VarG.f23370a));
        long jE = s7n0.e(iN, iN);
        if (o9q0.b(jE, k7q0Var.l().b)) {
            return;
        }
        djz djzVar2 = k7q0Var.d;
        if ((djzVar2 == null || ((Boolean) ((hgk0) djzVar2.q).getValue()).booleanValue()) && (omvVar = k7q0Var.k) != null) {
            ((tv90) omvVar).a(9);
        }
        k7q0Var.c.invoke(k7q0.b(k7q0Var.l().f440a, jE));
        k7q0Var.w = new o9q0(jE);
    }

    @Override // a.p5q0
    public final void b() {
    }

    @Override // a.p5q0
    public final void onCancel() {
    }
}
