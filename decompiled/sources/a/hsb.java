package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hsb extends gms0 {
    public static final String[] j1 = {"android:changeScroll:x", "android:changeScroll:y"};

    public static void U(mns0 mns0Var) {
        HashMap map = mns0Var.f22105a;
        View view = mns0Var.b;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // a.gms0
    public final void f(mns0 mns0Var) {
        U(mns0Var);
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        U(mns0Var);
    }

    @Override // a.gms0
    public final Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (mns0Var != null) {
            HashMap map = mns0Var.f22105a;
            if (mns0Var2 != null) {
                HashMap map2 = mns0Var2.f22105a;
                View view = mns0Var2.b;
                int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
                int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
                int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
                int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
                if (iIntValue != iIntValue2) {
                    view.setScrollX(iIntValue);
                    objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
                } else {
                    objectAnimatorOfInt = null;
                }
                if (iIntValue3 != iIntValue4) {
                    view.setScrollY(iIntValue3);
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
                }
                boolean z = lns0.f20363a;
                if (objectAnimatorOfInt == null) {
                    return objectAnimatorOfInt2;
                }
                if (objectAnimatorOfInt2 == null) {
                    return objectAnimatorOfInt;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // a.gms0
    public final String[] z() {
        return j1;
    }
}
