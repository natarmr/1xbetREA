package a;

import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampInfoParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dat0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final UniversalChampInfoParams o;
    public final hzg p;
    public final m1e q;
    public final rpt r;
    public final zr1 s;
    public final ih5 t;
    public long u;
    public bby v;
    public bby w;
    public c4m0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dat0(UniversalChampInfoParams universalChampInfoParams, mne mneVar, g2v g2vVar, ctf0 ctf0Var, hzg hzgVar, m1e m1eVar, rpt rptVar, zr1 zr1Var, ih5 ih5Var) {
        super(new xns0((byte) 15), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 2), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = universalChampInfoParams;
        this.p = hzgVar;
        this.q = m1eVar;
        this.r = rptVar;
        this.s = zr1Var;
        this.t = ih5Var;
    }

    public final void M() {
        e3c.n(this.x);
        this.x = i3t0.L(this, new fnq(i120.W(this.q.b()), new k6s0(this, null, (byte) 8), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        t9t0 t9t0Var = (t9t0) obj;
        t9t0Var.getClass();
        super.x(t9t0Var);
        yje yjeVar = null;
        if (t9t0Var instanceof o9t0) {
            o9t0 o9t0Var = (o9t0) t9t0Var;
            if (o9t0Var.equals(n9t0.f23157a)) {
                M();
                return;
            }
            if (!o9t0Var.equals(m9t0.f21428a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var = this.x;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.w;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (!(t9t0Var instanceof s9t0)) {
            t9f.b();
            return;
        }
        s9t0 s9t0Var = (s9t0) t9t0Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.u;
        ymx ymxVar = ymx.INTERVAL_100;
        if (j > 200) {
            bby bbyVar2 = this.v;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.v = i3t0.K(this, null, null, new r72(s9t0Var, this, yjeVar, (byte) 21), 3);
            this.u = jCurrentTimeMillis;
        }
    }
}
