package a;

/* JADX INFO: loaded from: classes4.dex */
public final class x9q extends i3t0 {
    public final i1u o;
    public final i1u p;
    public final v6q q;
    public final zr1 r;
    public final mii0 s;

    public x9q(i1u i1uVar, i1u i1uVar2, v6q v6qVar, zr1 zr1Var, mii0 mii0Var, mne mneVar) {
        v9q v9qVar = new v9q((byte) 0);
        rnp rnpVar = new rnp((byte) 5);
        rwj rwjVar = mneVar.f22085a;
        super(null, v9qVar, rnpVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = i1uVar;
        this.p = i1uVar2;
        this.q = v6qVar;
        this.r = zr1Var;
        this.s = mii0Var;
        sac.V(jiu0.a(this), w9q.f38792a, null, mneVar.b, new hij(this, null, (byte) 23), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        r9q r9qVar = (r9q) obj;
        r9qVar.getClass();
        njx njxVar = r9qVar.f30097a;
        fcq fcqVar = njxVar.d;
        this.r.f44833a.a(cui0.b(new j1p(fcqVar.C(), (byte) 0)), 3353L);
        int iOrdinal = fcqVar.ordinal();
        mii0 mii0Var = this.s;
        if (iOrdinal == 1) {
            i8i.D("option", "random", (kt2) mii0Var.b, "finbet_type_choose");
        } else if (iOrdinal == 2) {
            i8i.D("option", "bear", (kt2) mii0Var.b, "finbet_type_choose");
        } else if (iOrdinal == 3) {
            i8i.D("option", "bull", (kt2) mii0Var.b, "finbet_type_choose");
        }
        this.q.b(njxVar.f23657a);
        G(s9q.f31858a);
    }
}
