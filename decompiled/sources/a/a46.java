package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class a46 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f208a;
    public final /* synthetic */ g46 b;

    public /* synthetic */ a46(g46 g46Var, byte b) {
        this.f208a = b;
        this.b = g46Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f208a;
        g46 g46Var = this.b;
        switch (b) {
            case 0:
                g46Var.d();
                break;
            default:
                g46Var.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f208a) {
            case 0:
                this.b.j.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
