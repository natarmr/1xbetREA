package a;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class iyk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f15593a;

    public iyk(int i) {
        this.f15593a = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public Map a() {
        LinkedHashMap linkedHashMap = this.f15593a;
        return linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
    }

    public void b(Class cls, Object obj) {
        this.f15593a.put(cls, obj);
    }
}
