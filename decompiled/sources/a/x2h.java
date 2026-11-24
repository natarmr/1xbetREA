package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class x2h implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40167a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;

    public x2h(float f, float f2, int i, int i2) {
        this.f40167a = i;
        this.b = f;
        this.c = f2;
        this.d = i2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        list.getClass();
        long jB = p4e.b(j, 0, 0, 0, Math.min(p4e.h(j), p4e.i(j)), 7);
        int i = (int) this.b;
        int i2 = (int) this.c;
        int i3 = this.d;
        int i4 = i3 * 2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int iE = 1;
        while (iE < size) {
            iE = w6x.e((pj30) list.get(iE), jB, arrayList, iE, 1);
        }
        Iterator it = arrayList.iterator();
        int iD0 = 0;
        int iD1 = 0;
        while (it.hasNext()) {
            iD1 += ((pu90) it.next()).d0() + i4;
        }
        int iH = ((p4e.h(jB) - i4) - iD1) - i4;
        if (iH >= i) {
            pj30 pj30Var = (pj30) CollectionsKt.U(list);
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(iH);
            int i5 = this.f40167a;
            int iIntValue = ((Number) CollectionsKt.l0(q3d.j(numValueOf, numValueOf2, Integer.valueOf(i5)))).intValue();
            if (!((i5 >= 0) & (iIntValue >= 0))) {
                zcx.a("width and height must be >= 0");
            }
            arrayList.add(0, pj30Var.S(r4e.h(i5, i5, iIntValue, iIntValue)));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iD0 += ((pu90) it2.next()).d0() + i4;
        }
        int iH2 = (p4e.h(jB) - iD0) / 2;
        kie0 kie0Var = new kie0();
        kie0Var.f18333a = Math.max(i3, iH2);
        return vj30.x(vj30Var, p4e.i(jB), p4e.h(jB), new w2h(arrayList, jB, kie0Var, i3, (byte) 0));
    }
}
