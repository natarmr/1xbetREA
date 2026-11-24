package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26001a;
    public final /* synthetic */ o3a b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ ox9(o3a o3aVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, byte b) {
        this.f26001a = b;
        this.b = o3aVar;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f26001a;
        o3a o3aVar = this.b;
        switch (b) {
            case 0:
                o3aVar.f24573a.onCaptureStarted(this.c, this.d, this.e, this.f);
                break;
            default:
                o3aVar.f24573a.onReadoutStarted(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
