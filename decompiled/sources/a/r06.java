package a;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class r06 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29614a;
    public final /* synthetic */ t06 b;

    public /* synthetic */ r06(t06 t06Var, byte b) {
        this.f29614a = b;
        this.b = t06Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f29614a;
        t06 t06Var = this.b;
        switch (b) {
            case 0:
                if (t06Var.d > 0) {
                    t06Var.e = SystemClock.uptimeMillis();
                }
                t06Var.setVisibility(0);
                break;
            default:
                ((shl) t06Var.getCurrentDrawable()).d(false, false, true);
                if ((t06Var.getProgressDrawable() == null || !t06Var.getProgressDrawable().isVisible()) && (t06Var.getIndeterminateDrawable() == null || !t06Var.getIndeterminateDrawable().isVisible())) {
                    t06Var.setVisibility(4);
                }
                t06Var.e = -1L;
                break;
        }
    }
}
