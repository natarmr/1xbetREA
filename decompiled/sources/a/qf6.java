package a;

import android.graphics.Rect;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qf6 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28615a;
    public final Object b;

    public qf6(List list) {
        this.f28615a = (byte) 1;
        list.getClass();
        this.b = list;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Integer numValueOf;
        int iIntValue;
        long jA;
        int i;
        int i2;
        pu90 pu90VarS;
        int i3;
        byte b = this.f28615a;
        byte b2 = 14;
        byte b3 = 5;
        Object obj = this.b;
        switch (b) {
            case 0:
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pj30 pj30Var = (pj30) it.next();
                    if (Intrinsics.d(mrv.i0(pj30Var), "BetBuilderButton")) {
                        int iT = vj30Var.T(rf6.f30371a);
                        int i4 = p4e.e(j) ? p4e.i(j) : iT;
                        if (iT > i4) {
                            iT = i4;
                        }
                        int iB = si30.b((((Number) ((l7m0) obj).getValue()).floatValue() * (i4 - iT)) + iT);
                        pu90 pu90VarS2 = pj30Var.S(r4e.a(iB, iB, 0, p4e.h(j)));
                        return vj30.x(vj30Var, iB, pu90VarS2.b, new y1(pu90VarS2, (byte) 5));
                    }
                }
                v4i0.o("Collection contains no element matching the predicate.");
                return null;
            case 1:
                List list2 = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i5 = 0;
                for (Object obj2 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pj30 pj30Var2 = (pj30) obj2;
                    us8 us8Var = (us8) CollectionsKt.W(i5, list2);
                    if (us8Var != null) {
                        Rect rect = us8Var.b;
                        jA = r4e.a(rect.width(), rect.width(), 0, p4e.h(j));
                    } else {
                        jA = j;
                    }
                    arrayList.add(pj30Var2.S(jA));
                    i5 = i6;
                }
                if (p4e.i(j) != Integer.MAX_VALUE) {
                    iIntValue = p4e.i(j);
                } else {
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        numValueOf = Integer.valueOf(((pu90) it2.next()).f27604a);
                        while (it2.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((pu90) it2.next()).f27604a);
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                int i7 = 0;
                for (Object obj3 : arrayList) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var = (pu90) obj3;
                    us8 us8Var2 = (us8) CollectionsKt.W(i7, list2);
                    arrayList2.add(Integer.valueOf((us8Var2 != null ? us8Var2.b.top : 0) + pu90Var.b));
                    i7 = i8;
                }
                Integer num = (Integer) CollectionsKt.g0(arrayList2);
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (p4e.h(j) != Integer.MAX_VALUE) {
                    iIntValue2 = p4e.h(j);
                }
                return vj30.x(vj30Var, iIntValue, iIntValue2, new op7(arrayList, this, b2));
            case 2:
                list.getClass();
                if (p4e.i(j) == Integer.MAX_VALUE) {
                    i = p4e.i(j);
                } else {
                    i = p4e.i(j);
                    if (i < 0) {
                        i = 0;
                    }
                }
                int i9 = i;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    pj30 pj30Var3 = (pj30) list.get(i10);
                    if (Intrinsics.d(mrv.i0(pj30Var3), RemoteMessageConst.Notification.CONTENT)) {
                        pu90 pu90VarS3 = pj30Var3.S(p4e.b(j, 0, i9, 0, 0, 12));
                        float fL = ((k2d) obj).f17566a.getState().c.l();
                        int iH = p4e.h(j) == Integer.MAX_VALUE ? p4e.h(j) : p4e.h(j) + (Float.isNaN(fL) ? 0 : si30.b(fL));
                        return vj30.x(vj30Var, p4e.i(j), iH, new n7(pu90VarS3, iH, (byte) 6));
                    }
                }
                qf00.b("Collection contains no element matching the predicate.");
                csj.b();
                return null;
            case 3:
                list.getClass();
                if (p4e.i(j) == Integer.MAX_VALUE) {
                    i2 = p4e.i(j);
                } else {
                    i2 = p4e.i(j);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                }
                int i11 = i2;
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    pj30 pj30Var4 = (pj30) list.get(i12);
                    if (Intrinsics.d(mrv.i0(pj30Var4), RemoteMessageConst.Notification.CONTENT)) {
                        pu90 pu90VarS4 = pj30Var4.S(p4e.b(j, 0, i11, 0, 0, 12));
                        float fL2 = ((kip) obj).f18346a.f7077a.c.l();
                        int iB2 = Float.isNaN(fL2) ? 0 : si30.b(fL2);
                        int i13 = p4e.i(j);
                        if (i13 < 0) {
                            i13 = 0;
                        }
                        int iMax = Math.max(p4e.h(j) == Integer.MAX_VALUE ? p4e.h(j) : iB2 + p4e.h(j), 0);
                        return vj30.x(vj30Var, i13, iMax, new n7(pu90VarS4, iMax, (byte) 14));
                    }
                }
                qf00.b("Collection contains no element matching the predicate.");
                csj.b();
                return null;
            case 4:
                list.getClass();
                int i14 = p4e.i(j);
                int iH2 = p4e.h(j);
                zcl zclVar = qmk.f28987a;
                int iT2 = vj30Var.T(56.0f);
                cgk0 cgk0Var = (cgk0) obj;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    pj30 pj30Var5 = (pj30) it3.next();
                    Object objN = pj30Var5.n();
                    mh00 mh00Var = objN instanceof mh00 ? (mh00) objN : null;
                    String str = mh00Var != null ? mh00Var.b : null;
                    if (Intrinsics.d(str, "TOOLBAR_ID")) {
                        pu90VarS = pj30Var5.S(p4e.a(i14, i14, iT2, iT2));
                    } else if (Intrinsics.d(str, "CONTENT_ID")) {
                        int i15 = iH2 - iT2;
                        pu90VarS = pj30Var5.S(p4e.a(i14, i14, i15 - cgk0Var.l(), i15 - cgk0Var.l()));
                    } else {
                        pu90VarS = null;
                    }
                    if (pu90VarS != null) {
                        arrayList3.add(pu90VarS);
                    }
                }
                return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new f3s(cgk0Var, arrayList3, b3));
            case 5:
                list.getClass();
                float fI = p4e.i(j) / 12.0f;
                int i16 = 12;
                int[] iArr = new int[12];
                for (int i17 = 0; i17 < 12; i17++) {
                    iArr[i17] = si30.b(fI);
                }
                ArrayList arrayList4 = new ArrayList(9);
                int iC = 0;
                while (true) {
                    int i18 = 1;
                    if (iC >= 9) {
                        int i19 = iArr[0];
                        Function1 function1 = (Function1) obj;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(i19));
                        }
                        pj30 pj30Var6 = (pj30) CollectionsKt.d0(list);
                        ArrayList arrayList5 = new ArrayList();
                        int i20 = 0;
                        int iE = 0;
                        while (i20 < 9) {
                            int i21 = 0;
                            while (i21 < i16) {
                                if (i20 == 3 && i21 == 5) {
                                    int i22 = iArr[5] + iArr[6];
                                    int iIntValue3 = ((Number) arrayList4.get(i20)).intValue();
                                    pj30 pj30Var7 = (pj30) list.get(iE);
                                    if (((i22 >= 0 ? i18 : 0) & (iIntValue3 >= 0 ? i18 : 0)) == 0) {
                                        zcx.a("width and height must be >= 0");
                                    }
                                    iE = w6x.e(pj30Var7, r4e.h(i22, i22, iIntValue3, iIntValue3), arrayList5, iE, i18);
                                    i21 += 2;
                                } else {
                                    int i23 = i18;
                                    int i24 = i21;
                                    if (i20 != 3 || i24 != 6) {
                                        int i25 = iArr[i24];
                                        int iIntValue4 = ((Number) arrayList4.get(i20)).intValue();
                                        pj30 pj30Var8 = (pj30) list.get(iE);
                                        if (((i25 >= 0 ? i23 : 0) & (iIntValue4 >= 0 ? i23 : 0)) == 0) {
                                            zcx.a("width and height must be >= 0");
                                        }
                                        iE = w6x.e(pj30Var8, r4e.h(i25, i25, iIntValue4, iIntValue4), arrayList5, iE, i23);
                                    }
                                    i21 = i24 + 1;
                                    i18 = i23;
                                }
                                i16 = 12;
                            }
                            i20++;
                            i16 = 12;
                        }
                        int i26 = i18;
                        int iB3 = si30.b(i19 * 3.5f);
                        if (((iB3 >= 0 ? i26 : 0) & (iB3 >= 0 ? i26 : 0)) == 0) {
                            zcx.a("width and height must be >= 0");
                        }
                        return vj30.x(vj30Var, p4e.i(j), CollectionsKt.C0(arrayList4), new duo(arrayList5, iArr, arrayList4, j, pj30Var6.S(r4e.h(iB3, iB3, iB3, iB3)), i19));
                    }
                    iC = w6x.c(iArr[0], iC, 1, arrayList4);
                }
                break;
            case 6:
                return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new u400(list, this, b3));
            case 7:
                list.getClass();
                if (p4e.i(j) == Integer.MAX_VALUE) {
                    i3 = p4e.i(j);
                } else {
                    i3 = p4e.i(j);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                }
                int i27 = i3;
                int size3 = list.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    pj30 pj30Var9 = (pj30) list.get(i28);
                    if (Intrinsics.d(mrv.i0(pj30Var9), RemoteMessageConst.Notification.CONTENT)) {
                        pu90 pu90VarS5 = pj30Var9.S(p4e.b(j, 0, i27, 0, 0, 12));
                        float fL3 = ((mno0) obj).f22100a.f45214a.c.l();
                        int iH3 = p4e.h(j) == Integer.MAX_VALUE ? p4e.h(j) : p4e.h(j) + (Float.isNaN(fL3) ? 0 : si30.b(fL3));
                        return vj30.x(vj30Var, p4e.i(j), iH3, new n7(pu90VarS5, iH3, (byte) 17));
                    }
                }
                qf00.b("Collection contains no element matching the predicate.");
                csj.b();
                return null;
            default:
                list.getClass();
                ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    pj30 pj30Var10 = (pj30) it4.next();
                    zcl zclVar2 = qmk.f28987a;
                    arrayList6.add(pj30Var10.S(r4e.b(0, vj30Var.T(34.0f), 0, vj30Var.T(46.0f), 5)));
                }
                return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new x5q(arrayList6, (ArrayList) obj, (byte) 4));
        }
    }

    public /* synthetic */ qf6(Object obj, byte b) {
        this.f28615a = b;
        this.b = obj;
    }
}
