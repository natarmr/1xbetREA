package a;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u2g0 implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34945a;
    public final Function1 b;
    public final odd c;
    public volatile Long d;

    public u2g0(long j, Function1 function1) {
        function1.getClass();
        this.f34945a = j;
        this.b = function1;
        this.c = new odd();
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) {
        if (this.c.isCompleted() || this.c.isCancelled()) {
            return;
        }
        pz2 pz2Var = oz2Var.b;
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        pz2Var.getClass();
        Long l = (Long) pz2Var.f27824a.get(key);
        if (l != null && this.d == null) {
            this.d = l;
        }
        Long l2 = this.d;
        if (this.f34945a == 0 || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f34945a) {
            if (((Boolean) this.b.invoke(oz2Var)).booleanValue()) {
                this.c.N(oz2Var);
                return;
            }
            return;
        }
        this.c.N(null);
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Wait for capture result timeout, current: " + l.longValue() + " first: " + l2.longValue());
        }
    }
}
