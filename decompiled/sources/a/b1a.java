package a;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b1a f1797a = new b1a();
    public static final int[] b;

    static {
        HashMap map = dd40.c;
        tre0 tre0Var = sre0.f32672a;
        g7x.y(tre0Var.b(g3a.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        g7x.y(tre0Var.b(f1a.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        g7x.y(tre0Var.b(gy9.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        b = new int[0];
    }

    public static boolean a(c1a c1aVar) {
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        key.getClass();
        ow9 ow9Var = (ow9) c1aVar;
        Float f = (Float) ow9Var.c(key);
        if (f == null) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            key2.getClass();
            int[] iArr = (int[]) ow9Var.c(key2);
            if (iArr == null) {
                return false;
            }
            if (!tx3.w(iArr, 1) && !tx3.w(iArr, 2) && !tx3.w(iArr, 4) && !tx3.w(iArr, 3)) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean b(c1a c1aVar) {
        c1aVar.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        c1a.a0.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((ow9) c1aVar).c(key);
        if (iArr == null) {
            iArr = b;
        }
        return tx3.w(iArr, 2);
    }

    public static boolean c(c1a c1aVar) {
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((ow9) c1aVar).c(key);
        return num != null && num.intValue() == 2;
    }
}
