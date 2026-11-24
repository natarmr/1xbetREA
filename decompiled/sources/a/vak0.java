package a;

import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vak0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37093a;
    public final /* synthetic */ wak0 b;

    public /* synthetic */ vak0(wak0 wak0Var, byte b) {
        this.f37093a = b;
        this.b = wak0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f37093a;
        wak0 wak0Var = this.b;
        switch (b) {
            case 0:
                wak0Var.m.postDelayed(new vak0(wak0Var, (byte) 1), wak0Var.l);
                break;
            default:
                wak0Var.m.animate().scaleX(1.0f).scaleY(1.0f).setDuration(wak0Var.k).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
