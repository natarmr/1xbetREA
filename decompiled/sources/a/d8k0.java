package a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d8k0 extends muu0 {
    public static final DecelerateInterpolator m1 = new DecelerateInterpolator();
    public static final AccelerateInterpolator n1 = new AccelerateInterpolator();
    public static final a8k0 o1 = new a8k0((byte) 0);
    public static final a8k0 p1 = new a8k0((byte) 1);
    public static final b8k0 q1 = new b8k0((byte) 0);
    public static final a8k0 r1 = new a8k0((byte) 2);
    public static final a8k0 s1 = new a8k0((byte) 3);
    public static final b8k0 t1 = new b8k0((byte) 1);
    public c8k0 l1;

    @Override // a.muu0
    public final ObjectAnimator W(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2) {
        if (mns0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) mns0Var2.f22105a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return tnq0.k(view, mns0Var2, iArr[0], iArr[1], this.l1.a(view, viewGroup), this.l1.b(view, viewGroup), translationX, translationY, m1, this);
    }

    @Override // a.muu0
    public final ObjectAnimator X(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2) {
        if (mns0Var == null) {
            return null;
        }
        int[] iArr = (int[]) mns0Var.f22105a.get("android:slide:screenPosition");
        return tnq0.k(view, mns0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.l1.a(view, viewGroup), this.l1.b(view, viewGroup), n1, this);
    }

    @Override // a.muu0, a.gms0
    public final void f(mns0 mns0Var) {
        muu0.U(mns0Var);
        int[] iArr = new int[2];
        mns0Var.b.getLocationOnScreen(iArr);
        mns0Var.f22105a.put("android:slide:screenPosition", iArr);
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        muu0.U(mns0Var);
        int[] iArr = new int[2];
        mns0Var.b.getLocationOnScreen(iArr);
        mns0Var.f22105a.put("android:slide:screenPosition", iArr);
    }
}
