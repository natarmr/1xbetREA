package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gtq implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11892a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ gtq(pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f11892a = b;
        this.b = pz40Var;
        this.c = pz40Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Object obj;
        Object obj2;
        byte b = this.f11892a;
        pz40 pz40Var = this.c;
        pz40 pz40Var2 = this.b;
        Object[] objArr = 0;
        list.getClass();
        switch (b) {
            case 0:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new rnp((byte) 19));
                }
                int i = p4e.i(j);
                final ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    pj30 pj30Var = (pj30) list.get(i2);
                    Object objI0 = mrv.i0(pj30Var);
                    if (Intrinsics.d(objI0, "RED_CARDS_CONTENT_ID") || Intrinsics.d(objI0, "YELLOW_CARDS_CONTENT_ID") || Intrinsics.d(objI0, "CORNERS_CONTENT_ID") || Intrinsics.d(objI0, "TOTAL_CONTENT_ID")) {
                        arrayList.add(pj30Var.S(j));
                    }
                }
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += ((pu90) it.next()).f27604a;
                }
                int i4 = i - i3;
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        obj = list.get(i5);
                        if (!Intrinsics.d(mrv.i0((pj30) obj), "PERIOD_CONTENT_ID")) {
                            i5++;
                        }
                    } else {
                        obj = null;
                    }
                }
                pj30 pj30Var2 = (pj30) obj;
                final pu90 pu90VarS = pj30Var2 != null ? pj30Var2.S(p4e.b(j, 0, i4, 0, 0, 13)) : null;
                pz40Var2.setValue(pu90VarS != null ? new ycl(vj30Var.r0(pu90VarS.f27604a)) : null);
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i6 = ((pu90) it2.next()).b;
                while (it2.hasNext()) {
                    int i7 = ((pu90) it2.next()).b;
                    if (i6 < i7) {
                        i6 = i7;
                    }
                }
                int iMax = Math.max(i6, pu90VarS != null ? pu90VarS.b : 0);
                Iterator it3 = arrayList.iterator();
                int i8 = 0;
                while (it3.hasNext()) {
                    i8 += ((pu90) it3.next()).f27604a;
                }
                final int iMin = Math.min(i, i8 + (pu90VarS != null ? pu90VarS.f27604a : 0));
                pz40Var.setValue(new ycl(vj30Var.r0(iMax)));
                final Object[] objArr2 = objArr == true ? 1 : 0;
                return vj30.x(vj30Var, iMin, iMax, new Function1() { // from class: a.ftq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b2 = objArr2;
                        int i9 = iMin;
                        pu90 pu90Var = pu90VarS;
                        ArrayList arrayList2 = arrayList;
                        ou90 ou90Var = (ou90) obj3;
                        switch (b2) {
                            case 0:
                                ou90Var.getClass();
                                int size3 = arrayList2.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size3; i11++) {
                                    pu90 pu90Var2 = (pu90) arrayList2.get(i11);
                                    Object objN = pu90Var2.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "RED_CARDS_CONTENT_ID") || Intrinsics.d(objG0, "YELLOW_CARDS_CONTENT_ID") || Intrinsics.d(objG0, "CORNERS_CONTENT_ID")) {
                                        ou90Var.m(pu90Var2, i10, 0, 0.0f);
                                        i10 += pu90Var2.f27604a;
                                    } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                        ou90Var.m(pu90Var2, i9 - pu90Var2.f27604a, 0, 0.0f);
                                    }
                                }
                                if (pu90Var != null) {
                                    ou90Var.m(pu90Var, i10, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90Var.getClass();
                                int size4 = arrayList2.size();
                                for (int i12 = 0; i12 < size4; i12++) {
                                    pu90 pu90Var3 = (pu90) arrayList2.get(i12);
                                    Object objN2 = pu90Var3.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    if (Intrinsics.d(p6zVar2 != null ? p6zVar2.g0() : null, "TOTAL_CONTENT_ID")) {
                                        ou90Var.m(pu90Var3, i9 - pu90Var3.f27604a, 0, 0.0f);
                                    }
                                }
                                if (pu90Var != null) {
                                    ou90Var.m(pu90Var, 0, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new rnp((byte) 20));
                }
                int i9 = p4e.i(j);
                final ArrayList arrayList2 = new ArrayList();
                int size3 = list.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    pj30 pj30Var3 = (pj30) list.get(i10);
                    if (Intrinsics.d(mrv.i0(pj30Var3), "TOTAL_CONTENT_ID")) {
                        arrayList2.add(pj30Var3.S(j));
                    }
                }
                Iterator it4 = arrayList2.iterator();
                int i11 = 0;
                while (it4.hasNext()) {
                    i11 += ((pu90) it4.next()).f27604a;
                }
                int i12 = i9 - i11;
                int size4 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size4) {
                        obj2 = list.get(i13);
                        if (!Intrinsics.d(mrv.i0((pj30) obj2), "PERIOD_CONTENT_ID")) {
                            i13++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                pj30 pj30Var4 = (pj30) obj2;
                final pu90 pu90VarS2 = pj30Var4 != null ? pj30Var4.S(p4e.b(j, 0, i12, 0, 0, 13)) : null;
                pz40Var2.setValue(pu90VarS2 != null ? new ycl(vj30Var.r0(pu90VarS2.f27604a)) : null);
                Iterator it5 = arrayList2.iterator();
                if (!it5.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i14 = ((pu90) it5.next()).b;
                while (it5.hasNext()) {
                    int i15 = ((pu90) it5.next()).b;
                    if (i14 < i15) {
                        i14 = i15;
                    }
                }
                int iMax2 = Math.max(i14, pu90VarS2 != null ? pu90VarS2.b : 0);
                Iterator it6 = arrayList2.iterator();
                int i16 = 0;
                while (it6.hasNext()) {
                    i16 += ((pu90) it6.next()).f27604a;
                }
                final int iMin2 = Math.min(i9, i16 + (pu90VarS2 != null ? pu90VarS2.f27604a : 0));
                pz40Var.setValue(new ycl(vj30Var.r0(iMax2)));
                final byte b2 = 1;
                return vj30.x(vj30Var, iMin2, iMax2, new Function1() { // from class: a.ftq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b3 = b2;
                        int i17 = iMin2;
                        pu90 pu90Var = pu90VarS2;
                        ArrayList arrayList3 = arrayList2;
                        ou90 ou90Var = (ou90) obj3;
                        switch (b3) {
                            case 0:
                                ou90Var.getClass();
                                int size5 = arrayList3.size();
                                int i18 = 0;
                                for (int i19 = 0; i19 < size5; i19++) {
                                    pu90 pu90Var2 = (pu90) arrayList3.get(i19);
                                    Object objN = pu90Var2.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "RED_CARDS_CONTENT_ID") || Intrinsics.d(objG0, "YELLOW_CARDS_CONTENT_ID") || Intrinsics.d(objG0, "CORNERS_CONTENT_ID")) {
                                        ou90Var.m(pu90Var2, i18, 0, 0.0f);
                                        i18 += pu90Var2.f27604a;
                                    } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                        ou90Var.m(pu90Var2, i17 - pu90Var2.f27604a, 0, 0.0f);
                                    }
                                }
                                if (pu90Var != null) {
                                    ou90Var.m(pu90Var, i18, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90Var.getClass();
                                int size6 = arrayList3.size();
                                for (int i110 = 0; i110 < size6; i110++) {
                                    pu90 pu90Var3 = (pu90) arrayList3.get(i110);
                                    Object objN2 = pu90Var3.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    if (Intrinsics.d(p6zVar2 != null ? p6zVar2.g0() : null, "TOTAL_CONTENT_ID")) {
                                        ou90Var.m(pu90Var3, i17 - pu90Var3.f27604a, 0, 0.0f);
                                    }
                                }
                                if (pu90Var != null) {
                                    ou90Var.m(pu90Var, 0, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }
}
