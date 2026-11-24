package a;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class von0 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37776a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ von0(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.f37776a = b;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        zon0 zon0Var;
        byte b = this.f37776a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                if (!swipeRefreshLayout.c) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.z.setAlpha(255);
                    swipeRefreshLayout.z.start();
                    if (swipeRefreshLayout.h1 && (zon0Var = swipeRefreshLayout.b) != null) {
                        zon0Var.b();
                    }
                    swipeRefreshLayout.n = swipeRefreshLayout.t.getTop();
                }
                break;
            default:
                won0 won0Var = new won0(swipeRefreshLayout, (byte) 1);
                swipeRefreshLayout.B = won0Var;
                won0Var.setDuration(150L);
                gjc gjcVar = swipeRefreshLayout.t;
                gjcVar.f11391a = null;
                gjcVar.clearAnimation();
                swipeRefreshLayout.t.startAnimation(swipeRefreshLayout.B);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.f37776a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.f37776a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
