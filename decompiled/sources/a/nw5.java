package a;

import a.yfu0;
import android.app.Dialog;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/nw5;", "La/yfu0;", TokenNames.V, "La/yo8;", "<init>", "()V", "a/lw5", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class nw5<V extends yfu0> extends yo8 {
    public static final /* synthetic */ iiy[] d2 = {new j0d0(nw5.class, "parentBinding", "getParentBinding()Lorg/xplatform/ui_core/databinding/BaseBottomSheetDialogLayoutBinding;", 0)};
    public boolean Z1;
    public View b2;
    public BottomSheetBehavior c2;
    public final nae0 Y1 = ltt0.p(this, mw5.f22486a);
    public final boolean a2 = true;

    public static View K0(View view) {
        if (view.getId() == R.id.container) {
            return view;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return K0(view2);
        }
        return null;
    }

    @Override // a.yo8, a.sd3, a.sik
    public Dialog C0(Bundle bundle) {
        return new hw5(this, o0());
    }

    public abstract int I0();

    public final void J0() {
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.N(3);
        }
    }

    public abstract yfu0 L0();

    public final BottomSheetBehavior M0() {
        FrameLayout frameLayout;
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        Dialog dialog = this.S1;
        if (dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return null;
        }
        BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout);
        this.c2 = bottomSheetBehaviorE;
        return bottomSheetBehaviorE;
    }

    public final ow5 N0() {
        Object objN = this.Y1.n(d2[0], this);
        objN.getClass();
        return (ow5) objN;
    }

    public abstract int Q0();

    public String R0() {
        return "";
    }

    public String S0() {
        return "";
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        P0();
        this.O1 = false;
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ConstraintLayout constraintLayout = N0().f25953a;
        constraintLayout.getClass();
        hxm0.v(constraintLayout);
        View root = L0().getRoot();
        root.getClass();
        hxm0.v(root);
        N0().b.addView(L0().getRoot());
        qcc.X(this, new o85((byte) 15));
        ConstraintLayout constraintLayout2 = N0().f25953a;
        constraintLayout2.getClass();
        return constraintLayout2;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void Z() {
        super.Z();
        View view = this.b2;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        this.b2 = null;
        this.c2 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        Window window;
        Window window2;
        this.j1 = true;
        O0();
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (window2 = D0().getWindow()) == null) {
            return;
        }
        hfm0.u(window2, window);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void h0() {
        super.h0();
        this.O1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) {
        View viewFindViewById;
        view.getClass();
        Log.i("onCreateDialog", "Current screen: ".concat(getClass().getName()));
        View viewQ0 = q0();
        View viewK0 = K0(q0());
        byte b = 0;
        Drawable drawable = null;
        if (viewK0 != null) {
            View view2 = this.l1;
            Object parent = view2 != null ? view2.getParent() : null;
            View view3 = parent instanceof View ? (View) parent : null;
            this.b2 = view3;
            if (view3 != null) {
                view3.setOnTouchListener(new jw5(this, b));
            }
            N0().f25953a.setOnClickListener(new kw5((byte) 0));
            khf0 khf0Var = new khf0((Object) viewQ0, (Object) this, (Object) viewK0, (byte) 5);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(viewK0, khf0Var);
        }
        if (S0().length() > 0) {
            N0().e.setText(S0());
            N0().e.setVisibility(0);
        }
        if (R0().length() > 0) {
            N0().d.setText(R0());
            N0().d.setVisibility(0);
        }
        Dialog dialog = this.S1;
        if (dialog == null || (viewFindViewById = dialog.findViewById(Q0())) == null) {
            return;
        }
        Drawable drawableU = epv0.U(R.drawable.bg_bottom_sheet, o0());
        if (drawableU != null) {
            sj3.B0(drawableU, o0(), I0());
            sj3.B0(N0().f25953a.getBackground(), o0(), I0());
            drawable = drawableU;
        }
        viewFindViewById.setBackground(drawable);
    }

    public void O0() {
    }

    public void P0() {
    }
}
