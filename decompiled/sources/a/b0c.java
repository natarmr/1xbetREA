package a;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b0c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1760a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ b0c(LinkedHashMap linkedHashMap, byte b) {
        this.f1760a = b;
        this.b = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f;
        byte b = this.f1760a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                return hdd.b((Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj).f28902a)), (Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj2).f28902a)));
            case 1:
                return hdd.b((Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj).f28902a)), (Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj2).f28902a)));
            case 2:
                return hdd.b((Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj).f28902a)), (Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj2).f28902a)));
            case 3:
                return hdd.b((Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj).f28902a)), (Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj2).f28902a)));
            case 4:
                return hdd.b((Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj).f28902a)), (Integer) linkedHashMap.get(Integer.valueOf(((qkt) obj2).f28902a)));
            case 5:
                return Boolean.valueOf(!linkedHashMap.containsKey(Long.valueOf(((i6a0) obj).b))).compareTo(Boolean.valueOf(!linkedHashMap.containsKey(Long.valueOf(((i6a0) obj2).b))));
            case 6:
                ycl yclVar = (ycl) linkedHashMap.get(((ojh) obj).f25359a);
                float f2 = 0.0f;
                if (yclVar != null) {
                    f = yclVar.f42389a;
                } else {
                    zcl zclVar = qmk.f28987a;
                    f = 0.0f;
                }
                ycl yclVar2 = (ycl) linkedHashMap.get(((ojh) obj2).f25359a);
                if (yclVar2 != null) {
                    f2 = yclVar2.f42389a;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                }
                return ycl.a(f, f2);
            default:
                return hdd.b((Integer) linkedHashMap.get(Long.valueOf(((vuf) obj).f38045a)), (Integer) linkedHashMap.get(Long.valueOf(((vuf) obj2).f38045a)));
        }
    }
}
