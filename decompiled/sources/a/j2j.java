package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j2j extends eiu0 {
    public final cu c;
    public final mne d;
    public final kki e;
    public final duj f;
    public final kc60 g;
    public final nmt h;
    public final g4u i;
    public final n660 j;
    public final m1e k;
    public final g4u l;
    public final sje m;
    public c4m0 n;
    public bby o;
    public c4m0 p;
    public bby q;
    public c4m0 r;
    public bby s;
    public bby t;
    public bby u;
    public boolean v;
    public boolean w;
    public final sff0 x;
    public final qoj0 y;

    public j2j(cu cuVar, mne mneVar, kki kkiVar, duj dujVar, kc60 kc60Var, nmt nmtVar, g4u g4uVar, n660 n660Var, m1e m1eVar, g4u g4uVar2, pru pruVar) {
        m1eVar.getClass();
        this.c = cuVar;
        this.d = mneVar;
        this.e = kkiVar;
        this.f = dujVar;
        this.g = kc60Var;
        this.h = nmtVar;
        this.i = g4uVar;
        this.j = n660Var;
        this.k = m1eVar;
        this.l = g4uVar2;
        dvj dvjVar = mneVar.b;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.m = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        this.x = pruVar.a();
        this.y = roj0.a(0, 1, i99.b);
    }

    public final void A(Throwable th) {
        this.f.b(th, new chh(this, th, (byte) 28));
    }

    public final void B(long j) {
        bby bbyVar = this.q;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.q = sac.V(jiu0.a(s()), new y6h(1, this, j2j.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, this.d.b, new wg0(j, this, yjeVar, (byte) 3), 10);
    }

    @Override // a.eiu0
    public final void t() {
        v();
        bby bbyVar = this.t;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.u;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        d5c.G(this.m, null);
    }

    public final void v() {
        c4m0 c4m0Var = this.n;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.p;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        c4m0 c4m0Var3 = this.r;
        if (c4m0Var3 != null) {
            c4m0Var3.cancel(null);
        }
        w();
    }

    public final void w() {
        bby bbyVar = this.t;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.t = sac.V(jiu0.a(s()), g2j.f10560a, null, this.d.b, new h2j(this, null, (byte) 0), 10);
        }
    }

    public final void x() {
        dvj dvjVar = this.d.b;
        c4m0 c4m0Var = this.n;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            cu cuVar = this.c;
            this.n = sac.T(new a1g(((rpt) cuVar.b).f(), cuVar, (byte) 4), d5c.S(jiu0.a(s()), dvjVar), new d7e(2, this, j2j.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 24));
        }
        z();
        y();
        sac.T(new fnq(dtb.z(this.g.a(), 1), new e9g(this, null, (byte) 12), (byte) 4), d5c.S(jiu0.a(s()), dvjVar), new d7e(2, this, j2j.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 22));
    }

    public final void y() {
        c4m0 c4m0Var = this.r;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.r = sac.T(new fnq(this.k.b(), new i2j(this, null, b), (byte) 4), d5c.S(jiu0.a(s()), this.d.b), new d7e(2, this, j2j.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 23));
        }
    }

    public final void z() {
        if (this.v) {
            return;
        }
        bby bbyVar = this.o;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.o = sac.V(jiu0.a(s()), new y6h(1, this, j2j.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.d.b, new ya(this, null, (byte) 22), 10);
        }
    }
}
