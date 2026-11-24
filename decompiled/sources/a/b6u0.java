package a;

/* JADX INFO: loaded from: classes.dex */
public final class b6u0 extends lm40 implements ehl {
    public vls0 o;
    public pzn p;
    public alo q;
    public toj0 r;

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        g7zVar.a();
        vls0 vls0Var = this.o;
        a6u0 a6u0Var = new a6u0(this, (byte) 0);
        toj0 toj0Var = this.r;
        uls0 uls0VarA = vls0Var.a(a6u0Var, toj0Var.a() ? new y3d(toj0Var.e) : null, null, new a6u0(this, (byte) 1));
        toj0 toj0Var2 = this.r;
        long j = ((y3d) uls0VarA.getValue()).f41946a;
        sd60 sd60Var = toj0Var2.c;
        if (toj0Var2.b() && ((Boolean) ((hgk0) ((pz40) sd60Var.h)).getValue()).booleanValue()) {
            j = ((y3d) ((hgk0) ((pz40) sd60Var.i)).getValue()).f41946a;
        }
        long j2 = j;
        if (toj0Var2.b()) {
            toj0Var2.e = j2;
        }
        if (y3d.d(j2) == 0.0f) {
            return;
        }
        jms0 jms0Var = this.p.f27854a;
        jms0 jms0Var2 = this.q.f1078a;
        fhl.u(g7zVar, j2, 0L, 0L, 0.0f, null, null, 0, 126);
    }
}
