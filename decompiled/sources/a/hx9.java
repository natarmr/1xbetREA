package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes.dex */
public final class hx9 extends h03 {
    public static final u15 d;
    public static final u15 e;
    public static final u15 f;
    public static final u15 g;
    public static final u15 h;
    public static final u15 i;
    public static final u15 j;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        d = new u15("camera2.captureRequest.templateType", cls, null);
        e = new u15("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        f = new u15("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        g = new u15("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        h = new u15("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        i = new u15("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        j = new u15("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
