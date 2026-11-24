package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class wjc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39255a;
    public final /* synthetic */ xjc b;

    public /* synthetic */ wjc(xjc xjcVar, byte b) {
        this.f39255a = b;
        this.b = xjcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f39255a) {
            case 1:
                super.onAnimationEnd(animator);
                xjc xjcVar = this.b;
                xjcVar.d();
                s06 s06Var = xjcVar.j;
                if (s06Var != null) {
                    s06Var.a((d5x) xjcVar.f3600a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f39255a) {
            case 0:
                super.onAnimationRepeat(animator);
                xjc xjcVar = this.b;
                xjcVar.g = (xjcVar.g + xjc.l.length) % xjcVar.f.e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
