package a;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pb8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26692a;
    public final /* synthetic */ qb8 b;
    public final /* synthetic */ View c;

    public /* synthetic */ pb8(qb8 qb8Var, View view, byte b) {
        this.f26692a = b;
        this.b = qb8Var;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f26692a;
        View view = this.c;
        qb8 qb8Var = this.b;
        Object objM = w6x.m(valueAnimator);
        switch (b) {
            case 0:
                qb8Var.l = ((Float) objM).floatValue();
                view.invalidate();
                break;
            default:
                qb8Var.e = ((Float) objM).floatValue();
                view.invalidate();
                break;
        }
    }
}
