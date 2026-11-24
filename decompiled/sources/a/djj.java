package a;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class djj extends ivb0 implements View.OnLongClickListener {
    public final au20 d;

    public djj(au20 au20Var) {
        ymx ymxVar = ymx.INTERVAL_100;
        this.d = au20Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - ivb0.c;
        ymx ymxVar = ymx.INTERVAL_100;
        if (j <= 500) {
            return false;
        }
        ivb0.c = jUptimeMillis;
        this.f15438a = jUptimeMillis;
        this.d.invoke(view);
        return Boolean.TRUE.booleanValue();
    }
}
