package a;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class tvl {
    public static ValueAnimator a(int i, int i2, LinearInterpolator linearInterpolator, ArgbEvaluator argbEvaluator, Function1 function1) {
        linearInterpolator.getClass();
        argbEvaluator.getClass();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.setDuration(50L);
        valueAnimatorOfObject.setInterpolator(linearInterpolator);
        valueAnimatorOfObject.addUpdateListener(new svl(function1, (byte) 0));
        return valueAnimatorOfObject;
    }
}
