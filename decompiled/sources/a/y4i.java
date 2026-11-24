package a;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class y4i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42003a;
    public final /* synthetic */ org.xplatform.uikit.components.text_field.end.b b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ y4i(org.xplatform.uikit.components.text_field.end.b bVar, Function0 function0, byte b) {
        this.f42003a = b;
        this.b = bVar;
        this.c = function0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f42003a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f42003a;
        Function0 function0 = this.c;
        org.xplatform.uikit.components.text_field.end.b bVar = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                bVar.f = 1;
                function0.invoke();
                break;
            default:
                bVar.f = 0;
                function0.invoke();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f42003a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f42003a;
        animator.getClass();
    }
}
