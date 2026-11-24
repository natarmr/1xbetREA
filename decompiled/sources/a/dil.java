package a;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class dil implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6145a;
    public final /* synthetic */ View b;

    public /* synthetic */ dil(View view, byte b) {
        this.f6145a = b;
        this.b = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f6145a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f6145a;
        View view = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                view.setTranslationY(0.0f);
                view.setAlpha(0.0f);
                break;
            case 1:
                view.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f6145a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f6145a;
        animator.getClass();
        switch (b) {
            case 0:
            case 1:
                break;
            default:
                this.b.setEnabled(false);
                break;
        }
    }
}
