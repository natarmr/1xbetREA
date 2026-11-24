package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class n180 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22737a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n180(Object obj, boolean z, byte b) {
        this.f22737a = b;
        this.c = obj;
        this.b = z;
    }

    public static final void f(pu90 pu90Var, boolean z, ou90 ou90Var, int i, int i2) {
        if (z) {
            ou90Var.m(pu90Var, i, i2, 0.0f);
        } else {
            ou90Var.g(pu90Var, i, i2, 0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        int iC;
        int iT;
        byte b = this.f22737a;
        Object obj = this.c;
        list.getClass();
        switch (b) {
            case 0:
                zcl zclVar = qmk.f28987a;
                int iT2 = vj30Var.T(8.0f);
                int iT3 = vj30Var.T(16.0f);
                int iT4 = vj30Var.T(29.0f);
                int i = p4e.i(j) / 2;
                pu90 pu90VarS2 = ((pj30) list.get(1)).S(j);
                pu90 pu90VarS3 = ((pj30) list.get(2)).S(j);
                pu90 pu90VarS4 = ((pj30) list.get(3)).S(j);
                int i2 = pu90VarS3.f27604a / 2;
                int i3 = i - i2;
                int i4 = (i3 - pu90VarS2.f27604a) - iT2;
                int i5 = i + i2 + iT2;
                int i6 = i4 - iT3;
                pu90 pu90VarS5 = ((pj30) list.get(0)).S(p4e.b(j, 0, i6 < 0 ? 0 : i6, 0, 0, 12));
                pu90 pu90VarS6 = ((pj30) list.get(4)).S(p4e.b(j, 0, i6 < 0 ? 0 : i6, 0, 0, 12));
                int i7 = i6 - pu90VarS5.f27604a;
                int i8 = i5 + pu90VarS4.f27604a + iT3;
                pj30 pj30Var = (pj30) CollectionsKt.W(5, list);
                if (pj30Var != null) {
                    pu90VarS = pj30Var.S(p4e.b(j, 0, i6 < 0 ? 0 : i6, 0, 0, 12));
                } else {
                    pu90VarS = null;
                }
                int i9 = pu90VarS3.b;
                int i10 = pu90VarS5.b;
                if (pu90VarS != null) {
                    int i11 = pu90VarS6.b;
                    int i12 = pu90VarS2.b;
                    iC = idd.c(new int[]{i10, i11, (pu90VarS.b + i12) - (i12 / 4)}, i9);
                } else {
                    iC = idd.c(new int[]{i10, pu90VarS6.b, pu90VarS2.b}, i9);
                }
                return vj30.x(vj30Var, p4e.i(j), iC, new m180(pu90VarS3, i3, (iC - pu90VarS3.b) / 2, pu90VarS2, i4, (iC - pu90VarS4.b) / 2, pu90VarS4, i5, pu90VarS5, i7, (iC - pu90VarS5.b) / 2, pu90VarS6, i8, (iC - pu90VarS6.b) / 2, pu90VarS, (j00) obj, iT4, this.b));
            default:
                d4n d4nVar = (d4n) obj;
                if (d4nVar == null) {
                    t9f.b();
                } else {
                    if (d4nVar instanceof z3n) {
                        zcl zclVar2 = qmk.f28987a;
                        iT = vj30Var.T(6.0f);
                    } else if (d4nVar instanceof a4n) {
                        zcl zclVar3 = qmk.f28987a;
                        iT = vj30Var.T(8.0f);
                    } else if (d4nVar instanceof b4n) {
                        zcl zclVar4 = qmk.f28987a;
                        iT = vj30Var.T(2.0f);
                    } else if (d4nVar instanceof c4n) {
                        zcl zclVar5 = qmk.f28987a;
                        iT = vj30Var.T(8.0f);
                    } else if (d4nVar instanceof y3n) {
                        zcl zclVar6 = qmk.f28987a;
                        iT = vj30Var.T(4.0f);
                    } else {
                        t9f.b();
                    }
                    int i13 = (p4e.i(j) - ((list.size() - 1) * iT)) / list.size();
                    Integer numValueOf = Integer.valueOf(i13);
                    if (i13 <= 0) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        int i14 = ((pj30) it.next()).S(p4e.a(iIntValue, iIntValue, 0, p4e.h(j))).b;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (i14 <= 0) {
                            numValueOf2 = null;
                        }
                        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                        while (it.hasNext()) {
                            int i15 = ((pj30) it.next()).S(p4e.a(iIntValue, iIntValue, 0, p4e.h(j))).b;
                            Integer numValueOf3 = Integer.valueOf(i15);
                            if (i15 <= 0) {
                                numValueOf3 = null;
                            }
                            int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                            if (iIntValue2 < iIntValue3) {
                                iIntValue2 = iIntValue3;
                            }
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((pj30) it2.next()).S(p4e.a(iIntValue, iIntValue, iIntValue2, iIntValue2)));
                        }
                        return vj30.x(vj30Var, p4e.i(j), iIntValue2, new hka(iT, arrayList, this.b));
                    }
                    itt0.a();
                }
                return null;
        }
    }
}
