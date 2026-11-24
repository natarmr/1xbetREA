package a;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class fe10 implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ge10 f9382a;

    public fe10(ge10 ge10Var) {
        this.f9382a = ge10Var;
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) {
        if (Build.VERSION.SDK_INT >= 35) {
            ge10 ge10Var = this.f9382a;
            if (ge10Var.c == null || !ge10Var.e) {
                return;
            }
            pz2 pz2Var = oz2Var.b;
            CaptureResult.Key key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
            key.getClass();
            pz2Var.getClass();
            Integer num = (Integer) pz2Var.f27824a.get(key);
            if (num != null) {
                ge10Var.c(ge10Var.f, num.intValue() != 1 ? 0 : 1);
            }
        }
    }
}
