package a;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes6.dex */
public final class ueq0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ weq0 f35542a;

    public ueq0(weq0 weq0Var) {
        this.f35542a = weq0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int left;
        int iX;
        int right;
        int iX2;
        s9m0 s9m0Var = weq0.Q1;
        weq0 weq0Var = this.f35542a;
        weq0Var.I0().e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        double height = ((double) weq0Var.I0().f.getHeight()) * 0.41d;
        double height2 = ((double) weq0Var.I0().e.getHeight()) * 0.28d;
        double top = ((double) weq0Var.I0().f.getTop()) - height;
        double bottom = ((double) weq0Var.I0().e.getBottom()) + height2;
        if (weq0Var.o0().getResources().getConfiguration().getLayoutDirection() == 1) {
            left = weq0Var.I0().h.getLeft();
            iX = sj3.X(6);
        } else {
            left = weq0Var.I0().f.getLeft();
            iX = sj3.X(6);
        }
        int i = left - iX;
        if (weq0Var.o0().getResources().getConfiguration().getLayoutDirection() == 1) {
            right = weq0Var.I0().f.getRight();
            iX2 = sj3.X(6);
        } else {
            right = weq0Var.I0().h.getRight();
            iX2 = sj3.X(6);
        }
        int i2 = iX2 + right;
        weq0Var.I0().c.setX(i);
        weq0Var.I0().c.setY((float) top);
        ViewGroup.LayoutParams layoutParams = weq0Var.I0().c.getLayoutParams();
        layoutParams.width = i2 - i;
        layoutParams.height = (int) (bottom - top);
        weq0Var.I0().c.setLayoutParams(layoutParams);
        weq0Var.I0().c.setVisibility(0);
        weq0Var.H0((int) height2, s470.FRUIT_BLAST);
    }
}
