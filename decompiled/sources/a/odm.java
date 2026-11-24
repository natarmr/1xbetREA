package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class odm implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mdm f25083a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public odm(mdm mdmVar, boolean z, int i, float f, float f2, int i2) {
        this.f25083a = mdmVar;
        this.b = z;
        this.c = i;
        this.d = f;
        this.e = f2;
        this.f = i2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        ArrayList arrayList;
        int iMax;
        int iH;
        list.getClass();
        int i = (int) this.d;
        int i2 = (int) this.e;
        int i3 = this.f;
        int i4 = i3 * 2;
        int iD0 = 0;
        if (this.f25083a.b == pdm.f26814a) {
            arrayList = new ArrayList();
            int size = list.size();
            int iE = 1;
            while (iE < size) {
                iE = w6x.e((pj30) list.get(iE), j, arrayList, iE, 1);
            }
            Iterator it = arrayList.iterator();
            int iD1 = 0;
            while (it.hasNext()) {
                iD1 += ((pu90) it.next()).d0() + i4;
            }
            int iH2 = ((p4e.h(j) - i4) - iD1) - i4;
            if (iH2 >= i) {
                pj30 pj30Var = (pj30) CollectionsKt.U(list);
                Integer numValueOf = Integer.valueOf(i2);
                Integer numValueOf2 = Integer.valueOf(iH2);
                int i5 = this.c;
                int iIntValue = ((Number) CollectionsKt.l0(q3d.j(numValueOf, numValueOf2, Integer.valueOf(i5)))).intValue();
                if (!((i5 >= 0) & (iIntValue >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                arrayList.add(0, pj30Var.S(r4e.h(i5, i5, iIntValue, iIntValue)));
            }
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((pj30) it2.next()).S(j));
            }
        }
        ArrayList arrayList2 = arrayList;
        kie0 kie0Var = new kie0();
        boolean z = this.b;
        if (z) {
            iMax = i3;
        } else {
            Iterator it3 = arrayList2.iterator();
            int iD2 = 0;
            while (it3.hasNext()) {
                iD2 += ((pu90) it3.next()).d0() + i4;
            }
            iMax = Math.max(i3, (p4e.h(j) - iD2) / 2);
        }
        kie0Var.f18333a = iMax;
        if (z) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                iD0 += ((pu90) it4.next()).d0() + i4;
            }
            iH = i4 + iD0;
        } else {
            iH = p4e.h(j);
        }
        return vj30.x(vj30Var, p4e.i(j), iH, new w2h(arrayList2, j, kie0Var, i3, (byte) 1));
    }
}
