package a;

import android.os.Trace;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class lcz implements ibz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xcz f19822a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hh80 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ sw3 f;
    public final /* synthetic */ ow3 g;
    public final /* synthetic */ vne h;
    public final /* synthetic */ afv i;
    public final /* synthetic */ g9m0 j;
    public final /* synthetic */ xx7 k;
    public final /* synthetic */ yx7 l;

    public lcz(xcz xczVar, boolean z, hh80 hh80Var, boolean z2, eiy eiyVar, sw3 sw3Var, ow3 ow3Var, vne vneVar, afv afvVar, g9m0 g9m0Var, xx7 xx7Var, yx7 yx7Var) {
        this.f19822a = xczVar;
        this.b = z;
        this.c = hh80Var;
        this.d = z2;
        this.e = eiyVar;
        this.f = sw3Var;
        this.g = ow3Var;
        this.h = vneVar;
        this.i = afvVar;
        this.j = g9m0Var;
        this.k = xx7Var;
        this.l = yx7Var;
    }

    /* JADX WARN: Code duplicated, block: B:328:0x0734  */
    /* JADX WARN: Code duplicated, block: B:347:0x0790  */
    /* JADX WARN: Code duplicated, block: B:356:0x07b4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.ibz
    public final uj30 a(jbz jbzVar, long j) {
        int i;
        float fA;
        xcz xczVar;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        ncz nczVar;
        int i10;
        List arrayList;
        int i11;
        float f2;
        List arrayList2;
        kcz kczVar;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList3;
        dbz dbzVar;
        float f3;
        float f4;
        int iF;
        Integer numValueOf;
        Integer numValueOf2;
        c5n0 c5n0Var;
        icz iczVar;
        kcz kczVar2;
        mcz mczVar;
        int i15;
        jbz jbzVar2;
        c5n0 c5n0Var2 = jbzVar.b;
        xcz xczVar2 = this.f19822a;
        xczVar2.t.getValue();
        boolean z = xczVar2.b || c5n0Var2.M();
        boolean z2 = this.b;
        d5c.H(j, z2 ? ma80.f21447a : ma80.b);
        hh80 hh80Var = this.c;
        int iT = z2 ? c5n0Var2.T(hh80Var.b(c5n0Var2.getLayoutDirection())) : c5n0Var2.T(s5x0.B(hh80Var, c5n0Var2.getLayoutDirection()));
        int iT2 = z2 ? c5n0Var2.T(hh80Var.c(c5n0Var2.getLayoutDirection())) : c5n0Var2.T(s5x0.A(hh80Var, c5n0Var2.getLayoutDirection()));
        int iT3 = c5n0Var2.T(hh80Var.d());
        int iT4 = c5n0Var2.T(hh80Var.a());
        int i16 = iT3 + iT4;
        int i17 = iT + iT2;
        int i18 = z2 ? i16 : i17;
        boolean z3 = this.d;
        if (z2 && !z3) {
            i = iT3;
        } else if (z2 && z3) {
            i = iT4;
        } else {
            i = (z2 || z3) ? iT2 : iT;
        }
        int i19 = i18 - i;
        long jI = r4e.i(-i17, -i16, j);
        icz iczVar2 = (icz) this.e.invoke();
        g9z g9zVar = iczVar2.c;
        int i20 = p4e.i(jI);
        int iH = p4e.h(jI);
        g9zVar.f10940a.m(i20);
        g9zVar.b.m(iH);
        ow3 ow3Var = this.g;
        sw3 sw3Var = this.f;
        if (z2) {
            if (sw3Var == null) {
                throw w6x.i("null verticalArrangement when isVertical == true");
            }
            fA = sw3Var.a();
        } else {
            if (ow3Var == null) {
                throw w6x.i("null horizontalAlignment when isVertical == false");
            }
            fA = ow3Var.a();
        }
        int iT5 = c5n0Var2.T(fA);
        int iB = iczVar2.b();
        int iH2 = z2 ? p4e.h(j) - i16 : p4e.i(j) - i17;
        boolean z4 = this.d;
        if (z4 && iH2 <= 0) {
            if (!z2) {
                iT += iH2;
            }
            if (z2) {
                iT3 += iH2;
            }
        }
        long j3 = (((long) iT) << 32) | (((long) iT3) & 4294967295L);
        int i21 = iH2;
        int i22 = i;
        kcz kczVar3 = new kcz(jI, this.b, iczVar2, jbzVar, iB, iT5, this.k, this.l, z4, i22, i19, j3, this.f19822a);
        int i23 = iB;
        icz iczVar3 = kczVar3.c;
        androidx.compose.foundation.lazy.layout.c cVar = iczVar3.d;
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            int iH3 = xczVar2.h();
            t8z t8zVar = xczVar2.e;
            int iJ = k9x.J(iH3, iczVar2, t8zVar.e);
            if (iH3 != iJ) {
                t8zVar.b.m(iJ);
                t8zVar.f.b(iH3);
            }
            int i24 = xczVar2.i();
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            MutableIntList mutableIntListT = c9x.t(iczVar2, xczVar2.s, xczVar2.p);
            float fFloatValue = (c5n0Var2.M() || !z) ? xczVar2.h : ((Number) ((hgk0) ((l73) xczVar2.x.c).b).getValue()).floatValue();
            dbz dbzVar2 = xczVar2.o;
            boolean zM = c5n0Var2.M();
            pz40 pz40Var = xczVar2.w;
            boolean z5 = xczVar2.i;
            if (i22 < 0) {
                adx.a("invalid beforeContentPadding");
            }
            if (i19 < 0) {
                adx.a("invalid afterContentPadding");
            }
            boolean z6 = this.b;
            int i25 = i24;
            boolean z7 = this.d;
            vne vneVar = this.h;
            afv afvVar = this.i;
            if (i23 <= 0) {
                int iK = p4e.k(jI);
                int iJ2 = p4e.j(jI);
                dbzVar2.d(0, iK, iJ2, new ArrayList(), cVar, kczVar3, z6, zM, 1, z, 0, 0, vneVar, afvVar);
                if (!zM) {
                    long jB = dbzVar2.b();
                    if (!qkx.a(jB, 0L)) {
                        iK = r4e.g((int) (jB >> 32), jI);
                        iJ2 = r4e.f((int) (jB & 4294967295L), jI);
                    }
                }
                z8z z8zVar = new z8z((byte) 3);
                int iG = r4e.g(iK + i17, j);
                int iF2 = r4e.f(iJ2 + i16, j);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                c5n0Var = c5n0Var2;
                iczVar = iczVar3;
                xczVar = xczVar2;
                mczVar = new mcz(null, 0, false, 0.0f, c5n0Var2.i0(iG, iF2, lunVar, z8zVar), 0.0f, false, vneVar, jbzVar, kczVar3.e, 0, iun.f15405a, -i22, i21 + i19, 0, z7, z6 ? ma80.f21447a : ma80.b, i19, iT5);
                kczVar2 = kczVar3;
            } else {
                xczVar = xczVar2;
                if (iJ >= i23) {
                    iJ = i23 - 1;
                    i25 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i26 = i25 - iRound;
                if (iJ == 0 && i26 < 0) {
                    iRound += i26;
                    i26 = 0;
                }
                xw3 xw3Var = new xw3();
                int i27 = iRound;
                int i28 = -i22;
                int i29 = iJ;
                int i30 = i28 + (iT5 < 0 ? iT5 : 0);
                int iM = i26 + i30;
                float f5 = fFloatValue;
                int iMax = 0;
                while (true) {
                    j2 = kczVar3.e;
                    if (iM >= 0 || i29 <= 0) {
                        break;
                    }
                    pz40 pz40Var2 = pz40Var;
                    int i31 = i29 - 1;
                    ncz nczVarN1 = kczVar3.n1(i31, j2);
                    xw3Var.add(0, nczVarN1);
                    iMax = Math.max(iMax, nczVarN1.v);
                    iM += nczVarN1.m();
                    i29 = i31;
                    pz40Var = pz40Var2;
                }
                pz40 pz40Var3 = pz40Var;
                if (iM < i30) {
                    i2 = i27 - (i30 - iM);
                    iM = i30;
                } else {
                    i2 = i27;
                }
                int i32 = iM - i30;
                int i33 = i21 + i19;
                int i34 = i33 >= 0 ? i33 : 0;
                int i35 = iMax;
                int iM2 = -i32;
                int iM3 = i32;
                int i36 = i29;
                int i37 = 0;
                boolean z8 = false;
                while (i37 < xw3Var.c) {
                    if (iM2 >= i34) {
                        xw3Var.e(i37);
                        z8 = true;
                    } else {
                        i36++;
                        int iM4 = ((ncz) xw3Var.get(i37)).m() + iM2;
                        i37++;
                        iM2 = iM4;
                    }
                }
                int iMax2 = i35;
                boolean z9 = z8;
                int i38 = i36;
                while (i38 < i23 && (iM2 < i34 || iM2 <= 0 || xw3Var.isEmpty())) {
                    int i39 = i34;
                    ncz nczVarN2 = kczVar3.n1(i38, j2);
                    iM2 = nczVarN2.m() + iM2;
                    if (iM2 <= i30) {
                        i15 = i30;
                        if (i38 != i23 - 1) {
                            iM3 -= nczVarN2.m();
                            i29 = i38 + 1;
                            z9 = true;
                        }
                        i38++;
                        i34 = i39;
                        i30 = i15;
                    } else {
                        i15 = i30;
                    }
                    iMax2 = Math.max(iMax2, nczVarN2.v);
                    xw3Var.addLast(nczVarN2);
                    i38++;
                    i34 = i39;
                    i30 = i15;
                }
                if (iM2 < i21) {
                    int i40 = i21 - iM2;
                    int i41 = iM2 + i40;
                    int iM5 = iM3 - i40;
                    while (iM5 < i22 && i29 > 0) {
                        int i42 = i40;
                        int i43 = i29 - 1;
                        int i44 = i41;
                        ncz nczVarN3 = kczVar3.n1(i43, j2);
                        i29 = i43;
                        xw3Var.add(0, nczVarN3);
                        iMax2 = Math.max(iMax2, nczVarN3.v);
                        iM5 += nczVarN3.m();
                        i40 = i42;
                        i41 = i44;
                    }
                    int i45 = i40;
                    int i46 = i41;
                    i3 = i2;
                    int i47 = i3 + i45;
                    if (iM5 < 0) {
                        int i48 = i47 + iM5;
                        i4 = iMax2;
                        i5 = i46 + iM5;
                        i7 = i29;
                        i8 = i48;
                        i6 = 0;
                    } else {
                        i4 = iMax2;
                        i6 = iM5;
                        i5 = i46;
                        i7 = i29;
                        i8 = i47;
                    }
                } else {
                    i3 = i2;
                    i4 = iMax2;
                    i5 = iM2;
                    i6 = iM3;
                    i7 = i29;
                    i8 = i3;
                }
                int i49 = i38;
                if (Integer.signum(Math.round(f5)) != Integer.signum(i8) || Math.abs(Math.round(f5)) < Math.abs(i8)) {
                    i9 = i8;
                    f = f5;
                } else {
                    i9 = i8;
                    f = i9;
                }
                float f6 = f5 - f;
                float f7 = 0.0f;
                if (zM && i9 > i3 && f6 <= 0.0f) {
                    f7 = (i9 - i3) + f6;
                }
                float f8 = f7;
                if (i6 < 0) {
                    adx.a("negative currentFirstItemScrollOffset");
                }
                int i50 = -i6;
                ncz nczVar2 = (ncz) xw3Var.first();
                if (i22 > 0 || iT5 < 0) {
                    int iB2 = xw3Var.b();
                    ncz nczVar3 = nczVar2;
                    int i51 = 0;
                    while (i51 < iB2) {
                        int i52 = iB2;
                        int iM6 = ((ncz) xw3Var.get(i51)).m();
                        if (i6 == 0 || iM6 > i6 || i51 == xw3Var.b() - 1) {
                            break;
                        }
                        i6 -= iM6;
                        i51++;
                        nczVar3 = (ncz) xw3Var.get(i51);
                        iB2 = i52;
                    }
                    nczVar = nczVar3;
                } else {
                    nczVar = nczVar2;
                }
                int i53 = i6;
                int iMax3 = Math.max(0, i7);
                int i54 = i7 - 1;
                if (iMax3 <= i54) {
                    List arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        i10 = i23;
                        arrayList = arrayList4;
                        arrayList.add(kczVar3.n1(i54, j2));
                        if (i54 == iMax3) {
                            break;
                        }
                        i54--;
                        arrayList4 = arrayList;
                        i23 = i10;
                    }
                } else {
                    i10 = i23;
                    arrayList = null;
                }
                int[] iArr = mutableIntListT.f45342a;
                for (int i55 = mutableIntListT.b - 1; -1 < i55; i55--) {
                    int i56 = iArr[i55];
                    if (i56 < iMax3) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(kczVar3.n1(i56, j2));
                    }
                }
                if (arrayList == null) {
                    arrayList = iun.f15405a;
                }
                int iMax4 = i4;
                int i57 = 0;
                for (int size = arrayList.size(); i57 < size; size = size) {
                    iMax4 = Math.max(iMax4, ((ncz) arrayList.get(i57)).v);
                    i57++;
                }
                int iMin = Math.min(((ncz) CollectionsKt.d0(xw3Var)).f23317a, i10 - 1);
                int i58 = ((ncz) CollectionsKt.d0(xw3Var)).f23317a + 1;
                if (i58 <= iMin) {
                    List arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i11 = iMax4;
                        f2 = f;
                        arrayList2 = arrayList5;
                        arrayList2.add(kczVar3.n1(i58, j2));
                        if (i58 == iMin) {
                            break;
                        }
                        i58++;
                        arrayList5 = arrayList2;
                        iMax4 = i11;
                        f = f2;
                    }
                } else {
                    i11 = iMax4;
                    f2 = f;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((ncz) CollectionsKt.d0(arrayList2)).f23317a > iMin) {
                    iMin = ((ncz) CollectionsKt.d0(arrayList2)).f23317a;
                }
                int[] iArr2 = mutableIntListT.f45342a;
                int i59 = mutableIntListT.b;
                int i60 = 0;
                while (i60 < i59) {
                    int i61 = i59;
                    int i62 = iArr2[i60];
                    if (i62 > iMin) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(kczVar3.n1(i62, j2));
                    }
                    i60++;
                    i59 = i61;
                }
                if (arrayList2 == null) {
                    arrayList2 = iun.f15405a;
                }
                int size2 = arrayList2.size();
                int iMax5 = i11;
                for (int i63 = 0; i63 < size2; i63++) {
                    iMax5 = Math.max(iMax5, ((ncz) arrayList2.get(i63)).v);
                }
                boolean z10 = Intrinsics.d(nczVar, xw3Var.first()) && arrayList.isEmpty() && arrayList2.isEmpty();
                int iG2 = r4e.g(z6 ? iMax5 : i5, jI);
                if (z6) {
                    iMax5 = i5;
                }
                int iF3 = r4e.f(iMax5, jI);
                int i64 = z6 ? iF3 : iG2;
                boolean z11 = i5 < Math.min(i64, i21);
                if (z11 && i50 != 0) {
                    adx.c("non-zero itemsScrollOffset");
                }
                boolean z12 = z10;
                ArrayList arrayList6 = new ArrayList(arrayList2.size() + arrayList.size() + xw3Var.b());
                if (z11) {
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        adx.a("no extra items");
                    }
                    int iB3 = xw3Var.b();
                    int[] iArr3 = new int[iB3];
                    for (int i65 = 0; i65 < iB3; i65++) {
                        iArr3[i65] = ((ncz) xw3Var.get(!z7 ? i65 : (iB3 - i65) - 1)).q;
                    }
                    kczVar = kczVar3;
                    int[] iArr4 = new int[iB3];
                    if (z6) {
                        if (sw3Var == null) {
                            throw w6x.i("null verticalArrangement when isVertical == true");
                        }
                        sw3Var.c(jbzVar, i64, iArr3, iArr4);
                        i12 = 0;
                    } else {
                        if (ow3Var == null) {
                            throw w6x.i("null horizontalArrangement when isVertical == false");
                        }
                        i12 = 0;
                        ow3Var.b(jbzVar, i64, iArr3, k6z.f17794a, iArr4);
                    }
                    IntRange intRangeC = tx3.C(iArr4);
                    kotlin.ranges.a aVarK = intRangeC;
                    if (z7) {
                        aVarK = l1e0.k(intRangeC);
                    }
                    int i66 = aVarK.f46068a;
                    int i67 = aVarK.b;
                    int i68 = aVarK.c;
                    if ((i68 > 0 && i66 <= i67) || (i68 < 0 && i67 <= i66)) {
                        while (true) {
                            int i69 = iArr4[i66];
                            ncz nczVar4 = (ncz) xw3Var.get(!z7 ? i66 : (iB3 - i66) - 1);
                            if (z7) {
                                i69 = (i64 - i69) - nczVar4.q;
                            }
                            nczVar4.o(i69, iG2, iF3);
                            arrayList6.add(nczVar4);
                            if (i66 == i67) {
                                break;
                            }
                            i66 += i68;
                            i68 = i68;
                            iB3 = iB3;
                        }
                    }
                } else {
                    nczVar = nczVar;
                    kczVar = kczVar3;
                    i49 = i49;
                    i12 = 0;
                    int size3 = arrayList.size();
                    int iM7 = i50;
                    for (int i70 = 0; i70 < size3; i70++) {
                        ncz nczVar5 = (ncz) arrayList.get(i70);
                        iM7 -= nczVar5.m();
                        nczVar5.o(iM7, iG2, iF3);
                        arrayList6.add(nczVar5);
                    }
                    int iB4 = xw3Var.b();
                    int iM8 = i50;
                    for (int i71 = 0; i71 < iB4; i71++) {
                        ncz nczVar6 = (ncz) xw3Var.get(i71);
                        nczVar6.o(iM8, iG2, iF3);
                        arrayList6.add(nczVar6);
                        iM8 += nczVar6.m();
                    }
                    int size4 = arrayList2.size();
                    for (int i72 = 0; i72 < size4; i72++) {
                        ncz nczVar7 = (ncz) arrayList2.get(i72);
                        nczVar7.o(iM8, iG2, iF3);
                        arrayList6.add(nczVar7);
                        iM8 += nczVar7.m();
                    }
                }
                if (z5) {
                    i13 = i5;
                    i14 = iF3;
                    arrayList3 = arrayList6;
                    dbzVar = dbzVar2;
                    f3 = f2;
                } else {
                    f3 = f2;
                    int i73 = i5;
                    dbzVar = dbzVar2;
                    dbzVar.d((int) f3, iG2, iF3, arrayList6, cVar, kczVar, z6, zM, 1, z, i53, i73, vneVar, afvVar);
                    i14 = iF3;
                    arrayList3 = arrayList6;
                    i13 = i73;
                }
                kcz kczVar4 = kczVar;
                if (zM) {
                    f4 = f3;
                    iF = i14;
                } else {
                    long jB2 = dbzVar.b();
                    if (qkx.a(jB2, 0L)) {
                        f4 = f3;
                        iF = i14;
                    } else {
                        int i74 = z6 ? i14 : iG2;
                        f4 = f3;
                        iG2 = r4e.g(Math.max(iG2, (int) (jB2 >> 32)), jI);
                        iF = r4e.f(Math.max(i14, (int) (jB2 & 4294967295L)), jI);
                        int i75 = z6 ? iF : iG2;
                        if (i75 != i74) {
                            int size5 = arrayList3.size();
                            for (int i76 = i12; i76 < size5; i76++) {
                                ncz nczVar8 = (ncz) arrayList3.get(i76);
                                nczVar8.x = i75;
                                nczVar8.z = nczVar8.i + i75;
                            }
                        }
                    }
                }
                int i77 = iG2;
                ncz nczVar9 = (ncz) xw3Var.h();
                int i78 = nczVar9 != null ? nczVar9.f23317a : i12;
                ncz nczVar10 = (ncz) xw3Var.k();
                int i79 = nczVar10 != null ? nczVar10.f23317a : i12;
                MutableIntList mutableIntList = iczVar3.b.b;
                if (mutableIntList == null) {
                    mutableIntList = IntListKt.f45341a;
                }
                int i80 = iF;
                List listV = ucx.V(this.j, i78, i79, arrayList3, mutableIntList, i22, i77, i80, z6, new ebz(kczVar4, (byte) 2));
                if (z12) {
                    ncz nczVar11 = (ncz) CollectionsKt.firstOrNull(arrayList3);
                    if (nczVar11 != null) {
                        numValueOf = Integer.valueOf(nczVar11.f23317a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    ncz nczVar12 = (ncz) xw3Var.h();
                    if (nczVar12 != null) {
                        numValueOf = Integer.valueOf(nczVar12.f23317a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z12) {
                    ncz nczVar13 = (ncz) CollectionsKt.f0(arrayList3);
                    if (nczVar13 != null) {
                        numValueOf2 = Integer.valueOf(nczVar13.f23317a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    ncz nczVar14 = (ncz) xw3Var.k();
                    if (nczVar14 != null) {
                        numValueOf2 = Integer.valueOf(nczVar14.f23317a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                int i81 = i10;
                int i82 = (i49 < i81 || i13 > i21) ? 1 : i12;
                p8z p8zVar = new p8z(pz40Var3, arrayList3, listV, zM, (byte) 1);
                int iG3 = r4e.g(i77 + i17, j);
                int iF4 = r4e.f(i80 + i16, j);
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                uj30 uj30VarI0 = c5n0Var2.i0(iG3, iF4, lunVar2, p8zVar);
                List listJ0 = j120.j0(numValueOf != null ? numValueOf.intValue() : i12, numValueOf2 != null ? numValueOf2.intValue() : i12, arrayList3, listV);
                ma80 ma80Var = z6 ? ma80.f21447a : ma80.b;
                int size6 = listV.size();
                c5n0Var = c5n0Var2;
                int i83 = i12;
                int i84 = i83;
                while (i83 < size6) {
                    i84 += ((ncz) listV.get(i83)).q;
                    i83++;
                }
                iczVar = iczVar3;
                kczVar2 = kczVar4;
                mczVar = new mcz(nczVar, i53, i82, f4, uj30VarI0, f8, z9, vneVar, jbzVar, kczVar4.e, i84, listJ0, i28, i33, i81, z7, ma80Var, i19, iT5);
            }
            mcz mczVar2 = mczVar;
            xcz xczVar3 = xczVar;
            xczVar3.g(mczVar2, c5n0Var.M(), false);
            Object obj = xczVar3.f40671a;
            sj9 sj9Var = obj instanceof sj9 ? (sj9) obj : null;
            if (sj9Var == null) {
                return mczVar2;
            }
            List list = mczVar2.l;
            Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
            try {
                if (sj9Var.e() && !list.isEmpty()) {
                    int i85 = ((ncz) CollectionsKt.U(list)).f23317a;
                    int i86 = ((ncz) CollectionsKt.d0(list)).f23317a;
                    int i87 = sj9Var.j;
                    kcz kczVar5 = kczVar2;
                    while (true) {
                        jbzVar2 = kczVar5.d;
                        if (i87 >= i85) {
                            break;
                        }
                        if (i87 >= 0 && i87 < iczVar.b()) {
                            jbzVar2.a(i87);
                        }
                        i87++;
                    }
                    int i88 = i86 + 1;
                    int i89 = sj9Var.k;
                    if (i88 <= i89) {
                        while (true) {
                            if (i88 >= 0 && i88 < iczVar.b()) {
                                jbzVar2.a(i88);
                            }
                            if (i88 == i89) {
                                break;
                            }
                            i88++;
                        }
                    }
                }
                return mczVar2;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }
}
