package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class jgr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16493a = new LinkedHashMap();

    public final p7m0 a(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.f16493a;
        igr0 igr0Var = (igr0) linkedHashMap.get(lValueOf);
        if (igr0Var != null) {
            return igr0Var.f14747a;
        }
        igr0 igr0Var2 = new igr0();
        linkedHashMap.put(Long.valueOf(j), igr0Var2);
        return igr0Var2.f14747a;
    }
}
