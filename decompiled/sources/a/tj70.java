package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tj70 extends w46 {
    public final hpb b;
    public final egu c;
    public final pqt d;
    public final pyb e;
    public final vcu f;
    public final spx g;
    public final oqt h;
    public final nqt i;
    public final fq j;
    public final gni0 k;
    public final mne l;
    public final xcc m;
    public final m1e n;
    public final hni0 o;
    public final q99 p;
    public final p7m0 q;
    public final p7m0 r;
    public final p7m0 s;
    public boolean t;
    public boolean u;

    public tj70(hs60 hs60Var, ipi0 ipi0Var, hpb hpbVar, egu eguVar, pqt pqtVar, pyb pybVar, vcu vcuVar, spx spxVar, oqt oqtVar, nqt nqtVar, fq fqVar, qa60 qa60Var, gni0 gni0Var, mne mneVar, i1w0 i1w0Var, xcc xccVar, m1e m1eVar, hni0 hni0Var) {
        ipi0Var.getClass();
        hpbVar.getClass();
        eguVar.getClass();
        pqtVar.getClass();
        pybVar.getClass();
        vcuVar.getClass();
        spxVar.getClass();
        oqtVar.getClass();
        nqtVar.getClass();
        fqVar.getClass();
        qa60Var.getClass();
        gni0Var.getClass();
        i1w0Var.getClass();
        xccVar.getClass();
        hni0Var.getClass();
        this.b = hpbVar;
        this.c = eguVar;
        this.d = pqtVar;
        this.e = pybVar;
        this.f = vcuVar;
        this.g = spxVar;
        this.h = oqtVar;
        this.i = nqtVar;
        this.j = fqVar;
        this.k = gni0Var;
        this.l = mneVar;
        this.m = xccVar;
        this.n = m1eVar;
        this.o = hni0Var;
        yje yjeVar = null;
        this.p = vtb.d(0, null, null, 7);
        this.q = q7m0.a(bj70.f2692a);
        Boolean bool = Boolean.FALSE;
        this.r = q7m0.a(bool);
        this.s = q7m0.a(bool);
        this.t = true;
        this.u = oqtVar.a();
        ipi0Var.f15165a.f26724a.g = false;
        j5t.a(bool, "instantBetVisibility");
        Class<tj70> cls = tj70.class;
        slb.U(new dnq(new fnq(qa60Var.a(), new hi70(2, this, cls, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 2), (byte) 4), new pr60(3, yjeVar, (byte) 8), (byte) 1), jiu0.a(this));
        sac.V(jiu0.a(this), new cf70(1, this, cls, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, null, new sj70(this, yjeVar, (byte) 1), 14);
    }

    public final void A(oj70 oj70Var) {
        qjj.W(jiu0.a(this), null, null, new ku60(this, oj70Var, null, (byte) 28), 3);
    }

    public final void B(boolean z) {
        twn.A(z, this.r, null);
    }

    public final void C() {
        oqt oqtVar = this.h;
        A(new fj70(oqtVar.a()));
        if (oqtVar.a() && this.g.a()) {
            A(new ij70(this.d.f27431a.f26724a.e));
        }
    }

    public final void D() {
        boolean zA = this.h.a();
        vcu vcuVar = this.f;
        A(new jj70(((zA || this.u) && vcuVar.a() == vrs.b) || (this.e.a() && vcuVar.a() == vrs.f37917a)));
    }

    public final void E() {
        if (this.f.a() == vrs.f37917a) {
            boolean zA = this.c.a();
            A(new kj70(zA));
            w(new ole(zA));
        }
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), pj70.f27074a, null, this.l.f22085a, new ku60(this, zy5Var, null, (byte) 25), 10);
    }

    public final void x() {
        if (this.f.a().a() || this.g.a()) {
            this.o.a(false);
            C();
            D();
        }
    }

    public final void y() {
        sac.V(jiu0.a(this), rj70.f30579a, null, this.l.f22085a, new sj70(this, null, (byte) 0), 10);
        A(new ej70(this.i.a()));
        A(mj70.f21882a);
        A(new fj70(this.h.a()));
    }

    public final void z(dj70 dj70Var) {
        qjj.W(jiu0.a(this), null, null, new ku60(this, dj70Var, null, (byte) 27), 3);
    }
}
