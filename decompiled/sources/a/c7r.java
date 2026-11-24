package a;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class c7r implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o24 f3878a;

    public c7r(o24 o24Var) {
        this.f3878a = o24Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        o24 o24Var = this.f3878a;
        if (o24Var.f24513a) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) o24Var.b)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }
}
