package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.api.domain.TypeStageId;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La/syl0;", "La/yx5;", "", "<init>", "()V", "a/nyl0", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class syl0 extends yx5 {
    public final khf0 K1;
    public final r34 L1;
    public final r34 M1;
    public final r34 N1;
    public final yzn0 O1;
    public int P1;
    public boolean Q1;
    public boolean R1;
    public int S1;
    public boolean U1;
    public final HashMap V1;
    public zfb W1;
    public final s0r X1;
    public fiu0 Y1;
    public jk3 Z1;
    public final a8z a2;
    public final a8z b2;
    public final boolean c2;
    public final v62 d2;
    public final tvj e2;
    public static final /* synthetic */ iiy[] g2 = {new ez40(syl0.class, "stageId", "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", 0), new ez40(syl0.class, "sportId", "getSportId()J", 0), new ez40(syl0.class, "subSportId", "getSubSportId()J", 0), new ez40(syl0.class, "globalChampId", "getGlobalChampId()J", 0), new ez40(syl0.class, "lastStatusBarStyle", "getLastStatusBarStyle()Lorg/xplatform/statistic/stage/impl/stage_net/presentation/fragments/StageFragment$ColorStyle;", 0), new j0d0(syl0.class, "viewBinding", "getViewBinding()Lorg/xplatform/statistic/stage/impl/databinding/FragmentStageNetComposeBinding;", 0)};
    public static final eke0 f2 = new eke0();

    public syl0() {
        super(R.layout.fragment_stage_net_compose);
        this.K1 = new khf0("KEY_STAGE_ID");
        this.L1 = new r34("KEY_SPORT_ID");
        this.M1 = new r34("KEY_SUB_SPORT_ID");
        this.N1 = new r34("KEY_GLOBAL_CHAMP_ID");
        this.O1 = new yzn0("LAST_STYLE_CODE");
        this.V1 = new HashMap();
        this.X1 = ltt0.o(this, qyl0.f29540a);
        this.a2 = maz.a(wez.b, new lyl0(this, (byte) 1));
        byte b = 2;
        this.b2 = xbc.b0(this, sre0.f32672a.b(w3m0.class), new lyl0(this, b));
        this.c2 = true;
        this.d2 = new v62(this, (byte) 20);
        this.e2 = new tvj(new kyl0(this, b), new kyl0(this, (byte) 3), null, 51);
    }

    @Override // a.yx5
    public final void C0() {
        this.Y1 = ((mwi) this.a2.getValue()).a();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = H0().w();
        lkz lkzVar = lkz.f20223a;
        ssl0 ssl0Var = new ssl0((Object) this, (yje) null, (byte) 3);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0(gmqVarW, clzVarW, ssl0Var, (yje) null), 3);
    }

    public final c5r G0() {
        Object objN = this.X1.n(g2[5], this);
        objN.getClass();
        return (c5r) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.b2.getValue();
    }

    public final void I0() {
        Window window;
        this.O1.u(this, g2[4], nyl0.c);
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null) {
            return;
        }
        Context contextO0 = o0();
        TypedValue typedValue = j5d.f15927a;
        ofm0.A(window, contextO0, j5d.a(o0(), R.attr.uikitBackgroundContent, true), j5d.a(o0(), R.attr.uikitBackgroundContent, true), !qem0.r(B()), !qem0.r(B()));
    }

    public final void J0() {
        Window window;
        this.O1.u(this, g2[4], nyl0.d);
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null) {
            return;
        }
        Context contextO0 = o0();
        TypedValue typedValue = j5d.f15927a;
        ofm0.A(window, contextO0, R.color.static_transparent, j5d.a(o0(), R.attr.uikitBackgroundContent, true), false, !qem0.r(B()));
    }

    public final void K0(boolean z) {
        int i = o0().getResources().getBoolean(R.bool.isTablet) ? R.layout.shimmer_item_stage_net_bottom_table : R.layout.shimmer_item_stage_net_bottom;
        ShimmerLinearLayout shimmerLinearLayout = G0().f;
        if (z) {
            shimmerLinearLayout.setShimmerItems(i);
        }
        shimmerLinearLayout.setVisibility(z ? 0 : 8);
    }

    public final void L0() {
        Window window;
        this.O1.u(this, g2[4], nyl0.b);
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null) {
            return;
        }
        Context contextO0 = o0();
        TypedValue typedValue = j5d.f15927a;
        ofm0.A(window, contextO0, R.color.static_transparent, j5d.a(o0(), R.attr.uikitBackgroundContent, true), !qem0.r(B()), !qem0.r(B()));
    }

    public final void M0(boolean z) {
        G0().c.setVisibility(8);
        G0().g.setVisibility(z ? 8 : 0);
        K0(z);
    }

    public final void N0(boolean z) {
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.size_166) + this.S1;
        int dimensionPixelSize2 = G().getDimensionPixelSize(R.dimen.size_56) + this.S1;
        ViewGroup.LayoutParams layoutParams = G0().d.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        marginLayoutParams.topMargin = dimensionPixelSize;
        G0().d.setLayoutParams(marginLayoutParams);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hgp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hgp0 hgp0Var = (hgp0) (ze3Var instanceof hgp0 ? ze3Var : null);
            if (hgp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = g2;
                this.Y1 = hgp0Var.a(i1w0VarF, (TypeStageId) this.K1.n(this, iiyVarArr[0]), this.L1.n(this, iiyVarArr[1]).longValue(), this.M1.n(this, iiyVarArr[2]).longValue(), this.N1.n(this, iiyVarArr[3]).longValue()).a();
                return;
            }
        }
        jf4.n(b1j.i(hgp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().g.setAdapter(null);
        G0().g.setOnFlingListener(null);
        this.W1 = null;
        H0().x(new vzl0(false));
        n6r n6rVarK = K();
        n6rVarK.b();
        n6rVarK.c.f(this.e2);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        int iOrdinal = ((nyl0) this.O1.n(this, g2[4])).ordinal();
        if (iOrdinal == 1) {
            L0();
        } else if (iOrdinal == 2) {
            I0();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            J0();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        Window window = n0().getWindow();
        this.P1 = window.getAttributes().softInputMode;
        if (Build.VERSION.SDK_INT > 29) {
            window.setSoftInputMode(48);
        } else {
            window.setSoftInputMode(16);
        }
        H0().x(uzl0.f36541a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        n0().getWindow().setSoftInputMode(this.P1);
        H0().x(tzl0.f34810a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        View viewQ0 = q0();
        epi0 epi0Var = new epi0((Object) this, (byte) 10);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, epi0Var);
        knm0.h(G0().d, true);
        byte b = 0;
        pkd.h(G0().b, new owp0(this), null, new ugd(895289523, true, new kyl0(this, b)));
        n6r n6rVarK = K();
        n6rVarK.b();
        n6rVarK.c.a(this.e2);
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_14);
        FrameLayout frameLayout = G0().e;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new pyl0(dimensionPixelSize, (byte) 0));
        G0().c.setButtonOnClickListener(new lyl0(this, b));
        jk3 jk3VarB = jk3.b(G0().f3785a);
        this.Z1 = jk3VarB;
        dyb.O((ImageView) jk3VarB.d, new myl0(this, (byte) 0));
        jk3 jk3Var = this.Z1;
        if (jk3Var != null) {
            dyb.O((ImageView) jk3Var.c, new myl0(this, (byte) 1));
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.c2;
    }
}
