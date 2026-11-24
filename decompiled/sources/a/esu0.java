package a;

import org.xbet.client1.R;
import org.xplatform.cyber.section.api.virtualrecommended.VirtualRecommendedEventsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class esu0 extends w46 {
    public final VirtualRecommendedEventsParams b;
    public final g2v c;
    public final hzg d;
    public final r2u e;
    public final duj f;
    public final ih5 g;
    public final zr1 h;
    public final bby i;
    public final boolean j;
    public final p7m0 k;
    public final xae0 l;

    public esu0(VirtualRecommendedEventsParams virtualRecommendedEventsParams, mne mneVar, g2v g2vVar, hzg hzgVar, r2u r2uVar, duj dujVar, ih5 ih5Var, zr1 zr1Var, svu svuVar) {
        this.b = virtualRecommendedEventsParams;
        this.c = g2vVar;
        this.d = hzgVar;
        this.e = r2uVar;
        this.f = dujVar;
        this.g = ih5Var;
        this.h = zr1Var;
        this.j = svuVar.l();
        nch nchVar = nch.f23293a;
        p7m0 p7m0VarA = q7m0.a(nchVar);
        this.k = p7m0VarA;
        bby bbyVar = this.i;
        if (bbyVar == null || !bbyVar.isActive()) {
            bby bbyVar2 = this.i;
            yje yjeVar = null;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.i = sac.V(jiu0.a(this), new npt0(this, (byte) 17), null, mneVar.b, new k6s0(this, yjeVar, (byte) 19), 10);
        }
        this.l = vtb.h0(p7m0VarA, d5c.S(jiu0.a(this), mneVar.f22085a), new o6m0(Long.MAX_VALUE), nchVar);
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.k;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new mch(g2v.d(this.c, ozb.J(-1L, pb10.v), null, null, R.string.currently_no_events, 0, null, 478), 0L)));
    }
}
