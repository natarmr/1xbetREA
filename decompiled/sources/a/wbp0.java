package a;

import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wbp0 extends i3t0 {
    public static final /* synthetic */ int L = 0;
    public final m1e A;
    public final hzg B;
    public final poq0 C;
    public final ieu D;
    public long E;
    public bby F;
    public bby G;
    public bby H;
    public bby I;
    public bby J;
    public c4m0 K;
    public final mne o;
    public final TeamDetailsParams p;
    public final ctf0 q;
    public final reu r;
    public final xzp s;
    public final gvu t;
    public final vqc u;
    public final hjd v;
    public final pv00 w;
    public final i1w0 x;
    public final gr00 y;
    public final yfm0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wbp0(mne mneVar, TeamDetailsParams teamDetailsParams, ctf0 ctf0Var, reu reuVar, xzp xzpVar, gvu gvuVar, svu svuVar, pru pruVar, bzt bztVar, vqc vqcVar, hjd hjdVar, luu luuVar, lbu lbuVar, g2v g2vVar, y78 y78Var, wiu wiuVar, pv00 pv00Var, i1w0 i1w0Var, gr00 gr00Var, yfm0 yfm0Var, r9u r9uVar, m1e m1eVar, hzg hzgVar, poq0 poq0Var, ieu ieuVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new pg1(teamDetailsParams, svuVar, pruVar, bztVar, lbuVar, luuVar, r9uVar), cvm0.p(rwjVar, rwjVar), new dg(teamDetailsParams, ctf0Var, g2vVar, y78Var, wiuVar, (byte) 29), (yzn0) null);
        this.o = mneVar;
        this.p = teamDetailsParams;
        this.q = ctf0Var;
        this.r = reuVar;
        this.s = xzpVar;
        this.t = gvuVar;
        this.u = vqcVar;
        this.v = hjdVar;
        this.w = pv00Var;
        this.x = i1w0Var;
        this.y = gr00Var;
        this.z = yfm0Var;
        this.A = m1eVar;
        this.B = hzgVar;
        this.C = poq0Var;
        this.D = ieuVar;
    }

    public final void M() {
        e3c.n(this.K);
        this.K = i3t0.L(this, new fnq(i120.W(this.A.b()), new ubp0(this, null, (byte) 0), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wbp0 wbp0Var;
        n8p0 n8p0Var = (n8p0) obj;
        n8p0Var.getClass();
        super.x(n8p0Var);
        yje yjeVar = null;
        if (!(n8p0Var instanceof x7p0)) {
            if (!(n8p0Var instanceof m8p0)) {
                t9f.b();
                return;
            }
            m8p0 m8p0Var = (m8p0) n8p0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.E;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.F;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.F = i3t0.K(this, null, null, new r72(m8p0Var, this, yjeVar, (byte) 18), 3);
                this.E = jCurrentTimeMillis;
                return;
            }
            return;
        }
        x7p0 x7p0Var = (x7p0) n8p0Var;
        if (!x7p0Var.equals(w7p0.f38686a)) {
            if (x7p0Var.equals(v7p0.f36940a)) {
                e3c.n(this.I);
                e3c.n(this.J);
                e3c.n(this.G);
                return;
            } else if (x7p0Var.equals(u7p0.f35196a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        M();
        bby bbyVar2 = this.G;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            wbp0Var = this;
            wbp0Var.G = i3t0.F(wbp0Var, this.v, this.o.f22085a, null, new ofo0((byte) 26), 118);
        } else {
            wbp0Var = this;
        }
        bby bbyVar3 = wbp0Var.H;
        if (bbyVar3 == null || !bbyVar3.isActive()) {
            wbp0Var.H = i3t0.K(wbp0Var, null, null, new m91(wbp0Var, yjeVar, (byte) 22), 3);
        }
    }
}
