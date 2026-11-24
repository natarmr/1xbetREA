package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31253a;
    public final /* synthetic */ o3a b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ CaptureResult e;

    public /* synthetic */ rx9(o3a o3aVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, byte b) {
        this.f31253a = b;
        this.b = o3aVar;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f31253a;
        CaptureResult captureResult = this.e;
        CaptureRequest captureRequest = this.d;
        CameraCaptureSession cameraCaptureSession = this.c;
        o3a o3aVar = this.b;
        switch (b) {
            case 0:
                o3aVar.f24573a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
            default:
                o3aVar.f24573a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }
}
