package a;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f27812a;

    public pys0(LinkedHashMap linkedHashMap) {
        this.f27812a = linkedHashMap;
    }

    public final pys0 a() {
        LinkedHashMap linkedHashMap = this.f27812a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            iay iayVar = (iay) entry.getValue();
            linkedHashMap2.put(key, new iay(iayVar.f14460a, iayVar.b, iayVar.c, true, true));
        }
        return new pys0(linkedHashMap2);
    }
}
