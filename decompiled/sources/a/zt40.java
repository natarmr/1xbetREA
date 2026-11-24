package a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nuj0 f44938a = new nuj0(0);
    public final nuj0 b = new nuj0(0);

    public static zt40 a(int i, Context context, TypedArray typedArray) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(resourceId, context);
    }

    public static zt40 b(int i, Context context) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static zt40 c(ArrayList arrayList) {
        zt40 zt40Var = new zt40();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                e9d0.i(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            zt40Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            au40 au40Var = new au40();
            au40Var.d = 0;
            au40Var.e = 1;
            au40Var.f1461a = startDelay;
            au40Var.b = duration;
            au40Var.c = interpolator;
            au40Var.d = objectAnimator.getRepeatCount();
            au40Var.e = objectAnimator.getRepeatMode();
            zt40Var.f44938a.put(propertyName, au40Var);
        }
        return zt40Var;
    }

    public final au40 d(String str) {
        nuj0 nuj0Var = this.f44938a;
        if (nuj0Var.get(str) != null) {
            return (au40) nuj0Var.get(str);
        }
        e9d0.o();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zt40) {
            return this.f44938a.equals(((zt40) obj).f44938a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44938a.hashCode();
    }

    public final String toString() {
        return Separators.RETURN + zt40.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f44938a + "}\n";
    }
}
