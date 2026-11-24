package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class l1a0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19241a;
    public final /* synthetic */ n1a0 b;

    public /* synthetic */ l1a0(n1a0 n1a0Var, byte b) {
        this.f19241a = b;
        this.b = n1a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        byte b = this.f19241a;
        n1a0 n1a0Var = this.b;
        switch (b) {
            case 0:
                View view = n1a0Var.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = n1a0Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = n1a0Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = n1a0Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                n1a0Var.i(0);
                break;
            case 3:
                n1a0Var.i(0);
                break;
            case 4:
                ViewGroup viewGroup4 = n1a0Var.g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup5 = n1a0Var.i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f19241a;
        n1a0 n1a0Var = this.b;
        switch (b) {
            case 0:
                View view = n1a0Var.k;
                if ((view instanceof zxj) && !n1a0Var.B) {
                    zxj zxjVar = (zxj) view;
                    ValueAnimator valueAnimator = zxjVar.h1;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(zxjVar.i1, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = n1a0Var.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = n1a0Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = n1a0Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = n1a0Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(n1a0Var.B ? 0 : 4);
                }
                View view3 = n1a0Var.k;
                if ((view3 instanceof zxj) && !n1a0Var.B) {
                    zxj zxjVar2 = (zxj) view3;
                    ValueAnimator valueAnimator2 = zxjVar2.h1;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    zxjVar2.j1 = false;
                    valueAnimator2.setFloatValues(zxjVar2.i1, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                n1a0Var.i(4);
                break;
            case 3:
                n1a0Var.i(4);
                break;
            case 4:
                ViewGroup viewGroup4 = n1a0Var.i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup5 = n1a0Var.g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                break;
        }
    }
}
