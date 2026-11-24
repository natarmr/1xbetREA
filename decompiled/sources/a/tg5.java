package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tg5 {
    public long b;
    public long c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f33892a = new LinkedHashMap();
    public final qoj0 d = roj0.b(1, 0, null, 6);

    public final List a() {
        Object g0g0Var;
        LinkedHashMap linkedHashMap = this.f33892a;
        if (linkedHashMap.isEmpty()) {
            return iun.f15405a;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = CollectionsKt.A0(linkedHashMap.values(), new s7f((byte) 25));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        return (List) g0g0Var;
    }

    public final void b() {
        this.d.g(CollectionsKt.L0(this.f33892a.values()));
    }

    public final void c(ql5 ql5Var) {
        ql5Var.getClass();
        this.f33892a.put(Long.valueOf(ql5Var.f28916a), ql5Var);
        b();
    }
}
