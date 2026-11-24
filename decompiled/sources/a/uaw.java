package a;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uaw extends x36 {
    public int h;

    @Override // a.fmo
    public final int d() {
        return this.h;
    }

    @Override // a.fmo
    public final Object j() {
        return null;
    }

    @Override // a.fmo
    public final void m(long j, long j2, long j3, List list, am30[] am30VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c(this.h, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!c(i, jElapsedRealtime)) {
                    this.h = i;
                    return;
                }
            }
            v4i0.e();
        }
    }

    @Override // a.fmo
    public final int s() {
        return 0;
    }
}
