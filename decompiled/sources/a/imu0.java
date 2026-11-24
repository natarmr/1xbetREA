package a;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class imu0 extends hmu0 {
    @Override // a.ibm0
    public final void A(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // a.hmu0
    public final void H(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // a.hmu0
    public final void I(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // a.hmu0
    public final void J(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // a.hmu0
    public final void K(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.hmu0
    public final void L(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // a.ibm0
    public final float z(View view) {
        return view.getTransitionAlpha();
    }
}
