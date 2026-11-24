package a;

import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampPrizePoolParams;

/* JADX INFO: loaded from: classes4.dex */
public final class yat0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final UniversalChampPrizePoolParams o;
    public final hzg p;
    public final m1e q;
    public final rpt r;
    public long s;
    public bby t;
    public bby u;
    public c4m0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yat0(UniversalChampPrizePoolParams universalChampPrizePoolParams, mne mneVar, g2v g2vVar, hzg hzgVar, m1e m1eVar, rpt rptVar, ctf0 ctf0Var) {
        super(new xns0((byte) 16), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 3), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = universalChampPrizePoolParams;
        this.p = hzgVar;
        this.q = m1eVar;
        this.r = rptVar;
    }

    public final void M() {
        e3c.n(this.v);
        this.v = i3t0.L(this, new fnq(i120.W(this.q.b()), new k6s0(this, null, (byte) 9), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        oat0 oat0Var = (oat0) obj;
        oat0Var.getClass();
        super.x(oat0Var);
        yje yjeVar = null;
        if (oat0Var instanceof kat0) {
            kat0 kat0Var = (kat0) oat0Var;
            if (kat0Var.equals(jat0.f16207a)) {
                M();
                return;
            }
            if (!kat0Var.equals(iat0.f14455a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var = this.v;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.u;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (!(oat0Var instanceof nat0)) {
            t9f.b();
            return;
        }
        nat0 nat0Var = (nat0) oat0Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.s;
        ymx ymxVar = ymx.INTERVAL_100;
        if (j > 200) {
            bby bbyVar2 = this.t;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.t = i3t0.K(this, null, null, new r72(nat0Var, this, yjeVar, (byte) 22), 3);
            this.s = jCurrentTimeMillis;
        }
    }
}
