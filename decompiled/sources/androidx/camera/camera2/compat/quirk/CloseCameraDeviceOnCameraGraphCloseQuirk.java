package androidx.camera.camera2.compat.quirk;

import a.gpd0;
import a.q3d;
import a.tx3;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "La/gpd0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements gpd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f45306a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097 A[EDGE_INSN: B:25:0x0097->B:26:0x0098 BREAK  A[LOOP:0: B:20:0x007e->B:39:?]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:20:0x007e->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    static {
        String lowerCase;
        boolean z;
        List listJ;
        Iterator it;
        String str;
        String str2;
        boolean z2;
        int i;
        String str3 = Build.HARDWARE;
        f45306a = Intrinsics.d(str3, "samsungexynos7570");
        b = Intrinsics.d(str3, "samsungexynos7870");
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        boolean z3 = false;
        if (str4.equalsIgnoreCase("Xiaomi")) {
            String str5 = Build.DEVICE;
            str5.getClass();
            lowerCase = str5.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (tx3.u(lowerCase, new String[]{"aurora", "houji"})) {
                z = true;
            } else {
                z = false;
            }
        } else {
            String str6 = Build.BRAND;
            str6.getClass();
            if (str6.equalsIgnoreCase("Xiaomi")) {
                String str7 = Build.DEVICE;
                str7.getClass();
                lowerCase = str7.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (tx3.u(lowerCase, new String[]{"aurora", "houji"})) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        c = z;
        str4.getClass();
        if (!str4.equalsIgnoreCase("Sony")) {
            String str8 = Build.BRAND;
            str8.getClass();
            if (!str8.equalsIgnoreCase("Sony")) {
                z2 = false;
                break;
            }
            listJ = q3d.j("XQ-DQ", "SO", "A301SO");
            if (listJ == null || !listJ.isEmpty()) {
                it = listJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    str = (String) it.next();
                    str2 = Build.DEVICE;
                    str2.getClass();
                    if (c.x(str2, str, true)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
        } else {
            listJ = q3d.j("XQ-DQ", "SO", "A301SO");
            if (listJ == null) {
                it = listJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    str = (String) it.next();
                    str2 = Build.DEVICE;
                    str2.getClass();
                    if (c.x(str2, str, true)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                it = listJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    str = (String) it.next();
                    str2 = Build.DEVICE;
                    str2.getClass();
                    if (c.x(str2, str, true)) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        d = z2;
        String str9 = Build.MANUFACTURER;
        str9.getClass();
        if (str9.equalsIgnoreCase("Samsung")) {
            i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                z3 = true;
            }
        } else {
            String str10 = Build.BRAND;
            str10.getClass();
            if (str10.equalsIgnoreCase("Samsung")) {
                i = Build.VERSION.SDK_INT;
                if (i >= 31 && i <= 34) {
                    z3 = true;
                }
            }
        }
        e = z3;
    }
}
