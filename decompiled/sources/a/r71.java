package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r71 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29958a;
    public static final r71 b = new r71(0);
    public static final r71 c = new r71(1);
    public static final r71 d = new r71(2);
    public static final r71 e = new r71(3);
    public static final r71 f = new r71(4);
    public static final r71 g = new r71(5);
    public static final r71 h = new r71(6);
    public static final r71 i = new r71(7);
    public static final r71 j = new r71(8);
    public static final r71 k = new r71(9);
    public static final r71 l = new r71(10);
    public static final r71 m = new r71(11);
    public static final r71 n = new r71(12);
    public static final r71 o = new r71(13);
    public static final r71 p = new r71(14);
    public static final r71 q = new r71(15);
    public static final r71 r = new r71(16);
    public static final mmn s = new mmn((byte) 2);
    public static final r71 t = new r71(17);
    public static final r71 u = new r71(18);
    public static final r71 v = new r71(19);
    public static final r71 w = new r71(20);
    public static final r71 x = new r71(21);
    public static final r71 y = new r71(22);
    public static final r71 z = new r71(23);
    public static final r71 A = new r71(24);
    public static final r71 B = new r71(25);
    public static final r71 C = new r71(26);
    public static final r71 D = new r71(27);
    public static final r71 E = new r71(28);
    public static final r71 F = new r71(29);

    public /* synthetic */ r71(byte b2) {
        this.f29958a = b2;
    }

    private final uj30 f(vj30 vj30Var, List list, long j2) {
        list.getClass();
        int i2 = p4e.i(j2);
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(8.0f);
        int iT2 = vj30Var.T(4.0f);
        int iT3 = vj30Var.T(144.0f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pj30 pj30Var = (pj30) it.next();
            if (Intrinsics.d(mrv.i0(pj30Var), "IMAGE_ID")) {
                pu90 pu90VarS = pj30Var.S(j2);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    pj30 pj30Var2 = (pj30) it2.next();
                    if (Intrinsics.d(mrv.i0(pj30Var2), "SCORE_ID")) {
                        pu90 pu90VarS2 = pj30Var2.S(p4e.b(j2, 0, iT3, 0, 0, 13));
                        int iE0 = ((i2 - pu90VarS.e0()) - pu90VarS2.e0()) - (iT * 2);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            pj30 pj30Var3 = (pj30) it3.next();
                            if (Intrinsics.d(mrv.i0(pj30Var3), "TITLE_ID")) {
                                pu90 pu90VarS3 = pj30Var3.S(p4e.b(j2, 0, iE0, 0, 0, 13));
                                int iD0 = pu90VarS.d0() + iT;
                                return vj30.x(vj30Var, i2, iD0, new mdf(pu90VarS, iT2, pu90VarS3, iT, (iD0 - pu90VarS3.d0()) / 2, pu90VarS2, i2, (iD0 - pu90VarS2.d0()) / 2, (byte) 1));
                            }
                        }
                        v4i0.o("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
                v4i0.o("Collection contains no element matching the predicate.");
                return null;
            }
        }
        v4i0.o("Collection contains no element matching the predicate.");
        return null;
    }

    private final uj30 g(vj30 vj30Var, List list, long j2) {
        Integer numValueOf;
        Object next;
        pu90 pu90VarS;
        list.getClass();
        kie0 kie0Var = new kie0();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            numValueOf = null;
            pu90 pu90VarS2 = null;
            if (!it.hasNext()) {
                break;
            }
            pj30 pj30Var = (pj30) it.next();
            Object objI0 = mrv.i0(pj30Var);
            if (Intrinsics.d(objI0, "MarketCategoriesSubGamesContainerHEADER")) {
                pu90VarS2 = pj30Var.S(p4e.b(j2, 0, 0, 0, 0, 10));
                kie0Var.f18333a = pu90VarS2.f27604a;
            } else if (Intrinsics.d(objI0, "MarketCategoriesSubGamesContainerITEMS")) {
                pu90VarS2 = pj30Var.S(p4e.b(j2, 0, p4e.i(j2) - kie0Var.f18333a, 0, 0, 12));
            }
            if (pu90VarS2 != null) {
                arrayList.add(pu90VarS2);
            }
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "MarketCategoriesSubGamesContainerSEPARATOR"));
        pj30 pj30Var2 = (pj30) next;
        if (pj30Var2 != null) {
            int i2 = p4e.i(j2);
            if (i2 < 0) {
                zcx.a("width must be >= 0");
            }
            pu90VarS = pj30Var2.S(r4e.h(i2, i2, 0, Integer.MAX_VALUE));
        } else {
            pu90VarS = null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            numValueOf = Integer.valueOf(((pu90) it3.next()).b);
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((pu90) it3.next()).b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        return vj30.x(vj30Var, p4e.i(j2), iIntValue, new cs20(pu90VarS, iIntValue, arrayList, kie0Var, (byte) 1));
    }

    private final uj30 h(vj30 vj30Var, List list, long j2) {
        Object next;
        pu90 pu90VarS;
        list.getClass();
        kie0 kie0Var = new kie0();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            pu90 pu90VarS2 = null;
            if (!it.hasNext()) {
                break;
            }
            pj30 pj30Var = (pj30) it.next();
            Object objI0 = mrv.i0(pj30Var);
            if (Intrinsics.d(objI0, "MarketCategoriesSubGamesContainerHEADER")) {
                pu90VarS2 = pj30Var.S(p4e.b(j2, 0, 0, 0, 0, 10));
                kie0Var.f18333a = pu90VarS2.f27604a;
            } else if (Intrinsics.d(objI0, "MarketCategoriesSubGamesContainerITEMS")) {
                pu90VarS2 = pj30Var.S(p4e.b(j2, 0, p4e.i(j2) - kie0Var.f18333a, 0, 0, 12));
            }
            if (pu90VarS2 != null) {
                arrayList.add(pu90VarS2);
            }
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "MarketCategoriesSubGamesContainerSEPARATOR"));
        pj30 pj30Var2 = (pj30) next;
        if (pj30Var2 != null) {
            int i2 = p4e.i(j2);
            if (i2 < 0) {
                zcx.a("width must be >= 0");
            }
            pu90VarS = pj30Var2.S(r4e.h(i2, i2, 0, Integer.MAX_VALUE));
        } else {
            pu90VarS = null;
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            itt0.a();
            return null;
        }
        int i3 = ((pu90) it3.next()).b;
        while (true) {
            int i4 = i3;
            while (it3.hasNext()) {
                i3 = ((pu90) it3.next()).b;
                if (i4 < i3) {
                }
            }
            return vj30.x(vj30Var, p4e.i(j2), i4, new cs20(pu90VarS, i4, arrayList, kie0Var, (byte) 0));
        }
    }

    private final uj30 i(vj30 vj30Var, List list, long j2) {
        Object next;
        long j3;
        pu90 pu90VarS;
        Object next2;
        int i2;
        list.getClass();
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(2.0f);
        int iT2 = vj30Var.T(4.0f);
        int iT3 = vj30Var.T(168.0f);
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "COEFFICIENT_ID"));
        pj30 pj30Var = (pj30) next;
        if (pj30Var != null) {
            j3 = j2;
            pu90VarS = pj30Var.S(p4e.b(j3, 0, iT3, 0, 0, 12));
        } else {
            j3 = j2;
            pu90VarS = null;
        }
        int i3 = 0;
        int i4 = pu90VarS != null ? pu90VarS.f27604a : 0;
        Integer numValueOf = Integer.valueOf(iT2);
        if (pu90VarS == null) {
            numValueOf = null;
        }
        int i5 = (p4e.i(j3) - i4) - (numValueOf != null ? numValueOf.intValue() : 0);
        int i6 = i5 < 0 ? 0 : i5;
        pu90 pu90VarS2 = ((pj30) list.get(0)).S(p4e.b(j3, 0, i6, 0, 0, 12));
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next2), "SUB_MARKET_ID"));
        pj30 pj30Var2 = (pj30) next2;
        pu90 pu90VarS3 = pj30Var2 != null ? pj30Var2.S(p4e.b(j3, 0, i6, 0, 0, 12)) : null;
        Integer numValueOf2 = pu90VarS3 != null ? Integer.valueOf(iT) : null;
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
        int iMax = Math.max(pu90VarS2.b + (pu90VarS3 != null ? pu90VarS3.b : 0) + iIntValue, pu90VarS != null ? pu90VarS.b : 0);
        if (pu90VarS != null && pu90VarS3 == null && (i2 = (pu90VarS.b / 2) - (pu90VarS2.b / 2)) >= 0) {
            i3 = i2;
        }
        return vj30.x(vj30Var, p4e.i(j3), iMax, new wv20(pu90VarS2, i3, pu90VarS3, pu90VarS2.b + iIntValue, pu90VarS, p4e.i(j3) - i4, (iMax / 2) - ((pu90VarS != null ? pu90VarS.b : 1) / 2)));
    }

    private final uj30 j(vj30 vj30Var, List list, long j2) {
        Object obj;
        pu90 pu90VarS;
        int iT;
        Object obj2;
        pu90 pu90VarS2;
        Object obj3;
        pu90 pu90VarS3;
        Object obj4;
        int i2;
        pu90 pu90VarS4;
        list.getClass();
        int i3 = p4e.i(j2);
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (Intrinsics.d(mrv.i0((pj30) obj), "COEFFICIENT_INFO_ID")) {
                break;
            }
            i4++;
        }
        pj30 pj30Var = (pj30) obj;
        if (pj30Var != null) {
            int i5 = p4e.i(j2);
            if (i5 < 0) {
                i5 = 0;
            }
            int iH = p4e.h(j2);
            if (iH < 0) {
                iH = 0;
            }
            pu90VarS = pj30Var.S(r4e.a(0, i5, 0, iH));
        } else {
            pu90VarS = null;
        }
        int i6 = pu90VarS != null ? pu90VarS.b : 0;
        int i7 = pu90VarS != null ? pu90VarS.f27604a : 0;
        if (i7 == 0) {
            iT = 0;
        } else {
            zcl zclVar = qmk.f28987a;
            iT = vj30Var.T(4.0f);
        }
        int i8 = i3 - i7;
        int i9 = i8 - iT;
        if (i9 < 0) {
            i9 = 0;
        }
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i10);
            if (Intrinsics.d(mrv.i0((pj30) obj2), "EVENT_DESCRIPTION_ID")) {
                break;
            }
            i10++;
        }
        pj30 pj30Var2 = (pj30) obj2;
        if (pj30Var2 != null) {
            int iH2 = p4e.h(j2);
            if (iH2 < 0) {
                iH2 = 0;
            }
            pu90VarS2 = pj30Var2.S(r4e.a(0, i9, 0, iH2));
        } else {
            pu90VarS2 = null;
        }
        int iD0 = pu90VarS2 != null ? pu90VarS2.d0() : 0;
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i11);
            if (Intrinsics.d(mrv.i0((pj30) obj3), "MARKET_INFO_ID")) {
                break;
            }
            i11++;
        }
        pj30 pj30Var3 = (pj30) obj3;
        if (pj30Var3 != null) {
            int iH3 = p4e.h(j2);
            if (iH3 < 0) {
                iH3 = 0;
            }
            pu90VarS3 = pj30Var3.S(r4e.a(0, i9, 0, iH3));
        } else {
            pu90VarS3 = null;
        }
        int iD1 = pu90VarS3 != null ? pu90VarS3.d0() : 0;
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (Intrinsics.d(mrv.i0((pj30) obj4), "SUB_MARKET_INFO_ID")) {
                break;
            }
            i12++;
        }
        pj30 pj30Var4 = (pj30) obj4;
        if (pj30Var4 != null) {
            int iH4 = p4e.h(j2);
            if (iH4 < 0) {
                iH4 = 0;
            }
            i2 = 0;
            pu90VarS4 = pj30Var4.S(r4e.a(0, i9, 0, iH4));
        } else {
            i2 = 0;
            pu90VarS4 = null;
        }
        int iD2 = iD0 + iD1 + (pu90VarS4 != null ? pu90VarS4.d0() : i2);
        int iMax = Math.max(iD2, i6);
        int i13 = (iMax - i6) / 2;
        int i14 = iD2 > i6 ? i2 : (i6 - iD2) / 2;
        if (i3 < 0) {
            i3 = i2;
        }
        if (iMax >= 0) {
            i2 = iMax;
        }
        return vj30.x(vj30Var, i3, i2, new b330(pu90VarS2, i14, pu90VarS3, iD0, pu90VarS4, iD1, pu90VarS, i8, i13));
    }

    private final uj30 k(vj30 vj30Var, List list, final long j2) {
        final pu90 pu90VarS;
        list.getClass();
        pj30 pj30Var = (pj30) CollectionsKt.W(1, list);
        pu90 pu90VarS2 = null;
        final pu90 pu90VarS3 = pj30Var != null ? pj30Var.S(r4e.b(0, 0, 0, 0, 15)) : null;
        final int i2 = pu90VarS3 != null ? pu90VarS3.f27604a : 0;
        pj30 pj30Var2 = (pj30) CollectionsKt.firstOrNull(list);
        if (pj30Var2 != null) {
            int i3 = (p4e.i(j2) / 2) - (i2 / 2);
            if (i3 < 0) {
                i3 = 0;
            }
            pu90VarS = pj30Var2.S(r4e.b(0, i3, 0, 0, 13));
        } else {
            pu90VarS = null;
        }
        pj30 pj30Var3 = (pj30) CollectionsKt.f0(list);
        if (pj30Var3 != null) {
            int i4 = (p4e.i(j2) / 2) - (i2 / 2);
            if (i4 < 0) {
                i4 = 0;
            }
            pu90VarS2 = pj30Var3.S(r4e.b(0, i4, 0, 0, 13));
        }
        final pu90 pu90Var = pu90VarS2;
        final int i5 = pu90VarS != null ? pu90VarS.f27604a : 0;
        final int i6 = pu90VarS3 != null ? pu90VarS3.b : 0;
        final int i7 = pu90VarS != null ? pu90VarS.b : 0;
        final int i8 = pu90Var != null ? pu90Var.b : 0;
        final int iMax = Math.max(i6, Math.max(i7, i8));
        return vj30.x(vj30Var, p4e.i(j2), iMax, new Function1() { // from class: a.r480
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                pu90 pu90Var2 = pu90VarS;
                long j3 = j2;
                int i9 = i2;
                int i10 = iMax;
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, ((p4e.i(j3) / 2) - (i9 / 2)) - i5, (i10 / 2) - (i7 / 2), 0.0f);
                }
                pu90 pu90Var3 = pu90VarS3;
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, (p4e.i(j3) / 2) - (i9 / 2), (i10 / 2) - (i6 / 2), 0.0f);
                }
                pu90 pu90Var4 = pu90Var;
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, (i9 / 2) + (p4e.i(j3) / 2), (i10 / 2) - (i8 / 2), 0.0f);
                }
                return Unit.f46060a;
            }
        });
    }

    private final uj30 l(vj30 vj30Var, List list, long j2) {
        pu90 pu90VarS;
        Object obj;
        pu90 pu90VarS2;
        Object obj2;
        list.getClass();
        int i2 = p4e.i(j2);
        int i3 = (int) (((double) i2) * 0.6d);
        int size = list.size();
        int i4 = 0;
        while (true) {
            pu90VarS = null;
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (Intrinsics.d(mrv.i0((pj30) obj), "DESCRIPTION_TEXT")) {
                break;
            }
            i4++;
        }
        pj30 pj30Var = (pj30) obj;
        if (pj30Var != null) {
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 <= 0) {
                numValueOf = null;
            }
            pu90VarS2 = pj30Var.S(p4e.b(j2, 0, numValueOf != null ? numValueOf.intValue() : i2, 0, 0, 12));
        } else {
            pu90VarS2 = null;
        }
        int i5 = i2 - (pu90VarS2 != null ? pu90VarS2.f27604a : 0);
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (Intrinsics.d(mrv.i0((pj30) obj2), "TITLE_TEXT")) {
                break;
            }
            i6++;
        }
        pj30 pj30Var2 = (pj30) obj2;
        if (pj30Var2 != null) {
            Integer numValueOf2 = i5 > 0 ? Integer.valueOf(i5) : null;
            int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : i2;
            zcl zclVar = qmk.f28987a;
            pu90VarS = pj30Var2.S(p4e.b(j2, 0, iIntValue - vj30Var.T(4.0f), 0, 0, 12));
        }
        int iMax = Math.max(pu90VarS2 != null ? pu90VarS2.b : 0, pu90VarS != null ? pu90VarS.b : 0);
        return vj30.x(vj30Var, i2, iMax, new lw7(pu90VarS, iMax - (pu90VarS != null ? pu90VarS.b : 0), pu90VarS2, i2, iMax - (pu90VarS2 != null ? pu90VarS2.b : 0), (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x0313  */
    /* JADX WARN: Code duplicated, block: B:151:0x0318  */
    /* JADX WARN: Code duplicated, block: B:164:0x0357  */
    /* JADX WARN: Code duplicated, block: B:171:0x037a  */
    /* JADX WARN: Code duplicated, block: B:178:0x039d  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03df  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:197:0x0400  */
    /* JADX WARN: Code duplicated, block: B:200:0x0404  */
    /* JADX WARN: Code duplicated, block: B:201:0x0407  */
    /* JADX WARN: Code duplicated, block: B:204:0x0410  */
    /* JADX WARN: Code duplicated, block: B:205:0x0412  */
    /* JADX WARN: Code duplicated, block: B:207:0x0415  */
    /* JADX WARN: Code duplicated, block: B:208:0x0426  */
    /* JADX WARN: Code duplicated, block: B:210:0x042a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0431  */
    /* JADX WARN: Code duplicated, block: B:213:0x0435  */
    /* JADX WARN: Code duplicated, block: B:214:0x043c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0440  */
    /* JADX WARN: Code duplicated, block: B:217:0x0447  */
    /* JADX WARN: Code duplicated, block: B:219:0x044b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0463  */
    /* JADX WARN: Code duplicated, block: B:224:0x0469  */
    /* JADX WARN: Code duplicated, block: B:253:0x05b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:255:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:259:0x05de  */
    /* JADX WARN: Code duplicated, block: B:262:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:266:0x0604  */
    /* JADX WARN: Code duplicated, block: B:359:0x0921 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:360:0x0923  */
    /* JADX WARN: Code duplicated, block: B:361:0x0925  */
    /* JADX WARN: Code duplicated, block: B:405:0x0a25 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:406:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:407:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:449:0x0b26 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:450:0x0b28  */
    /* JADX WARN: Code duplicated, block: B:451:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:534:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:548:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:561:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x05f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:570:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0167  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178  */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v35 java.lang.Object, still in use, count: 2, list:
          (r3v35 java.lang.Object) from 0x0b21: PHI (r3 I:??) = (r3v31 java.lang.Object), (r3v35 java.lang.Object) binds: [B:446:0x0b1f, B:608:0x0b21] A[DONT_GENERATE, DONT_INLINE]
          (r3v35 java.lang.Object) from 0x0b12: CHECK_CAST (a.pj30) (r3v35 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.tj30
    public final a.uj30 b(a.vj30 r30, java.util.List r31, final long r32) {
        /*
            Method dump skipped, instruction units count: 3612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r71.b(a.vj30, java.util.List, long):a.uj30");
    }
}
