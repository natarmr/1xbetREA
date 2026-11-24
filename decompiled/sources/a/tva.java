package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class tva implements sv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tva f34590a = new tva();

    @Override // a.sv40
    public final uj30 b(vj30 vj30Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return vj30.x(vj30Var, 0, 0, new d69((byte) 28));
        }
        int iT = vj30Var.T(uva.f36339a);
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pj30) CollectionsKt.U((List) it.next())).S(j));
        }
        int i = ((pu90) CollectionsKt.U(arrayList2)).f27604a;
        Iterator it2 = CollectionsKt.O(arrayList2, 1).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = ((pu90) it2.next()).f27604a - iT;
            if (i3 < 0) {
                i3 = 0;
            }
            i2 += i3;
        }
        int i4 = i + i2;
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            itt0.a();
            return null;
        }
        int i5 = ((pu90) it3.next()).b;
        while (it3.hasNext()) {
            int i6 = ((pu90) it3.next()).b;
            if (i5 < i6) {
                i5 = i6;
            }
        }
        return vj30.x(vj30Var, i4, i5, new sva((byte) 0, i5, iT, arrayList2));
    }
}
