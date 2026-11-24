package a;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class ziv0 extends yiv0 {
    @Override // a.ycm0
    public final boolean t() {
        return (this.f42716a.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override // a.ycm0
    public final void v(boolean z) {
        if (!z) {
            D(16);
            return;
        }
        Window window = this.f42716a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        C(16);
    }
}
