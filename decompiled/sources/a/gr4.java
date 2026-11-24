package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gr4 extends i3t0 {
    public static final /* synthetic */ int q = 0;
    public final yo4 o;
    public final zr1 p;

    /* JADX WARN: Illegal instructions before constructor call */
    public gr4(ctf0 ctf0Var, yo4 yo4Var, zr1 zr1Var, mne mneVar) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new a04((byte) 16), cvm0.p(rwjVar, rwjVar), new ep4(ctf0Var, (byte) 1), (yzn0) null);
        this.o = yo4Var;
        this.p = zr1Var;
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(zq4 zq4Var) {
        zq4Var.getClass();
        boolean zEquals = zq4Var.equals(yq4.f43058a);
        zr1 zr1Var = this.p;
        yo4 yo4Var = this.o;
        if (zEquals) {
            i8i.D("action", "active_sessions", yo4Var.f42966a, "authenticator_bottom_click");
            zr1Var.f44833a.a(cui0.b(new j1p("off", (byte) 0)), 3342L);
            G(new dr4(n680.f22985a));
        } else if (zq4Var.equals(yq4.b)) {
            i8i.D("action", "off", yo4Var.f42966a, "authenticator_bottom_click");
            zr1Var.f44833a.a(cui0.b(new j1p("active_sessions", (byte) 0)), 3342L);
            G(new dr4(n680.b));
        } else if (zq4Var.equals(xq4.f41297a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
