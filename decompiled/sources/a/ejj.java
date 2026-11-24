package a;

import android.os.SystemClock;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class ejj extends ivb0 implements hwq0 {
    public final j1l0 d;

    public ejj(j1l0 j1l0Var) {
        this.d = j1l0Var;
    }

    @Override // a.hwq0
    public final boolean onMenuItemClick(MenuItem menuItem) {
        menuItem.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f15438a <= 10000) {
            return false;
        }
        ivb0.c = jUptimeMillis;
        this.f15438a = jUptimeMillis;
        this.d.invoke(menuItem);
        return Boolean.TRUE.booleanValue();
    }
}
