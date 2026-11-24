package a;

import android.gov.nist.core.Separators;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yoq implements sv40, lhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow3 f42998a;
    public final sw3 b;
    public final float c;
    public final eef d;
    public final float e;
    public final int f;
    public final int g;
    public final woq h;

    public yoq(ow3 ow3Var, sw3 sw3Var, float f, eef eefVar, float f2, int i, int i2, woq woqVar) {
        this.f42998a = ow3Var;
        this.b = sw3Var;
        this.c = f;
        this.d = eefVar;
        this.e = f2;
        this.f = i;
        this.g = i2;
        this.h = woqVar;
    }

    public static int k(List list, int i, int i2, int i3, int i4, int i5, woq woqVar) {
        long jA = akx.a(0, 0);
        if (!list.isEmpty()) {
            int i6 = Integer.MAX_VALUE;
            sx2 sx2Var = new sx2(i4, woqVar, r4e.a(0, i, 0, Integer.MAX_VALUE), i5, i2, i3);
            pj30 pj30Var = (pj30) CollectionsKt.W(0, list);
            int iD = pj30Var != null ? pj30Var.D(i) : 0;
            int iL = pj30Var != null ? pj30Var.L(iD) : 0;
            int i7 = 0;
            if (sx2Var.b(list.size() > 1, 0, akx.a(i, Integer.MAX_VALUE), pj30Var == null ? null : new akx(akx.a(iL, iD)), 0, 0, 0, false, false).b) {
                woqVar.getClass();
                voq voqVar = voq.f37778a;
                jA = jA;
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < size) {
                    int i14 = i8 - iL;
                    i11++;
                    int iMax = Math.max(i10, iD);
                    pj30 pj30Var2 = (pj30) CollectionsKt.W(i11, list);
                    iD = pj30Var2 != null ? pj30Var2.D(i) : 0;
                    int iL2 = pj30Var2 != null ? pj30Var2.L(iD) + i2 : 0;
                    int i15 = i11 - i13;
                    int i16 = i9;
                    int i17 = iL2;
                    soq soqVarB = sx2Var.b(i11 + 2 < list.size(), i15, akx.a(i14, i6), pj30Var2 == null ? null : new akx(akx.a(iL2, iD)), i16, i7, iMax, false, false);
                    if (soqVarB.f32556a) {
                        int i18 = iMax + i3 + i7;
                        sx2Var.a(soqVarB, pj30Var2 != null, i16, i18, i14, i15);
                        int i19 = i17 - i2;
                        i9 = i16 + 1;
                        if (soqVarB.b) {
                            i12 = i11;
                            i7 = i18;
                            break;
                        }
                        i8 = i;
                        i13 = i11;
                        iL = i19;
                        i7 = i18;
                        i10 = 0;
                    } else {
                        iL = i17;
                        i8 = i14;
                        i9 = i16;
                        i10 = iMax;
                    }
                    i12 = i11;
                    i6 = Integer.MAX_VALUE;
                }
                jA = akx.a(i7 - i3, i12);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // a.sv40
    public final int a(cnx cnxVar, List list, int i) {
        List list2 = (List) CollectionsKt.W(1, list);
        pj30 pj30Var = list2 != null ? (pj30) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.W(2, list);
        this.h.a(pj30Var, list3 != null ? (pj30) CollectionsKt.firstOrNull(list3) : null, r4e.b(0, i, 0, 0, 13));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return k(list4, i, cnxVar.T(this.c), cnxVar.T(this.e), this.f, this.g, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sv40
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pj30 pj30Var;
        pj30 pj30Var2;
        akx akxVar;
        soq soqVar;
        int i;
        int i2;
        char c;
        pj30 pj30Var3;
        akx akxVar2;
        Integer num;
        akx akxVar3;
        soq soqVar2;
        long jA;
        long jA2;
        if (this.g != 0 && this.f != 0 && !((ArrayList) list).isEmpty()) {
            int iH = p4e.h(j);
            woq woqVar = this.h;
            if (iH != 0) {
                List list2 = (List) CollectionsKt.U(list);
                byte b = 14;
                if (list2.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new rnp(b));
                }
                List list3 = (List) CollectionsKt.W(1, list);
                pj30 pj30Var4 = list3 != null ? (pj30) CollectionsKt.firstOrNull(list3) : null;
                List list4 = (List) CollectionsKt.W(2, list);
                pj30 pj30Var5 = list4 != null ? (pj30) CollectionsKt.firstOrNull(list4) : null;
                list2.size();
                woqVar.getClass();
                s7z s7zVar = s7z.f31776a;
                long jW = bww.W(bww.F(10, bww.E(j, s7zVar)));
                if (pj30Var4 != null) {
                    if (vdx.O(vdx.K(pj30Var4)) == 0.0f) {
                        vdx.K(pj30Var4);
                        pu90 pu90VarS = pj30Var4.S(jW);
                        new akx(akx.a(pu90VarS.e0(), pu90VarS.d0()));
                        pu90VarS.e0();
                        pu90VarS.d0();
                    } else {
                        pj30Var4.D(pj30Var4.L(Integer.MAX_VALUE));
                    }
                }
                if (pj30Var5 != null) {
                    if (vdx.O(vdx.K(pj30Var5)) == 0) {
                        vdx.K(pj30Var5);
                        pu90 pu90VarS2 = pj30Var5.S(jW);
                        new akx(akx.a(pu90VarS2.e0(), pu90VarS2.d0()));
                        pu90VarS2.e0();
                        pu90VarS2.d0();
                    } else {
                        pj30Var5.D(pj30Var5.L(Integer.MAX_VALUE));
                    }
                }
                Iterator it = list2.iterator();
                long jE = bww.E(j, s7zVar);
                xz40 xz40Var = new xz40(new uj30[16]);
                int i3 = p4e.i(jE);
                int iK = p4e.k(jE);
                int iH2 = p4e.h(jE);
                ey40 ey40Var = hkx.f13229a;
                ey40 ey40Var2 = new ey40();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(vj30Var.w0(this.c));
                int iCeil2 = (int) Math.ceil(vj30Var.w0(this.e));
                long jA3 = r4e.a(0, i3, 0, iH2);
                long jW2 = bww.W(bww.F(14, jA3));
                mie0 mie0Var = new mie0();
                if (it.hasNext()) {
                    try {
                        pj30Var = (pj30) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        pj30Var = null;
                    }
                    pj30Var2 = pj30Var;
                } else {
                    pj30Var2 = null;
                }
                if (pj30Var2 != null) {
                    if (vdx.O(vdx.K(pj30Var2)) == r12) {
                        vdx.K(pj30Var2);
                        pu90 pu90VarS3 = pj30Var2.S(jW2);
                        mie0Var.f21842a = pu90VarS3;
                        jA2 = akx.a(pu90VarS3.e0(), pu90VarS3.d0());
                    } else {
                        int iL = pj30Var2.L(Integer.MAX_VALUE);
                        jA2 = akx.a(iL, pj30Var2.D(iL));
                    }
                    akxVar = new akx(jA2);
                } else {
                    it = it;
                    iK = iK;
                    akxVar = null;
                }
                Integer numValueOf = akxVar != null ? Integer.valueOf((int) (akxVar.f1044a >> 32)) : null;
                Integer numValueOf2 = akxVar != null ? Integer.valueOf((int) (akxVar.f1044a & 4294967295L)) : null;
                MutableIntList mutableIntList = new MutableIntList();
                pj30 pj30Var6 = pj30Var2;
                MutableIntList mutableIntList2 = new MutableIntList();
                akx akxVar4 = akxVar;
                fy40 fy40Var = new fy40();
                int i4 = this.f;
                Integer num2 = numValueOf2;
                woq woqVar2 = this.h;
                sx2 sx2Var = new sx2(i4, woqVar2, jE, this.g, iCeil, iCeil2);
                soq soqVarB = sx2Var.b(it.hasNext(), 0, akx.a(i3, iH2), akxVar4, 0, 0, 0, false, false);
                if (soqVarB.b) {
                    soqVar = soqVarB;
                    sx2Var.a(soqVar, akxVar4 != null, -1, 0, i3, 0);
                } else {
                    soqVar = soqVarB;
                }
                int i5 = i3;
                Integer num3 = numValueOf;
                soq soqVar3 = soqVar;
                pj30 pj30Var7 = pj30Var6;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = iH2;
                int iMax = iK;
                while (!soqVar3.b && pj30Var7 != null) {
                    num3.getClass();
                    int iIntValue = num3.intValue();
                    num2.getClass();
                    int i13 = i8 + iIntValue;
                    int iMax2 = Math.max(i6, num2.intValue());
                    int i14 = i5 - iIntValue;
                    int i15 = i7 + 1;
                    woqVar2.getClass();
                    arrayList.add(pj30Var7);
                    ey40Var2.j(i7, mie0Var.f21842a);
                    pj30Var7.n();
                    int i16 = i15 - i9;
                    if (it.hasNext()) {
                        try {
                            pj30Var3 = (pj30) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            pj30Var3 = null;
                        }
                    } else {
                        pj30Var3 = null;
                    }
                    mie0Var.f21842a = null;
                    if (pj30Var3 != null) {
                        if (vdx.O(vdx.K(pj30Var3)) == r12) {
                            vdx.K(pj30Var3);
                            pu90 pu90VarS4 = pj30Var3.S(jW2);
                            mie0Var.f21842a = pu90VarS4;
                            jA = akx.a(pu90VarS4.e0(), pu90VarS4.d0());
                        } else {
                            int iL2 = pj30Var3.L(Integer.MAX_VALUE);
                            jA = akx.a(iL2, pj30Var3.D(iL2));
                        }
                        akxVar2 = new akx(jA);
                    } else {
                        arrayList = arrayList;
                        akxVar2 = null;
                    }
                    Integer numValueOf3 = akxVar2 != null ? Integer.valueOf(((int) (akxVar2.f1044a >> 32)) + iCeil) : null;
                    Integer numValueOf4 = akxVar2 != null ? Integer.valueOf((int) (akxVar2.f1044a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i17 = i10;
                    long jA4 = akx.a(i14, i12);
                    if (akxVar2 == null) {
                        num = numValueOf4;
                        akxVar3 = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue2 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        num = numValueOf4;
                        akxVar3 = new akx(akx.a(iIntValue2, num.intValue()));
                    }
                    soq soqVarB2 = sx2Var.b(zHasNext, i16, jA4, akxVar3, i17, i11, iMax2, false, false);
                    if (soqVarB2.f32556a) {
                        int iMin = Math.min(Math.max(iMax, i13), i3);
                        int i18 = i11 + iMax2;
                        soqVar2 = soqVarB2;
                        sx2Var.a(soqVar2, akxVar2 != null, i17, i18, i14, i16);
                        mutableIntList2.a(iMax2);
                        i12 = (iH2 - i18) - iCeil2;
                        mutableIntList.a(i15);
                        i10 = i17 + 1;
                        i11 = i18 + iCeil2;
                        i14 = i3;
                        numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - iCeil) : null;
                        i9 = i15;
                        i6 = 0;
                        iMax = iMin;
                        i13 = 0;
                    } else {
                        soqVar2 = soqVarB2;
                        i6 = iMax2;
                        i10 = i17;
                    }
                    i7 = i15;
                    arrayList = arrayList;
                    pj30Var7 = pj30Var3;
                    num3 = numValueOf3;
                    i5 = i14;
                    i8 = i13;
                    soqVar3 = soqVar2;
                    num2 = num;
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                pu90[] pu90VarArr = new pu90[size];
                for (int i19 = 0; i19 < size; i19++) {
                    pu90VarArr[i19] = ey40Var2.b(i19);
                }
                int i20 = mutableIntList.b;
                int[] iArr = new int[i20];
                int[] iArr2 = new int[i20];
                int[] iArr3 = mutableIntList.f45342a;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i22 < i20) {
                    int i24 = iArr3[i22];
                    int iC = mutableIntList2.c(i22);
                    if (fy40Var.c(i22)) {
                        c = 65535;
                    } else {
                        c = 65535;
                        iC = p4e.h(jA3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : p4e.h(jA3) - i23;
                    }
                    fy40 fy40Var2 = fy40Var;
                    int i25 = iMax;
                    ArrayList arrayList3 = arrayList2;
                    uj30 uj30VarB0 = wdx.b0(this, i25, p4e.j(jA3), p4e.i(jA3), iC, iCeil, vj30Var, arrayList3, pu90VarArr, i21, i24, iArr, i22);
                    int iJ = uj30VarB0.j();
                    int iF = uj30VarB0.f();
                    iArr2[i22] = iF;
                    i23 += iF;
                    iMax = Math.max(i25, iJ);
                    xz40Var.b(uj30VarB0);
                    i22++;
                    i21 = i24;
                    fy40Var = fy40Var2;
                    iArr3 = iArr3;
                    arrayList2 = arrayList3;
                }
                int i26 = iMax;
                if (xz40Var.c == 0) {
                    i2 = 0;
                    i = 0;
                } else {
                    i = i26;
                    i2 = i23;
                }
                sw3 sw3Var = this.b;
                int iB = twn.b(xz40Var.c, 1, vj30Var.T(sw3Var.a()), i2);
                int iJ2 = p4e.j(jE);
                int iH3 = p4e.h(jE);
                if (iB < iJ2) {
                    iB = iJ2;
                }
                if (iB <= iH3) {
                    iH3 = iB;
                }
                sw3Var.c(vj30Var, iH3, iArr2, iArr);
                int iK2 = p4e.k(jE);
                int i27 = p4e.i(jE);
                if (i < iK2) {
                    i = iK2;
                }
                if (i <= i27) {
                    i27 = i;
                }
                return vj30.x(vj30Var, i27, iH3, new g7p((Object) xz40Var, (byte) 9));
            }
            woqVar.getClass();
            voq voqVar = voq.f37778a;
            voq voqVar2 = voq.f37778a;
        }
        return vj30.x(vj30Var, 0, 0, new rnp((byte) 13));
    }

    @Override // a.sv40
    public final int c(cnx cnxVar, List list, int i) {
        List list2 = (List) CollectionsKt.W(1, list);
        pj30 pj30Var = list2 != null ? (pj30) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.W(2, list);
        this.h.a(pj30Var, list3 != null ? (pj30) CollectionsKt.firstOrNull(list3) : null, r4e.b(0, i, 0, 0, 13));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return k(list4, i, cnxVar.T(this.c), cnxVar.T(this.e), this.f, this.g, this.h);
    }

    @Override // a.sv40
    public final int d(cnx cnxVar, List list, int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        woq woqVar;
        int[] iArr2;
        List list2;
        long jA;
        int i5 = i;
        List list3 = (List) CollectionsKt.W(1, list);
        pj30 pj30Var = list3 != null ? (pj30) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.W(2, list);
        int i6 = 0;
        this.h.a(pj30Var, list4 != null ? (pj30) CollectionsKt.firstOrNull(list4) : null, r4e.b(0, 0, 0, i5, 7));
        List list5 = (List) CollectionsKt.firstOrNull(list);
        if (list5 == null) {
            list5 = iun.f15405a;
        }
        int iT = cnxVar.T(this.c);
        int iT2 = cnxVar.T(this.e);
        long jA2 = akx.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr3 = new int[size];
        int size2 = list5.size();
        int[] iArr4 = new int[size2];
        int size3 = list5.size();
        for (int i7 = 0; i7 < size3; i7++) {
            pj30 pj30Var2 = (pj30) list5.get(i7);
            int iL = pj30Var2.L(i5);
            iArr3[i7] = iL;
            iArr4[i7] = pj30Var2.D(iL);
        }
        int i8 = this.g;
        int[] iArr5 = iArr4;
        int i9 = this.f;
        int i10 = (i8 == Integer.MAX_VALUE || i9 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i9 * i8;
        int size4 = list5.size();
        woq woqVar2 = this.h;
        if (i10 < size4) {
            woqVar2.getClass();
            voq voqVar = voq.f37778a;
        }
        if (i10 >= list5.size()) {
            woqVar2.getClass();
            if (i8 >= 0) {
                voq voqVar2 = voq.f37778a;
            }
        }
        int iMin = Math.min(i10, list5.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr3[i12];
        }
        int size5 = ((list5.size() - 1) * iT) + i11;
        if (size2 == 0) {
            itt0.a();
            return 0;
        }
        int i13 = iArr5[0];
        int i14 = size2 - 1;
        if (1 <= i14) {
            int i15 = 1;
            i2 = 1;
            int i16 = i13;
            while (true) {
                int i17 = iArr5[i15];
                if (i16 < i17) {
                    i16 = i17;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
            i13 = i16;
        } else {
            i2 = 1;
        }
        if (size == 0) {
            itt0.a();
            return 0;
        }
        int i18 = iArr3[i6];
        int i19 = size - 1;
        if (i2 <= i19) {
            int i20 = 1;
            while (true) {
                int i21 = iArr3[i20];
                if (i18 < i21) {
                    i18 = i21;
                }
                if (i20 == i19) {
                    break;
                }
                i20++;
            }
        }
        int i22 = size5;
        int i23 = i13;
        while (i18 <= i22 && i23 != i5) {
            int i24 = (i18 + i22) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                i3 = i18;
                iArr2 = iArr3;
                i4 = i8;
                jA = jA2;
                iArr = iArr5;
                woqVar = woqVar2;
            } else {
                int i25 = i6;
                i3 = i18;
                i4 = i8;
                iArr = iArr5;
                woqVar = woqVar2;
                sx2 sx2Var = new sx2(i9, woqVar, r4e.a(i25, i24, i25, Integer.MAX_VALUE), i4, iT, iT2);
                pj30 pj30Var3 = (pj30) CollectionsKt.W(i25, list5);
                int i26 = pj30Var3 != null ? iArr[i25] : i25;
                int i27 = pj30Var3 != null ? iArr3[i25] : 0;
                int[] iArr6 = iArr3;
                int i28 = 0;
                int i29 = 0;
                if (sx2Var.b(list5.size() > 1, 0, akx.a(i24, Integer.MAX_VALUE), pj30Var3 == null ? null : new akx(akx.a(i27, i26)), 0, 0, 0, false, false).b) {
                    woqVar.getClass();
                    voq voqVar3 = voq.f37778a;
                    iArr2 = iArr6;
                    list2 = list5;
                    jA = jA2;
                } else {
                    int size6 = list5.size();
                    iArr2 = iArr6;
                    int i30 = i24;
                    int i31 = i27;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = i26;
                    int i36 = 0;
                    while (true) {
                        if (i34 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i37 = i30 - i31;
                        int i38 = size6;
                        int i39 = i34 + 1;
                        int iMax = Math.max(i32, i35);
                        pj30 pj30Var4 = (pj30) CollectionsKt.W(i39, list5);
                        i35 = pj30Var4 != null ? iArr[i39] : 0;
                        int i40 = pj30Var4 != null ? iArr2[i39] + iT : 0;
                        list2 = list5;
                        int i41 = i39 - i33;
                        soq soqVarB = sx2Var.b(i34 + 2 < list2.size(), i41, akx.a(i37, Integer.MAX_VALUE), pj30Var4 == 0 ? null : new akx(akx.a(i40, i35)), i28, i29, iMax, false, false);
                        if (soqVarB.f32556a) {
                            int i42 = iMax + iT2 + i29;
                            int i43 = i28;
                            sx2Var.a(soqVarB, pj30Var4 != null, i43, i42, i37, i41);
                            int i44 = i40 - iT;
                            i28 = i43 + 1;
                            if (soqVarB.b) {
                                i36 = i39;
                                i29 = i42;
                                break;
                            }
                            i31 = i44;
                            i33 = i39;
                            i30 = i24;
                            i29 = i42;
                            i32 = 0;
                        } else {
                            i31 = i40;
                            i30 = i37;
                            i32 = iMax;
                        }
                        i34 = i39;
                        i36 = i34;
                        size6 = i38;
                        list5 = list2;
                    }
                    jA = akx.a(i29 - iT2, i36);
                }
            }
            int i45 = (int) (jA >> 32);
            int i46 = (int) (jA & 4294967295L);
            i5 = i;
            if (i45 > i5 || i46 < iMin) {
                i18 = i24 + 1;
                if (i18 > i22) {
                    return i18;
                }
            } else {
                if (i45 >= i5) {
                    return i24;
                }
                i22 = i24 - 1;
                i18 = i3;
            }
            iArr3 = iArr2;
            size5 = i24;
            list5 = list2;
            i6 = 0;
            i23 = i45;
            woqVar2 = woqVar;
            iArr5 = iArr;
            i8 = i4;
        }
        return size5;
    }

    @Override // a.sv40
    public final int e(cnx cnxVar, List list, int i) {
        List list2 = (List) CollectionsKt.W(1, list);
        pj30 pj30Var = list2 != null ? (pj30) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.W(2, list);
        this.h.a(pj30Var, list3 != null ? (pj30) CollectionsKt.firstOrNull(list3) : null, r4e.b(0, 0, 0, i, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        int iT = cnxVar.T(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iP = ((pj30) list4.get(i2)).P(i) + iT;
            int i5 = i2 + 1;
            if (i5 - i3 == this.f || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iP) - iT);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iP;
            }
            i2 = i5;
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoq)) {
            return false;
        }
        yoq yoqVar = (yoq) obj;
        return this.f42998a.equals(yoqVar.f42998a) && this.b.equals(yoqVar.b) && ycl.b(this.c, yoqVar.c) && this.d.equals(yoqVar.d) && ycl.b(this.e, yoqVar.e) && this.f == yoqVar.f && this.g == yoqVar.g && Intrinsics.d(this.h, yoqVar.h);
    }

    @Override // a.lhg0
    public final int f(pu90 pu90Var) {
        return pu90Var.e0();
    }

    @Override // a.lhg0
    public final void g(int i, int[] iArr, int[] iArr2, vj30 vj30Var) {
        this.f42998a.b(vj30Var, i, iArr, vj30Var.getLayoutDirection(), iArr2);
    }

    @Override // a.lhg0
    public final uj30 h(pu90[] pu90VarArr, vj30 vj30Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return vj30.x(vj30Var, i2, i3, new y2i(iArr2, i4, i5, i6, pu90VarArr, this, i3, k6z.f17794a, i, iArr));
    }

    public final int hashCode() {
        return this.h.hashCode() + twn.a(this.g, twn.a(this.f, defpackage.c.a((this.d.f7670a.hashCode() + defpackage.c.a((this.b.hashCode() + ((this.f42998a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    @Override // a.lhg0
    public final long i(int i, int i2, int i3, boolean z) {
        thg0 thg0Var = shg0.f32210a;
        return !z ? r4e.a(i, i2, 0, i3) : lgb.O(i, i2, 0, i3);
    }

    @Override // a.lhg0
    public final int j(pu90 pu90Var) {
        return pu90Var.d0();
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        String strC2 = ycl.c(this.e);
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.f42998a);
        sb.append(", verticalArrangement=");
        sb.append(this.b);
        sb.append(", mainAxisSpacing=");
        sb.append(strC);
        sb.append(", crossAxisAlignment=");
        sb.append(this.d);
        sb.append(", crossAxisArrangementSpacing=");
        twn.w(this.f, strC2, ", maxItemsInMainAxis=", ", maxLines=", sb);
        sb.append(this.g);
        sb.append(", overflow=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
