package a;

import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ztu0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final i1w0 o;
    public final VirtualSportRulesParams p;
    public final m1e q;
    public final bzu r;
    public long s;
    public bby t;
    public bby u;
    public c4m0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztu0(i1w0 i1w0Var, VirtualSportRulesParams virtualSportRulesParams, ctf0 ctf0Var, m1e m1eVar, mne mneVar, g2v g2vVar, bzu bzuVar) {
        super(new rbt0(virtualSportRulesParams, (byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 10), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = i1w0Var;
        this.p = virtualSportRulesParams;
        this.q = m1eVar;
        this.r = bzuVar;
    }

    public final void M() {
        e3c.n(this.v);
        this.v = i3t0.L(this, new fnq(i120.W(this.q.b()), new k6s0(this, null, (byte) 20), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        psu0 psu0Var = (psu0) obj;
        psu0Var.getClass();
        super.x(psu0Var);
        if (psu0Var instanceof ksu0) {
            ksu0 ksu0Var = (ksu0) psu0Var;
            if (ksu0Var.equals(jsu0.f17070a)) {
                M();
                return;
            } else if (!ksu0Var.equals(isu0.f15323a)) {
                t9f.b();
                return;
            } else {
                e3c.n(this.u);
                e3c.n(this.v);
                return;
            }
        }
        if (!(psu0Var instanceof osu0)) {
            t9f.b();
            return;
        }
        osu0 osu0Var = (osu0) psu0Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.s;
        ymx ymxVar = ymx.INTERVAL_100;
        if (j > 200) {
            bby bbyVar = this.t;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.t = i3t0.K(this, null, null, new r72(osu0Var, this, yjeVar, (byte) 25), 3);
            this.s = jCurrentTimeMillis;
        }
    }
}
