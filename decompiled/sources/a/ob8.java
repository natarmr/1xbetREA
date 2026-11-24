package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ob8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24965a;
    public final /* synthetic */ qb8 b;

    public /* synthetic */ ob8(qb8 qb8Var, byte b) {
        this.f24965a = b;
        this.b = qb8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f24965a;
        qb8 qb8Var = this.b;
        Object objM = w6x.m(valueAnimator);
        switch (b) {
            case 0:
                qb8Var.l = ((Float) objM).floatValue();
                break;
            case 1:
                qb8Var.m = ((Float) objM).floatValue();
                break;
            default:
                qb8Var.r = ((Float) objM).floatValue();
                break;
        }
    }
}
