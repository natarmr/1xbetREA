package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class z36 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43705a;
    public final /* synthetic */ g46 b;

    public /* synthetic */ z36(g46 g46Var, byte b) {
        this.f43705a = b;
        this.b = g46Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f43705a;
        g46 g46Var = this.b;
        switch (b) {
            case 0:
                g46Var.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f46 f46Var = g46Var.i;
                f46Var.setScaleX(fFloatValue);
                f46Var.setScaleY(fFloatValue);
                break;
            case 2:
                g46Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                g46Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
