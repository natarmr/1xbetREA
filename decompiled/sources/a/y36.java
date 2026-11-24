package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class y36 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41937a;
    public final /* synthetic */ int b;
    public final /* synthetic */ g46 c;

    public /* synthetic */ y36(g46 g46Var, int i, byte b) {
        this.f41937a = b;
        this.c = g46Var;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f41937a;
        int i = this.b;
        g46 g46Var = this.c;
        switch (b) {
            case 0:
                g46Var.c(i);
                break;
            default:
                g46Var.c(i);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f41937a) {
            case 1:
                this.c.j.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
