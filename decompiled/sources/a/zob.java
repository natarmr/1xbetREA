package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class zob extends gms0 {
    public static final uob l1;
    public static final uob m1;
    public static final uob n1;
    public static final uob o1;
    public static final uob p1;
    public boolean j1;
    public static final String[] k1 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final zkq q1 = new zkq((byte) 2);

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        l1 = new uob(cls, str, (byte) 0);
        String str2 = "bottomRight";
        m1 = new uob(cls, str2, (byte) 1);
        n1 = new uob(cls, str2, (byte) 2);
        o1 = new uob(cls, str, (byte) 3);
        p1 = new uob(cls, "position", (byte) 4);
    }

    public final void U(mns0 mns0Var) {
        View view = mns0Var.b;
        HashMap map = mns0Var.f22105a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.j1) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // a.gms0
    public final void f(mns0 mns0Var) {
        U(mns0Var);
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        Rect rect;
        U(mns0Var);
        if (!this.j1 || (rect = (Rect) mns0Var.b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        mns0Var.f22105a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.gms0
    public final Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        int i;
        int i2;
        Rect rect;
        Animator animator;
        Animator animatorA;
        if (mns0Var != null) {
            HashMap map = mns0Var.f22105a;
            if (mns0Var2 != null) {
                HashMap map2 = mns0Var2.f22105a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = mns0Var2.b;
                    Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
                    int i3 = rect2.left;
                    int i4 = rect3.left;
                    int i5 = rect2.top;
                    int i6 = rect3.top;
                    int i7 = rect2.right;
                    int i8 = rect3.right;
                    int i9 = rect2.bottom;
                    int i10 = rect3.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect4 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                        i = 0;
                    } else {
                        i = (i3 == i4 && i5 == i6) ? 0 : 1;
                        if (i7 != i8 || i9 != i10) {
                            i++;
                        }
                    }
                    if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                        i++;
                    }
                    int i15 = i;
                    if (i15 <= 0) {
                        return null;
                    }
                    boolean z = this.j1;
                    uob uobVar = p1;
                    if (z) {
                        bmu0.a(view, i3, i5, i3 + Math.max(i11, i13), i5 + Math.max(i12, i14));
                        ObjectAnimator objectAnimatorA = (i3 == i4 && i5 == i6) ? null : r960.a(view, uobVar, this.B.a(i3, i5, i4, i6));
                        boolean z2 = rect4 == null;
                        if (z2) {
                            i2 = 0;
                            rect = new Rect(0, 0, i11, i12);
                        } else {
                            i2 = 0;
                            rect = rect4;
                        }
                        int i16 = rect5 == null ? 1 : i2;
                        Rect rect6 = i16 != 0 ? new Rect(i2, i2, i13, i14) : rect5;
                        if (rect.equals(rect6)) {
                            animator = null;
                        } else {
                            view.setClipBounds(rect);
                            Animator animatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", q1, rect, rect6);
                            wob wobVar = new wob(view, rect, z2, rect6, i16, i3, i5, i7, i9, i4, i6, i8, i10);
                            animatorOfObject.addListener(wobVar);
                            a(wobVar);
                            animator = animatorOfObject;
                        }
                        boolean z3 = lns0.f20363a;
                        animatorA = objectAnimatorA;
                        if (objectAnimatorA == null) {
                            animatorA = animator;
                        } else if (animator != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, animator);
                            animatorA = animatorSet;
                        }
                    } else {
                        bmu0.a(view, i3, i5, i7, i9);
                        if (i15 != 2) {
                            animatorA = (i3 == i4 && i5 == i6) ? r960.a(view, n1, this.B.a(i7, i9, i8, i10)) : r960.a(view, o1, this.B.a(i3, i5, i4, i6));
                        } else if (i11 == i13 && i12 == i14) {
                            animatorA = r960.a(view, uobVar, this.B.a(i3, i5, i4, i6));
                        } else {
                            yob yobVar = new yob(view);
                            ObjectAnimator objectAnimatorA2 = r960.a(yobVar, l1, this.B.a(i3, i5, i4, i6));
                            ObjectAnimator objectAnimatorA3 = r960.a(yobVar, m1, this.B.a(i7, i9, i8, i10));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet2.addListener(new vob(yobVar));
                            animatorA = animatorSet2;
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        v2n0.q(viewGroup4, true);
                        w().a(new xob(viewGroup4));
                    }
                    return animatorA;
                }
            }
        }
        return null;
    }

    @Override // a.gms0
    public final String[] z() {
        return k1;
    }
}
