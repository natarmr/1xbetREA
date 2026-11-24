package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface fy9 extends kft0, AutoCloseable {
    boolean C();

    yy9 E();

    boolean K(List list);

    boolean M0();

    Integer T0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    Integer d0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer g0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    Surface getInputSurface();

    Integer w0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
}
