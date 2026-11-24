package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wtl0 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39747a;
    public final /* synthetic */ float b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ wtl0(float f, pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f39747a = b;
        this.b = f;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Object obj;
        int i;
        pz40 pz40Var;
        int i2;
        Object obj2;
        ArrayList arrayList;
        int i3;
        Object obj3;
        int i4;
        int i5;
        Object obj4;
        pz40 pz40Var2;
        ArrayList arrayList2;
        int i6;
        Object obj5;
        int i7;
        pz40 pz40Var3;
        int i8;
        ArrayList arrayList3;
        int i9;
        Object obj6;
        int i10;
        Object obj7;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj8;
        pz40 pz40Var4;
        ArrayList arrayList4;
        Object obj9;
        int i15;
        pz40 pz40Var5;
        int i16;
        int i17;
        Object obj10;
        ArrayList arrayList5;
        int i18;
        Object obj11;
        int i19;
        String str;
        int i20;
        int i21;
        pz40 pz40Var6;
        ArrayList arrayList6;
        byte b = this.f39747a;
        pz40 pz40Var7 = this.d;
        pz40 pz40Var8 = this.c;
        String str2 = "INNING_CONTENT_ID";
        float f = this.b;
        switch (b) {
            case 0:
                Object obj12 = "INNING_CONTENT_ID";
                pz40 pz40Var9 = pz40Var7;
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new f8l0((byte) 4));
                }
                int iT = vj30Var.T(f);
                int i22 = p4e.i(j);
                ArrayList arrayList7 = new ArrayList();
                int size = list.size();
                int i23 = 0;
                while (i23 < size) {
                    pj30 pj30Var = (pj30) list.get(i23);
                    Object objI0 = mrv.i0(pj30Var);
                    Object obj13 = obj12;
                    if (Intrinsics.d(objI0, obj13)) {
                        obj2 = obj13;
                        i = i22;
                        pz40Var = pz40Var9;
                        arrayList = arrayList7;
                        i3 = i23;
                        i2 = size;
                        arrayList.add(pj30Var.S(p4e.b(j, iT, 0, 0, 0, 14)));
                    } else {
                        i = i22;
                        pz40Var = pz40Var9;
                        i2 = size;
                        obj2 = obj13;
                        arrayList = arrayList7;
                        i3 = i23;
                        if (Intrinsics.d(objI0, "GAME_CONTENT_ID") || Intrinsics.d(objI0, "POINTS_CONTENT_ID") || Intrinsics.d(objI0, "TOTAL_CONTENT_ID")) {
                            arrayList.add(pj30Var.S(j));
                        }
                    }
                    i23 = i3 + 1;
                    i22 = i;
                    arrayList7 = arrayList;
                    size = i2;
                    obj12 = obj2;
                    pz40Var9 = pz40Var;
                }
                int i24 = i22;
                pz40 pz40Var10 = pz40Var9;
                final ArrayList arrayList8 = arrayList7;
                Iterator it = arrayList8.iterator();
                int i25 = 0;
                while (it.hasNext()) {
                    i25 += ((pu90) it.next()).f27604a;
                }
                int i26 = i24 - i25;
                int size2 = list.size();
                int i27 = 0;
                while (true) {
                    if (i27 < size2) {
                        obj = list.get(i27);
                        if (!Intrinsics.d(mrv.i0((pj30) obj), "PERIOD_CONTENT_ID")) {
                            i27++;
                        }
                    } else {
                        obj = null;
                    }
                }
                pj30 pj30Var2 = (pj30) obj;
                pu90 pu90VarS = pj30Var2 != null ? pj30Var2.S(p4e.b(j, 0, i26, 0, 0, 13)) : null;
                pz40Var8.setValue(pu90VarS != null ? new ycl(vj30Var.r0(pu90VarS.f27604a)) : null);
                Iterator it2 = arrayList8.iterator();
                if (!it2.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i28 = ((pu90) it2.next()).b;
                while (it2.hasNext()) {
                    int i29 = ((pu90) it2.next()).b;
                    if (i28 < i29) {
                        i28 = i29;
                    }
                }
                final int iMax = Math.max(i28, pu90VarS != null ? pu90VarS.b : 0);
                Iterator it3 = arrayList8.iterator();
                int i30 = 0;
                while (it3.hasNext()) {
                    i30 += ((pu90) it3.next()).f27604a;
                }
                final int iMin = Math.min(i24, i30 + (pu90VarS != null ? pu90VarS.f27604a : 0));
                pz40Var10.setValue(new ycl(vj30Var.r0(iMax)));
                final byte b2 = 0;
                final pu90 pu90Var = pu90VarS;
                return vj30.x(vj30Var, iMin, iMax, new Function1() { // from class: a.vtl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj14) {
                        byte b3 = b2;
                        int i31 = iMin;
                        int i32 = iMax;
                        pu90 pu90Var2 = pu90Var;
                        ArrayList arrayList9 = arrayList8;
                        switch (b3) {
                            case 0:
                                ou90 ou90Var = (ou90) obj14;
                                ou90Var.getClass();
                                int size3 = arrayList9.size();
                                int i33 = 0;
                                for (int i34 = 0; i34 < size3; i34++) {
                                    pu90 pu90Var3 = (pu90) arrayList9.get(i34);
                                    Object objN = pu90Var3.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "INNING_CONTENT_ID")) {
                                        ou90Var.m(pu90Var3, i33, i32 - pu90Var3.b, 0.0f);
                                        i33 += pu90Var3.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG0, "GAME_CONTENT_ID") || Intrinsics.d(objG0, "POINTS_CONTENT_ID")) {
                                            ou90Var.m(pu90Var3, i33, 0, 0.0f);
                                            i33 += pu90Var3.f27604a;
                                        } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                            ou90Var.m(pu90Var3, i31 - pu90Var3.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var2 != null) {
                                    ou90Var.m(pu90Var2, i33, 0, 0.0f);
                                }
                                break;
                            case 1:
                                ou90 ou90Var2 = (ou90) obj14;
                                ou90Var2.getClass();
                                int size4 = arrayList9.size();
                                int i35 = 0;
                                for (int i36 = 0; i36 < size4; i36++) {
                                    pu90 pu90Var4 = (pu90) arrayList9.get(i36);
                                    Object objN2 = pu90Var4.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                                    if (Intrinsics.d(objG1, "INNING_CONTENT_ID")) {
                                        ou90Var2.m(pu90Var4, i35, i32 - pu90Var4.b, 0.0f);
                                        i35 += pu90Var4.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG1, "GAME_CONTENT_ID") || Intrinsics.d(objG1, "POINTS_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var4, i35, 0, 0.0f);
                                            i35 += pu90Var4.f27604a;
                                        } else if (Intrinsics.d(objG1, "TOTAL_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var4, i31 - pu90Var4.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var2 != null) {
                                    ou90Var2.m(pu90Var2, i35, 0, 0.0f);
                                }
                                break;
                            case 2:
                                ou90 ou90Var3 = (ou90) obj14;
                                ou90Var3.getClass();
                                int size5 = arrayList9.size();
                                int i37 = 0;
                                for (int i38 = 0; i38 < size5; i38++) {
                                    pu90 pu90Var5 = (pu90) arrayList9.get(i38);
                                    Object objN3 = pu90Var5.n();
                                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                                    if (Intrinsics.d(objG2, "INNING_CONTENT_ID")) {
                                        ou90Var3.m(pu90Var5, i37, i32 - pu90Var5.b, 0.0f);
                                        i37 += pu90Var5.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG2, "GAME_CONTENT_ID") || Intrinsics.d(objG2, "POINTS_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var5, i37, 0, 0.0f);
                                            i37 += pu90Var5.f27604a;
                                        } else if (Intrinsics.d(objG2, "TOTAL_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var5, i31 - pu90Var5.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var2 != null) {
                                    ou90Var3.m(pu90Var2, i37, 0, 0.0f);
                                }
                                break;
                            case 3:
                                ou90 ou90Var4 = (ou90) obj14;
                                ou90Var4.getClass();
                                int size6 = arrayList9.size();
                                int i39 = 0;
                                for (int i40 = 0; i40 < size6; i40++) {
                                    pu90 pu90Var6 = (pu90) arrayList9.get(i40);
                                    Object objN4 = pu90Var6.n();
                                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                                    if (Intrinsics.d(objG3, "INNING_CONTENT_ID")) {
                                        ou90Var4.m(pu90Var6, i39, i32 - pu90Var6.b, 0.0f);
                                        i39 += pu90Var6.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG3, "GAME_CONTENT_ID") || Intrinsics.d(objG3, "POINTS_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var6, i39, 0, 0.0f);
                                            i39 += pu90Var6.f27604a;
                                        } else if (Intrinsics.d(objG3, "TOTAL_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var6, i31 - pu90Var6.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var2 != null) {
                                    ou90Var4.m(pu90Var2, i39, 0, 0.0f);
                                }
                                break;
                            case 4:
                                ou90 ou90Var5 = (ou90) obj14;
                                ou90Var5.getClass();
                                int size7 = arrayList9.size();
                                int i41 = 0;
                                for (int i42 = 0; i42 < size7; i42++) {
                                    pu90 pu90Var7 = (pu90) arrayList9.get(i42);
                                    Object objN5 = pu90Var7.n();
                                    p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                                    Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                                    if (Intrinsics.d(objG4, "INNING_CONTENT_ID")) {
                                        ou90Var5.m(pu90Var7, i41, i32 - pu90Var7.b, 0.0f);
                                        i41 += pu90Var7.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG4, "GAME_CONTENT_ID") || Intrinsics.d(objG4, "POINTS_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var7, i41, 0, 0.0f);
                                            i41 += pu90Var7.f27604a;
                                        } else if (Intrinsics.d(objG4, "TOTAL_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var7, i31 - pu90Var7.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var2 != null) {
                                    ou90Var5.m(pu90Var2, i41, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90 ou90Var6 = (ou90) obj14;
                                ou90Var6.getClass();
                                int size8 = arrayList9.size();
                                int i43 = 0;
                                for (int i44 = 0; i44 < size8; i44++) {
                                    pu90 pu90Var8 = (pu90) arrayList9.get(i44);
                                    Object objN6 = pu90Var8.n();
                                    p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                                    Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                                    if (Intrinsics.d(objG5, "INNING_CONTENT_ID")) {
                                        ou90Var6.m(pu90Var8, i43, i32 - pu90Var8.b, 0.0f);
                                        i43 += pu90Var8.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG5, "GAME_CONTENT_ID") || Intrinsics.d(objG5, "POINTS_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var8, i43, 0, 0.0f);
                                            i43 += pu90Var8.f27604a;
                                        } else if (Intrinsics.d(objG5, "TOTAL_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var8, i31 - pu90Var8.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var2 != null) {
                                    ou90Var6.m(pu90Var2, i43, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 1:
                Object obj14 = "INNING_CONTENT_ID";
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new f8l0((byte) 5));
                }
                int iT2 = vj30Var.T(f);
                int i31 = p4e.i(j);
                ArrayList arrayList9 = new ArrayList();
                int size3 = list.size();
                int i32 = 0;
                while (i32 < size3) {
                    pj30 pj30Var3 = (pj30) list.get(i32);
                    Object objI1 = mrv.i0(pj30Var3);
                    Object obj15 = obj14;
                    if (Intrinsics.d(objI1, obj15)) {
                        i4 = i31;
                        pz40Var2 = pz40Var7;
                        arrayList2 = arrayList9;
                        obj4 = obj15;
                        i5 = size3;
                        i6 = i32;
                        arrayList2.add(pj30Var3.S(p4e.b(j, iT2, 0, 0, 0, 14)));
                    } else {
                        i4 = i31;
                        i5 = size3;
                        obj4 = obj15;
                        pz40Var2 = pz40Var7;
                        arrayList2 = arrayList9;
                        i6 = i32;
                        if (Intrinsics.d(objI1, "GAME_CONTENT_ID") || Intrinsics.d(objI1, "POINTS_CONTENT_ID") || Intrinsics.d(objI1, "TOTAL_CONTENT_ID")) {
                            arrayList2.add(pj30Var3.S(j));
                        }
                    }
                    i32 = i6 + 1;
                    arrayList9 = arrayList2;
                    size3 = i5;
                    pz40Var7 = pz40Var2;
                    obj14 = obj4;
                    i31 = i4;
                }
                int i33 = i31;
                pz40 pz40Var11 = pz40Var7;
                final ArrayList arrayList10 = arrayList9;
                Iterator it4 = arrayList10.iterator();
                int i34 = 0;
                while (it4.hasNext()) {
                    i34 += ((pu90) it4.next()).f27604a;
                }
                int i35 = i33 - i34;
                int size4 = list.size();
                int i36 = 0;
                while (true) {
                    if (i36 < size4) {
                        obj3 = list.get(i36);
                        if (!Intrinsics.d(mrv.i0((pj30) obj3), "PERIOD_CONTENT_ID")) {
                            i36++;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                pj30 pj30Var4 = (pj30) obj3;
                pu90 pu90VarS2 = pj30Var4 != null ? pj30Var4.S(p4e.b(j, 0, i35, 0, 0, 13)) : null;
                pz40Var8.setValue(pu90VarS2 != null ? new ycl(vj30Var.r0(pu90VarS2.f27604a)) : null);
                Iterator it5 = arrayList10.iterator();
                if (!it5.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i37 = ((pu90) it5.next()).b;
                while (it5.hasNext()) {
                    int i38 = ((pu90) it5.next()).b;
                    if (i37 < i38) {
                        i37 = i38;
                    }
                }
                final int iMax2 = Math.max(i37, pu90VarS2 != null ? pu90VarS2.b : 0);
                Iterator it6 = arrayList10.iterator();
                int i39 = 0;
                while (it6.hasNext()) {
                    i39 += ((pu90) it6.next()).f27604a;
                }
                final int iMin2 = Math.min(i33, i39 + (pu90VarS2 != null ? pu90VarS2.f27604a : 0));
                pz40Var11.setValue(new ycl(vj30Var.r0(iMax2)));
                final byte b3 = 1;
                final pu90 pu90Var2 = pu90VarS2;
                return vj30.x(vj30Var, iMin2, iMax2, new Function1() { // from class: a.vtl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj16) {
                        byte b4 = b3;
                        int i310 = iMin2;
                        int i311 = iMax2;
                        pu90 pu90Var3 = pu90Var2;
                        ArrayList arrayList11 = arrayList10;
                        switch (b4) {
                            case 0:
                                ou90 ou90Var = (ou90) obj16;
                                ou90Var.getClass();
                                int size5 = arrayList11.size();
                                int i312 = 0;
                                for (int i313 = 0; i313 < size5; i313++) {
                                    pu90 pu90Var4 = (pu90) arrayList11.get(i313);
                                    Object objN = pu90Var4.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "INNING_CONTENT_ID")) {
                                        ou90Var.m(pu90Var4, i312, i311 - pu90Var4.b, 0.0f);
                                        i312 += pu90Var4.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG0, "GAME_CONTENT_ID") || Intrinsics.d(objG0, "POINTS_CONTENT_ID")) {
                                            ou90Var.m(pu90Var4, i312, 0, 0.0f);
                                            i312 += pu90Var4.f27604a;
                                        } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                            ou90Var.m(pu90Var4, i310 - pu90Var4.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var.m(pu90Var3, i312, 0, 0.0f);
                                }
                                break;
                            case 1:
                                ou90 ou90Var2 = (ou90) obj16;
                                ou90Var2.getClass();
                                int size6 = arrayList11.size();
                                int i314 = 0;
                                for (int i315 = 0; i315 < size6; i315++) {
                                    pu90 pu90Var5 = (pu90) arrayList11.get(i315);
                                    Object objN2 = pu90Var5.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                                    if (Intrinsics.d(objG1, "INNING_CONTENT_ID")) {
                                        ou90Var2.m(pu90Var5, i314, i311 - pu90Var5.b, 0.0f);
                                        i314 += pu90Var5.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG1, "GAME_CONTENT_ID") || Intrinsics.d(objG1, "POINTS_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var5, i314, 0, 0.0f);
                                            i314 += pu90Var5.f27604a;
                                        } else if (Intrinsics.d(objG1, "TOTAL_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var5, i310 - pu90Var5.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var2.m(pu90Var3, i314, 0, 0.0f);
                                }
                                break;
                            case 2:
                                ou90 ou90Var3 = (ou90) obj16;
                                ou90Var3.getClass();
                                int size7 = arrayList11.size();
                                int i316 = 0;
                                for (int i317 = 0; i317 < size7; i317++) {
                                    pu90 pu90Var6 = (pu90) arrayList11.get(i317);
                                    Object objN3 = pu90Var6.n();
                                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                                    if (Intrinsics.d(objG2, "INNING_CONTENT_ID")) {
                                        ou90Var3.m(pu90Var6, i316, i311 - pu90Var6.b, 0.0f);
                                        i316 += pu90Var6.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG2, "GAME_CONTENT_ID") || Intrinsics.d(objG2, "POINTS_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var6, i316, 0, 0.0f);
                                            i316 += pu90Var6.f27604a;
                                        } else if (Intrinsics.d(objG2, "TOTAL_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var6, i310 - pu90Var6.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var3.m(pu90Var3, i316, 0, 0.0f);
                                }
                                break;
                            case 3:
                                ou90 ou90Var4 = (ou90) obj16;
                                ou90Var4.getClass();
                                int size8 = arrayList11.size();
                                int i318 = 0;
                                for (int i40 = 0; i40 < size8; i40++) {
                                    pu90 pu90Var7 = (pu90) arrayList11.get(i40);
                                    Object objN4 = pu90Var7.n();
                                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                                    if (Intrinsics.d(objG3, "INNING_CONTENT_ID")) {
                                        ou90Var4.m(pu90Var7, i318, i311 - pu90Var7.b, 0.0f);
                                        i318 += pu90Var7.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG3, "GAME_CONTENT_ID") || Intrinsics.d(objG3, "POINTS_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var7, i318, 0, 0.0f);
                                            i318 += pu90Var7.f27604a;
                                        } else if (Intrinsics.d(objG3, "TOTAL_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var7, i310 - pu90Var7.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var4.m(pu90Var3, i318, 0, 0.0f);
                                }
                                break;
                            case 4:
                                ou90 ou90Var5 = (ou90) obj16;
                                ou90Var5.getClass();
                                int size9 = arrayList11.size();
                                int i41 = 0;
                                for (int i42 = 0; i42 < size9; i42++) {
                                    pu90 pu90Var8 = (pu90) arrayList11.get(i42);
                                    Object objN5 = pu90Var8.n();
                                    p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                                    Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                                    if (Intrinsics.d(objG4, "INNING_CONTENT_ID")) {
                                        ou90Var5.m(pu90Var8, i41, i311 - pu90Var8.b, 0.0f);
                                        i41 += pu90Var8.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG4, "GAME_CONTENT_ID") || Intrinsics.d(objG4, "POINTS_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var8, i41, 0, 0.0f);
                                            i41 += pu90Var8.f27604a;
                                        } else if (Intrinsics.d(objG4, "TOTAL_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var8, i310 - pu90Var8.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var5.m(pu90Var3, i41, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90 ou90Var6 = (ou90) obj16;
                                ou90Var6.getClass();
                                int size10 = arrayList11.size();
                                int i43 = 0;
                                for (int i44 = 0; i44 < size10; i44++) {
                                    pu90 pu90Var9 = (pu90) arrayList11.get(i44);
                                    Object objN6 = pu90Var9.n();
                                    p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                                    Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                                    if (Intrinsics.d(objG5, "INNING_CONTENT_ID")) {
                                        ou90Var6.m(pu90Var9, i43, i311 - pu90Var9.b, 0.0f);
                                        i43 += pu90Var9.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG5, "GAME_CONTENT_ID") || Intrinsics.d(objG5, "POINTS_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var9, i43, 0, 0.0f);
                                            i43 += pu90Var9.f27604a;
                                        } else if (Intrinsics.d(objG5, "TOTAL_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var9, i310 - pu90Var9.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var6.m(pu90Var3, i43, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 2:
                Object obj16 = "INNING_CONTENT_ID";
                pz40 pz40Var12 = pz40Var7;
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new f8l0((byte) 8));
                }
                int iT3 = vj30Var.T(f);
                int i40 = p4e.i(j);
                ArrayList arrayList11 = new ArrayList();
                int size5 = list.size();
                int i41 = 0;
                while (i41 < size5) {
                    pj30 pj30Var5 = (pj30) list.get(i41);
                    Object objI2 = mrv.i0(pj30Var5);
                    Object obj17 = obj16;
                    if (Intrinsics.d(objI2, obj17)) {
                        int i42 = p4e.i(j);
                        if (iT3 <= i42) {
                            i42 = iT3;
                        }
                        i9 = i41;
                        i10 = i40;
                        i7 = iT3;
                        pz40Var3 = pz40Var12;
                        arrayList3 = arrayList11;
                        obj6 = obj17;
                        i8 = size5;
                        arrayList3.add(pj30Var5.S(p4e.b(j, i42, 0, 0, 0, 14)));
                    } else {
                        i7 = iT3;
                        pz40Var3 = pz40Var12;
                        i8 = size5;
                        arrayList3 = arrayList11;
                        i9 = i41;
                        obj6 = obj17;
                        i10 = i40;
                        if (Intrinsics.d(objI2, "GAME_CONTENT_ID") || Intrinsics.d(objI2, "POINTS_CONTENT_ID") || Intrinsics.d(objI2, "TOTAL_CONTENT_ID")) {
                            arrayList3.add(pj30Var5.S(j));
                        }
                    }
                    i41 = i9 + 1;
                    arrayList11 = arrayList3;
                    size5 = i8;
                    i40 = i10;
                    pz40Var12 = pz40Var3;
                    obj16 = obj6;
                    iT3 = i7;
                }
                pz40 pz40Var13 = pz40Var12;
                final ArrayList arrayList12 = arrayList11;
                int i43 = i40;
                Iterator it7 = arrayList12.iterator();
                int i44 = 0;
                while (it7.hasNext()) {
                    i44 += ((pu90) it7.next()).f27604a;
                }
                int i45 = i43 - i44;
                int size6 = list.size();
                int i46 = 0;
                while (true) {
                    if (i46 < size6) {
                        obj5 = list.get(i46);
                        if (!Intrinsics.d(mrv.i0((pj30) obj5), "PERIOD_CONTENT_ID")) {
                            i46++;
                        }
                    } else {
                        obj5 = null;
                    }
                }
                pj30 pj30Var6 = (pj30) obj5;
                final pu90 pu90VarS3 = pj30Var6 != null ? pj30Var6.S(p4e.b(j, 0, i45, 0, 0, 13)) : null;
                pz40Var8.setValue(pu90VarS3 != null ? new ycl(vj30Var.r0(pu90VarS3.f27604a)) : null);
                Iterator it8 = arrayList12.iterator();
                if (!it8.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i47 = ((pu90) it8.next()).b;
                while (it8.hasNext()) {
                    int i48 = ((pu90) it8.next()).b;
                    if (i47 < i48) {
                        i47 = i48;
                    }
                }
                final int iMax3 = Math.max(i47, pu90VarS3 != null ? pu90VarS3.b : 0);
                Iterator it9 = arrayList12.iterator();
                int i49 = 0;
                while (it9.hasNext()) {
                    i49 += ((pu90) it9.next()).f27604a;
                }
                final int iMin3 = Math.min(i43, i49 + (pu90VarS3 != null ? pu90VarS3.f27604a : 0));
                pz40Var13.setValue(new ycl(vj30Var.r0(iMax3)));
                final byte b4 = 2;
                return vj30.x(vj30Var, iMin3, iMax3, new Function1() { // from class: a.vtl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj18) {
                        byte b5 = b4;
                        int i310 = iMin3;
                        int i311 = iMax3;
                        pu90 pu90Var3 = pu90VarS3;
                        ArrayList arrayList13 = arrayList12;
                        switch (b5) {
                            case 0:
                                ou90 ou90Var = (ou90) obj18;
                                ou90Var.getClass();
                                int size7 = arrayList13.size();
                                int i312 = 0;
                                for (int i313 = 0; i313 < size7; i313++) {
                                    pu90 pu90Var4 = (pu90) arrayList13.get(i313);
                                    Object objN = pu90Var4.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "INNING_CONTENT_ID")) {
                                        ou90Var.m(pu90Var4, i312, i311 - pu90Var4.b, 0.0f);
                                        i312 += pu90Var4.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG0, "GAME_CONTENT_ID") || Intrinsics.d(objG0, "POINTS_CONTENT_ID")) {
                                            ou90Var.m(pu90Var4, i312, 0, 0.0f);
                                            i312 += pu90Var4.f27604a;
                                        } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                            ou90Var.m(pu90Var4, i310 - pu90Var4.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var.m(pu90Var3, i312, 0, 0.0f);
                                }
                                break;
                            case 1:
                                ou90 ou90Var2 = (ou90) obj18;
                                ou90Var2.getClass();
                                int size8 = arrayList13.size();
                                int i314 = 0;
                                for (int i315 = 0; i315 < size8; i315++) {
                                    pu90 pu90Var5 = (pu90) arrayList13.get(i315);
                                    Object objN2 = pu90Var5.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                                    if (Intrinsics.d(objG1, "INNING_CONTENT_ID")) {
                                        ou90Var2.m(pu90Var5, i314, i311 - pu90Var5.b, 0.0f);
                                        i314 += pu90Var5.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG1, "GAME_CONTENT_ID") || Intrinsics.d(objG1, "POINTS_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var5, i314, 0, 0.0f);
                                            i314 += pu90Var5.f27604a;
                                        } else if (Intrinsics.d(objG1, "TOTAL_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var5, i310 - pu90Var5.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var2.m(pu90Var3, i314, 0, 0.0f);
                                }
                                break;
                            case 2:
                                ou90 ou90Var3 = (ou90) obj18;
                                ou90Var3.getClass();
                                int size9 = arrayList13.size();
                                int i316 = 0;
                                for (int i317 = 0; i317 < size9; i317++) {
                                    pu90 pu90Var6 = (pu90) arrayList13.get(i317);
                                    Object objN3 = pu90Var6.n();
                                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                                    if (Intrinsics.d(objG2, "INNING_CONTENT_ID")) {
                                        ou90Var3.m(pu90Var6, i316, i311 - pu90Var6.b, 0.0f);
                                        i316 += pu90Var6.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG2, "GAME_CONTENT_ID") || Intrinsics.d(objG2, "POINTS_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var6, i316, 0, 0.0f);
                                            i316 += pu90Var6.f27604a;
                                        } else if (Intrinsics.d(objG2, "TOTAL_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var6, i310 - pu90Var6.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var3.m(pu90Var3, i316, 0, 0.0f);
                                }
                                break;
                            case 3:
                                ou90 ou90Var4 = (ou90) obj18;
                                ou90Var4.getClass();
                                int size10 = arrayList13.size();
                                int i318 = 0;
                                for (int i410 = 0; i410 < size10; i410++) {
                                    pu90 pu90Var7 = (pu90) arrayList13.get(i410);
                                    Object objN4 = pu90Var7.n();
                                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                                    if (Intrinsics.d(objG3, "INNING_CONTENT_ID")) {
                                        ou90Var4.m(pu90Var7, i318, i311 - pu90Var7.b, 0.0f);
                                        i318 += pu90Var7.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG3, "GAME_CONTENT_ID") || Intrinsics.d(objG3, "POINTS_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var7, i318, 0, 0.0f);
                                            i318 += pu90Var7.f27604a;
                                        } else if (Intrinsics.d(objG3, "TOTAL_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var7, i310 - pu90Var7.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var4.m(pu90Var3, i318, 0, 0.0f);
                                }
                                break;
                            case 4:
                                ou90 ou90Var5 = (ou90) obj18;
                                ou90Var5.getClass();
                                int size11 = arrayList13.size();
                                int i411 = 0;
                                for (int i412 = 0; i412 < size11; i412++) {
                                    pu90 pu90Var8 = (pu90) arrayList13.get(i412);
                                    Object objN5 = pu90Var8.n();
                                    p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                                    Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                                    if (Intrinsics.d(objG4, "INNING_CONTENT_ID")) {
                                        ou90Var5.m(pu90Var8, i411, i311 - pu90Var8.b, 0.0f);
                                        i411 += pu90Var8.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG4, "GAME_CONTENT_ID") || Intrinsics.d(objG4, "POINTS_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var8, i411, 0, 0.0f);
                                            i411 += pu90Var8.f27604a;
                                        } else if (Intrinsics.d(objG4, "TOTAL_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var8, i310 - pu90Var8.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var5.m(pu90Var3, i411, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90 ou90Var6 = (ou90) obj18;
                                ou90Var6.getClass();
                                int size12 = arrayList13.size();
                                int i413 = 0;
                                for (int i414 = 0; i414 < size12; i414++) {
                                    pu90 pu90Var9 = (pu90) arrayList13.get(i414);
                                    Object objN6 = pu90Var9.n();
                                    p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                                    Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                                    if (Intrinsics.d(objG5, "INNING_CONTENT_ID")) {
                                        ou90Var6.m(pu90Var9, i413, i311 - pu90Var9.b, 0.0f);
                                        i413 += pu90Var9.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG5, "GAME_CONTENT_ID") || Intrinsics.d(objG5, "POINTS_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var9, i413, 0, 0.0f);
                                            i413 += pu90Var9.f27604a;
                                        } else if (Intrinsics.d(objG5, "TOTAL_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var9, i310 - pu90Var9.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var6.m(pu90Var3, i413, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 3:
                Object obj18 = "INNING_CONTENT_ID";
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new f8l0((byte) 9));
                }
                int iT4 = vj30Var.T(f);
                int i50 = p4e.i(j);
                ArrayList arrayList13 = new ArrayList();
                int size7 = list.size();
                int i51 = 0;
                while (i51 < size7) {
                    pj30 pj30Var7 = (pj30) list.get(i51);
                    Object objI3 = mrv.i0(pj30Var7);
                    Object obj19 = obj18;
                    if (Intrinsics.d(objI3, obj19)) {
                        int i52 = p4e.i(j);
                        if (iT4 <= i52) {
                            i52 = iT4;
                        }
                        pz40 pz40Var14 = pz40Var7;
                        arrayList4 = arrayList13;
                        pz40Var4 = pz40Var14;
                        i11 = iT4;
                        i12 = i50;
                        obj8 = obj19;
                        i14 = i51;
                        i13 = size7;
                        arrayList4.add(pj30Var7.S(p4e.b(j, i52, 0, 0, 0, 14)));
                    } else {
                        i11 = iT4;
                        i12 = i50;
                        i13 = size7;
                        i14 = i51;
                        obj8 = obj19;
                        pz40Var4 = pz40Var7;
                        arrayList4 = arrayList13;
                        if (Intrinsics.d(objI3, "GAME_CONTENT_ID") || Intrinsics.d(objI3, "POINTS_CONTENT_ID") || Intrinsics.d(objI3, "TOTAL_CONTENT_ID")) {
                            arrayList4.add(pj30Var7.S(j));
                        }
                    }
                    i51 = i14 + 1;
                    iT4 = i11;
                    arrayList13 = arrayList4;
                    pz40Var7 = pz40Var4;
                    size7 = i13;
                    i50 = i12;
                    obj18 = obj8;
                }
                int i53 = i50;
                pz40 pz40Var15 = pz40Var7;
                final ArrayList arrayList14 = arrayList13;
                Iterator it10 = arrayList14.iterator();
                int i54 = 0;
                while (it10.hasNext()) {
                    i54 += ((pu90) it10.next()).f27604a;
                }
                int i55 = i53 - i54;
                int size8 = list.size();
                int i56 = 0;
                while (true) {
                    if (i56 < size8) {
                        obj7 = list.get(i56);
                        if (!Intrinsics.d(mrv.i0((pj30) obj7), "PERIOD_CONTENT_ID")) {
                            i56++;
                        }
                    } else {
                        obj7 = null;
                    }
                }
                pj30 pj30Var8 = (pj30) obj7;
                final pu90 pu90VarS4 = pj30Var8 != null ? pj30Var8.S(p4e.b(j, 0, i55, 0, 0, 13)) : null;
                pz40Var8.setValue(pu90VarS4 != null ? new ycl(vj30Var.r0(pu90VarS4.f27604a)) : null);
                Iterator it11 = arrayList14.iterator();
                if (!it11.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i57 = ((pu90) it11.next()).b;
                while (it11.hasNext()) {
                    int i58 = ((pu90) it11.next()).b;
                    if (i57 < i58) {
                        i57 = i58;
                    }
                }
                final int iMax4 = Math.max(i57, pu90VarS4 != null ? pu90VarS4.b : 0);
                Iterator it12 = arrayList14.iterator();
                int i59 = 0;
                while (it12.hasNext()) {
                    i59 += ((pu90) it12.next()).f27604a;
                }
                final int iMin4 = Math.min(i53, i59 + (pu90VarS4 != null ? pu90VarS4.f27604a : 0));
                pz40Var15.setValue(new ycl(vj30Var.r0(iMax4)));
                final byte b5 = 3;
                return vj30.x(vj30Var, iMin4, iMax4, new Function1() { // from class: a.vtl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        byte b6 = b5;
                        int i310 = iMin4;
                        int i311 = iMax4;
                        pu90 pu90Var3 = pu90VarS4;
                        ArrayList arrayList15 = arrayList14;
                        switch (b6) {
                            case 0:
                                ou90 ou90Var = (ou90) obj110;
                                ou90Var.getClass();
                                int size9 = arrayList15.size();
                                int i312 = 0;
                                for (int i313 = 0; i313 < size9; i313++) {
                                    pu90 pu90Var4 = (pu90) arrayList15.get(i313);
                                    Object objN = pu90Var4.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "INNING_CONTENT_ID")) {
                                        ou90Var.m(pu90Var4, i312, i311 - pu90Var4.b, 0.0f);
                                        i312 += pu90Var4.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG0, "GAME_CONTENT_ID") || Intrinsics.d(objG0, "POINTS_CONTENT_ID")) {
                                            ou90Var.m(pu90Var4, i312, 0, 0.0f);
                                            i312 += pu90Var4.f27604a;
                                        } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                            ou90Var.m(pu90Var4, i310 - pu90Var4.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var.m(pu90Var3, i312, 0, 0.0f);
                                }
                                break;
                            case 1:
                                ou90 ou90Var2 = (ou90) obj110;
                                ou90Var2.getClass();
                                int size10 = arrayList15.size();
                                int i314 = 0;
                                for (int i315 = 0; i315 < size10; i315++) {
                                    pu90 pu90Var5 = (pu90) arrayList15.get(i315);
                                    Object objN2 = pu90Var5.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                                    if (Intrinsics.d(objG1, "INNING_CONTENT_ID")) {
                                        ou90Var2.m(pu90Var5, i314, i311 - pu90Var5.b, 0.0f);
                                        i314 += pu90Var5.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG1, "GAME_CONTENT_ID") || Intrinsics.d(objG1, "POINTS_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var5, i314, 0, 0.0f);
                                            i314 += pu90Var5.f27604a;
                                        } else if (Intrinsics.d(objG1, "TOTAL_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var5, i310 - pu90Var5.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var2.m(pu90Var3, i314, 0, 0.0f);
                                }
                                break;
                            case 2:
                                ou90 ou90Var3 = (ou90) obj110;
                                ou90Var3.getClass();
                                int size11 = arrayList15.size();
                                int i316 = 0;
                                for (int i317 = 0; i317 < size11; i317++) {
                                    pu90 pu90Var6 = (pu90) arrayList15.get(i317);
                                    Object objN3 = pu90Var6.n();
                                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                                    if (Intrinsics.d(objG2, "INNING_CONTENT_ID")) {
                                        ou90Var3.m(pu90Var6, i316, i311 - pu90Var6.b, 0.0f);
                                        i316 += pu90Var6.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG2, "GAME_CONTENT_ID") || Intrinsics.d(objG2, "POINTS_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var6, i316, 0, 0.0f);
                                            i316 += pu90Var6.f27604a;
                                        } else if (Intrinsics.d(objG2, "TOTAL_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var6, i310 - pu90Var6.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var3.m(pu90Var3, i316, 0, 0.0f);
                                }
                                break;
                            case 3:
                                ou90 ou90Var4 = (ou90) obj110;
                                ou90Var4.getClass();
                                int size12 = arrayList15.size();
                                int i318 = 0;
                                for (int i410 = 0; i410 < size12; i410++) {
                                    pu90 pu90Var7 = (pu90) arrayList15.get(i410);
                                    Object objN4 = pu90Var7.n();
                                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                                    if (Intrinsics.d(objG3, "INNING_CONTENT_ID")) {
                                        ou90Var4.m(pu90Var7, i318, i311 - pu90Var7.b, 0.0f);
                                        i318 += pu90Var7.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG3, "GAME_CONTENT_ID") || Intrinsics.d(objG3, "POINTS_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var7, i318, 0, 0.0f);
                                            i318 += pu90Var7.f27604a;
                                        } else if (Intrinsics.d(objG3, "TOTAL_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var7, i310 - pu90Var7.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var4.m(pu90Var3, i318, 0, 0.0f);
                                }
                                break;
                            case 4:
                                ou90 ou90Var5 = (ou90) obj110;
                                ou90Var5.getClass();
                                int size13 = arrayList15.size();
                                int i411 = 0;
                                for (int i412 = 0; i412 < size13; i412++) {
                                    pu90 pu90Var8 = (pu90) arrayList15.get(i412);
                                    Object objN5 = pu90Var8.n();
                                    p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                                    Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                                    if (Intrinsics.d(objG4, "INNING_CONTENT_ID")) {
                                        ou90Var5.m(pu90Var8, i411, i311 - pu90Var8.b, 0.0f);
                                        i411 += pu90Var8.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG4, "GAME_CONTENT_ID") || Intrinsics.d(objG4, "POINTS_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var8, i411, 0, 0.0f);
                                            i411 += pu90Var8.f27604a;
                                        } else if (Intrinsics.d(objG4, "TOTAL_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var8, i310 - pu90Var8.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var5.m(pu90Var3, i411, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90 ou90Var6 = (ou90) obj110;
                                ou90Var6.getClass();
                                int size14 = arrayList15.size();
                                int i413 = 0;
                                for (int i414 = 0; i414 < size14; i414++) {
                                    pu90 pu90Var9 = (pu90) arrayList15.get(i414);
                                    Object objN6 = pu90Var9.n();
                                    p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                                    Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                                    if (Intrinsics.d(objG5, "INNING_CONTENT_ID")) {
                                        ou90Var6.m(pu90Var9, i413, i311 - pu90Var9.b, 0.0f);
                                        i413 += pu90Var9.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG5, "GAME_CONTENT_ID") || Intrinsics.d(objG5, "POINTS_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var9, i413, 0, 0.0f);
                                            i413 += pu90Var9.f27604a;
                                        } else if (Intrinsics.d(objG5, "TOTAL_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var9, i310 - pu90Var9.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var3 != null) {
                                    ou90Var6.m(pu90Var3, i413, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 4:
                Object obj20 = "INNING_CONTENT_ID";
                pz40 pz40Var16 = pz40Var7;
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new f8l0((byte) 10));
                }
                int iT5 = vj30Var.T(f);
                int i60 = p4e.i(j);
                ArrayList arrayList15 = new ArrayList();
                int size9 = list.size();
                int i61 = 0;
                while (i61 < size9) {
                    pj30 pj30Var9 = (pj30) list.get(i61);
                    Object objI4 = mrv.i0(pj30Var9);
                    Object obj21 = obj20;
                    if (Intrinsics.d(objI4, obj21)) {
                        int i62 = p4e.i(j);
                        if (iT5 <= i62) {
                            i62 = iT5;
                        }
                        i17 = i61;
                        i16 = size9;
                        i15 = iT5;
                        pz40Var5 = pz40Var16;
                        arrayList5 = arrayList15;
                        obj10 = obj21;
                        i18 = i60;
                        arrayList5.add(pj30Var9.S(p4e.b(j, i62, 0, 0, 0, 14)));
                    } else {
                        i15 = iT5;
                        pz40Var5 = pz40Var16;
                        i16 = size9;
                        i17 = i61;
                        obj10 = obj21;
                        arrayList5 = arrayList15;
                        i18 = i60;
                        if (Intrinsics.d(objI4, "GAME_CONTENT_ID") || Intrinsics.d(objI4, "POINTS_CONTENT_ID") || Intrinsics.d(objI4, "TOTAL_CONTENT_ID")) {
                            arrayList5.add(pj30Var9.S(j));
                        }
                    }
                    i61 = i17 + 1;
                    size9 = i16;
                    i60 = i18;
                    pz40Var16 = pz40Var5;
                    obj20 = obj10;
                    arrayList15 = arrayList5;
                    iT5 = i15;
                }
                pz40 pz40Var17 = pz40Var16;
                final ArrayList arrayList16 = arrayList15;
                int i63 = i60;
                Iterator it13 = arrayList16.iterator();
                int i64 = 0;
                while (it13.hasNext()) {
                    i64 += ((pu90) it13.next()).f27604a;
                }
                int i65 = i63 - i64;
                int size10 = list.size();
                int i66 = 0;
                while (true) {
                    if (i66 < size10) {
                        obj9 = list.get(i66);
                        if (!Intrinsics.d(mrv.i0((pj30) obj9), "PERIOD_CONTENT_ID")) {
                            i66++;
                        }
                    } else {
                        obj9 = null;
                    }
                }
                pj30 pj30Var10 = (pj30) obj9;
                pu90 pu90VarS5 = pj30Var10 != null ? pj30Var10.S(p4e.b(j, 0, i65, 0, 0, 13)) : null;
                pz40Var8.setValue(pu90VarS5 != null ? new ycl(vj30Var.r0(pu90VarS5.f27604a)) : null);
                Iterator it14 = arrayList16.iterator();
                if (!it14.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i67 = ((pu90) it14.next()).b;
                while (it14.hasNext()) {
                    int i68 = ((pu90) it14.next()).b;
                    if (i67 < i68) {
                        i67 = i68;
                    }
                }
                final int iMax5 = Math.max(i67, pu90VarS5 != null ? pu90VarS5.b : 0);
                Iterator it15 = arrayList16.iterator();
                int i69 = 0;
                while (it15.hasNext()) {
                    i69 += ((pu90) it15.next()).f27604a;
                }
                final int iMin5 = Math.min(i63, i69 + (pu90VarS5 != null ? pu90VarS5.f27604a : 0));
                pz40Var17.setValue(new ycl(vj30Var.r0(iMax5)));
                final byte b6 = 4;
                final pu90 pu90Var3 = pu90VarS5;
                return vj30.x(vj30Var, iMin5, iMax5, new Function1() { // from class: a.vtl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        byte b7 = b6;
                        int i310 = iMin5;
                        int i311 = iMax5;
                        pu90 pu90Var4 = pu90Var3;
                        ArrayList arrayList17 = arrayList16;
                        switch (b7) {
                            case 0:
                                ou90 ou90Var = (ou90) obj110;
                                ou90Var.getClass();
                                int size11 = arrayList17.size();
                                int i312 = 0;
                                for (int i313 = 0; i313 < size11; i313++) {
                                    pu90 pu90Var5 = (pu90) arrayList17.get(i313);
                                    Object objN = pu90Var5.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "INNING_CONTENT_ID")) {
                                        ou90Var.m(pu90Var5, i312, i311 - pu90Var5.b, 0.0f);
                                        i312 += pu90Var5.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG0, "GAME_CONTENT_ID") || Intrinsics.d(objG0, "POINTS_CONTENT_ID")) {
                                            ou90Var.m(pu90Var5, i312, 0, 0.0f);
                                            i312 += pu90Var5.f27604a;
                                        } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                            ou90Var.m(pu90Var5, i310 - pu90Var5.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var4 != null) {
                                    ou90Var.m(pu90Var4, i312, 0, 0.0f);
                                }
                                break;
                            case 1:
                                ou90 ou90Var2 = (ou90) obj110;
                                ou90Var2.getClass();
                                int size12 = arrayList17.size();
                                int i314 = 0;
                                for (int i315 = 0; i315 < size12; i315++) {
                                    pu90 pu90Var6 = (pu90) arrayList17.get(i315);
                                    Object objN2 = pu90Var6.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                                    if (Intrinsics.d(objG1, "INNING_CONTENT_ID")) {
                                        ou90Var2.m(pu90Var6, i314, i311 - pu90Var6.b, 0.0f);
                                        i314 += pu90Var6.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG1, "GAME_CONTENT_ID") || Intrinsics.d(objG1, "POINTS_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var6, i314, 0, 0.0f);
                                            i314 += pu90Var6.f27604a;
                                        } else if (Intrinsics.d(objG1, "TOTAL_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var6, i310 - pu90Var6.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var4 != null) {
                                    ou90Var2.m(pu90Var4, i314, 0, 0.0f);
                                }
                                break;
                            case 2:
                                ou90 ou90Var3 = (ou90) obj110;
                                ou90Var3.getClass();
                                int size13 = arrayList17.size();
                                int i316 = 0;
                                for (int i317 = 0; i317 < size13; i317++) {
                                    pu90 pu90Var7 = (pu90) arrayList17.get(i317);
                                    Object objN3 = pu90Var7.n();
                                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                                    if (Intrinsics.d(objG2, "INNING_CONTENT_ID")) {
                                        ou90Var3.m(pu90Var7, i316, i311 - pu90Var7.b, 0.0f);
                                        i316 += pu90Var7.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG2, "GAME_CONTENT_ID") || Intrinsics.d(objG2, "POINTS_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var7, i316, 0, 0.0f);
                                            i316 += pu90Var7.f27604a;
                                        } else if (Intrinsics.d(objG2, "TOTAL_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var7, i310 - pu90Var7.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var4 != null) {
                                    ou90Var3.m(pu90Var4, i316, 0, 0.0f);
                                }
                                break;
                            case 3:
                                ou90 ou90Var4 = (ou90) obj110;
                                ou90Var4.getClass();
                                int size14 = arrayList17.size();
                                int i318 = 0;
                                for (int i410 = 0; i410 < size14; i410++) {
                                    pu90 pu90Var8 = (pu90) arrayList17.get(i410);
                                    Object objN4 = pu90Var8.n();
                                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                                    if (Intrinsics.d(objG3, "INNING_CONTENT_ID")) {
                                        ou90Var4.m(pu90Var8, i318, i311 - pu90Var8.b, 0.0f);
                                        i318 += pu90Var8.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG3, "GAME_CONTENT_ID") || Intrinsics.d(objG3, "POINTS_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var8, i318, 0, 0.0f);
                                            i318 += pu90Var8.f27604a;
                                        } else if (Intrinsics.d(objG3, "TOTAL_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var8, i310 - pu90Var8.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var4 != null) {
                                    ou90Var4.m(pu90Var4, i318, 0, 0.0f);
                                }
                                break;
                            case 4:
                                ou90 ou90Var5 = (ou90) obj110;
                                ou90Var5.getClass();
                                int size15 = arrayList17.size();
                                int i411 = 0;
                                for (int i412 = 0; i412 < size15; i412++) {
                                    pu90 pu90Var9 = (pu90) arrayList17.get(i412);
                                    Object objN5 = pu90Var9.n();
                                    p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                                    Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                                    if (Intrinsics.d(objG4, "INNING_CONTENT_ID")) {
                                        ou90Var5.m(pu90Var9, i411, i311 - pu90Var9.b, 0.0f);
                                        i411 += pu90Var9.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG4, "GAME_CONTENT_ID") || Intrinsics.d(objG4, "POINTS_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var9, i411, 0, 0.0f);
                                            i411 += pu90Var9.f27604a;
                                        } else if (Intrinsics.d(objG4, "TOTAL_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var9, i310 - pu90Var9.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var4 != null) {
                                    ou90Var5.m(pu90Var4, i411, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90 ou90Var6 = (ou90) obj110;
                                ou90Var6.getClass();
                                int size16 = arrayList17.size();
                                int i413 = 0;
                                for (int i414 = 0; i414 < size16; i414++) {
                                    pu90 pu90Var10 = (pu90) arrayList17.get(i414);
                                    Object objN6 = pu90Var10.n();
                                    p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                                    Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                                    if (Intrinsics.d(objG5, "INNING_CONTENT_ID")) {
                                        ou90Var6.m(pu90Var10, i413, i311 - pu90Var10.b, 0.0f);
                                        i413 += pu90Var10.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG5, "GAME_CONTENT_ID") || Intrinsics.d(objG5, "POINTS_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var10, i413, 0, 0.0f);
                                            i413 += pu90Var10.f27604a;
                                        } else if (Intrinsics.d(objG5, "TOTAL_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var10, i310 - pu90Var10.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var4 != null) {
                                    ou90Var6.m(pu90Var4, i413, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new meo0((byte) 6));
                }
                int iT6 = vj30Var.T(f);
                int i70 = p4e.i(j);
                ArrayList arrayList17 = new ArrayList();
                int size11 = list.size();
                int i71 = 0;
                while (i71 < size11) {
                    pj30 pj30Var11 = (pj30) list.get(i71);
                    Object objI5 = mrv.i0(pj30Var11);
                    if (Intrinsics.d(objI5, str2)) {
                        i20 = size11;
                        i21 = i71;
                        i19 = i70;
                        str = str2;
                        pz40Var6 = pz40Var7;
                        arrayList6 = arrayList17;
                        arrayList6.add(pj30Var11.S(p4e.b(j, iT6, 0, 0, 0, 14)));
                    } else {
                        i19 = i70;
                        str = str2;
                        i20 = size11;
                        i21 = i71;
                        pz40Var6 = pz40Var7;
                        arrayList6 = arrayList17;
                        if (Intrinsics.d(objI5, "GAME_CONTENT_ID") || Intrinsics.d(objI5, "POINTS_CONTENT_ID") || Intrinsics.d(objI5, "TOTAL_CONTENT_ID")) {
                            arrayList6.add(pj30Var11.S(j));
                        }
                    }
                    i71 = i21 + 1;
                    i70 = i19;
                    arrayList17 = arrayList6;
                    pz40Var7 = pz40Var6;
                    size11 = i20;
                    str2 = str;
                }
                int i72 = i70;
                pz40 pz40Var18 = pz40Var7;
                final ArrayList arrayList18 = arrayList17;
                Iterator it16 = arrayList18.iterator();
                int i73 = 0;
                while (it16.hasNext()) {
                    i73 += ((pu90) it16.next()).f27604a;
                }
                int i74 = i72 - i73;
                int size12 = list.size();
                int i75 = 0;
                while (true) {
                    if (i75 < size12) {
                        obj11 = list.get(i75);
                        if (!Intrinsics.d(mrv.i0((pj30) obj11), "PERIOD_CONTENT_ID")) {
                            i75++;
                        }
                    } else {
                        obj11 = null;
                    }
                }
                pj30 pj30Var12 = (pj30) obj11;
                pu90 pu90VarS6 = pj30Var12 != null ? pj30Var12.S(p4e.b(j, 0, i74, 0, 0, 13)) : null;
                pz40Var8.setValue(pu90VarS6 != null ? new ycl(vj30Var.r0(pu90VarS6.f27604a)) : null);
                Iterator it17 = arrayList18.iterator();
                if (!it17.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i76 = ((pu90) it17.next()).b;
                while (it17.hasNext()) {
                    int i77 = ((pu90) it17.next()).b;
                    if (i76 < i77) {
                        i76 = i77;
                    }
                }
                final int iMax6 = Math.max(i76, pu90VarS6 != null ? pu90VarS6.b : 0);
                Iterator it18 = arrayList18.iterator();
                int i78 = 0;
                while (it18.hasNext()) {
                    i78 += ((pu90) it18.next()).f27604a;
                }
                final int iMin6 = Math.min(i72, i78 + (pu90VarS6 != null ? pu90VarS6.f27604a : 0));
                pz40Var18.setValue(new ycl(vj30Var.r0(iMax6)));
                final byte b7 = 5;
                final pu90 pu90Var4 = pu90VarS6;
                return vj30.x(vj30Var, iMin6, iMax6, new Function1() { // from class: a.vtl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        byte b8 = b7;
                        int i310 = iMin6;
                        int i311 = iMax6;
                        pu90 pu90Var5 = pu90Var4;
                        ArrayList arrayList19 = arrayList18;
                        switch (b8) {
                            case 0:
                                ou90 ou90Var = (ou90) obj110;
                                ou90Var.getClass();
                                int size13 = arrayList19.size();
                                int i312 = 0;
                                for (int i313 = 0; i313 < size13; i313++) {
                                    pu90 pu90Var6 = (pu90) arrayList19.get(i313);
                                    Object objN = pu90Var6.n();
                                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                                    if (Intrinsics.d(objG0, "INNING_CONTENT_ID")) {
                                        ou90Var.m(pu90Var6, i312, i311 - pu90Var6.b, 0.0f);
                                        i312 += pu90Var6.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG0, "GAME_CONTENT_ID") || Intrinsics.d(objG0, "POINTS_CONTENT_ID")) {
                                            ou90Var.m(pu90Var6, i312, 0, 0.0f);
                                            i312 += pu90Var6.f27604a;
                                        } else if (Intrinsics.d(objG0, "TOTAL_CONTENT_ID")) {
                                            ou90Var.m(pu90Var6, i310 - pu90Var6.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var5 != null) {
                                    ou90Var.m(pu90Var5, i312, 0, 0.0f);
                                }
                                break;
                            case 1:
                                ou90 ou90Var2 = (ou90) obj110;
                                ou90Var2.getClass();
                                int size14 = arrayList19.size();
                                int i314 = 0;
                                for (int i315 = 0; i315 < size14; i315++) {
                                    pu90 pu90Var7 = (pu90) arrayList19.get(i315);
                                    Object objN2 = pu90Var7.n();
                                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                                    if (Intrinsics.d(objG1, "INNING_CONTENT_ID")) {
                                        ou90Var2.m(pu90Var7, i314, i311 - pu90Var7.b, 0.0f);
                                        i314 += pu90Var7.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG1, "GAME_CONTENT_ID") || Intrinsics.d(objG1, "POINTS_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var7, i314, 0, 0.0f);
                                            i314 += pu90Var7.f27604a;
                                        } else if (Intrinsics.d(objG1, "TOTAL_CONTENT_ID")) {
                                            ou90Var2.m(pu90Var7, i310 - pu90Var7.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var5 != null) {
                                    ou90Var2.m(pu90Var5, i314, 0, 0.0f);
                                }
                                break;
                            case 2:
                                ou90 ou90Var3 = (ou90) obj110;
                                ou90Var3.getClass();
                                int size15 = arrayList19.size();
                                int i316 = 0;
                                for (int i317 = 0; i317 < size15; i317++) {
                                    pu90 pu90Var8 = (pu90) arrayList19.get(i317);
                                    Object objN3 = pu90Var8.n();
                                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                                    if (Intrinsics.d(objG2, "INNING_CONTENT_ID")) {
                                        ou90Var3.m(pu90Var8, i316, i311 - pu90Var8.b, 0.0f);
                                        i316 += pu90Var8.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG2, "GAME_CONTENT_ID") || Intrinsics.d(objG2, "POINTS_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var8, i316, 0, 0.0f);
                                            i316 += pu90Var8.f27604a;
                                        } else if (Intrinsics.d(objG2, "TOTAL_CONTENT_ID")) {
                                            ou90Var3.m(pu90Var8, i310 - pu90Var8.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var5 != null) {
                                    ou90Var3.m(pu90Var5, i316, 0, 0.0f);
                                }
                                break;
                            case 3:
                                ou90 ou90Var4 = (ou90) obj110;
                                ou90Var4.getClass();
                                int size16 = arrayList19.size();
                                int i318 = 0;
                                for (int i410 = 0; i410 < size16; i410++) {
                                    pu90 pu90Var9 = (pu90) arrayList19.get(i410);
                                    Object objN4 = pu90Var9.n();
                                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                                    if (Intrinsics.d(objG3, "INNING_CONTENT_ID")) {
                                        ou90Var4.m(pu90Var9, i318, i311 - pu90Var9.b, 0.0f);
                                        i318 += pu90Var9.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG3, "GAME_CONTENT_ID") || Intrinsics.d(objG3, "POINTS_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var9, i318, 0, 0.0f);
                                            i318 += pu90Var9.f27604a;
                                        } else if (Intrinsics.d(objG3, "TOTAL_CONTENT_ID")) {
                                            ou90Var4.m(pu90Var9, i310 - pu90Var9.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var5 != null) {
                                    ou90Var4.m(pu90Var5, i318, 0, 0.0f);
                                }
                                break;
                            case 4:
                                ou90 ou90Var5 = (ou90) obj110;
                                ou90Var5.getClass();
                                int size17 = arrayList19.size();
                                int i411 = 0;
                                for (int i412 = 0; i412 < size17; i412++) {
                                    pu90 pu90Var10 = (pu90) arrayList19.get(i412);
                                    Object objN5 = pu90Var10.n();
                                    p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                                    Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                                    if (Intrinsics.d(objG4, "INNING_CONTENT_ID")) {
                                        ou90Var5.m(pu90Var10, i411, i311 - pu90Var10.b, 0.0f);
                                        i411 += pu90Var10.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG4, "GAME_CONTENT_ID") || Intrinsics.d(objG4, "POINTS_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var10, i411, 0, 0.0f);
                                            i411 += pu90Var10.f27604a;
                                        } else if (Intrinsics.d(objG4, "TOTAL_CONTENT_ID")) {
                                            ou90Var5.m(pu90Var10, i310 - pu90Var10.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var5 != null) {
                                    ou90Var5.m(pu90Var5, i411, 0, 0.0f);
                                }
                                break;
                            default:
                                ou90 ou90Var6 = (ou90) obj110;
                                ou90Var6.getClass();
                                int size18 = arrayList19.size();
                                int i413 = 0;
                                for (int i414 = 0; i414 < size18; i414++) {
                                    pu90 pu90Var11 = (pu90) arrayList19.get(i414);
                                    Object objN6 = pu90Var11.n();
                                    p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                                    Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                                    if (Intrinsics.d(objG5, "INNING_CONTENT_ID")) {
                                        ou90Var6.m(pu90Var11, i413, i311 - pu90Var11.b, 0.0f);
                                        i413 += pu90Var11.f27604a;
                                    } else {
                                        if (Intrinsics.d(objG5, "GAME_CONTENT_ID") || Intrinsics.d(objG5, "POINTS_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var11, i413, 0, 0.0f);
                                            i413 += pu90Var11.f27604a;
                                        } else if (Intrinsics.d(objG5, "TOTAL_CONTENT_ID")) {
                                            ou90Var6.m(pu90Var11, i310 - pu90Var11.f27604a, 0, 0.0f);
                                        }
                                    }
                                }
                                if (pu90Var5 != null) {
                                    ou90Var6.m(pu90Var5, i413, 0, 0.0f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }
}
