package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tw0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final ctf0 o;
    public final duj p;
    public final mne q;
    public final oeg0 r;
    public final hcp0 s;
    public bby t;
    public bby u;
    public bby v;
    public final zw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(us00 us00Var, bv0 bv0Var, ctf0 ctf0Var, duj dujVar, mne mneVar, oeg0 oeg0Var, j1q0 j1q0Var, hcp0 hcp0Var, bzt bztVar) {
        super(null, new kk0(bv0Var, j1q0Var, bztVar, (byte) 1), new uc(ctf0Var, (byte) 7), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        oeg0Var.getClass();
        j1q0Var.getClass();
        this.o = ctf0Var;
        this.p = dujVar;
        this.q = mneVar;
        this.r = oeg0Var;
        this.s = hcp0Var;
        this.w = new zw0(us00Var, mneVar);
        i3t0.K(this, null, new ow0(this, (byte) 0), new pn(this, null, (byte) 4), 1);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.v;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, jw0.a((jw0) value, false, false, true, null, 3455)));
            this.v = sac.V(jiu0.a(this), rw0.f31196a, new pw0(this, (byte) 0), null, new pa((Object) this, (yje) null, (byte) 13), 12);
        }
    }

    public final void N() {
        sac.V(jiu0.a(this), new eo0((byte) 8), null, null, new qw0(this, null, (byte) 1), 14);
    }

    @Override // a.diu0
    public final void v() {
        zw0 zw0Var = this.w;
        zw0Var.b();
        zw0Var.h = null;
        zw0Var.f = null;
        zw0Var.i = null;
        zw0Var.j = null;
        zw0Var.k = null;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        vs0 vs0Var = (vs0) obj;
        vs0Var.getClass();
        if (!((jw0) D()).j || (vs0Var instanceof ms0)) {
            boolean z = vs0Var instanceof ss0;
            zw0 zw0Var = this.w;
            if (z) {
                zw0Var.c.setBaseContext(((ss0) vs0Var).f32704a);
                return;
            }
            if (vs0Var.equals(ts0.f34440a)) {
                zw0Var.c.setBaseContext(zw0Var.f45083a);
                return;
            }
            if (vs0Var.equals(rs0.f31010a)) {
                zw0Var.f();
                return;
            }
            if (vs0Var.equals(qs0.f29234a)) {
                zw0Var.e();
                return;
            }
            if (vs0Var.equals(ks0.f18791a)) {
                bby bbyVar = this.t;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.t = sac.V(jiu0.a(this), new t90(1, this.p, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.q.b, new qw0(this, null, (byte) 0), 10);
                    return;
                }
                return;
            }
            if (vs0Var.equals(os0.f25760a)) {
                M();
                return;
            }
            if (vs0Var.equals(ns0.f24030a)) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, jw0.a((jw0) value, false, false, false, null, 3071)));
                return;
            }
            if (vs0Var.equals(ls0.f20555a)) {
                N();
                return;
            }
            if (vs0Var.equals(us0.f36185a)) {
                M();
                return;
            }
            if (vs0Var.equals(ps0.f27490a)) {
                G(ew0.f8497a);
            } else if (vs0Var.equals(ms0.f22296a)) {
                E();
            } else {
                t9f.b();
            }
        }
    }
}
