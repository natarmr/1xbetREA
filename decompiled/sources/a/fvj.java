package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class fvj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10217a = 1;
    public final /* synthetic */ xhe0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ kvj e;

    public fvj(kvj kvjVar, xhe0 xhe0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = kvjVar;
        this.b = xhe0Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10217a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f10217a;
        xhe0 xhe0Var = this.b;
        kvj kvjVar = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                kvjVar.c(xhe0Var);
                kvjVar.q.remove(xhe0Var);
                kvjVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                kvjVar.c(xhe0Var);
                kvjVar.o.remove(xhe0Var);
                kvjVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10217a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public fvj(kvj kvjVar, xhe0 xhe0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = kvjVar;
        this.b = xhe0Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
