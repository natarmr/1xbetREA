package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ou80;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ou80 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public ii N1;
    public wdk0 O1;
    public ynb P1;
    public final khf0 Q1;
    public final cgx0 R1;
    public final cgx0 S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(ou80.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentPartTypeTwoGamesBinding;", 0), new ez40(ou80.class, "aggregatorScreenModel", "getAggregatorScreenModel()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;", 0), new ez40(ou80.class, "fromSearch", "getFromSearch()Z", 0), new ez40(ou80.class, "shouldShowNavBar", "getShouldShowNavBar()Z", 0)};
    public static final rl70 V1 = new rl70();

    public ou80() {
        super(R.layout.fragment_part_type_two_games);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitStaticTransparent, 12);
        this.L1 = ltt0.o(this, mu80.f22403a);
        this.Q1 = new khf0("AGGREGATOR_SCREEN_ITEM");
        this.R1 = new cgx0("FROM_AGGREGATOR_SEARCH_ITEM");
        this.S1 = new cgx0("SHOULD_SHOW_NAV_BAR_ITEM");
        this.U1 = xbc.b0(this, sre0.f32672a.b(rv80.class), new lu80(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().r().u0("GAME_CLOSED_KEY", this, new ex60(this, (byte) 7));
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new lu80(this, (byte) 1));
        Object objN = this.L1.n(W1[0], this);
        objN.getClass();
        pkd.h(((r2r) objN).b, new owp0(this), null, new ugd(767607349, true, new ds60(this, (byte) 19)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(is0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            is0 is0Var = (is0) (ze3Var instanceof is0 ? ze3Var : null);
            if (is0Var != null) {
                ir1 ir1Var = ir1.c;
                iiy[] iiyVarArr = W1;
                q7i q7iVarA = is0.a(is0Var, ir1Var, (AggregatorScreenModel) this.Q1.n(this, iiyVarArr[1]), null, ou80.class.getSimpleName(), this.S1.n(this, iiyVarArr[3]).booleanValue(), null, 36);
                this.M1 = q7iVarA.c();
                this.N1 = q7iVarA.a0;
                this.O1 = q7iVarA.c0;
                ynb ynbVarI = ((yzn0) q7iVarA.b0.b).i();
                x1x.x(ynbVarI);
                this.P1 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(is0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.U1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(qt80.f29288a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return this.S1.n(this, W1[3]).booleanValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
