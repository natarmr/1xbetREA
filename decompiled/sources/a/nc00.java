package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nc00 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23268a;
    public final /* synthetic */ oc00 b;

    public /* synthetic */ nc00(oc00 oc00Var, byte b) {
        this.f23268a = b;
        this.b = oc00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f23268a;
        oc00 oc00Var = this.b;
        Object objM = w6x.m(valueAnimator);
        switch (b) {
            case 0:
                oc00Var.l = ((Float) objM).floatValue();
                oc00Var.f25005a.invalidate();
                break;
            case 1:
                oc00Var.f = ((Float) objM).floatValue();
                oc00Var.f25005a.invalidate();
                break;
            case 2:
                oc00Var.j = ((Float) objM).floatValue();
                oc00Var.f25005a.invalidate();
                break;
            default:
                oc00Var.i = ((Float) objM).floatValue();
                oc00Var.f25005a.invalidate();
                break;
        }
    }
}
