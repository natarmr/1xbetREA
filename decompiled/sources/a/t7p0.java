package a;

import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsAchievementParams;

/* JADX INFO: loaded from: classes4.dex */
public final class t7p0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final TeamDetailsAchievementParams o;
    public final reu p;
    public final hzg q;
    public final m1e r;
    public c4m0 s;
    public bby t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7p0(TeamDetailsAchievementParams teamDetailsAchievementParams, reu reuVar, hzg hzgVar, ctf0 ctf0Var, mne mneVar, m1e m1eVar, g2v g2vVar) {
        super(new fno0((byte) 20), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 29), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = teamDetailsAchievementParams;
        this.p = reuVar;
        this.q = hzgVar;
        this.r = m1eVar;
    }

    public final void M() {
        e3c.n(this.s);
        this.s = i3t0.L(this, new fnq(i120.W(this.r.b()), new z2n0(this, null, (byte) 6), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        g7p0 g7p0Var = (g7p0) obj;
        g7p0Var.getClass();
        super.x(g7p0Var);
        if (!(g7p0Var instanceof c7p0)) {
            if (!(g7p0Var instanceof f7p0)) {
                t9f.b();
                return;
            }
            f7p0 f7p0Var = (f7p0) g7p0Var;
            if (f7p0Var.equals(d7p0.f5605a)) {
                ((uzg) this.q).a();
                return;
            } else if (f7p0Var.equals(e7p0.f7339a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        c7p0 c7p0Var = (c7p0) g7p0Var;
        if (c7p0Var.equals(b7p0.f2120a)) {
            M();
            return;
        }
        if (!c7p0Var.equals(a7p0.f383a)) {
            t9f.b();
            return;
        }
        c4m0 c4m0Var = this.s;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar = this.t;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }
}
