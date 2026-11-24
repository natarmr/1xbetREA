package a;

import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wbt0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public bby B;
    public bby C;
    public c4m0 D;
    public final UniversalChampResultsParams o;
    public final ctf0 p;
    public final hzg q;
    public final pv00 r;
    public final i1w0 s;
    public final gr00 t;
    public final yfm0 u;
    public final m1e v;
    public final y3v w;
    public final zpu x;
    public final pmi0 y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbt0(UniversalChampResultsParams universalChampResultsParams, mne mneVar, g2v g2vVar, wiu wiuVar, ctf0 ctf0Var, hzg hzgVar, pv00 pv00Var, i1w0 i1w0Var, gr00 gr00Var, yfm0 yfm0Var, m1e m1eVar, y3v y3vVar, zpu zpuVar, pmi0 pmi0Var, r9u r9uVar, pru pruVar) {
        super(new zbg0(universalChampResultsParams, wiuVar, pruVar, r9uVar, (byte) 4), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 4), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = universalChampResultsParams;
        this.p = ctf0Var;
        this.q = hzgVar;
        this.r = pv00Var;
        this.s = i1w0Var;
        this.t = gr00Var;
        this.u = yfm0Var;
        this.v = m1eVar;
        this.w = y3vVar;
        this.x = zpuVar;
        this.y = pmi0Var;
    }

    public final void M() {
        e3c.n(this.D);
        this.D = i3t0.L(this, new fnq(i120.W(this.v.b()), new k6s0(this, null, (byte) 10), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        jbt0 jbt0Var = (jbt0) obj;
        jbt0Var.getClass();
        super.x(jbt0Var);
        yje yjeVar = null;
        if (!(jbt0Var instanceof dbt0)) {
            if (!(jbt0Var instanceof ibt0)) {
                t9f.b();
                return;
            }
            ibt0 ibt0Var = (ibt0) jbt0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.z;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.A;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.A = i3t0.K(this, null, null, new r72(ibt0Var, this, yjeVar, (byte) 23), 3);
                this.z = jCurrentTimeMillis;
                return;
            }
            return;
        }
        dbt0 dbt0Var = (dbt0) jbt0Var;
        if (dbt0Var.equals(cbt0.f4077a)) {
            M();
            return;
        }
        if (!dbt0Var.equals(bbt0.f2324a)) {
            if (dbt0Var.equals(abt0.f596a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        c4m0 c4m0Var = this.D;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar2 = this.B;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        bby bbyVar3 = this.C;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
    }
}
