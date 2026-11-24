package a;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class ag60 extends ef50 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public ag60(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new ma3(this, (byte) 4) : new bg60(this);
    }

    @Override // a.ef50
    public final void b(boolean z) {
        e(z);
    }

    @Override // a.ef50
    public final void d() {
        e(false);
    }

    public final void e(boolean z) {
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, this.e);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            this.c.unregisterOnBackInvokedCallback(this.e);
            this.f = false;
        }
    }
}
