package a;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7446a = 1;
    public final Object b;

    public ea0(CameraManager cameraManager, String str) {
        this.b = cameraManager.getCameraDeviceSetup(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x860 a(SessionConfiguration sessionConfiguration) {
        byte b = this.f7446a;
        Object obj = this.b;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    x860 x860VarA = ((ea0) it.next()).a(sessionConfiguration);
                    if (x860VarA.f40449a != 0) {
                        return x860VarA;
                    }
                }
                return new x860((int) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0));
            default:
                int i = ((CameraDevice.CameraDeviceSetup) obj).isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                return new x860(i, z);
        }
    }

    public ea0(ArrayList arrayList) {
        this.b = arrayList;
    }
}
