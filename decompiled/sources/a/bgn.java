package a;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class bgn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f2563a;
    public static final LinkedHashMap b;

    static {
        agn agnVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f2563a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        agn agnVar2 = agn.d;
        linkedHashMap.put(1L, agnVar2);
        linkedHashMap2.put(agnVar2, kotlin.collections.a.c(1L));
        linkedHashMap.put(2L, agn.e);
        linkedHashMap2.put(linkedHashMap.get(2L), kotlin.collections.a.c(2L));
        agn agnVar3 = agn.f;
        linkedHashMap.put(4L, agnVar3);
        linkedHashMap2.put(agnVar3, kotlin.collections.a.c(4L));
        agn agnVar4 = agn.g;
        linkedHashMap.put(8L, agnVar4);
        linkedHashMap2.put(agnVar4, kotlin.collections.a.c(8L));
        List listJ = q3d.j(64L, 128L, 16L, 32L);
        Iterator it = listJ.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            agnVar = agn.h;
            if (!zHasNext) {
                break;
            }
            f2563a.put(Long.valueOf(((Number) it.next()).longValue()), agnVar);
        }
        b.put(agnVar, listJ);
        List listJ2 = q3d.j(1024L, 2048L, 256L, 512L);
        Iterator it2 = listJ2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            agn agnVar5 = agn.i;
            if (!zHasNext2) {
                b.put(agnVar5, listJ2);
                return;
            } else {
                f2563a.put(Long.valueOf(((Number) it2.next()).longValue()), agnVar5);
            }
        }
    }

    public static Long a(agn agnVar, DynamicRangeProfiles dynamicRangeProfiles) {
        agnVar.getClass();
        dynamicRangeProfiles.getClass();
        List list = (List) b.get(agnVar);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        supportedProfiles.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
