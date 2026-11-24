package a;

import android.os.Trace;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class ok80 implements ibz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk80 f25395a;
    public final /* synthetic */ hh80 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yi80 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ yx7 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ifk0 i;
    public final /* synthetic */ vne j;

    public ok80(xk80 xk80Var, hh80 hh80Var, float f, yi80 yi80Var, eiy eiyVar, Function0 function0, yx7 yx7Var, int i, ifk0 ifk0Var, vne vneVar) {
        ma80 ma80Var = ma80.f21447a;
        this.f25395a = xk80Var;
        this.b = hh80Var;
        this.c = f;
        this.d = yi80Var;
        this.e = eiyVar;
        this.f = function0;
        this.g = yx7Var;
        this.h = i;
        this.i = ifk0Var;
        this.j = vneVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x036f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0372  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a0 A[LOOP:7: B:112:0x0370->B:116:0x03a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:122:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:127:0x0405  */
    /* JADX WARN: Code duplicated, block: B:130:0x0414  */
    /* JADX WARN: Code duplicated, block: B:133:0x0420 A[LOOP:9: B:132:0x041e->B:133:0x0420, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0446  */
    /* JADX WARN: Code duplicated, block: B:138:0x0449  */
    /* JADX WARN: Code duplicated, block: B:141:0x046b A[LOOP:10: B:137:0x0447->B:141:0x046b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0476  */
    /* JADX WARN: Code duplicated, block: B:146:0x0483  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:156:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:159:0x04c5 A[LOOP:12: B:158:0x04c3->B:159:0x04c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:170:0x0506  */
    /* JADX WARN: Code duplicated, block: B:171:0x0509  */
    /* JADX WARN: Code duplicated, block: B:176:0x0523  */
    /* JADX WARN: Code duplicated, block: B:179:0x053a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0547  */
    /* JADX WARN: Code duplicated, block: B:187:0x0555 A[LOOP:13: B:186:0x0553->B:187:0x0555, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:200:0x05bb A[LOOP:19: B:199:0x05b9->B:200:0x05bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x05d9 A[LOOP:20: B:202:0x05d7->B:203:0x05d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x05f1 A[LOOP:21: B:205:0x05ef->B:206:0x05f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0604  */
    /* JADX WARN: Code duplicated, block: B:210:0x060a  */
    /* JADX WARN: Code duplicated, block: B:212:0x061a  */
    /* JADX WARN: Code duplicated, block: B:220:0x064f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0652  */
    /* JADX WARN: Code duplicated, block: B:223:0x0662  */
    /* JADX WARN: Code duplicated, block: B:225:0x0675  */
    /* JADX WARN: Code duplicated, block: B:229:0x0681  */
    /* JADX WARN: Code duplicated, block: B:230:0x0684  */
    /* JADX WARN: Code duplicated, block: B:232:0x0694  */
    /* JADX WARN: Code duplicated, block: B:234:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:238:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:239:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:241:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:244:0x0716  */
    /* JADX WARN: Code duplicated, block: B:246:0x071b A[LOOP:15: B:242:0x06f6->B:246:0x071b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x0725  */
    /* JADX WARN: Code duplicated, block: B:251:0x0731  */
    /* JADX WARN: Code duplicated, block: B:253:0x0736  */
    /* JADX WARN: Code duplicated, block: B:255:0x073a  */
    /* JADX WARN: Code duplicated, block: B:257:0x073d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0774  */
    /* JADX WARN: Code duplicated, block: B:309:0x03b9 A[EDGE_INSN: B:309:0x03b9->B:117:0x03b9 BREAK  A[LOOP:7: B:112:0x0370->B:116:0x03a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0474 A[EDGE_INSN: B:314:0x0474->B:142:0x0474 BREAK  A[LOOP:10: B:137:0x0447->B:141:0x046b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0722 A[EDGE_INSN: B:321:0x0722->B:247:0x0722 BREAK  A[LOOP:15: B:242:0x06f6->B:246:0x071b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x06aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0678 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v61, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v27 */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v47, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v68 */
    @Override // a.ibz
    public final uj30 a(jbz jbzVar, long j) {
        yx7 yx7Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        xw3 xw3Var;
        int i13;
        wj30 wj30Var;
        long j3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        List arrayList;
        int[] iArr;
        int i19;
        wj30 wj30Var2;
        int i20;
        List list;
        int size;
        int iMax2;
        int i21;
        int iMin;
        int i22;
        int i23;
        int i24;
        int i25;
        List arrayList2;
        int[] iArr2;
        int i26;
        int i27;
        int size2;
        int iMax3;
        int i28;
        int i29;
        int i30;
        int iG;
        int iF;
        int i31;
        int i32;
        int i33;
        ArrayList arrayList3;
        wj30 wj30Var3;
        xw3 xw3Var2;
        c5n0 c5n0Var;
        int size3;
        int i34;
        int i35;
        int iB;
        int i36;
        int size4;
        int i37;
        ArrayList arrayList4;
        int size5;
        int i38;
        wj30 wj30Var4;
        xw3 xw3Var3;
        xw3 xw3Var4;
        ?? arrayList5;
        int size6;
        int i39;
        Object obj;
        ?? arrayList6;
        int size7;
        int i40;
        Object obj2;
        Object obj3;
        ?? r20;
        ifk0 ifk0Var;
        int i41;
        int i42;
        int i43;
        float f;
        int size8;
        int i44;
        ArrayList arrayList7;
        ?? r25;
        Object obj4;
        float f2;
        ?? r2;
        Object obj5;
        ?? r26;
        float f3;
        ?? r21;
        wj30 wj30Var5;
        int iA;
        int i45;
        int i46;
        float fC;
        boolean z;
        pk80 pk80Var;
        xk80 xk80Var;
        jbz jbzVar2;
        int iB2;
        int[] iArr3;
        int i47;
        int i48;
        int i49;
        ArrayList arrayList8;
        ArrayList arrayList9;
        int i50;
        int i51;
        ArrayList arrayList10;
        ArrayList arrayList11;
        int iMax4;
        ok80 ok80Var = this;
        xk80 xk80Var2 = ok80Var.f25395a;
        xk80Var2.C.getValue();
        ma80 ma80Var = ma80.b;
        ma80 ma80Var2 = ma80.f21447a;
        d5c.H(j, ma80Var);
        c5n0 c5n0Var2 = jbzVar.b;
        k6z layoutDirection = c5n0Var2.getLayoutDirection();
        hh80 hh80Var = ok80Var.b;
        int iT = c5n0Var2.T(s5x0.B(hh80Var, layoutDirection));
        int iT2 = c5n0Var2.T(s5x0.A(hh80Var, c5n0Var2.getLayoutDirection()));
        int iT3 = c5n0Var2.T(hh80Var.d());
        int iT4 = c5n0Var2.T(hh80Var.a()) + iT3;
        int i52 = iT2 + iT;
        int i53 = i52 - iT;
        long jI = r4e.i(-i52, -iT4, j);
        xk80Var2.n = jbzVar;
        int iT5 = c5n0Var2.T(ok80Var.c);
        int i54 = p4e.i(j) - i52;
        long j4 = (((long) iT) << 32) | (((long) iT3) & 4294967295L);
        int iA2 = ok80Var.d.a(jbzVar, i54);
        if (iA2 < 0) {
            iA2 = 0;
        }
        r4e.b(0, iA2, 0, p4e.h(jI), 5);
        kk80 kk80Var = (kk80) ok80Var.e.invoke();
        int i55 = i54 + iT + i53;
        ifk0 ifk0Var2 = ok80Var.i;
        rfk0 rfk0VarJ = vdx.J();
        long j5 = jI;
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            int iK = xk80Var2.k();
            int i56 = i54;
            qaj qajVar = xk80Var2.d;
            c5n0 c5n0Var3 = c5n0Var2;
            int iJ = k9x.J(iK, kk80Var, qajVar.b);
            if (iK != iJ) {
                ((cgk0) qajVar.d).m(iJ);
                ((lbz) qajVar.f).b(iK);
            }
            xk80Var2.k();
            float fL = xk80Var2.l();
            xk80Var2.n();
            int i57 = iA2 + iT5;
            int iB3 = si30.b(ifk0Var2.a(i55, iA2, iT, i53) - (fL * i57));
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            MutableIntList mutableIntListT = c9x.t(kk80Var, xk80Var2.A, xk80Var2.w);
            ey40 ey40Var = hkx.f13229a;
            ey40 ey40Var2 = new ey40();
            int iIntValue = ((Number) ok80Var.f.invoke()).intValue();
            pz40 pz40Var = xk80Var2.B;
            if (iT < 0) {
                adx.a("negative beforeContentPadding");
            }
            if (i53 < 0) {
                adx.a("negative afterContentPadding");
            }
            int i58 = i57 < 0 ? 0 : i57;
            int i59 = ok80Var.h;
            if (i59 > iIntValue) {
                i59 = iIntValue;
            }
            kk80 kk80Var2 = kk80Var;
            int i60 = iB3;
            long jB = r4e.b(0, iA2, 0, p4e.h(j5), 5);
            pz40 pz40Var2 = pz40Var;
            ifk0 ifk0Var3 = ok80Var.i;
            int i61 = iA2;
            int i62 = i53;
            int i63 = i59;
            vne vneVar = ok80Var.j;
            if (iIntValue <= 0) {
                int iK2 = p4e.k(j5);
                int iJ2 = p4e.j(j5);
                r580 r580Var = new r580((byte) 17);
                int iG2 = r4e.g(iK2 + i52, j);
                int iF2 = r4e.f(iJ2 + iT4, j);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                pk80Var = new pk80(iun.f15405a, i61, iT5, i62, -iT, i56 + i62, i63, ifk0Var3, c5n0Var3.i0(iG2, iF2, lunVar, r580Var), vneVar, jbzVar, jB);
                jbzVar2 = jbzVar;
                xk80Var = xk80Var2;
            } else {
                long j6 = j4;
                int i64 = iJ;
                while (i64 > 0 && i60 > 0) {
                    i64--;
                    i60 -= i58;
                }
                int i65 = i60 * (-1);
                if (i64 >= iIntValue) {
                    i64 = iIntValue - 1;
                    i65 = 0;
                }
                xw3 xw3Var5 = new xw3();
                int i66 = -iT;
                int i67 = i66 + (iT5 < 0 ? iT5 : 0);
                int i68 = i65 + i67;
                int iMax5 = 0;
                while (true) {
                    yx7Var = ok80Var.g;
                    if (i68 >= 0 || i64 <= 0) {
                        break;
                    }
                    int i69 = i64 - 1;
                    int i70 = i58;
                    int i71 = i55;
                    int i72 = i68;
                    long j7 = j6;
                    int i73 = i61;
                    kk80 kk80Var3 = kk80Var2;
                    wj30 wj30VarX = d7x.x(jbzVar, i69, jB, kk80Var3, j7, yx7Var, c5n0Var3.getLayoutDirection(), i73, ey40Var2);
                    xw3Var5.add(0, wj30VarX);
                    iMax5 = Math.max(iMax5, wj30VarX.h);
                    i64 = i69;
                    kk80Var2 = kk80Var3;
                    j6 = j7;
                    i61 = i73;
                    i58 = i70;
                    iIntValue = iIntValue;
                    i62 = i62;
                    iT = iT;
                    j5 = j5;
                    i55 = i71;
                    pz40Var2 = pz40Var2;
                    i63 = i63;
                    i68 = i72 + i70;
                    ok80Var = this;
                }
                pz40 pz40Var3 = pz40Var2;
                int i74 = iT;
                int i75 = i55;
                int i76 = i63;
                int i77 = i68;
                long j8 = j5;
                int i78 = i62;
                int i79 = iIntValue;
                kk80 kk80Var4 = kk80Var2;
                long j9 = j6;
                int i80 = i58;
                int i81 = i61;
                if (i77 < i67) {
                    i77 = i67;
                }
                int i82 = i77 - i67;
                int i83 = i56 + i78;
                int i84 = i83 < 0 ? 0 : i83;
                int i85 = -i82;
                int i86 = i64;
                int i87 = 0;
                boolean z2 = false;
                while (i87 < xw3Var5.c) {
                    if (i85 >= i84) {
                        xw3Var5.e(i87);
                        z2 = true;
                    } else {
                        i86++;
                        i85 += i80;
                        i87++;
                    }
                }
                int iMax6 = iMax5;
                int i88 = i79;
                int i89 = i85;
                int i90 = i64;
                int i91 = i86;
                boolean z3 = z2;
                int i92 = i82;
                while (i91 < i88 && (i89 < i84 || i89 <= 0 || xw3Var5.isEmpty())) {
                    int i93 = i83;
                    int i94 = i80;
                    int i95 = iMax6;
                    int i96 = i88;
                    long j10 = jB;
                    int i97 = i84;
                    int i98 = i91;
                    wj30 wj30VarX2 = d7x.x(jbzVar, i98, j10, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2);
                    int i99 = i96 - 1;
                    i89 += i98 == i99 ? i81 : i94;
                    if (i89 > i67 || i98 == i99) {
                        iMax4 = Math.max(i95, wj30VarX2.h);
                        xw3Var5.addLast(wj30VarX2);
                    } else {
                        i92 -= i94;
                        i90 = i98 + 1;
                        iMax4 = i95;
                        z3 = true;
                    }
                    i91 = i98 + 1;
                    iMax6 = iMax4;
                    i84 = i97;
                    jB = j10;
                    i83 = i93;
                    i88 = i96;
                    i80 = i94;
                }
                if (i89 < i56) {
                    int i100 = i56 - i89;
                    int i101 = i89 + i100;
                    int i102 = i92 - i100;
                    int i103 = i74;
                    while (i102 < i103 && i90 > 0) {
                        i90--;
                        int i104 = i103;
                        wj30 wj30VarX3 = d7x.x(jbzVar, i90, jB, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2);
                        xw3Var5.add(0, wj30VarX3);
                        iMax6 = Math.max(iMax6, wj30VarX3.h);
                        i103 = i104;
                        i101 = i101;
                        i102 += i80;
                        i91 = i91;
                    }
                    i = i91;
                    int i105 = i102;
                    int i106 = i101;
                    i3 = i103;
                    if (i105 < 0) {
                        i2 = i106 + i105;
                        i4 = 0;
                    } else {
                        i2 = i106;
                        i4 = i105;
                    }
                } else {
                    i = i91;
                    i2 = i89;
                    i3 = i74;
                    i4 = i92;
                }
                if (i4 < 0) {
                    adx.a("invalid currentFirstPageScrollOffset");
                }
                int i107 = -i4;
                wj30 wj30Var6 = (wj30) xw3Var5.first();
                if (i3 > 0 || iT5 < 0) {
                    i5 = i2;
                    int iB4 = xw3Var5.b();
                    j2 = jB;
                    int i108 = 0;
                    while (true) {
                        if (i108 >= iB4 || i4 == 0) {
                            i6 = iMax6;
                            i7 = i80;
                        } else {
                            i7 = i80;
                            if (i7 <= i4) {
                                i6 = iMax6;
                                i8 = 1;
                                if (i108 == xw3Var5.b() - 1) {
                                    break;
                                }
                                i4 -= i7;
                                i108++;
                                wj30Var6 = (wj30) xw3Var5.get(i108);
                                i80 = i7;
                                iMax6 = i6;
                            } else {
                                i6 = iMax6;
                            }
                        }
                    }
                    i9 = i4;
                    ma80 ma80Var3 = ma80.f21447a;
                    iMax = Math.max(0, i90 - i76);
                    i10 = i90 - 1;
                    if (iMax <= i10) {
                        arrayList10 = null;
                        while (true) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ma80 ma80Var4 = ma80.f21447a;
                            i11 = i7;
                            i12 = i9;
                            i13 = i3;
                            wj30Var = wj30Var6;
                            i14 = i76;
                            i15 = i107;
                            xw3Var = xw3Var5;
                            arrayList11 = arrayList10;
                            j3 = j2;
                            i16 = i5;
                            i17 = i56;
                            i18 = iMax;
                            arrayList11.add(d7x.x(jbzVar, i10, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                            if (i10 != i18) {
                                break;
                            }
                            i10--;
                            i76 = i14;
                            iMax = i18;
                            i107 = i15;
                            i56 = i17;
                            i5 = i16;
                            i3 = i13;
                            j2 = j3;
                            wj30Var6 = wj30Var;
                            arrayList10 = arrayList11;
                            xw3Var5 = xw3Var;
                            i9 = i12;
                            i7 = i11;
                        }
                        arrayList = arrayList11;
                    } else {
                        i11 = i7;
                        i12 = i9;
                        xw3Var = xw3Var5;
                        i13 = i3;
                        wj30Var = wj30Var6;
                        j3 = j2;
                        i14 = i76;
                        i15 = i107;
                        i16 = i5;
                        i17 = i56;
                        i18 = iMax;
                        arrayList = null;
                    }
                    iArr = mutableIntListT.f45342a;
                    i19 = mutableIntListT.b;
                    wj30Var2 = wj30Var;
                    i20 = 0;
                    while (i20 < i19) {
                        int i109 = i19;
                        i51 = iArr[i20];
                        if (i51 >= i18) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            ma80 ma80Var5 = ma80.f21447a;
                            List list2 = arrayList;
                            list2.add(d7x.x(jbzVar, i51, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                            arrayList = list2;
                        }
                        i20++;
                        iArr = iArr;
                        i19 = i109;
                    }
                    if (arrayList == null) {
                        arrayList = iun.f15405a;
                    }
                    list = arrayList;
                    size = list.size();
                    iMax2 = i6;
                    for (i21 = 0; i21 < size; i21++) {
                        iMax2 = Math.max(iMax2, ((wj30) list.get(i21)).h);
                    }
                    int i110 = ((wj30) xw3Var.last()).f39244a;
                    ma80 ma80Var6 = ma80.f21447a;
                    iMin = Math.min(i14, (i88 - i110) - 1) + i110;
                    i22 = i110 + 1;
                    if (i22 <= iMin) {
                        arrayList8 = null;
                        while (true) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            ma80 ma80Var7 = ma80.f21447a;
                            arrayList9 = arrayList8;
                            i24 = iMax2;
                            i23 = i14;
                            i25 = iMin;
                            i50 = i22;
                            arrayList9.add(d7x.x(jbzVar, i50, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                            if (i50 != i25) {
                                break;
                            }
                            i22 = i50 + 1;
                            iMin = i25;
                            arrayList8 = arrayList9;
                            iMax2 = i24;
                            i14 = i23;
                        }
                        arrayList2 = arrayList9;
                    } else {
                        i23 = i14;
                        i24 = iMax2;
                        i25 = iMin;
                        arrayList2 = null;
                    }
                    iArr2 = mutableIntListT.f45342a;
                    i26 = mutableIntListT.b;
                    i27 = 0;
                    while (i27 < i26) {
                        i49 = iArr2[i27];
                        int i111 = i27;
                        if (i25 + 1 > i49 && i49 < i88) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ma80 ma80Var8 = ma80.f21447a;
                            List list3 = arrayList2;
                            list3.add(d7x.x(jbzVar, i49, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                            arrayList2 = list3;
                        }
                        i27 = i111 + 1;
                        i26 = i26;
                        j3 = j3;
                    }
                    long j11 = j3;
                    if (arrayList2 == null) {
                        arrayList2 = iun.f15405a;
                    }
                    size2 = arrayList2.size();
                    iMax3 = i24;
                    for (i28 = 0; i28 < size2; i28++) {
                        iMax3 = Math.max(iMax3, ((wj30) arrayList2.get(i28)).h);
                    }
                    if (!Intrinsics.d(wj30Var2, xw3Var.first()) && list.isEmpty() && arrayList2.isEmpty()) {
                        i29 = i8;
                    } else {
                        i29 = 0;
                    }
                    ma80 ma80Var9 = ma80.f21447a;
                    i30 = i16;
                    iG = r4e.g(i30, j8);
                    iF = r4e.f(iMax3, j8);
                    i31 = i17;
                    if (i30 < Math.min(iG, i31)) {
                        i32 = i8;
                    } else {
                        i32 = 0;
                    }
                    if (i32 != 0 || i15 == 0) {
                        i33 = i15;
                    } else {
                        StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                        i33 = i15;
                        sb.append(i33);
                        adx.c(sb.toString());
                    }
                    arrayList3 = new ArrayList(arrayList2.size() + list.size() + xw3Var.b());
                    if (i32 != 0) {
                        if (list.isEmpty() || !arrayList2.isEmpty()) {
                            adx.a("No extra pages");
                        }
                        iB2 = xw3Var.b();
                        iArr3 = new int[iB2];
                        for (i47 = 0; i47 < iB2; i47++) {
                            iArr3[i47] = i81;
                        }
                        int[] iArr4 = new int[iB2];
                        wj30Var3 = wj30Var2;
                        qw3 qw3Var = new qw3(c5n0Var3.r0(iT5), false, null);
                        ma80 ma80Var10 = ma80.f21447a;
                        c5n0Var = c5n0Var3;
                        qw3Var.b(jbzVar, iG, iArr3, k6z.f17794a, iArr4);
                        IntRange intRangeC = tx3.C(iArr4);
                        int i112 = intRangeC.b;
                        i48 = intRangeC.c;
                        if ((i48 <= 0 && i112 >= 0) || (i48 < 0 && i112 <= 0)) {
                            int i113 = 0;
                            while (true) {
                                int i114 = iArr4[i113];
                                int i115 = i48;
                                xw3Var2 = xw3Var;
                                int[] iArr5 = iArr4;
                                wj30 wj30Var7 = (wj30) xw3Var2.get(i113);
                                wj30Var7.b(i114, iG, iF);
                                arrayList3.add(wj30Var7);
                                if (i113 == i112) {
                                    break;
                                }
                                i113 += i115;
                                xw3Var = xw3Var2;
                                i48 = i115;
                                iArr4 = iArr5;
                            }
                        }
                    } else {
                        wj30Var3 = wj30Var2;
                        xw3Var2 = xw3Var;
                        c5n0Var = c5n0Var3;
                        size3 = list.size();
                        i34 = i33;
                        i35 = 0;
                        while (i35 < size3) {
                            int i116 = size3;
                            wj30 wj30Var8 = (wj30) list.get(i35);
                            i34 -= i57;
                            wj30Var8.b(i34, iG, iF);
                            arrayList3.add(wj30Var8);
                            i35++;
                            size3 = i116;
                        }
                        iB = xw3Var2.b();
                        for (i36 = 0; i36 < iB; i36++) {
                            wj30 wj30Var9 = (wj30) xw3Var2.get(i36);
                            wj30Var9.b(i33, iG, iF);
                            arrayList3.add(wj30Var9);
                            i33 += i57;
                        }
                        size4 = arrayList2.size();
                        for (i37 = 0; i37 < size4; i37++) {
                            wj30 wj30Var10 = (wj30) arrayList2.get(i37);
                            wj30Var10.b(i33, iG, iF);
                            arrayList3.add(wj30Var10);
                            i33 += i57;
                        }
                    }
                    if (i29 != 0) {
                        arrayList4 = arrayList3;
                    } else {
                        arrayList4 = new ArrayList(arrayList3.size());
                        size5 = arrayList3.size();
                        i38 = 0;
                        while (i38 < size5) {
                            Object obj6 = arrayList3.get(i38);
                            wj30Var4 = (wj30) obj6;
                            xw3Var3 = xw3Var2;
                            int i117 = iG;
                            if (wj30Var4.f39244a < ((wj30) xw3Var3.first()).f39244a && wj30Var4.f39244a <= ((wj30) xw3Var3.last()).f39244a) {
                                arrayList4.add(obj6);
                            }
                            i38++;
                            xw3Var2 = xw3Var3;
                            iG = i117;
                        }
                    }
                    xw3Var4 = xw3Var2;
                    int i118 = iG;
                    if (list.isEmpty()) {
                        arrayList5 = iun.f15405a;
                    } else {
                        arrayList5 = new ArrayList(arrayList3.size());
                        size6 = arrayList3.size();
                        for (i39 = 0; i39 < size6; i39++) {
                            obj = arrayList3.get(i39);
                            if (((wj30) obj).f39244a < ((wj30) xw3Var4.first()).f39244a) {
                                arrayList5.add(obj);
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList6 = iun.f15405a;
                    } else {
                        arrayList6 = new ArrayList(arrayList3.size());
                        size7 = arrayList3.size();
                        for (i40 = 0; i40 < size7; i40++) {
                            obj2 = arrayList3.get(i40);
                            if (((wj30) obj2).f39244a > ((wj30) xw3Var4.last()).f39244a) {
                                arrayList6.add(obj2);
                            }
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        r21 = arrayList5;
                        r25 = arrayList6;
                        ifk0Var = ifk0Var3;
                        i41 = i78;
                        i42 = i13;
                        i43 = i75;
                        obj3 = null;
                        arrayList7 = arrayList4;
                    } else {
                        obj3 = arrayList4.get(0);
                        r20 = arrayList5;
                        ifk0Var = ifk0Var3;
                        i41 = i78;
                        i42 = i13;
                        i43 = i75;
                        f = -Math.abs(((wj30) obj3).j - ifk0Var.a(i43, i81, i42, i41));
                        size8 = arrayList4.size() - 1;
                        i44 = i8;
                        if (i44 <= size8) {
                            obj4 = obj3;
                            f2 = f;
                            r2 = arrayList6;
                            while (true) {
                                obj5 = arrayList4.get(i44);
                                arrayList7 = arrayList4;
                                r26 = r2;
                                f3 = -Math.abs(((wj30) obj5).j - ifk0Var.a(i43, i81, i42, i41));
                                if (Float.compare(f2, f3) < 0) {
                                    f2 = f3;
                                    obj4 = obj5;
                                }
                                if (i44 != size8) {
                                    break;
                                }
                                i44++;
                                arrayList4 = arrayList7;
                                r2 = r26;
                            }
                            obj3 = obj4;
                            r21 = r20;
                            r25 = r26;
                        } else {
                            arrayList7 = arrayList4;
                            r25 = arrayList6;
                            r21 = r20;
                        }
                    }
                    wj30Var5 = (wj30) obj3;
                    iA = ifk0Var.a(i43, i81, i42, i41);
                    if (wj30Var5 != null) {
                        i45 = wj30Var5.j;
                    } else {
                        i45 = 0;
                    }
                    i46 = i11;
                    if (i46 == 0) {
                        fC = 0.0f;
                    } else {
                        fC = l1e0.c((iA - i45) / i46, -0.5f, 0.5f);
                    }
                    float f4 = fC;
                    ka70 ka70Var = new ka70(pz40Var3, arrayList3, (byte) 5);
                    int iG3 = r4e.g(i118 + i52, j);
                    int iF3 = r4e.f(iF + iT4, j);
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    uj30 uj30VarI0 = c5n0Var.i0(iG3, iF3, lunVar2, ka70Var);
                    if (i >= i88 || i30 > i31) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c5n0Var3 = c5n0Var;
                    xk80Var = xk80Var2;
                    pk80Var = new pk80(arrayList7, i81, iT5, i41, ma80Var, i66, i83, i23, wj30Var3, wj30Var5, f4, i12, z, ifk0Var, uj30VarI0, z3, r21, r25, vneVar, jbzVar, j11);
                    jbzVar2 = jbzVar;
                } else {
                    i5 = i2;
                    j2 = jB;
                    i6 = iMax6;
                    i7 = i80;
                }
                i8 = 1;
                i9 = i4;
                ma80 ma80Var11 = ma80.f21447a;
                iMax = Math.max(0, i90 - i76);
                i10 = i90 - 1;
                if (iMax <= i10) {
                    arrayList10 = null;
                    while (true) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        ma80 ma80Var12 = ma80.f21447a;
                        i11 = i7;
                        i12 = i9;
                        i13 = i3;
                        wj30Var = wj30Var6;
                        i14 = i76;
                        i15 = i107;
                        xw3Var = xw3Var5;
                        arrayList11 = arrayList10;
                        j3 = j2;
                        i16 = i5;
                        i17 = i56;
                        i18 = iMax;
                        arrayList11.add(d7x.x(jbzVar, i10, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                        if (i10 != i18) {
                            break;
                            break;
                        }
                        i10--;
                        i76 = i14;
                        iMax = i18;
                        i107 = i15;
                        i56 = i17;
                        i5 = i16;
                        i3 = i13;
                        j2 = j3;
                        wj30Var6 = wj30Var;
                        arrayList10 = arrayList11;
                        xw3Var5 = xw3Var;
                        i9 = i12;
                        i7 = i11;
                    }
                    arrayList = arrayList11;
                } else {
                    i11 = i7;
                    i12 = i9;
                    xw3Var = xw3Var5;
                    i13 = i3;
                    wj30Var = wj30Var6;
                    j3 = j2;
                    i14 = i76;
                    i15 = i107;
                    i16 = i5;
                    i17 = i56;
                    i18 = iMax;
                    arrayList = null;
                }
                iArr = mutableIntListT.f45342a;
                i19 = mutableIntListT.b;
                wj30Var2 = wj30Var;
                i20 = 0;
                while (i20 < i19) {
                    int i1010 = i19;
                    i51 = iArr[i20];
                    if (i51 >= i18) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ma80 ma80Var13 = ma80.f21447a;
                        List list4 = arrayList;
                        list4.add(d7x.x(jbzVar, i51, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                        arrayList = list4;
                    }
                    i20++;
                    iArr = iArr;
                    i19 = i1010;
                }
                if (arrayList == null) {
                    arrayList = iun.f15405a;
                }
                list = arrayList;
                size = list.size();
                iMax2 = i6;
                while (i21 < size) {
                    iMax2 = Math.max(iMax2, ((wj30) list.get(i21)).h);
                }
                int i119 = ((wj30) xw3Var.last()).f39244a;
                ma80 ma80Var14 = ma80.f21447a;
                iMin = Math.min(i14, (i88 - i119) - 1) + i119;
                i22 = i119 + 1;
                if (i22 <= iMin) {
                    arrayList8 = null;
                    while (true) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        ma80 ma80Var15 = ma80.f21447a;
                        arrayList9 = arrayList8;
                        i24 = iMax2;
                        i23 = i14;
                        i25 = iMin;
                        i50 = i22;
                        arrayList9.add(d7x.x(jbzVar, i50, j3, kk80Var4, j9, yx7Var, c5n0Var3.getLayoutDirection(), i81, ey40Var2));
                        if (i50 != i25) {
                            break;
                            break;
                        }
                        i22 = i50 + 1;
                        iMin = i25;
                        arrayList8 = arrayList9;
                        iMax2 = i24;
                        i14 = i23;
                    }
                    arrayList2 = arrayList9;
                } else {
                    i23 = i14;
                    i24 = iMax2;
                    i25 = iMin;
                    arrayList2 = null;
                }
                iArr2 = mutableIntListT.f45342a;
                i26 = mutableIntListT.b;
                i27 = 0;
                while (i27 < i26) {
                    i49 = iArr2[i27];
                    int i1110 = i27;
                    if (i25 + 1 > i49) {
                    }
                    i27 = i1110 + 1;
                    i26 = i26;
                    j3 = j3;
                }
                long j12 = j3;
                if (arrayList2 == null) {
                    arrayList2 = iun.f15405a;
                }
                size2 = arrayList2.size();
                iMax3 = i24;
                while (i28 < size2) {
                    iMax3 = Math.max(iMax3, ((wj30) arrayList2.get(i28)).h);
                }
                if (!Intrinsics.d(wj30Var2, xw3Var.first())) {
                    i29 = 0;
                } else {
                    i29 = 0;
                }
                ma80 ma80Var16 = ma80.f21447a;
                i30 = i16;
                iG = r4e.g(i30, j8);
                iF = r4e.f(iMax3, j8);
                i31 = i17;
                if (i30 < Math.min(iG, i31)) {
                    i32 = i8;
                } else {
                    i32 = 0;
                }
                if (i32 != 0) {
                    i33 = i15;
                } else {
                    i33 = i15;
                }
                arrayList3 = new ArrayList(arrayList2.size() + list.size() + xw3Var.b());
                if (i32 != 0) {
                    if (list.isEmpty()) {
                        adx.a("No extra pages");
                    } else {
                        adx.a("No extra pages");
                    }
                    iB2 = xw3Var.b();
                    iArr3 = new int[iB2];
                    while (i47 < iB2) {
                        iArr3[i47] = i81;
                    }
                    int[] iArr6 = new int[iB2];
                    wj30Var3 = wj30Var2;
                    qw3 qw3Var2 = new qw3(c5n0Var3.r0(iT5), false, null);
                    ma80 ma80Var17 = ma80.f21447a;
                    c5n0Var = c5n0Var3;
                    qw3Var2.b(jbzVar, iG, iArr3, k6z.f17794a, iArr6);
                    IntRange intRangeC2 = tx3.C(iArr6);
                    int i1111 = intRangeC2.b;
                    i48 = intRangeC2.c;
                    xw3Var2 = i48 <= 0 ? xw3Var : xw3Var;
                } else {
                    wj30Var3 = wj30Var2;
                    xw3Var2 = xw3Var;
                    c5n0Var = c5n0Var3;
                    size3 = list.size();
                    i34 = i33;
                    i35 = 0;
                    while (i35 < size3) {
                        int i1112 = size3;
                        wj30 wj30Var11 = (wj30) list.get(i35);
                        i34 -= i57;
                        wj30Var11.b(i34, iG, iF);
                        arrayList3.add(wj30Var11);
                        i35++;
                        size3 = i1112;
                    }
                    iB = xw3Var2.b();
                    while (i36 < iB) {
                        wj30 wj30Var12 = (wj30) xw3Var2.get(i36);
                        wj30Var12.b(i33, iG, iF);
                        arrayList3.add(wj30Var12);
                        i33 += i57;
                    }
                    size4 = arrayList2.size();
                    while (i37 < size4) {
                        wj30 wj30Var13 = (wj30) arrayList2.get(i37);
                        wj30Var13.b(i33, iG, iF);
                        arrayList3.add(wj30Var13);
                        i33 += i57;
                    }
                }
                if (i29 != 0) {
                    arrayList4 = arrayList3;
                } else {
                    arrayList4 = new ArrayList(arrayList3.size());
                    size5 = arrayList3.size();
                    i38 = 0;
                    while (i38 < size5) {
                        Object obj7 = arrayList3.get(i38);
                        wj30Var4 = (wj30) obj7;
                        xw3Var3 = xw3Var2;
                        int i1113 = iG;
                        if (wj30Var4.f39244a < ((wj30) xw3Var3.first()).f39244a) {
                        }
                        i38++;
                        xw3Var2 = xw3Var3;
                        iG = i1113;
                    }
                }
                xw3Var4 = xw3Var2;
                int i1114 = iG;
                if (list.isEmpty()) {
                    arrayList5 = iun.f15405a;
                } else {
                    arrayList5 = new ArrayList(arrayList3.size());
                    size6 = arrayList3.size();
                    while (i39 < size6) {
                        obj = arrayList3.get(i39);
                        if (((wj30) obj).f39244a < ((wj30) xw3Var4.first()).f39244a) {
                            arrayList5.add(obj);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList6 = iun.f15405a;
                } else {
                    arrayList6 = new ArrayList(arrayList3.size());
                    size7 = arrayList3.size();
                    while (i40 < size7) {
                        obj2 = arrayList3.get(i40);
                        if (((wj30) obj2).f39244a > ((wj30) xw3Var4.last()).f39244a) {
                            arrayList6.add(obj2);
                        }
                    }
                }
                if (arrayList4.isEmpty()) {
                    r21 = arrayList5;
                    r25 = arrayList6;
                    ifk0Var = ifk0Var3;
                    i41 = i78;
                    i42 = i13;
                    i43 = i75;
                    obj3 = null;
                    arrayList7 = arrayList4;
                } else {
                    obj3 = arrayList4.get(0);
                    r20 = arrayList5;
                    ifk0Var = ifk0Var3;
                    i41 = i78;
                    i42 = i13;
                    i43 = i75;
                    f = -Math.abs(((wj30) obj3).j - ifk0Var.a(i43, i81, i42, i41));
                    size8 = arrayList4.size() - 1;
                    i44 = i8;
                    if (i44 <= size8) {
                        obj4 = obj3;
                        f2 = f;
                        r2 = arrayList6;
                        while (true) {
                            obj5 = arrayList4.get(i44);
                            arrayList7 = arrayList4;
                            r26 = r2;
                            f3 = -Math.abs(((wj30) obj5).j - ifk0Var.a(i43, i81, i42, i41));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj4 = obj5;
                            }
                            if (i44 != size8) {
                                break;
                                break;
                            }
                            i44++;
                            arrayList4 = arrayList7;
                            r2 = r26;
                        }
                        obj3 = obj4;
                        r21 = r20;
                        r25 = r26;
                    } else {
                        arrayList7 = arrayList4;
                        r25 = arrayList6;
                        r21 = r20;
                    }
                }
                wj30Var5 = (wj30) obj3;
                iA = ifk0Var.a(i43, i81, i42, i41);
                if (wj30Var5 != null) {
                    i45 = wj30Var5.j;
                } else {
                    i45 = 0;
                }
                i46 = i11;
                if (i46 == 0) {
                    fC = 0.0f;
                } else {
                    fC = l1e0.c((iA - i45) / i46, -0.5f, 0.5f);
                }
                float f5 = fC;
                ka70 ka70Var2 = new ka70(pz40Var3, arrayList3, (byte) 5);
                int iG4 = r4e.g(i1114 + i52, j);
                int iF4 = r4e.f(iF + iT4, j);
                lun lunVar3 = lun.f20680a;
                lunVar3.getClass();
                uj30 uj30VarI1 = c5n0Var.i0(iG4, iF4, lunVar3, ka70Var2);
                if (i >= i88) {
                    z = true;
                } else {
                    z = true;
                }
                c5n0Var3 = c5n0Var;
                xk80Var = xk80Var2;
                pk80Var = new pk80(arrayList7, i81, iT5, i41, ma80Var, i66, i83, i23, wj30Var3, wj30Var5, f5, i12, z, ifk0Var, uj30VarI1, z3, r21, r25, vneVar, jbzVar, j12);
                jbzVar2 = jbzVar;
            }
            xk80 xk80Var3 = xk80Var;
            xk80Var3.h(pk80Var, c5n0Var3.M(), false);
            sj80 sj80Var = xk80Var3.v;
            List list5 = pk80Var.f27124a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (sj80Var.e() && !list5.isEmpty()) {
                    int i120 = ((wj30) CollectionsKt.U(list5)).f39244a;
                    int i121 = ((wj30) CollectionsKt.d0(list5)).f39244a;
                    for (int i122 = sj80Var.j; i122 < i120; i122++) {
                        jbzVar2.a(i122);
                    }
                    int i123 = i121 + 1;
                    int i124 = sj80Var.k;
                    if (i123 <= i124) {
                        while (true) {
                            jbzVar2.a(i123);
                            if (i123 == i124) {
                                break;
                            }
                            i123++;
                        }
                    }
                }
                return pk80Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }
}
