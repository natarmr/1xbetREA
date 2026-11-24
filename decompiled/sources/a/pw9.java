package a;

import android.hardware.camera2.CameraManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class pw9 extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27700a = 1;
    public final /* synthetic */ hzb0 b;
    public final /* synthetic */ Object c;

    public pw9(hzb0 hzb0Var, qw9 qw9Var) {
        this.b = hzb0Var;
        this.c = qw9Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.f27700a) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (dub.w0(this.b, a3a.f162a) instanceof ytb) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                }
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        byte b = this.f27700a;
        hzb0 hzb0Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (b) {
            case 0:
                if (str.equals(((qw9) obj).b)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    g0a.a(str);
                    if (dub.w0(hzb0Var, new z2a(str)) instanceof ytb) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                ((cx9) obj).c(hzb0Var, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        byte b = this.f27700a;
        hzb0 hzb0Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (b) {
            case 0:
                if (str.equals(((qw9) obj).b)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    g0a.a(str);
                    if (dub.w0(hzb0Var, new b3a(str)) instanceof ytb) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                ((cx9) obj).c(hzb0Var, str, false);
                break;
        }
    }

    public pw9(cx9 cx9Var, hzb0 hzb0Var) {
        this.c = cx9Var;
        this.b = hzb0Var;
    }
}
