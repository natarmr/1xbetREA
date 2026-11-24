package a;

import a.yfu0;
import android.app.Dialog;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La/qw5;", "La/yfu0;", TokenNames.V, "La/yo8;", "<init>", "()V", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class qw5<V extends yfu0> extends yo8 {
    public static final /* synthetic */ iiy[] a2 = {new j0d0(qw5.class, "parentBinding", "getParentBinding()Lorg/xplatform/ui_core/databinding/BaseBottomSheetDialogLayoutBinding;", 0)};
    public final nae0 Y1 = ltt0.p(this, pw5.f27694a);
    public BottomSheetBehavior Z1;

    public abstract int I0();

    public abstract yfu0 J0();

    public final BottomSheetBehavior K0() {
        FrameLayout frameLayout;
        BottomSheetBehavior bottomSheetBehavior = this.Z1;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        Dialog dialog = this.S1;
        if (dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return null;
        }
        BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout);
        this.Z1 = bottomSheetBehaviorE;
        return bottomSheetBehaviorE;
    }

    public final ow5 L0() {
        Object objN = this.Y1.n(a2[0], this);
        objN.getClass();
        return (ow5) objN;
    }

    public abstract int O0();

    public String P0() {
        return "";
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        N0();
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View root = J0().getRoot();
        root.getClass();
        hxm0.v(root);
        L0().b.addView(J0().getRoot());
        qcc.X(this, new o85((byte) 16));
        ConstraintLayout constraintLayout = L0().f25953a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void Z() {
        super.Z();
        this.Z1 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        Window window;
        Window window2;
        this.j1 = true;
        M0();
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (window2 = D0().getWindow()) == null) {
            return;
        }
        hfm0.u(window2, window);
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) {
        View viewFindViewById;
        view.getClass();
        Log.i("onCreateDialog", "Current screen: ".concat(getClass().getName()));
        if (P0().length() > 0) {
            L0().e.setText(P0());
            L0().e.setVisibility(0);
        }
        Dialog dialog = this.S1;
        if (dialog != null && (viewFindViewById = dialog.findViewById(O0())) != null) {
            Drawable drawableU = epv0.U(R.drawable.bg_bottom_sheet, o0());
            if (drawableU != null) {
                sj3.B0(drawableU, o0(), I0());
                sj3.B0(L0().f25953a.getBackground(), o0(), I0());
            } else {
                drawableU = null;
            }
            viewFindViewById.setBackground(drawableU);
        }
        if (this instanceof jty) {
            L0().c.setVisibility(8);
            sj3.L0(L0().b, 0, 0, 0, 0, 13);
        }
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        Object parent = q0().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            h03 h03Var = new h03(this, (byte) 14);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view2, h03Var);
        }
    }

    public void M0() {
    }

    public void N0() {
    }
}
