package a;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class x73 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f40393a;
    public final Function1 b;
    public final Function0 c;
    public final Function1 d;

    public x73(Function0 function0, Function0 function1, int i) {
        function0 = (i & 1) != 0 ? new f33((byte) 4) : function0;
        sy2 sy2Var = new sy2((byte) 12);
        sy2 sy2Var2 = new sy2((byte) 13);
        this.f40393a = function0;
        this.b = sy2Var;
        this.c = function1;
        this.d = sy2Var2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.d.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.c.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
        this.b.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.f40393a.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        animator.getClass();
        onAnimationEnd(animator);
    }
}
