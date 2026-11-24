package a;

import java.util.Map;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
public final class mog0 extends w46 {
    public final RuleData b;
    public final boolean c;
    public final nv20 d;
    public final tzi e;
    public final m1e f;
    public final g2v g;
    public final duj h;
    public final u58 i;
    public final ag3 j;
    public final gg5 k;
    public final au0 l;
    public final mne m;
    public final i1w0 n;
    public c4m0 o;
    public bby p;
    public boolean q;
    public final ol60 r;
    public final p7m0 s;

    public mog0(RuleData ruleData, boolean z, nv20 nv20Var, tzi tziVar, m1e m1eVar, g2v g2vVar, duj dujVar, u58 u58Var, ag3 ag3Var, gg5 gg5Var, au0 au0Var, mne mneVar, i1w0 i1w0Var) {
        m1eVar.getClass();
        i1w0Var.getClass();
        this.b = ruleData;
        this.c = z;
        this.d = nv20Var;
        this.e = tziVar;
        this.f = m1eVar;
        this.g = g2vVar;
        this.h = dujVar;
        this.i = u58Var;
        this.j = ag3Var;
        this.k = gg5Var;
        this.l = au0Var;
        this.m = mneVar;
        this.n = i1w0Var;
        this.r = new ol60(3);
        p7m0 p7m0VarA = q7m0.a(gog0.f11631a);
        this.s = p7m0VarA;
        Map map = ruleData.b;
        if (!map.containsKey("TITLE_KEY") || !map.containsKey("DESCRIPTION_KEY")) {
            x();
            return;
        }
        String str = (String) map.get("TITLE_KEY");
        str = str == null ? "" : str;
        ysw yswVar = new ysw(null, 15);
        clg0 clg0Var = clg0.DEFAULT;
        ykg0 ykg0Var = new ykg0(true, str, yswVar, yswVar, clg0Var);
        String str2 = (String) map.get("DESCRIPTION_KEY");
        String str3 = str2 != null ? str2 : "";
        ysw yswVar2 = new ysw(null, 15);
        p7m0VarA.o(null, new jog0(q3d.j(ykg0Var, new ykg0(false, str3, yswVar2, yswVar2, clg0Var))));
    }

    public final jkm w() {
        return g2v.d(this.g, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new b0c0(0, this, mog0.class, "refreshDataOnLottieButtonClick", "refreshDataOnLottieButtonClick()V", 0, (byte) 23), 94);
    }

    public final void x() {
        bby bbyVar = this.p;
        if (bbyVar == null || !bbyVar.isActive()) {
            bm5 bm5Var = this.c ? bm5.d : bm5.f2822a;
            p7m0 p7m0Var = this.s;
            yje yjeVar = null;
            if (!(p7m0Var.getValue() instanceof iog0)) {
                p7m0Var.getClass();
                p7m0Var.o(null, hog0.f13392a);
            }
            this.p = sac.V(jiu0.a(this), new eme0(this, (byte) 28), null, this.m.b, new k6d0((Object) this, (Object) bm5Var, yjeVar, (byte) 26), 10);
        }
    }

    public final void y(fog0 fog0Var) {
        this.r.f(fog0Var);
    }
}
