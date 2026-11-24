package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24786a = new LinkedHashMap();

    public final n7h0 a(bm5 bm5Var) {
        LinkedHashMap linkedHashMap = this.f24786a;
        Object n7h0Var = linkedHashMap.get(bm5Var);
        if (n7h0Var == null) {
            n7h0Var = new n7h0();
            linkedHashMap.put(bm5Var, n7h0Var);
        }
        return (n7h0) n7h0Var;
    }
}
