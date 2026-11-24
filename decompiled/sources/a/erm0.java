package a;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class erm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf80 f8290a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final roi0 d;

    public erm0(StreamConfigurationMap streamConfigurationMap, cf80 cf80Var) {
        cf80Var.getClass();
        this.f8290a = cf80Var;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        new LinkedHashMap();
        this.d = Build.VERSION.SDK_INT >= 34 ? new frm0(streamConfigurationMap) : new roi0(streamConfigurationMap);
    }

    public final Size[] a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        Size[] sizeArrF = this.d.f(i);
        if (sizeArrF != null && sizeArrF.length != 0) {
            sizeArrF = this.f8290a.a(sizeArrF, i);
        }
        linkedHashMap.put(Integer.valueOf(i), sizeArrF);
        if (sizeArrF != null) {
            return (Size[]) sizeArrF.clone();
        }
        return null;
    }

    public final Size[] b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Size[] sizeArrI = null;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            sizeArrI = this.d.i(i);
        } catch (Throwable th) {
            l8x.F0("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArrI != null && sizeArrI.length != 0) {
            Size[] sizeArrA = this.f8290a.a(sizeArrI, i);
            linkedHashMap.put(Integer.valueOf(i), sizeArrA);
            return (Size[]) sizeArrA.clone();
        }
        l8x.E0("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return sizeArrI;
    }
}
