package a;

import android.animation.Animator;

/* JADX INFO: loaded from: classes6.dex */
public final class d7n implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5i f5601a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f5i c;

    public d7n(f5i f5iVar, boolean z, f5i f5iVar2) {
        this.f5601a = f5iVar;
        this.b = z;
        this.c = f5iVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.f5601a.setVisibility(this.b ? 0 : 8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.c.setVisibility(0);
    }
}
