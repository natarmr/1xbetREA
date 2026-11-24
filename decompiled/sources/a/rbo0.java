package a;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class rbo0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f30199a;
    public final /* synthetic */ View b;
    public final /* synthetic */ sbo0 c;

    public rbo0(sbo0 sbo0Var, View view, View view2) {
        this.c = sbo0Var;
        this.f30199a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.f30199a, this.b, valueAnimator.getAnimatedFraction());
    }
}
