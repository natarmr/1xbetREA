package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nm70 extends w46 {
    public final hpb b;
    public final egu c;
    public final pqt d;
    public final pyb e;
    public final vcu f;
    public final spx g;
    public final fqx h;
    public final oqt i;
    public final nqt j;
    public final fq k;
    public final gni0 l;
    public final boolean m;
    public final ztt n;
    public final xcc o;
    public final m1e p;
    public final hni0 q;
    public final mne r;
    public final q99 s;
    public final p7m0 t;
    public final p7m0 u;
    public final p7m0 v;
    public boolean w;
    public boolean x;

    public nm70(hs60 hs60Var, ipi0 ipi0Var, hpb hpbVar, egu eguVar, pqt pqtVar, pyb pybVar, vcu vcuVar, spx spxVar, fqx fqxVar, oqt oqtVar, nqt nqtVar, fq fqVar, qa60 qa60Var, gni0 gni0Var, i1w0 i1w0Var, boolean z, ztt zttVar, xcc xccVar, m1e m1eVar, hni0 hni0Var, mne mneVar) {
        ipi0Var.getClass();
        hpbVar.getClass();
        eguVar.getClass();
        pqtVar.getClass();
        pybVar.getClass();
        vcuVar.getClass();
        spxVar.getClass();
        fqxVar.getClass();
        oqtVar.getClass();
        nqtVar.getClass();
        fqVar.getClass();
        qa60Var.getClass();
        gni0Var.getClass();
        i1w0Var.getClass();
        zttVar.getClass();
        xccVar.getClass();
        hni0Var.getClass();
        this.b = hpbVar;
        this.c = eguVar;
        this.d = pqtVar;
        this.e = pybVar;
        this.f = vcuVar;
        this.g = spxVar;
        this.h = fqxVar;
        this.i = oqtVar;
        this.j = nqtVar;
        this.k = fqVar;
        this.l = gni0Var;
        this.m = z;
        this.n = zttVar;
        this.o = xccVar;
        this.p = m1eVar;
        this.q = hni0Var;
        this.r = mneVar;
        yje yjeVar = null;
        this.s = vtb.d(0, null, null, 7);
        this.t = q7m0.a(vl70.f37608a);
        Boolean bool = Boolean.FALSE;
        this.u = q7m0.a(bool);
        this.v = q7m0.a(bool);
        this.w = true;
        this.x = oqtVar.a();
        ipi0Var.f15165a.f26724a.g = false;
        j5t.a(bool, "instantBetVisibility");
        Class<nm70> cls = nm70.class;
        slb.U(new dnq(new fnq(qa60Var.a(), new hi70(2, this, cls, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 6), (byte) 4), new pr60(3, yjeVar, (byte) 11), (byte) 1), jiu0.a(this));
        sac.V(jiu0.a(this), new gk70(1, this, cls, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, null, new mm70(this, yjeVar, (byte) 1), 14);
    }

    public final void A(xl70 xl70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 22), null, this.r.c, new wk70(this, xl70Var, null, (byte) 7), 10);
    }

    public final void B(im70 im70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 21), null, this.r.c, new wk70(this, im70Var, null, (byte) 8), 10);
    }

    public final void C(boolean z) {
        twn.A(z || (this.m && this.f.a().a()), this.u, null);
    }

    public final void D() {
        oqt oqtVar = this.i;
        B(new zl70(oqtVar.a()));
        if (oqtVar.a() && this.g.a()) {
            B(new cm70(this.d.f27431a.f26724a.e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    public final void E() {
        boolean z;
        boolean zA = this.i.a();
        vcu vcuVar = this.f;
        if ((zA || this.x) && vcuVar.a() == vrs.b) {
            z = true;
        } else {
            pyb pybVar = this.e;
            if ((pybVar.a() && vcuVar.a() == vrs.f37917a) || (pybVar.a() && this.h.a() && vcuVar.a() == vrs.b)) {
                z = true;
            } else {
                z = false;
            }
        }
        B(new dm70(z));
    }

    public final void F() {
        if (this.f.a() == vrs.f37917a || this.m) {
            boolean zA = this.c.a();
            B(new em70(zA));
            w(new ole(zA));
        }
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), jm70.f16753a, null, this.r.f22085a, new wk70(this, zy5Var, null, (byte) 5), 10);
    }

    public final void x() {
        boolean z = this.m && this.n.a().f4905a.f3145a != esr.FREE_BET;
        if (!this.i.a() || z) {
            C(z);
        } else {
            B(bm70.f2825a);
        }
    }

    public final void y() {
        if (this.f.a().a() || this.g.a()) {
            this.q.a(false);
            D();
            E();
        }
    }

    public final void z() {
        sac.V(jiu0.a(this), lm70.f20284a, null, this.r.f22085a, new mm70(this, null, (byte) 0), 10);
        B(new yl70(this.j.a()));
        B(gm70.f11530a);
        B(new zl70(this.i.a()));
    }
}
