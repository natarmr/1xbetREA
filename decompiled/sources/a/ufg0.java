package a;

import android.animation.Animator;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield.RouletteView;

/* JADX INFO: loaded from: classes4.dex */
public final class ufg0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RouletteView f35576a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public ufg0(RouletteView rouletteView, int i, int i2) {
        this.f35576a = rouletteView;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        RouletteView rouletteView = this.f35576a;
        jmu0.j(rouletteView.getBinding().c, jiq0.n0(this.b, rouletteView.getContext()));
        TextView textView = rouletteView.getBinding().c;
        int i = this.c;
        textView.setText(i == -1 ? "00" : String.valueOf(i));
        rouletteView.getBinding().c.animate().alpha(0.0f).setDuration(5000L).start();
        rouletteView.getBinding().c.setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        RouletteView rouletteView = this.f35576a;
        rouletteView.getBinding().c.setVisibility(8);
        rouletteView.getBinding().c.setAlpha(1.0f);
    }
}
