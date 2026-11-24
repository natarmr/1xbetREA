package a;

import android.animation.Animator;

/* JADX INFO: loaded from: classes5.dex */
public final class u930 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35263a;
    public final /* synthetic */ v930 b;

    public /* synthetic */ u930(v930 v930Var, byte b) {
        this.f35263a = b;
        this.b = v930Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f35263a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f35263a;
        v930 v930Var = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                v930Var.e = false;
                break;
            case 1:
                v930Var.f = false;
                break;
            case 2:
                v930Var.c.setCompress(true);
                break;
            case 3:
                v930Var.d.a(0, v930Var.b);
                break;
            case 4:
                v930Var.c.setupDisableWhenAnim(true);
                break;
            case 5:
                v930Var.c.setCompress(false);
                break;
            default:
                v930Var.d.a(v930Var.f37014a, 0);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f35263a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f35263a;
        v930 v930Var = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                v930Var.e = true;
                break;
            case 1:
                v930Var.f = true;
                break;
            case 4:
                v930Var.c.setupDisableWhenAnim(false);
                break;
        }
    }
}
