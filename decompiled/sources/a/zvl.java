package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class zvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathInterpolator f45063a = new PathInterpolator(0.68f, -0.6f, 0.32f, 1.6f);

    public final AnimatorSet a(float f, float f2, Function1 function1) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(this.f45063a);
        valueAnimatorOfFloat.addUpdateListener(new svl(function1, (byte) 1));
        animatorSet.play(valueAnimatorOfFloat);
        return animatorSet;
    }
}
