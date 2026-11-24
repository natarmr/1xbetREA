package a;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class yiv0 extends ycm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f42716a;
    public final ani0 b;

    public yiv0(Window window, ani0 ani0Var) {
        this.f42716a = window;
        this.b = ani0Var;
    }

    public final void C(int i) {
        View decorView = this.f42716a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void D(int i) {
        View decorView = this.f42716a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // a.ycm0
    public final int q() {
        Object tag = this.f42716a.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }

    @Override // a.ycm0
    public final void s(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    C(4);
                } else if (i2 == 2) {
                    C(2);
                } else if (i2 == 8) {
                    ((lef0) this.b.f1155a).h();
                }
            }
        }
    }

    @Override // a.ycm0
    public final boolean u() {
        return (this.f42716a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // a.ycm0
    public final void w(boolean z) {
        if (!z) {
            D(8192);
            return;
        }
        Window window = this.f42716a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        C(8192);
    }

    @Override // a.ycm0
    public final void x(int i) {
        this.f42716a.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            D(6144);
            return;
        }
        if (i == 1) {
            D(4096);
            C(2048);
        } else {
            if (i != 2) {
                return;
            }
            D(2048);
            C(4096);
        }
    }

    @Override // a.ycm0
    public final void y(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    D(4);
                    this.f42716a.clearFlags(1024);
                } else if (i2 == 2) {
                    D(2);
                } else if (i2 == 8) {
                    ((lef0) this.b.f1155a).l();
                }
            }
        }
    }
}
