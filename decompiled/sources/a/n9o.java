package a;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class n9o implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ odd f23151a;

    public n9o(odd oddVar) {
        this.f23151a = oddVar;
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) {
        pz2 pz2Var = oz2Var.b;
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        pz2Var.getClass();
        Integer num = (Integer) pz2Var.f27824a.get(key);
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
        key2.getClass();
        pz2Var.getClass();
        Integer num2 = (Integer) pz2Var.f27824a.get(key2);
        odd oddVar = this.f23151a;
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != 0) {
                return;
            }
            oddVar.N(0);
            return;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
            oddVar.N(0);
        }
    }
}
