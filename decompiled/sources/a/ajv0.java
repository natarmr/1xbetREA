package a;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class ajv0 extends ycm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f996a;
    public final ani0 b;
    public final Window c;

    public ajv0(Window window, ani0 ani0Var) {
        this(window.getInsetsController(), ani0Var);
        this.c = window;
    }

    public final boolean C(int i, int i2) {
        Window window = this.c;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & i) != 0;
        }
        this.f996a.setSystemBarsAppearance(0, 0);
        return (this.f996a.getSystemBarsAppearance() & i2) != 0;
    }

    public final void D(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // a.ycm0
    public int q() {
        Window window = this.c;
        if (window == null) {
            return this.f996a.getSystemBarsBehavior();
        }
        Object tag = window.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }

    @Override // a.ycm0
    public final void s(int i) {
        if ((i & 8) != 0) {
            ((lef0) this.b.f1155a).h();
        }
        this.f996a.hide(i & (-9));
    }

    @Override // a.ycm0
    public boolean t() {
        return C(16, 16);
    }

    @Override // a.ycm0
    public boolean u() {
        return C(8192, 8);
    }

    @Override // a.ycm0
    public void v(boolean z) {
        Window window = this.c;
        if (window != null) {
            if (!z) {
                D(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.f996a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // a.ycm0
    public void w(boolean z) {
        Window window = this.c;
        if (window != null) {
            if (!z) {
                D(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.f996a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // a.ycm0
    public void x(int i) {
        Window window = this.c;
        if (window == null) {
            this.f996a.setSystemBarsBehavior(i);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            D(6144);
            return;
        }
        if (i == 1) {
            D(4096);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
        } else {
            if (i != 2) {
                return;
            }
            D(2048);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
        }
    }

    @Override // a.ycm0
    public final void y(int i) {
        if ((i & 8) != 0) {
            ((lef0) this.b.f1155a).l();
        }
        this.f996a.show(i & (-9));
    }

    public ajv0(WindowInsetsController windowInsetsController, ani0 ani0Var) {
        this.f996a = windowInsetsController;
        this.b = ani0Var;
    }
}
