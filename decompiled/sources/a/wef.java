package a;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class wef implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39015a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ wef(Function0 function0, byte b) {
        this.f39015a = b;
        this.b = function0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f39015a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f39015a;
        Function0 function0 = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                function0.invoke();
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f39015a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f39015a;
        animator.getClass();
    }
}
