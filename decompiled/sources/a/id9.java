package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class id9 {
    public static final id9 b = new id9(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14572a;

    public id9(emd emdVar) {
        Map map = null;
        if (emdVar != null) {
            ArrayList arrayList = emdVar.f8040a;
            int iA = wp20.a(r3d.q(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (Object obj : arrayList) {
                String str = ((qpy) obj).b;
                if (str == null) {
                    Intrinsics.h("name");
                    throw null;
                }
                linkedHashMap.put(str, obj);
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        this.f14572a = map;
    }
}
