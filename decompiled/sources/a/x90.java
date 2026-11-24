package a;

import android.animation.Animator;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteWheel;

/* JADX INFO: loaded from: classes2.dex */
public final class x90 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40486a;
    public final /* synthetic */ AfricanRouletteWheel b;

    public /* synthetic */ x90(AfricanRouletteWheel africanRouletteWheel, byte b) {
        this.f40486a = b;
        this.b = africanRouletteWheel;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f40486a;
        animator.getClass();
        switch (b) {
            case 0:
                break;
            default:
                this.b.d = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f40486a;
        AfricanRouletteWheel africanRouletteWheel = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                africanRouletteWheel.e.invoke();
                africanRouletteWheel.c = null;
                break;
            default:
                africanRouletteWheel.d = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f40486a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f40486a;
        animator.getClass();
    }
}
