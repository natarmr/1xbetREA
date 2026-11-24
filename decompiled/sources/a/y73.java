package a;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class y73 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f42130a;
    public final Function1 b;
    public final Function0 c;
    public final Function1 d;
    public final clz e;

    public y73(Function0 function0, Function1 function1, Function0 function2, Function1 function3, clz clzVar) {
        this.f42130a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = clzVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        glz glzVarX;
        animator.getClass();
        clz clzVar = this.e;
        if (((clzVar == null || (glzVarX = clzVar.x()) == null) ? null : glzVarX.i) != lkz.f20223a) {
            this.d.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        glz glzVarX;
        animator.getClass();
        clz clzVar = this.e;
        if (((clzVar == null || (glzVarX = clzVar.x()) == null) ? null : glzVarX.i) != lkz.f20223a) {
            this.c.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        glz glzVarX;
        animator.getClass();
        clz clzVar = this.e;
        if (((clzVar == null || (glzVarX = clzVar.x()) == null) ? null : glzVarX.i) != lkz.f20223a) {
            this.b.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        glz glzVarX;
        animator.getClass();
        clz clzVar = this.e;
        if (((clzVar == null || (glzVarX = clzVar.x()) == null) ? null : glzVarX.i) != lkz.f20223a) {
            this.f42130a.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        glz glzVarX;
        animator.getClass();
        clz clzVar = this.e;
        if (((clzVar == null || (glzVarX = clzVar.x()) == null) ? null : glzVarX.i) != lkz.f20223a) {
            onAnimationEnd(animator);
        }
    }
}
