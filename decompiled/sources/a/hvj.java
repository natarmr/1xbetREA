package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class hvj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13729a;
    public final /* synthetic */ ivj b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ kvj e;

    public /* synthetic */ hvj(kvj kvjVar, ivj ivjVar, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.f13729a = b;
        this.e = kvjVar;
        this.b = ivjVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f13729a;
        ivj ivjVar = this.b;
        kvj kvjVar = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kvjVar.c(ivjVar.f15448a);
                kvjVar.r.remove(ivjVar.f15448a);
                kvjVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kvjVar.c(ivjVar.b);
                kvjVar.r.remove(ivjVar.b);
                kvjVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f13729a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }
}
