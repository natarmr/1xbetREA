package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xgc extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final mne o;
    public final m1e p;
    public final tgu q;
    public c4m0 r;
    public c4m0 s;

    public xgc(mne mneVar, m1e m1eVar, tgu tguVar) {
        m1eVar.getClass();
        zxb zxbVar = new zxb((byte) 12);
        kgc kgcVar = kgc.f18231a;
        rwj rwjVar = mneVar.f22085a;
        super(null, zxbVar, kgcVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = mneVar;
        this.p = m1eVar;
        this.q = tguVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        mgc mgcVar = (mgc) obj;
        mgcVar.getClass();
        super.x(mgcVar);
        if (mgcVar instanceof sgc) {
            G(new pgc(((sgc) mgcVar).f32153a));
            return;
        }
        yje yjeVar = null;
        if (mgcVar instanceof tgc) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, qgc.a((qgc) value, ((tgc) mgcVar).f33903a, null, 2)));
            return;
        }
        if (!(mgcVar instanceof ngc)) {
            if (!(mgcVar instanceof ogc)) {
                t9f.b();
                return;
            } else {
                e3c.n(this.r);
                e3c.n(this.s);
                return;
            }
        }
        c4m0 c4m0Var = this.r;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.r = sac.T(new fnq(this.p.b(), new wib(this, yjeVar, (byte) 7), (byte) 4), d5c.S(jiu0.a(this), this.o.f22085a), ugc.h);
        }
    }
}
