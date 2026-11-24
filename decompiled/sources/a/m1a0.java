package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: loaded from: classes.dex */
public final class m1a0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20998a;
    public final /* synthetic */ PlayerControlView b;
    public final /* synthetic */ n1a0 c;

    public /* synthetic */ m1a0(n1a0 n1a0Var, PlayerControlView playerControlView, byte b) {
        this.f20998a = b;
        this.c = n1a0Var;
        this.b = playerControlView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f20998a;
        PlayerControlView playerControlView = this.b;
        n1a0 n1a0Var = this.c;
        switch (b) {
            case 0:
                n1a0Var.i(1);
                if (n1a0Var.C) {
                    playerControlView.post(n1a0Var.t);
                    n1a0Var.C = false;
                }
                break;
            case 1:
                n1a0Var.i(2);
                if (n1a0Var.C) {
                    playerControlView.post(n1a0Var.t);
                    n1a0Var.C = false;
                }
                break;
            default:
                n1a0Var.i(2);
                if (n1a0Var.C) {
                    playerControlView.post(n1a0Var.t);
                    n1a0Var.C = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f20998a;
        n1a0 n1a0Var = this.c;
        switch (b) {
            case 0:
                n1a0Var.i(3);
                break;
            case 1:
                n1a0Var.i(3);
                break;
            default:
                n1a0Var.i(3);
                break;
        }
    }
}
