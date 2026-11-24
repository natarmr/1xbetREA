package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.hardware.camera2.CaptureResult;
import android.opengl.EGL14;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yzn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43522a;
    public final /* synthetic */ Map b;

    public /* synthetic */ yzn(Map map, x7w0 x7w0Var) {
        this.f43522a = (byte) 3;
        this.b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        Object g0g0Var;
        String strB;
        byte b = this.f43522a;
        Map map = this.b;
        switch (b) {
            case 0:
                return map;
            case 1:
                pz2 pz2Var = (pz2) obj;
                pz2Var.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
                    List list = (List) entry.getValue();
                    key.getClass();
                    if (!CollectionsKt.L(list, pz2Var.f27824a.get(key))) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 2:
                n7w0 n7w0Var = (n7w0) obj;
                n7w0Var.getClass();
                n7w0Var.a(map.get("vendor"), "vendor");
                n7w0Var.a(map.get("renderer"), "renderer");
                n7w0Var.a(map.get("version"), "version");
                try {
                    e0g0 e0g0Var = j0g0.b;
                    x4w0 x4w0Var = new x4w0();
                    x4w0Var.f40287a = EGL14.EGL_NO_DISPLAY;
                    x4w0Var.b = EGL14.EGL_NO_CONTEXT;
                    x4w0Var.c = EGL14.EGL_NO_SURFACE;
                    try {
                        x4w0Var.b();
                        g0g0Var = ycm0.l(ycm0.n());
                        x4w0Var.c();
                    } catch (Throwable th) {
                        x4w0Var.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th2);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                n7w0Var.a(g0g0Var, HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
                return Unit.f46060a;
            case 3:
                n7w0 n7w0Var2 = (n7w0) obj;
                String strB2 = "error";
                n7w0Var2.getClass();
                n7w0Var2.a(map.get("kernelQemu"), "kernelQemu");
                n7w0Var2.a(map.get("hardware"), "hardware");
                n7w0Var2.a(map.get("board"), "board");
                n7w0Var2.a(map.get("device"), "device");
                n7w0Var2.a(map.get("cpuAbi"), "cpuAbi");
                n7w0Var2.a(map.get("qemu"), "qemu");
                n7w0Var2.a(map.get("characteristics"), "characteristics");
                n7w0Var2.a(map.get("bootloader"), "bootloader");
                n7w0Var2.a(map.get("verifiedbootstate"), "verifiedbootstate");
                n7w0Var2.a(map.get("flashLocked"), "flashLocked");
                n7w0Var2.a(map.get("deviceState"), "deviceState");
                n7w0Var2.a(Boolean.valueOf(new File("/sbin/.magisk").exists()), "magiskExists");
                n7w0Var2.a(Boolean.valueOf(new File("/sys/qemu_trace").exists()), "qemuTraceExists");
                try {
                    File file = new File("/proc/cpuinfo");
                    strB = file.exists() ? i0q.b(file) : "not_found";
                    break;
                } catch (Exception unused) {
                    strB = "error";
                }
                n7w0Var2.a(strB, "cpuInfo");
                try {
                    File file2 = new File("/proc/meminfo");
                    strB2 = file2.exists() ? i0q.b(file2) : "not_found";
                } catch (Exception unused2) {
                }
                n7w0Var2.a(strB2, "memInfo");
                return Unit.f46060a;
            case 4:
                n7w0 n7w0Var3 = (n7w0) obj;
                n7w0Var3.getClass();
                n7w0Var3.a(map.get("nfc"), "nfc");
                n7w0Var3.a(map.get("bluetooth"), "bluetooth");
                n7w0Var3.a(map.get("camera"), "camera");
                n7w0Var3.a(map.get("cameraFront"), "cameraFront");
                n7w0Var3.a(map.get("autofocus"), "autofocus");
                n7w0Var3.a(map.get("telephony"), "telephony");
                n7w0Var3.a(map.get("bluetoothLe"), "bluetoothLe");
                n7w0Var3.a(map.get("wifi"), "wifi");
                n7w0Var3.a(map.get("usbHost"), "usbHost");
                n7w0Var3.a(map.get("ethernet"), "ethernet");
                n7w0Var3.a(map.get("gps"), "gps");
                n7w0Var3.a(map.get("microphone"), "microphone");
                n7w0Var3.a(map.get(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT), HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
                n7w0Var3.a(map.get("biometric"), "biometric");
                n7w0Var3.a(map.get("ir"), "irDA");
                return Unit.f46060a;
            case 5:
                n7w0 n7w0Var4 = (n7w0) obj;
                n7w0Var4.getClass();
                n7w0Var4.a(map.get(ParameterNames.ID), "idList");
                n7w0Var4.a(map.get("sensorSize"), "sensorSize");
                n7w0Var4.a(map.get("focalLengths"), "focalLengths");
                n7w0Var4.a(map.get("apertures"), "apertures");
                n7w0Var4.a(map.get("ois"), "ois");
                n7w0Var4.a(map.get("flash"), "flash");
                return Unit.f46060a;
            case 6:
                n7w0 n7w0Var5 = (n7w0) obj;
                n7w0Var5.getClass();
                n7w0Var5.a(map.get("screenLayout"), "screenLayout");
                n7w0Var5.a(map.get("smallestScreenWidth"), "smallestScreenWidth");
                n7w0Var5.a(map.get("totalRam"), "totalRam");
                n7w0Var5.a(map.get("buildFingerprint"), "buildFingerprint");
                n7w0Var5.a(map.get("buildDisplay"), "buildDisplay");
                n7w0Var5.a(map.get("buildUser"), "buildUser");
                return Unit.f46060a;
            default:
                n7w0 n7w0Var6 = (n7w0) obj;
                n7w0Var6.getClass();
                n7w0Var6.a(map.get("brand"), "brand");
                n7w0Var6.a(map.get("device"), "device");
                n7w0Var6.a(map.get("product"), "product");
                n7w0Var6.a(map.get("hardware"), "hardware");
                n7w0Var6.a(map.get("board"), "board");
                n7w0Var6.a(map.get("bootloader"), "bootloader");
                n7w0Var6.a(map.get("host"), "host");
                n7w0Var6.a(map.get("tags"), "tags");
                n7w0Var6.a(map.get(Payload.TYPE), Payload.TYPE);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ yzn(Map map, byte b) {
        this.f43522a = b;
        this.b = map;
    }
}
