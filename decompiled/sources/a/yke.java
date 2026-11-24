package a;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class yke {
    public boolean e(Rect rect, View view) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f) {
        return false;
    }

    public void q(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public Parcelable t(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    public boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void j() {
    }

    public void g(ble bleVar) {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void s(View view, Parcelable parcelable) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void p(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
    }
}
