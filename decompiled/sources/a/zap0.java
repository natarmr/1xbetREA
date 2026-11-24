package a;

import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class zap0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final TeamDetailsResultsParams o;
    public final ctf0 p;
    public final i1w0 q;
    public final m1e r;
    public final xfu s;
    public final pv00 t;
    public final gr00 u;
    public final yfm0 v;
    public long w;
    public bby x;
    public bby y;
    public c4m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zap0(TeamDetailsResultsParams teamDetailsResultsParams, mne mneVar, g2v g2vVar, ctf0 ctf0Var, i1w0 i1w0Var, m1e m1eVar, xfu xfuVar, pv00 pv00Var, gr00 gr00Var, yfm0 yfm0Var, wiu wiuVar, pru pruVar, r9u r9uVar) {
        super(new ck60(teamDetailsResultsParams, pruVar, r9uVar, (byte) 19), cvm0.p(mneVar.c, mneVar.f22085a), new nej0((Object) ctf0Var, (Object) g2vVar, (Object) wiuVar, (byte) 16), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = teamDetailsResultsParams;
        this.p = ctf0Var;
        this.q = i1w0Var;
        this.r = m1eVar;
        this.s = xfuVar;
        this.t = pv00Var;
        this.u = gr00Var;
        this.v = yfm0Var;
    }

    public final void M() {
        e3c.n(this.z);
        this.z = i3t0.L(this, new fnq(i120.W(this.r.b()), new z2n0(this, null, (byte) 7), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        nap0 nap0Var = (nap0) obj;
        nap0Var.getClass();
        super.x(nap0Var);
        yje yjeVar = null;
        if (!(nap0Var instanceof hap0)) {
            if (!(nap0Var instanceof map0)) {
                t9f.b();
                return;
            }
            map0 map0Var = (map0) nap0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.w;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.x;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.x = i3t0.K(this, null, null, new r72(map0Var, this, yjeVar, (byte) 17), 3);
                this.w = jCurrentTimeMillis;
                return;
            }
            return;
        }
        hap0 hap0Var = (hap0) nap0Var;
        if (hap0Var.equals(gap0.f10980a)) {
            M();
            return;
        }
        if (!hap0Var.equals(fap0.f9221a)) {
            if (hap0Var.equals(eap0.f7479a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        c4m0 c4m0Var = this.z;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar2 = this.y;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }
}
