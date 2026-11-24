package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import org.xplatform.ui_core.AnimatedCoefficientView;

/* JADX INFO: loaded from: classes6.dex */
public final class n43 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22880a;
    public final /* synthetic */ AnimatedCoefficientView b;

    public /* synthetic */ n43(AnimatedCoefficientView animatedCoefficientView, byte b) {
        this.f22880a = b;
        this.b = animatedCoefficientView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f22880a;
        AnimatedCoefficientView animatedCoefficientView = this.b;
        animator.getClass();
        switch (b) {
            case 0:
                AnimatorSet animatorSet = new AnimatorSet();
                int i = AnimatedCoefficientView.j1;
                animatedCoefficientView.b();
                animatorSet.play(animatedCoefficientView.b()).before(animatedCoefficientView.e());
                animatorSet.start();
                animatedCoefficientView.x = animatorSet;
                break;
            case 1:
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i2 = AnimatedCoefficientView.j1;
                animatedCoefficientView.b();
                animatorSet2.play(animatedCoefficientView.b());
                animatorSet2.start();
                animatedCoefficientView.x = animatorSet2;
                break;
            default:
                int i3 = AnimatedCoefficientView.j1;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ValueAnimator valueAnimatorE = animatedCoefficientView.e();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
                valueAnimatorOfInt.setStartDelay(animatedCoefficientView.h1);
                valueAnimatorOfInt.setDuration(animatedCoefficientView.i1);
                valueAnimatorOfInt.setInterpolator(animatedCoefficientView.g);
                valueAnimatorOfInt.addUpdateListener(new l43(animatedCoefficientView, (byte) 2));
                animatorSet3.play(animatedCoefficientView.b()).before(valueAnimatorE);
                animatorSet3.play(valueAnimatorE).with(valueAnimatorOfInt);
                animatorSet3.start();
                animatedCoefficientView.x = animatorSet3;
                break;
        }
    }
}
