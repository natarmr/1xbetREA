package a;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class mw2 extends lw2 {
    public final CameraConstrainedHighSpeedCaptureSession e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(nw2 nw2Var, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, gx9 gx9Var, Handler handler) {
        super(nw2Var, cameraConstrainedHighSpeedCaptureSession, gx9Var, handler);
        gx9Var.getClass();
        handler.getClass();
        this.e = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // a.lw2, a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        return sgyVar.equals(sre0.f32672a.b(CameraConstrainedHighSpeedCaptureSession.class)) ? this.e : super.H(sgyVar);
    }
}
