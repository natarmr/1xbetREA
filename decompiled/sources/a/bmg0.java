package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bmg0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bmg0 extends yx5 {
    public final hnm0 K1;
    public final f9o0 L1;
    public lsi M1;
    public final kiu0 N1;
    public wdk0 O1;
    public final s0r P1;
    public final khf0 Q1;
    public final zz2 R1;
    public final cgx0 S1;
    public final cgx0 U1;
    public final cgx0 V1;
    public final cgx0 W1;
    public final cgx0 X1;
    public final n0o0 Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(bmg0.class, "viewBinding", "getViewBinding()Lorg/xplatform/rules/impl/databinding/RulesFragmentOldBinding;", 0), new ez40(bmg0.class, "ruleData", "getRuleData()Lorg/xplatform/rules/api/presentation/models/RuleData;", 0), new ez40(bmg0.class, "ruleName", "getRuleName()I", 0), new ez40(bmg0.class, "showCustomToolbar", "getShowCustomToolbar()Z", 0), new ez40(bmg0.class, "fromBanners", "getFromBanners()Z", 0), new ez40(bmg0.class, "showNavBarArg", "getShowNavBarArg()Z", 0), new ez40(bmg0.class, "fromGames", "getFromGames()Z", 0), new ez40(bmg0.class, "fromAggregator", "getFromAggregator()Z", 0)};
    public static final zie0 Z1 = new zie0();

    public bmg0() {
        super(R.layout.rules_fragment_old);
        this.K1 = hnm0.f13359a;
        this.L1 = new f9o0(R.attr.uikitBackgroundContent);
        ylg0 ylg0Var = new ylg0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 5), (byte) 6));
        this.N1 = agc.G(this, sre0.f32672a.b(mog0.class), new fxf0(a8zVarA, (byte) 8), new fxf0(a8zVarA, (byte) 9), ylg0Var);
        this.P1 = ltt0.o(this, amg0.f1107a);
        this.Q1 = new khf0("RULE_DATA");
        this.R1 = new zz2("RULE_NAME");
        this.S1 = new cgx0("TOOLBAR_DATA");
        this.U1 = new cgx0("FROM_BANNERS");
        this.V1 = new cgx0("SHOW_NAV_BAR");
        this.W1 = new cgx0("FROM_GAMES");
        this.X1 = new cgx0("FROM_AGGREGATOR");
        this.Y1 = maz.b(new ylg0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        DsNavigationBar dsNavigationBar = G0().c;
        iiy[] iiyVarArr = a2;
        byte b = 0;
        dsNavigationBar.setVisibility(this.S1.n(this, iiyVarArr[3]).booleanValue() ? 0 : 8);
        String string = dsNavigationBar.getResources().getString(this.R1.n(this, iiyVarArr[2]).intValue());
        string.getClass();
        dsNavigationBar.setTitle(string);
        mc50.a(dsNavigationBar, new ylg0(this, b));
        RecyclerView recyclerView = G0().e;
        recyclerView.setLayoutManager(new LinearLayoutManager(G0().e.getContext()));
        recyclerView.setAdapter((plg0) this.Y1.getValue());
        vvw.o(recyclerView, getQ1(), 1);
        knm0.h(G0().b, getQ1());
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
                iiy[] iiyVarArr = a2;
                nsi nsiVarA = slg0Var.a(this.X1.n(this, iiyVarArr[7]).booleanValue(), a4n0.f(this), new gmg0((RuleData) this.Q1.n(this, iiyVarArr[1]), this.W1.n(this, iiyVarArr[6]).booleanValue(), this.R1.n(this, iiyVarArr[2]).intValue(), this.S1.n(this, iiyVarArr[3]).booleanValue(), null));
                this.M1 = (lsi) nsiVarA.n.get();
                this.O1 = nsiVarA.i;
                return;
            }
        }
        jf4.n(b1j.i(slg0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().r;
        yje yjeVar = null;
        zlg0 zlg0Var = new zlg0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(ol60Var, clzVarW, zlg0Var, (yje) null), 3);
        p7m0 p7m0Var = H0().s;
        zlg0 zlg0Var2 = new zlg0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w7f0(p7m0Var, clzVarW2, zlg0Var2, (yje) null, (byte) 0), 3);
    }

    public final cmg0 G0() {
        Object objN = this.P1.n(a2[0], this);
        objN.getClass();
        return (cmg0) objN;
    }

    public final mog0 H0() {
        return (mog0) this.N1.getValue();
    }

    public final void I0(boolean z) {
        G0().d.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        c4m0 c4m0Var = H0().o;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        mog0 mog0VarH0 = H0();
        c4m0 c4m0Var = mog0VarH0.o;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            mog0VarH0.o = sac.T(new fnq(mog0VarH0.f.b(), new yng0(mog0VarH0, null, b), (byte) 4), d5c.S(jiu0.a(mog0VarH0), mog0VarH0.m.f22085a), log0.h);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getQ1() {
        return this.V1.n(this, a2[5]).booleanValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
