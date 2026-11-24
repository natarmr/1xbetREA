package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes6.dex */
public final class fw5 extends dw5 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ iw5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw5(iw5 iw5Var, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = iw5Var;
    }

    public final Object i() {
        byte b = this.c;
        iw5 iw5Var = this.d;
        switch (b) {
            case 0:
                Object parent = iw5Var.q0().getParent();
                parent.getClass();
                return BottomSheetBehavior.E((View) parent);
            default:
                ComposeView composeView = new ComposeView(iw5Var.o0(), null, 6);
                composeView.setId(View.generateViewId());
                ViewParent parent2 = iw5Var.q0().getParent();
                ViewParent parent3 = parent2 != null ? parent2.getParent() : null;
                CoordinatorLayout coordinatorLayout = parent3 instanceof CoordinatorLayout ? (CoordinatorLayout) parent3 : null;
                if (coordinatorLayout != null) {
                    LinearLayout linearLayout = new LinearLayout(coordinatorLayout.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(1);
                    linearLayout.setClipChildren(false);
                    linearLayout.setClipToPadding(false);
                    linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    ViewParent parent4 = coordinatorLayout.getParent();
                    parent4.getClass();
                    ViewGroup viewGroup = (ViewGroup) parent4;
                    iw5Var.d2 = coordinatorLayout;
                    viewGroup.removeView(coordinatorLayout);
                    viewGroup.addView(linearLayout);
                    coordinatorLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                    linearLayout.addView(coordinatorLayout);
                    composeView.setClipChildren(false);
                    composeView.setClipToPadding(false);
                    composeView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(composeView);
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) iw5Var.Y1.b;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.y((po8) iw5Var.i2.getValue());
                }
                return composeView;
        }
    }
}
