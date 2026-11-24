package a;

import android.javax.sip.message.Response;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class cf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1a f4248a;
    public final ExcludedSupportedSizesQuirk b = (ExcludedSupportedSizesQuirk) mhk.a().b(ExcludedSupportedSizesQuirk.class);
    public final ExtraSupportedOutputSizeQuirk c = (ExtraSupportedOutputSizeQuirk) mhk.a().b(ExtraSupportedOutputSizeQuirk.class);

    public cf80(c1a c1aVar) {
        this.f4248a = c1aVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0294  */
    public final Size[] a(Size[] sizeArr, int i) {
        Collection<?> collectionJ;
        Size[] sizeArr2;
        sizeArr.getClass();
        ArrayList arrayListJ0 = tx3.j0(sizeArr);
        if (this.c != null) {
            if (i == 34) {
                String str = Build.MANUFACTURER;
                str.getClass();
                if (!str.equalsIgnoreCase("Motorola")) {
                    String str2 = Build.BRAND;
                    str2.getClass();
                    if (!str2.equalsIgnoreCase("Motorola")) {
                        sizeArr2 = new Size[0];
                    } else if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                        sizeArr2 = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                    } else {
                        sizeArr2 = new Size[0];
                    }
                } else if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr2 = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                } else {
                    sizeArr2 = new Size[0];
                }
            } else {
                sizeArr2 = new Size[0];
            }
            if (sizeArr2.length != 0) {
                w3d.v(arrayListJ0, sizeArr2);
            }
        }
        c1a c1aVar = this.f4248a;
        if (c1aVar != null && this.b != null) {
            String str3 = ((ow9) c1aVar).f25959a;
            str3.getClass();
            if (lmc.O()) {
                collectionJ = (str3.equals("0") && i == 256) ? q3d.j(new Size(4160, 3120), new Size(4000, 3000)) : iun.f15405a;
            } else if (lmc.P()) {
                collectionJ = (str3.equals("0") && i == 256) ? q3d.j(new Size(4160, 3120), new Size(4000, 3000)) : iun.f15405a;
            } else if (lmc.M()) {
                collectionJ = (str3.equals("0") && (i == 34 || i == 35)) ? q3d.j(new Size(720, 720), new Size(Response.BAD_REQUEST, Response.BAD_REQUEST)) : iun.f15405a;
            } else if (lmc.T()) {
                if (str3.equals("0")) {
                    if (i == 34) {
                        collectionJ = q3d.j(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionJ = q3d.j(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else {
                        collectionJ = iun.f15405a;
                    }
                } else if (str3.equals("1") && (i == 34 || i == 35)) {
                    collectionJ = q3d.j(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                } else {
                    collectionJ = iun.f15405a;
                }
            } else if (lmc.S()) {
                if (str3.equals("0")) {
                    if (i == 34) {
                        collectionJ = q3d.j(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionJ = q3d.j(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else {
                        collectionJ = iun.f15405a;
                    }
                } else if (str3.equals("1") && (i == 34 || i == 35)) {
                    collectionJ = q3d.j(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                } else {
                    collectionJ = iun.f15405a;
                }
            } else if (lmc.Q()) {
                collectionJ = (str3.equals("0") && i == 256) ? kotlin.collections.a.c(new Size(9280, 6944)) : iun.f15405a;
            } else if (lmc.R()) {
                collectionJ = i == 35 ? q3d.j(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440)) : iun.f15405a;
            } else if (lmc.N()) {
                collectionJ = i == 35 ? q3d.j(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448)) : iun.f15405a;
            } else if (lmc.U()) {
                collectionJ = (str3.equals("1") && i == 35) ? q3d.j(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712)) : iun.f15405a;
            } else {
                l8x.E0("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                collectionJ = iun.f15405a;
            }
            if (!collectionJ.isEmpty()) {
                arrayListJ0.removeAll(collectionJ);
            }
        }
        if (arrayListJ0.isEmpty()) {
            l8x.E0("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayListJ0.toArray(new Size[0]);
    }
}
