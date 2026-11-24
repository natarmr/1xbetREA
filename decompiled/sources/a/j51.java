package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f15912a = new ConcurrentHashMap();
    public boolean b;

    public final void a(List list) {
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(Long.valueOf(((mlr) obj).f22006a), obj);
        }
        this.f15912a.putAll(linkedHashMap);
    }
}
