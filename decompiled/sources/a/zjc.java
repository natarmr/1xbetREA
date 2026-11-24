package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class zjc implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bkc f44477a;
    public final /* synthetic */ ckc b;

    public zjc(ckc ckcVar, bkc bkcVar) {
        this.b = ckcVar;
        this.f44477a = bkcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bkc bkcVar = this.f44477a;
        ckc.d(fFloatValue, bkcVar);
        ckc ckcVar = this.b;
        ckcVar.a(fFloatValue, bkcVar, false);
        ckcVar.invalidateSelf();
    }
}
