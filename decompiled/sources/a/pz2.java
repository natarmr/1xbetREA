package a;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class pz2 implements gd40, kft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureResult f27824a;
    public final String b;

    public pz2(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.f27824a = captureResult;
        this.b = str;
        lun.f20680a.getClass();
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        tre0 tre0Var = sre0.f32672a;
        boolean zEquals = sgyVar.equals(tre0Var.b(CaptureResult.class));
        CaptureResult captureResult = this.f27824a;
        if (zEquals) {
            captureResult.getClass();
            return captureResult;
        }
        if (!sgyVar.equals(tre0Var.b(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) g0a.b(this.b)) + ", frameNumber: " + this.f27824a.getFrameNumber() + ')';
    }
}
