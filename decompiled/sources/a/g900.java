package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class g900 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10890a;
    public final /* synthetic */ h900 b;

    public /* synthetic */ g900(h900 h900Var, byte b) {
        this.f10890a = b;
        this.b = h900Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10890a) {
            case 1:
                super.onAnimationEnd(animator);
                h900 h900Var = this.b;
                h900Var.d();
                s06 s06Var = h900Var.j;
                if (s06Var != null) {
                    s06Var.a((d5x) h900Var.f3600a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f10890a) {
            case 0:
                super.onAnimationRepeat(animator);
                h900 h900Var = this.b;
                h900Var.g = (h900Var.g + 1) % h900Var.f.e.length;
                h900Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
