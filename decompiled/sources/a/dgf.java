package a;

import android.animation.Animator;

/* JADX INFO: loaded from: classes4.dex */
public final class dgf implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6039a;
    public final /* synthetic */ egf b;

    public /* synthetic */ dgf(egf egfVar, byte b) {
        this.f6039a = b;
        this.b = egfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f6039a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f6039a;
        egf egfVar = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                egfVar.c();
                break;
            default:
                egfVar.getBinding().d.setAlpha(0.0f);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f6039a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f6039a;
        animator.getClass();
    }
}
