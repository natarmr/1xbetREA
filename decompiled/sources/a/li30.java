package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class li30 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f20085a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mi30 c;

    public li30(mi30 mi30Var, boolean z, int i) {
        this.c = mi30Var;
        this.f20085a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mi30 mi30Var = this.c;
        mi30Var.b.setTranslationX(0.0f);
        mi30Var.a(0.0f, this.b, this.f20085a);
    }
}
