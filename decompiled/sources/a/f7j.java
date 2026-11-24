package a;

/* JADX INFO: loaded from: classes4.dex */
public final class f7j extends w46 {
    public final bzu b;
    public final yqc c;
    public final ntu d;
    public final mne e;
    public final g2v f;
    public final duj g;
    public final p7m0 h;
    public final c4m0 i;
    public bby j;
    public boolean k;

    public f7j(bzu bzuVar, abu abuVar, yqc yqcVar, ntu ntuVar, i1w0 i1w0Var, mne mneVar, g2v g2vVar, duj dujVar, m1e m1eVar) {
        i1w0Var.getClass();
        this.b = bzuVar;
        this.c = yqcVar;
        this.d = ntuVar;
        this.e = mneVar;
        this.f = g2vVar;
        this.g = dujVar;
        this.h = q7m0.a(z6j.f43870a);
        c4m0 c4m0Var = this.i;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.i = slb.U(new fnq(m1eVar.b(), new e7j(this, yjeVar, b), (byte) 4), jiu0.a(this));
        }
        slb.U(new fnq(new p6d(vtb.M(((yzi) ((ali) ((hnu) abuVar.b).f13365a).b).f43514a), vtb.M(((yzi) ((v4v) abuVar.c).f36800a.b).b), new qos(3, yjeVar, (byte) 8), (byte) 1), new e9g(this, yjeVar, (byte) 14), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
    }

    public final void w() {
        bby bbyVar = this.j;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.j = sac.V(jiu0.a(this), new y6h(1, this, f7j.class, "handleErrorWithLottie", "handleErrorWithLottie(Ljava/lang/Throwable;)V", 0, (byte) 15), null, this.e.b, new e7j(this, null, (byte) 0), 10);
        }
    }

    public final void x(d7j d7jVar) {
        sac.V(jiu0.a(this), new x2i((byte) 9), null, this.e.c, new b1f((Object) this, (Object) d7jVar, (yje) null, (byte) 16), 10);
    }
}
