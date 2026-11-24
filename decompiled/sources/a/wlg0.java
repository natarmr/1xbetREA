package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wlg0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wlg0 extends yx5 {
    public final f9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public wdk0 N1;
    public final s0r O1;
    public final khf0 P1;
    public final zz2 Q1;
    public final cgx0 R1;
    public final cgx0 S1;
    public final cgx0 U1;
    public final cgx0 V1;
    public final cgx0 W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(wlg0.class, "viewBinding", "getViewBinding()Lorg/xplatform/rules/impl/databinding/RulesFragmentBinding;", 0), new ez40(wlg0.class, "ruleData", "getRuleData()Lorg/xplatform/rules/api/presentation/models/RuleData;", 0), new ez40(wlg0.class, "ruleName", "getRuleName()I", 0), new ez40(wlg0.class, "showCustomToolbar", "getShowCustomToolbar()Z", 0), new ez40(wlg0.class, "fromBanners", "getFromBanners()Z", 0), new ez40(wlg0.class, "showNavBarArg", "getShowNavBarArg()Z", 0), new ez40(wlg0.class, "fromGames", "getFromGames()Z", 0), new ez40(wlg0.class, "fromAggregator", "getFromAggregator()Z", 0)};
    public static final cge0 X1 = new cge0((byte) 11);

    public wlg0() {
        super(R.layout.rules_fragment);
        this.K1 = new f9o0(R.attr.uikitStaticTransparent);
        this.M1 = xbc.b0(this, sre0.f32672a.b(aog0.class), new ulg0(this, (byte) 0));
        this.O1 = ltt0.o(this, vlg0.f37622a);
        this.P1 = new khf0("RULE_DATA");
        this.Q1 = new zz2("RULE_NAME");
        this.R1 = new cgx0("TOOLBAR_DATA");
        this.S1 = new cgx0("FROM_BANNERS");
        this.U1 = new cgx0("SHOW_NAV_BAR");
        this.V1 = new cgx0("FROM_GAMES");
        this.W1 = new cgx0("FROM_AGGREGATOR");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0q n0qVar = o7k0.c;
        Object objN = this.O1.n(Y1[0], this);
        objN.getClass();
        pkd.h(((xlg0) objN).b, new owp0(this), null, new ugd(1263771131, true, new j5d0(this, n0qVar, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(slg0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            slg0 slg0Var = (slg0) (ze3Var instanceof slg0 ? ze3Var : null);
            if (slg0Var != null) {
                iiy[] iiyVarArr = Y1;
                nsi nsiVarA = slg0Var.a(this.W1.n(this, iiyVarArr[7]).booleanValue(), a4n0.f(this), new gmg0((RuleData) this.P1.n(this, iiyVarArr[1]), this.V1.n(this, iiyVarArr[6]).booleanValue(), this.Q1.n(this, iiyVarArr[2]).intValue(), this.R1.n(this, iiyVarArr[3]).booleanValue(), null));
                this.L1 = new fiu0(Collections.singletonMap(aog0.class, nsiVarA.o));
                this.N1 = nsiVarA.i;
                return;
            }
        }
        jf4.n(b1j.i(slg0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getN1() {
        return this.U1.n(this, Y1[5]).booleanValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
