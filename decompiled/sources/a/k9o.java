package a;

/* JADX INFO: loaded from: classes4.dex */
public final class k9o extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public long A;
    public bby B;
    public bby C;
    public bby D;
    public c4m0 E;
    public final sff0 F;
    public final hjd o;
    public final hzg p;
    public final pru q;
    public final pwi r;
    public final mne s;
    public final m1e t;
    public final b8u u;
    public final ih5 v;
    public final zr1 w;
    public final pyg0 x;
    public final qyg0 y;
    public final gvu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public k9o(hjd hjdVar, hzg hzgVar, pru pruVar, g2v g2vVar, pwi pwiVar, mne mneVar, ctf0 ctf0Var, y78 y78Var, m1e m1eVar, svu svuVar, b8u b8uVar, ih5 ih5Var, zr1 zr1Var, pyg0 pyg0Var, qyg0 qyg0Var, lbu lbuVar, gvu gvuVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new mr0(pruVar, lbuVar, svuVar, r9uVar, (byte) 12), cvm0.p(rwjVar, rwjVar), new mlb(ctf0Var, g2vVar, y78Var, (byte) 4), (yzn0) null);
        this.o = hjdVar;
        this.p = hzgVar;
        this.q = pruVar;
        this.r = pwiVar;
        this.s = mneVar;
        this.t = m1eVar;
        this.u = b8uVar;
        this.v = ih5Var;
        this.w = zr1Var;
        this.x = pyg0Var;
        this.y = qyg0Var;
        this.z = gvuVar;
        this.F = pruVar.a();
    }

    public final void M() {
        e3c.n(this.E);
        this.E = i3t0.L(this, new fnq(i120.W(this.t.b()), new hij(this, null, (byte) 12), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        s7o s7oVar = (s7o) obj;
        s7oVar.getClass();
        super.x(s7oVar);
        if (!(s7oVar instanceof h7o)) {
            if (!(s7oVar instanceof r7o)) {
                t9f.b();
                return;
            }
            r7o r7oVar = (r7o) s7oVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.A;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.B;
                yje yjeVar = null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.B = i3t0.K(this, null, null, new r72(r7oVar, this, yjeVar, (byte) 9), 3);
                this.A = jCurrentTimeMillis;
                return;
            }
            return;
        }
        h7o h7oVar = (h7o) s7oVar;
        if (h7oVar.equals(e7o.f7336a)) {
            E();
            return;
        }
        if (h7oVar.equals(f7o.f9067a)) {
            e3c.n(this.E);
            e3c.n(this.D);
            e3c.n(this.C);
        } else {
            if (!h7oVar.equals(g7o.f10826a)) {
                t9f.b();
                return;
            }
            M();
            bby bbyVar2 = this.C;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.C = i3t0.F(this, this.o, this.s.f22085a, null, new x6o((byte) 4), 118);
            }
        }
    }
}
