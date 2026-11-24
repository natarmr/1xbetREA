package a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ix9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15530a;
    public final qcq0 b;
    public final yg90 c;
    public final yzn0 d;
    public final cao0 e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final ArrayMap h;

    public ix9(Context context, qcq0 qcq0Var, yg90 yg90Var, yzn0 yzn0Var, cao0 cao0Var) {
        qcq0Var.getClass();
        yg90Var.getClass();
        cao0Var.getClass();
        this.f15530a = context;
        this.b = qcq0Var;
        this.c = yg90Var;
        this.d = yzn0Var;
        this.e = cao0Var;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public final c1a a(String str) {
        c1a c1aVarC;
        str.getClass();
        try {
            Trace.beginSection(((Object) g0a.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                c1aVarC = (c1a) this.f.get(str);
                if (c1aVarC == null) {
                    if (e()) {
                        c1aVarC = c(str, true);
                    } else {
                        c1aVarC = c(str, false);
                        this.f.put(str, c1aVarC);
                    }
                }
            }
            Trace.endSection();
            return c1aVarC;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final lw9 b(String str, int i, boolean z) {
        String str2;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) g0a.b(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) g0a.b(str)));
                CameraExtensionCharacteristics cameraExtensionCharacteristicsD = d(str);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                lw9 lw9Var = new lw9(str, i, cameraExtensionCharacteristicsD, lunVar);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new m460();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) g0a.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return lw9Var;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) g0a.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final ow9 c(String str, boolean z) {
        Iterable iterableH;
        String str2;
        yzn0 yzn0Var = this.d;
        Map map = (Map) yzn0Var.b;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) g0a.b(str)) + "#readCameraMetadata");
            String methodName = null;
            try {
                Log.d("CXCP", "Loading metadata for " + ((Object) g0a.b(str)));
                Object systemService = this.f15530a.getSystemService("camera");
                systemService.getClass();
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterableH = (Set) map.get(new g0a(str));
                } else {
                    Set set = (Set) map.get(new g0a(str));
                    if (set == null) {
                        set = xun.f41520a;
                    }
                    iterableH = eui0.h(set, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                Set setG = (Set) yzn0Var.f43523a;
                if (iterableH != null) {
                    setG = eui0.g(setG, iterableH);
                }
                Set set2 = setG;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                ow9 ow9Var = new ow9(str, cameraCharacteristics, this, lunVar, set2);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new m460();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded metadata for " + ((Object) g0a.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return ow9Var;
            } catch (Throwable th) {
                if (Build.VERSION.SDK_INT == 28) {
                    boolean zD = false;
                    if (th instanceof RuntimeException) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        stackTrace.getClass();
                        if (stackTrace.length != 0) {
                            methodName = stackTrace[0].getMethodName();
                        }
                        zD = Intrinsics.d(methodName, "_enableShutterSound");
                    }
                    if (zD) {
                        throw new cxk("Failed to load metadata: Do Not Disturb mode is on!");
                    }
                }
                throw new IllegalStateException("Failed to load metadata for " + ((Object) g0a.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final CameraExtensionCharacteristics d(String str) throws CameraAccessException {
        synchronized (this.h) {
            CameraExtensionCharacteristics cameraExtensionCharacteristicsG = kn4.g(this.h.get(str));
            if (cameraExtensionCharacteristicsG != null) {
                return cameraExtensionCharacteristicsG;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) g0a.b(str)));
            Object systemService = this.f15530a.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            CameraExtensionCharacteristics cameraExtensionCharacteristics = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics.getClass();
            return cameraExtensionCharacteristics;
        }
    }

    public final boolean e() {
        boolean z;
        yg90 yg90Var = this.c;
        yg90Var.getClass();
        if (Intrinsics.d(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!yg90Var.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (yg90Var.f42575a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    yg90Var.b = true;
                }
                Trace.endSection();
            }
            z = yg90Var.b;
        }
        return !z;
    }
}
