package a;

/* JADX INFO: loaded from: classes3.dex */
public final class l7b0 extends w3k implements f0s {
    public final l0s c;
    public final g2v d;
    public final ctf0 e;
    public final y78 f;
    public final j3c g;
    public final lbu h;
    public final qgd i;
    public final luu j;
    public final ywq0 k;
    public final b7b0 l;
    public final m1e m;
    public final mne n;
    public final rkt0 o;
    public final vqc p;
    public final h3c q;
    public final viu r;
    public final p7m0 s;
    public bby t;
    public bby u;
    public bby v;
    public boolean w;
    public final n0o0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7b0(vzg0 vzg0Var, l0s l0sVar, g2v g2vVar, ctf0 ctf0Var, y78 y78Var, j3c j3cVar, lbu lbuVar, pru pruVar, qgd qgdVar, luu luuVar, ywq0 ywq0Var, b7b0 b7b0Var, m1e m1eVar, mne mneVar, rkt0 rkt0Var, vqc vqcVar, h3c h3cVar, viu viuVar) {
        super(vzg0Var, kotlin.collections.a.c(l0sVar));
        ctf0Var.getClass();
        m1eVar.getClass();
        this.c = l0sVar;
        this.d = g2vVar;
        this.e = ctf0Var;
        this.f = y78Var;
        this.g = j3cVar;
        this.h = lbuVar;
        this.i = qgdVar;
        this.j = luuVar;
        this.k = ywq0Var;
        this.l = b7b0Var;
        this.m = m1eVar;
        this.n = mneVar;
        this.o = rkt0Var;
        this.p = vqcVar;
        this.q = h3cVar;
        this.r = viuVar;
        this.s = q7m0.a(new g7b0(true));
        this.w = true;
        this.x = maz.b(new b6u(pruVar, (byte) 29));
        l0sVar.z = new ir2();
    }

    @Override // a.etr
    public final void b(kia kiaVar) {
        sac.V(jiu0.a(this), j7b0.f16032a, null, null, new tr(this, kiaVar.c, kiaVar.f18327a, null, (byte) 11), 14);
        this.c.b(kiaVar);
    }

    @Override // a.etr
    public final void c(mia miaVar) {
        this.c.c(miaVar);
    }

    @Override // a.etr
    public final void d(oia oiaVar) {
        sac.V(jiu0.a(this), j7b0.f16032a, null, null, new tr(this, oiaVar.c, oiaVar.f25300a, null, (byte) 11), 14);
        this.c.d(oiaVar);
    }

    @Override // a.f0s
    public final void e(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.c.e(zxj0Var, m0k0Var);
    }

    @Override // a.f0s
    public final gmq h() {
        return this.c.B;
    }

    @Override // a.etr
    public final void i(iia iiaVar) {
        this.c.i(iiaVar);
    }

    @Override // a.f0s
    public final void j() {
        this.c.j();
    }

    @Override // a.etr
    public final void k(nia niaVar) {
        this.c.k(niaVar);
    }

    @Override // a.f0s
    public final ol60 l() {
        return this.c.A;
    }

    @Override // a.etr
    public final void m(oia oiaVar) {
        this.c.m(oiaVar);
    }

    @Override // a.f0s
    public final void n(m0k0 m0k0Var, m97 m97Var, boolean z) {
        this.c.n(m0k0Var, m97Var, z);
    }

    @Override // a.etr
    public final void o(lia liaVar) {
        this.c.o(liaVar);
    }

    @Override // a.f0s
    public final void q(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.c.q(zxj0Var, m0k0Var);
    }

    @Override // a.etr
    public final void r(iia iiaVar) {
        l0s l0sVar = this.c;
        l0sVar.getClass();
        l0sVar.v(iiaVar, ctc.b);
    }

    public final void w(d7b0 d7b0Var) {
        p7m0 p7m0Var = this.s;
        i7b0 i7b0Var = (i7b0) p7m0Var.getValue();
        d7b0 d7b0Var2 = d7b0.b;
        if (d7b0Var == d7b0Var2) {
            bby bbyVar = this.t;
            if (bbyVar != null && bbyVar.isActive()) {
                return;
            }
            if (i7b0Var instanceof f7b0) {
                Throwable th = ((f7b0) i7b0Var).f9053a;
                if (!hic.C(th) && !(th instanceof hr30)) {
                    return;
                }
            }
        }
        v3c.N(this.t);
        byte b = 0;
        yje yjeVar = null;
        if (d7b0Var == d7b0Var2 && ((i7b0Var instanceof f7b0) || (i7b0Var instanceof h7b0))) {
            g7b0 g7b0Var = new g7b0(false);
            p7m0Var.getClass();
            p7m0Var.o(null, g7b0Var);
            bby bbyVar2 = this.v;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.v = sac.V(jiu0.a(this), new kma0((byte) 23), null, this.n.b, new k7b0(this, yjeVar, b), 10);
        } else if (!(i7b0Var instanceof e7b0)) {
            g7b0 g7b0Var2 = new g7b0(true);
            p7m0Var.getClass();
            p7m0Var.o(null, g7b0Var2);
        }
        this.t = sac.V(jiu0.a(this), new yr80(this, (byte) 25), null, null, new g21(this, d7b0Var == d7b0.f5587a, yjeVar, (byte) 2), 14);
    }
}
