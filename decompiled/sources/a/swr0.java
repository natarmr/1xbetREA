package a;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class swr0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32937a;
    public final /* synthetic */ Map b;

    public /* synthetic */ swr0(Map map, byte b) {
        this.f32937a = b;
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f;
        byte b = this.f32937a;
        Map map = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) map.get(((zjh) obj).f44481a);
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = (Integer) map.get(((zjh) obj2).f44481a);
                return numValueOf.compareTo(Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            case 1:
                Integer num3 = (Integer) map.get(((zjh) obj).f44481a);
                Integer numValueOf2 = Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                Integer num4 = (Integer) map.get(((zjh) obj2).f44481a);
                return numValueOf2.compareTo(Integer.valueOf(num4 != null ? num4.intValue() : Integer.MAX_VALUE));
            case 2:
                Integer num5 = (Integer) map.get(((zjh) obj).f44481a);
                Integer numValueOf3 = Integer.valueOf(num5 != null ? num5.intValue() : Integer.MAX_VALUE);
                Integer num6 = (Integer) map.get(((zjh) obj2).f44481a);
                return numValueOf3.compareTo(Integer.valueOf(num6 != null ? num6.intValue() : Integer.MAX_VALUE));
            default:
                ycl yclVar = (ycl) map.get(((ojh) obj).f25359a);
                float f2 = 0.0f;
                if (yclVar != null) {
                    f = yclVar.f42389a;
                } else {
                    zcl zclVar = qmk.f28987a;
                    f = 0.0f;
                }
                ycl yclVar2 = (ycl) map.get(((ojh) obj2).f25359a);
                if (yclVar2 != null) {
                    f2 = yclVar2.f42389a;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                }
                return ycl.a(f, f2);
        }
    }
}
