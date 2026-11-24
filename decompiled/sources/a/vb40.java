package a;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f37123a = new HashMap();

    public final List a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f37123a.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listA0 = CollectionsKt.A0(CollectionsKt.L0(linkedHashMap.keySet()), new lk30((byte) 3));
        if (listA0.isEmpty()) {
            return null;
        }
        return listA0;
    }
}
