package a;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class jk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jk9 f16656a = new jk9();

    public final void a(View view, float[] fArr, Matrix matrix, int[] iArr) {
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        tke.b0(matrix, fArr);
    }
}
