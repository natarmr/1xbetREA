package a;

import a.yfu0;
import android.app.Dialog;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTwoButtons;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La/stl;", "La/yfu0;", TokenNames.V, "La/yo8;", "<init>", "()V", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class stl<V extends yfu0> extends yo8 {
    public static final /* synthetic */ iiy[] f2 = {new j0d0(stl.class, "baseBinding", "getBaseBinding()Lorg/xplatform/uikit/databinding/DesignSystemBottomSheetParentViewBinding;", 0)};
    public final nae0 Y1 = new pmi(this, qtl.f29304a);
    public final n0o0 Z1 = maz.b(new ntl(this, 0));
    public final boolean a2 = true;
    public final int b2 = R.attr.uikitBackgroundDark;
    public BottomSheetBehavior c2;
    public boolean d2;
    public View e2;

    public static void L0(stl stlVar, View view, Boolean bool, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ptl(view, stlVar, bool));
    }

    public static View N0(View view) {
        if (view.getId() == R.id.container) {
            return view;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return N0(view2);
        }
        return null;
    }

    @Override // a.yo8, a.sd3, a.sik
    public Dialog C0(Bundle bundle) {
        return new hw5(this, o0());
    }

    public final void I0(kp8 kp8Var) {
        K0(M0(kp8Var));
    }

    public final void J0(View view) {
        P0().c.removeAllViews();
        P0().c.addView(view);
        P0().c.setVisibility(0);
    }

    public final void K0(View view) {
        P0().f.removeAllViews();
        P0().f.addView(view);
        P0().f.setVisibility(0);
    }

    public final View M0(lp8 lp8Var) {
        if (lp8Var instanceof jp8) {
            DsPresetTwoButtons dsPresetTwoButtons = new DsPresetTwoButtons(o0(), null, 6);
            jp8 jp8Var = (jp8) lp8Var;
            dsPresetTwoButtons.setFirstButtonText(jp8Var.f16889a);
            dsPresetTwoButtons.setSecondButtonText(jp8Var.b);
            dsPresetTwoButtons.setFirstButtonStyle(R.style.DSButton_Large_Secondary);
            dsPresetTwoButtons.setSecondButtonStyle(R.style.DSButton_Large_Primary);
            dsPresetTwoButtons.setButtonsHeight(R.dimen.size_40);
            dsPresetTwoButtons.setOrientation(0);
            dsPresetTwoButtons.setFirstButtonClickListener(jp8Var.c);
            dsPresetTwoButtons.setSecondButtonClickListener(jp8Var.d);
            return dsPresetTwoButtons;
        }
        if (!(lp8Var instanceof kp8)) {
            if (!(lp8Var instanceof ip8)) {
                t9f.b();
                return null;
            }
            nnm nnmVar = new nnm(o0());
            nnmVar.setModel(((ip8) lp8Var).f15150a);
            return nnmVar;
        }
        DsPresetTitle dsPresetTitle = new DsPresetTitle(o0(), null, 6);
        kp8 kp8Var = (kp8) lp8Var;
        dsPresetTitle.setTitle(kp8Var.f18665a);
        int i = kp8Var.b;
        if (i != 0) {
            dsPresetTitle.setTitleStyle(i);
        }
        return dsPresetTitle;
    }

    public final View O0() {
        pls0 pls0Var = new pls0(pym0.i(P0().b).iterator());
        return (View) (!pls0Var.hasNext() ? null : pls0Var.next());
    }

    public final vfk P0() {
        Object objN = this.Y1.n(f2[0], this);
        objN.getClass();
        return (vfk) objN;
    }

    public abstract yfu0 Q0();

    public void R0() {
        View viewQ0 = q0();
        View viewN0 = N0(viewQ0);
        if (viewN0 != null) {
            View view = this.l1;
            ViewParent parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            this.e2 = view2;
            if (view2 != null) {
                view2.setOnTouchListener(new jw5(this, (byte) 4));
            }
            lhf0 lhf0Var = new lhf0((Object) viewQ0, (Object) this, (Object) viewN0, (byte) 16);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(viewN0, lhf0Var);
        }
        viewQ0.setOnClickListener(new kw5((byte) 1));
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        T0();
        Log.i("onCreate", "Current screen: ".concat(getClass().getName()));
    }

    @Override // androidx.fragment.app.Fragment
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        FrameLayout frameLayout = P0().f37337a;
        frameLayout.getClass();
        jmu0.h(frameLayout);
        P0().e.removeAllViews();
        P0().e.addView(Q0().getRoot());
        return P0().f37337a;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void Z() {
        this.c2 = null;
        View view = this.e2;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        this.e2 = null;
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        Window window;
        Window window2;
        BottomSheetBehavior bottomSheetBehavior;
        this.j1 = true;
        if (o0().getResources().getBoolean(R.bool.isTablet) && (bottomSheetBehavior = this.c2) != null) {
            bottomSheetBehavior.l = (int) G().getDimension(R.dimen.size_512);
        }
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (window2 = D0().getWindow()) == null) {
            return;
        }
        hfm0.u(window2, window);
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) {
        FrameLayout frameLayout;
        view.getClass();
        Dialog dialog = this.S1;
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet)) != null) {
            this.c2 = BottomSheetBehavior.E(frameLayout);
        }
        view.setClipToOutline(true);
        view.setOutlineProvider(new otl(this, (byte) 1));
        R0();
        S0();
        U0();
    }

    public void S0() {
    }

    public void T0() {
    }

    public void U0() {
    }
}
