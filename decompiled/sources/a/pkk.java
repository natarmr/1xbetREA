package a;

import android.animation.Animator;

/* JADX INFO: loaded from: classes4.dex */
public final class pkk implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27138a;
    public final /* synthetic */ qkk b;

    public pkk(int i, qkk qkkVar) {
        this.f27138a = i;
        this.b = qkkVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        qkk qkkVar = this.b;
        if (this.f27138a == q3d.i(qkkVar.c)) {
            qkkVar.d.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
