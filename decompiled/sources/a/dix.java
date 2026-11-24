package a;

import java.util.Arrays;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class dix extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public bby A;
    public c4m0 B;
    public final m1e o;
    public final aqp p;
    public final xzp q;
    public final x4u r;
    public final MarketsParams.InsightsSubGame s;
    public final mne t;
    public final ikt0 u;
    public final o030 v;
    public final xpr w;
    public final owp0 x;
    public final yk50 y;
    public final bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dix(vzg0 vzg0Var, m1e m1eVar, aqp aqpVar, xzp xzpVar, x4u x4uVar, MarketsParams.InsightsSubGame insightsSubGame, mne mneVar, ctf0 ctf0Var, ikt0 ikt0Var, o030 o030Var, xpr xprVar, f2v f2vVar, r9u r9uVar, owp0 owp0Var, u8u u8uVar, yk50 yk50Var, jqt jqtVar, edu eduVar, pru pruVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        yje yjeVar = null;
        super(new uhx(pruVar, eduVar, r9uVar), cvm0.p(rwjVar, vs10Var), new n7h(r9uVar, ctf0Var), (yzn0) null);
        this.o = m1eVar;
        this.p = aqpVar;
        this.q = xzpVar;
        this.r = x4uVar;
        this.s = insightsSubGame;
        this.t = mneVar;
        this.u = ikt0Var;
        this.v = o030Var;
        this.w = xprVar;
        this.x = owp0Var;
        this.y = yk50Var;
        byte b = 0;
        byte b2 = 4;
        i3t0.L(this, new fnq(dtb.z(jqtVar.a(), 1), new whx(this, yjeVar, b), b2), null, null, 3);
        sac.V(jiu0.a(this), yhx.f42658a, null, vs10Var, new aix(this, yjeVar, b), 10);
        sac.T(new fnq(f2vVar.a(-746L), new bix(this, yjeVar, (byte) 1), b2), jiu0.a(this), cix.h);
        bby bbyVar = this.z;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = i3t0.F(this, o030Var, null, null, new v1x((byte) 16), 119);
        i3t0.L(this, new fnq(u8uVar.s(), new bix(this, yjeVar, b), b2), mneVar.b, null, 2);
        i3t0.K(this, null, null, new epp(this, yjeVar, (byte) 10), 3);
        long j = insightsSubGame.c;
        svm0 svm0Var = new svm0(j, insightsSubGame.b);
        i3t0.A(this, o030Var, new r030(j, oy20.b, ctf0Var.b.a(R.string.game_insights_title, Arrays.copyOf(new Object[0], 0))), null, null, 6);
        i3t0.A(this, xprVar, new hv20(svm0Var), null, null, 6);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ehx ehxVar = (ehx) obj;
        ehxVar.getClass();
        if (ehxVar instanceof bhx) {
            i3t0.A(this, this.v, ((bhx) ehxVar).f2630a, null, null, 6);
            return;
        }
        if (ehxVar.equals(ahx.f897a)) {
            E();
            return;
        }
        if (ehxVar instanceof chx) {
            i3t0.A(this, this.w, ((chx) ehxVar).f4383a, null, null, 6);
            return;
        }
        yje yjeVar = null;
        if (ehxVar.equals(dhx.f6114a)) {
            c4m0 c4m0Var = this.B;
            byte b = 1;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.B = sac.T(new fnq(this.o.b(), new whx(this, yjeVar, b), (byte) 4), jiu0.a(this), xhx.h);
                return;
            }
            return;
        }
        if (!ehxVar.equals(dhx.b)) {
            t9f.b();
            return;
        }
        c4m0 c4m0Var2 = this.B;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        bby bbyVar = this.A;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }
}
