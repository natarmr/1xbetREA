package a;

/* JADX INFO: loaded from: classes.dex */
public final class h7q0 implements p5q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k7q0 f12589a;
    public final /* synthetic */ boolean b;

    public h7q0(k7q0 k7q0Var, boolean z) {
        this.f12589a = k7q0Var;
        this.b = z;
    }

    @Override // a.p5q0
    public final void b() {
        b9q0 b9q0VarD;
        boolean z = this.b;
        blv blvVar = z ? blv.b : blv.c;
        k7q0 k7q0Var = this.f12589a;
        k7q0Var.q(blvVar);
        long jA = h5i0.a(k7q0Var.j(z));
        djz djzVar = k7q0Var.d;
        if (djzVar == null || (b9q0VarD = djzVar.d()) == null) {
            return;
        }
        long jE = b9q0VarD.e(jA);
        k7q0Var.o = jE;
        k7q0Var.p(new ne60(jE));
        k7q0Var.q = 0L;
        k7q0Var.t = -1;
        djz djzVar2 = k7q0Var.d;
        if (djzVar2 != null) {
            ((hgk0) djzVar2.q).setValue(Boolean.TRUE);
        }
        k7q0Var.u(false);
    }

    @Override // a.p5q0
    public final void c() {
        k7q0 k7q0Var = this.f12589a;
        k7q0Var.q(null);
        k7q0Var.p(null);
        k7q0Var.u(true);
    }

    @Override // a.p5q0
    public final void d() {
        k7q0 k7q0Var = this.f12589a;
        k7q0Var.q(null);
        k7q0Var.p(null);
        k7q0Var.u(true);
    }

    @Override // a.p5q0
    public final void e(long j) {
        k7q0 k7q0Var = this.f12589a;
        long jF = ne60.f(k7q0Var.q, j);
        k7q0Var.q = jF;
        k7q0Var.p(new ne60(ne60.f(k7q0Var.o, jF)));
        a8q0 a8q0VarL = k7q0Var.l();
        ne60 ne60VarG = k7q0Var.g();
        ne60VarG.getClass();
        k7q0Var.v(a8q0VarL, ne60VarG.f23370a, false, this.b, m2a.j1, true, new pmv(9));
        k7q0Var.u(false);
    }

    @Override // a.p5q0
    public final void onCancel() {
    }

    @Override // a.p5q0
    public final void a(long j, w4i0 w4i0Var) {
    }
}
