package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class ujc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35771a;
    public final /* synthetic */ vjc b;

    public /* synthetic */ ujc(vjc vjcVar, byte b) {
        this.f35771a = b;
        this.b = vjcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f35771a) {
            case 1:
                super.onAnimationEnd(animator);
                vjc vjcVar = this.b;
                vjcVar.d();
                s06 s06Var = vjcVar.j;
                if (s06Var != null) {
                    s06Var.a((d5x) vjcVar.f3600a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f35771a) {
            case 0:
                super.onAnimationRepeat(animator);
                vjc vjcVar = this.b;
                vjcVar.g = (vjcVar.g + 4) % vjcVar.f.e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
