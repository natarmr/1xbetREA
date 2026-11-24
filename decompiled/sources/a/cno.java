package a;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4665a = new LinkedHashMap();

    public final bno a(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.f4665a;
        Object bnoVar = linkedHashMap.get(lValueOf);
        if (bnoVar == null) {
            bnoVar = new bno();
            linkedHashMap.put(lValueOf, bnoVar);
        }
        return (bno) bnoVar;
    }

    public final void b(long j, boolean z, long j2) {
        HashMap map = new HashMap();
        map.putAll((Map) a(j).f2893a.getValue());
        map.put(Long.valueOf(j2), Boolean.valueOf(z));
        a(j).f2893a.o(null, map);
    }
}
