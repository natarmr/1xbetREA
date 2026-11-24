package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class qno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f29040a = new LinkedHashMap();

    public final ebo0 a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f29040a;
        Object ebo0Var = linkedHashMap.get(numValueOf);
        if (ebo0Var == null) {
            ebo0Var = new ebo0();
            linkedHashMap.put(numValueOf, ebo0Var);
        }
        return (ebo0) ebo0Var;
    }
}
