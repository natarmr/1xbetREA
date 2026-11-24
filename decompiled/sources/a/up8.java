package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class up8 implements sv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xpj0 f36050a;
    public final /* synthetic */ Function0 b;

    public up8(xpj0 xpj0Var, Function0 function0) {
        this.f36050a = xpj0Var;
        this.b = function0;
    }

    @Override // a.sv40
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Integer numValueOf;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        final int i = p4e.i(j);
        final int iH = p4e.h(j);
        long jB = p4e.b(j, 0, 0, 0, 0, 10);
        final ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int iE = 0; iE < size; iE = w6x.e((pj30) list4.get(iE), jB, arrayList2, iE, 1)) {
        }
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int iE2 = 0; iE2 < size2; iE2 = w6x.e((pj30) list2.get(iE2), jB, arrayList3, iE2, 1)) {
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((pu90) arrayList3.get(0)).b);
            int size3 = arrayList3.size() - 1;
            if (1 <= size3) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pu90) arrayList3.get(i2)).b);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jB2 = p4e.b(jB, 0, 0, 0, iH - iIntValue, 7);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int iE3 = 0; iE3 < size4; iE3 = w6x.e((pj30) list3.get(iE3), jB2, arrayList4, iE3, 1)) {
        }
        final ArrayList arrayList5 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int iE4 = 0; iE4 < size5; iE4 = w6x.e((pj30) list5.get(iE4), jB, arrayList5, iE4, 1)) {
        }
        final xpj0 xpj0Var = this.f36050a;
        final Function0 function0 = this.b;
        return vj30.x(vj30Var, i, iH, new Function1() { // from class: a.tp8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer numValueOf3;
                Integer numValueOf4;
                Integer numValueOf5;
                int iB;
                ou90 ou90Var = (ou90) obj;
                ArrayList arrayList6 = arrayList2;
                if (!arrayList6.isEmpty()) {
                    numValueOf3 = Integer.valueOf(((pu90) arrayList6.get(0)).f27604a);
                    int size6 = arrayList6.size() - 1;
                    if (1 <= size6) {
                        int i3 = 1;
                        while (true) {
                            Integer numValueOf6 = Integer.valueOf(((pu90) arrayList6.get(i3)).f27604a);
                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf6;
                            }
                            if (i3 == size6) {
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    numValueOf3 = null;
                }
                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                int i4 = i;
                int iMax = Math.max(0, (i4 - iIntValue2) / 2);
                ArrayList arrayList7 = arrayList5;
                if (!arrayList7.isEmpty()) {
                    numValueOf4 = Integer.valueOf(((pu90) arrayList7.get(0)).f27604a);
                    int size7 = arrayList7.size() - 1;
                    if (1 <= size7) {
                        int i5 = 1;
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((pu90) arrayList7.get(i5)).f27604a);
                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf7;
                            }
                            if (i5 == size7) {
                                break;
                            }
                            i5++;
                        }
                    }
                } else {
                    numValueOf4 = null;
                }
                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                if (!arrayList7.isEmpty()) {
                    numValueOf5 = Integer.valueOf(((pu90) arrayList7.get(0)).b);
                    int size8 = arrayList7.size() - 1;
                    if (1 <= size8) {
                        int i6 = 1;
                        while (true) {
                            Integer numValueOf8 = Integer.valueOf(((pu90) arrayList7.get(i6)).b);
                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                numValueOf5 = numValueOf8;
                            }
                            if (i6 == size8) {
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    numValueOf5 = null;
                }
                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                int i7 = (i4 - iIntValue3) / 2;
                int iOrdinal = xpj0Var.c().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iB = iH;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    iB = si30.b(((Number) function0.invoke()).floatValue());
                }
                int i8 = iB - iIntValue4;
                ArrayList arrayList8 = arrayList4;
                int size9 = arrayList8.size();
                for (int i9 = 0; i9 < size9; i9++) {
                    ou90Var.m((pu90) arrayList8.get(i9), 0, iIntValue, 0.0f);
                }
                ArrayList arrayList9 = arrayList3;
                int size10 = arrayList9.size();
                for (int i10 = 0; i10 < size10; i10++) {
                    ou90Var.m((pu90) arrayList9.get(i10), 0, 0, 0.0f);
                }
                int size11 = arrayList6.size();
                for (int i11 = 0; i11 < size11; i11++) {
                    ou90Var.m((pu90) arrayList6.get(i11), iMax, 0, 0.0f);
                }
                int size12 = arrayList7.size();
                for (int i12 = 0; i12 < size12; i12++) {
                    ou90Var.m((pu90) arrayList7.get(i12), i7, i8, 0.0f);
                }
                return Unit.f46060a;
            }
        });
    }
}
