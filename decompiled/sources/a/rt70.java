package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rt70 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final mne o;
    public final pht0 p;
    public final hqx q;
    public final uq70 r;
    public final wri0 s;
    public final xr t;
    public final xfu u;
    public final ani0 v;
    public c4m0 w;
    public c4m0 x;
    public final c4m0 y;

    public rt70(String str, mne mneVar, pht0 pht0Var, hqx hqxVar, uq70 uq70Var, m1e m1eVar, wri0 wri0Var, rlt0 rlt0Var, qlt0 qlt0Var, xr xrVar, xfu xfuVar, ani0 ani0Var) {
        uq70Var.getClass();
        m1eVar.getClass();
        fq60 fq60Var = new fq60((byte) 28);
        wk60 wk60Var = new wk60((byte) 28);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, fq60Var, wk60Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = mneVar;
        this.p = pht0Var;
        this.q = hqxVar;
        this.r = uq70Var;
        this.s = wri0Var;
        this.t = xrVar;
        this.u = xfuVar;
        this.v = ani0Var;
        c4m0 c4m0Var = this.y;
        byte b = 4;
        byte b2 = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.y = sac.T(new fnq(m1eVar.b(), new jt70(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), kt70.h);
        }
        sac.V(jiu0.a(this), nt70.f24083a, null, rwjVar, new jt70(this, yjeVar, b), 10);
        gt70 gt70Var = rlt0Var.f30715a;
        gt70Var.getClass();
        ft70 ft70Var = gt70Var.f11868a;
        ft70Var.getClass();
        if (!Intrinsics.d(ft70Var.f10097a, "org.xplatform.feature.online_call.impl.service.OnlineCallService")) {
            ft70Var.f10097a = "org.xplatform.feature.online_call.impl.service.OnlineCallService";
        }
        gt70 gt70Var2 = qlt0Var.f28952a;
        gt70Var2.getClass();
        ft70 ft70Var2 = gt70Var2.f11868a;
        ft70Var2.getClass();
        if (Intrinsics.d(ft70Var2.b, str)) {
            return;
        }
        ft70Var2.b = str;
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(dt70 dt70Var) {
        dt70Var.getClass();
        if (Intrinsics.d(dt70Var, bt70.f3169a)) {
            N();
        } else if (Intrinsics.d(dt70Var, ct70.f4922a)) {
            E();
        } else {
            t9f.b();
        }
    }

    public final void N() {
        this.s.a(false);
        uq70 uq70Var = this.r;
        uq70Var.a();
        uq70Var.close();
        G(ht70.f13621a);
    }
}
