package a;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class xv9 extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hzb0 f41548a;

    public xv9(hzb0 hzb0Var) {
        this.f41548a = hzb0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        g0a.a(str);
        dub.w0(this.f41548a, new g0a(str));
    }
}
