package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class uno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f35973a = new LinkedHashMap();

    public final mno a(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.f35973a;
        Object mnoVar = linkedHashMap.get(lValueOf);
        if (mnoVar == null) {
            mnoVar = new mno();
            linkedHashMap.put(lValueOf, mnoVar);
        }
        return (mno) mnoVar;
    }
}
