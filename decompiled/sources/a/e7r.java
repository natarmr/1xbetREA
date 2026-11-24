package a;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e7r {
    public static final f03 e = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f7340a;
    public final ivn b;
    public final HashMap c;
    public boolean d;

    public e7r(Activity activity) {
        ivn ivnVar = new ivn();
        HashMap map = new HashMap();
        this.d = false;
        this.f7340a = activity;
        this.b = ivnVar;
        this.c = map;
    }

    public final v680 a() {
        boolean z = this.d;
        f03 f03Var = e;
        if (!z) {
            f03Var.a("No recording has been started.");
            return new v680();
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((o24) this.b.f15453a).b;
        if (sparseIntArrayArr == null) {
            f03Var.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new v680();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArr[0];
        if (sparseIntArray == null) {
            f03Var.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new v680();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new v680(new d7r(i, i2, i3));
    }

    public final void b() {
        boolean z = this.d;
        Activity activity = this.f7340a;
        if (z) {
            e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        o24 o24Var = (o24) this.b.f15453a;
        if (o24.e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            o24.e = handlerThread;
            handlerThread.start();
            o24.f = new Handler(o24.e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) o24Var.b;
            if (sparseIntArrayArr[i] == null && ((1 << i) & (o24Var.f24513a ? 1 : 0)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((c7r) o24Var.d, o24.f);
        ((ArrayList) o24Var.c).add(new WeakReference(activity));
        this.d = true;
    }
}
