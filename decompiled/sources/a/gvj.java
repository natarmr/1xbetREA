package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class gvj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xhe0 f11977a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ kvj f;

    public gvj(kvj kvjVar, xhe0 xhe0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = kvjVar;
        this.f11977a = xhe0Var;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        kvj kvjVar = this.f;
        xhe0 xhe0Var = this.f11977a;
        kvjVar.c(xhe0Var);
        kvjVar.p.remove(xhe0Var);
        kvjVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
