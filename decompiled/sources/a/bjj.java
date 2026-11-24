package a;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class bjj extends ivb0 {
    public final ymx d;
    public final boolean e;
    public final Function0 f;

    public bjj(ymx ymxVar, boolean z, Function0 function0) {
        ymxVar.getClass();
        this.d = ymxVar;
        this.e = z;
        this.f = function0;
    }

    public final void a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - (this.e ? ivb0.c : this.f15438a) > this.d.f42912a) {
            ivb0.c = jUptimeMillis;
            this.f15438a = jUptimeMillis;
            this.f.invoke();
        }
    }
}
