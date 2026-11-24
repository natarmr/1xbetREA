package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f17366a = q7m0.a(null);

    public final List a() {
        List list = (List) this.f17366a.getValue();
        return list == null ? iun.f15405a : list;
    }

    public final void b(ArrayList arrayList) {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList2;
        do {
            p7m0Var = this.f17366a;
            value = p7m0Var.getValue();
            HashSet hashSet = new HashSet();
            arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(Long.valueOf(((xvm0) obj).getId()))) {
                    arrayList2.add(obj);
                }
            }
        } while (!p7m0Var.m(value, arrayList2));
    }
}
