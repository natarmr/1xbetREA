package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.AnimatingPasswordTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class x63 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40342a;
    public final /* synthetic */ AnimatingPasswordTextView b;

    public /* synthetic */ x63(AnimatingPasswordTextView animatingPasswordTextView, byte b) {
        this.f40342a = b;
        this.b = animatingPasswordTextView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f40342a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f40342a;
        AnimatingPasswordTextView animatingPasswordTextView = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                AnimatorSet animatorSet = animatingPasswordTextView.f;
                if (animatorSet != null && Intrinsics.d(animatorSet, animator)) {
                    animatingPasswordTextView.f = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = animatingPasswordTextView.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatingPasswordTextView.f = null;
                    Function1 function1 = animatingPasswordTextView.h;
                    if (function1 != null && animatingPasswordTextView.getStringBuilder().length() == animatingPasswordTextView.f47206a) {
                        function1.invoke(animatingPasswordTextView.getStringBuilder().toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f40342a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f40342a;
        animator.getClass();
    }
}
