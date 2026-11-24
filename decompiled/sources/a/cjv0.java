package a;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class cjv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ycm0 f4478a;

    public cjv0(Window window, View view) {
        ani0 ani0Var = new ani0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f4478a = new bjv0(window, ani0Var);
            return;
        }
        if (i >= 30) {
            this.f4478a = new ajv0(window, ani0Var);
        } else if (i >= 26) {
            this.f4478a = new ziv0(window, ani0Var);
        } else {
            this.f4478a = new yiv0(window, ani0Var);
        }
    }

    public final void a(int i) {
        this.f4478a.s(i);
    }

    public final void b(boolean z) {
        this.f4478a.w(z);
    }

    public final void c(int i) {
        this.f4478a.x(i);
    }

    public final void d(int i) {
        this.f4478a.y(i);
    }

    public cjv0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f4478a = new bjv0(windowInsetsController, new ani0(windowInsetsController));
        } else {
            this.f4478a = new ajv0(windowInsetsController, new ani0(windowInsetsController));
        }
    }
}
