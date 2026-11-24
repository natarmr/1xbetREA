package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ddm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5902a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final qoj0 c = roj0.a(1, 1, i99.b);

    public final void a(String str, xqj0 xqj0Var) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.f5902a;
        if (linkedHashMap.size() > 5) {
            linkedHashMap.remove(CollectionsKt.T(linkedHashMap.keySet()));
        }
        xqj0 xqj0Var2 = (xqj0) linkedHashMap.get(str);
        linkedHashMap.put(str, xqj0.a(xqj0Var, xqj0Var2 != null ? xqj0Var2.p : false, 2064383));
        this.c.g(Unit.f46060a);
    }
}
