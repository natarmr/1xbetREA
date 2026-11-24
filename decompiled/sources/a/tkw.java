package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tkw extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public c4m0 A;
    public bby B;
    public final i1w0 o;
    public final a6u p;
    public final hjd q;
    public final mne r;
    public final m1e s;
    public final kys0 t;
    public final uxs0 u;
    public final vjp v;
    public final y9g w;
    public final gle0 x;
    public bby y;
    public bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public tkw(i1w0 i1w0Var, g2v g2vVar, ctf0 ctf0Var, a6u a6uVar, luu luuVar, y78 y78Var, lbu lbuVar, pru pruVar, svu svuVar, wiu wiuVar, r9u r9uVar, hjd hjdVar, mne mneVar, m1e m1eVar, kys0 kys0Var, uxs0 uxs0Var, vjp vjpVar, y9g y9gVar, gle0 gle0Var) {
        ctf0Var.getClass();
        r9uVar.getClass();
        m1eVar.getClass();
        y9gVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new co0(luuVar, lbuVar, pruVar, svuVar, wiuVar, r9uVar), g090VarP, new mlb(g2vVar, ctf0Var, y78Var, (byte) 8), (yzn0) null);
        this.o = i1w0Var;
        this.p = a6uVar;
        this.q = hjdVar;
        this.r = mneVar;
        this.s = m1eVar;
        this.t = kys0Var;
        this.u = uxs0Var;
        this.v = vjpVar;
        this.w = y9gVar;
        this.x = gle0Var;
        i3t0.K(this, null, null, new epp(this, null, (byte) 9), 3);
    }

    public final void M() {
        e3c.n(this.A);
        this.A = i3t0.L(this, new fnq(i120.W(this.s.b()), new gkr(this, null, (byte) 25), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xhw xhwVar = (xhw) obj;
        xhwVar.getClass();
        super.x(xhwVar);
        if (!(xhwVar instanceof ggw)) {
            if (!(xhwVar instanceof vhw)) {
                t9f.b();
                return;
            }
            vhw vhwVar = (vhw) xhwVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ymx ymxVar = ymx.INTERVAL_100;
            if (jCurrentTimeMillis > 200) {
                bby bbyVar = this.y;
                yje yjeVar = null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.y = i3t0.K(this, null, null, new r72(vhwVar, this, yjeVar, (byte) 11), 3);
                return;
            }
            return;
        }
        ggw ggwVar = (ggw) xhwVar;
        if (ggwVar.equals(agw.f846a)) {
            E();
            return;
        }
        if (ggwVar.equals(cgw.f4333a)) {
            e3c.n(this.A);
            e3c.n(this.B);
            e3c.n(this.z);
        } else {
            if (!ggwVar.equals(egw.f7782a)) {
                t9f.b();
                return;
            }
            M();
            bby bbyVar2 = this.z;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.z = i3t0.F(this, this.q, this.r.f22085a, null, new x2w((byte) 19), 118);
            }
        }
    }
}
