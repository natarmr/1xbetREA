package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a93 extends u0 {
    public static List m(r2e r2eVar) {
        if (!(r2eVar instanceof mx3)) {
            return r2eVar instanceof h0o ? kotlin.collections.a.c(((h0o) r2eVar).c.c()) : iun.f15405a;
        }
        Iterable iterable = (Iterable) ((mx3) r2eVar).f29728a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, m((r2e) it.next()));
        }
        return arrayList;
    }

    @Override // a.u0
    public final Iterable a(Object obj, boolean z) {
        t83 t83Var = (t83) obj;
        t83Var.getClass();
        Map mapC = t83Var.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapC.entrySet()) {
            w3d.u(arrayList, (!z || Intrinsics.d((g950) entry.getKey(), bey.b)) ? m((r2e) entry.getValue()) : iun.f15405a);
        }
        return arrayList;
    }
}
