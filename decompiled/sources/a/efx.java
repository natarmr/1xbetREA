package a;

import android.gov.nist.core.Separators;
import android.view.inputmethod.ExtractedText;
import androidx.collection.MutableIntList;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class efx {
    public static final boolean A(Object obj) {
        return obj == sqd.f32624a;
    }

    public static final int B(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:333:0x067a  */
    /* JADX WARN: Code duplicated, block: B:426:0x0873 A[LOOP:33: B:396:0x07ec->B:426:0x0873, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:433:0x0895  */
    /* JADX WARN: Code duplicated, block: B:435:0x089b  */
    /* JADX WARN: Code duplicated, block: B:437:0x08a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:438:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:440:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:443:0x08bc A[LOOP:36: B:439:0x08ab->B:443:0x08bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:444:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:453:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:455:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:457:0x08e6 A[LOOP:37: B:454:0x08de->B:457:0x08e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:461:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:462:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:467:0x0922  */
    /* JADX WARN: Code duplicated, block: B:468:0x0925  */
    /* JADX WARN: Code duplicated, block: B:471:0x0934  */
    /* JADX WARN: Code duplicated, block: B:474:0x0956  */
    /* JADX WARN: Code duplicated, block: B:476:0x0961  */
    /* JADX WARN: Code duplicated, block: B:479:0x0968  */
    /* JADX WARN: Code duplicated, block: B:481:0x096b A[LOOP:38: B:477:0x0964->B:481:0x096b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:483:0x0971  */
    /* JADX WARN: Code duplicated, block: B:486:0x099d  */
    /* JADX WARN: Code duplicated, block: B:488:0x09ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:489:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:490:0x09af  */
    /* JADX WARN: Code duplicated, block: B:493:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:494:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:496:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:498:0x09d8 A[LOOP:39: B:497:0x09d6->B:498:0x09d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:500:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:503:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:506:0x09fb A[LOOP:40: B:502:0x09f2->B:506:0x09fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:509:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a0a A[LOOP:41: B:508:0x0a02->B:511:0x0a0a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:636:0x087e A[EDGE_INSN: B:636:0x087e->B:427:0x087e BREAK  A[LOOP:33: B:396:0x07ec->B:426:0x0873], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x08c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x089d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x08d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x08e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x096e A[EDGE_INSN: B:646:0x096e->B:482:0x096e BREAK  A[LOOP:38: B:477:0x0964->B:481:0x096b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0a00 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0a11 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0a11 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0a0d A[SYNTHETIC] */
    public static final fez C(dez dezVar, int i, int[] iArr, int[] iArr2, boolean z) {
        long j;
        xdz xdzVar;
        boolean z2;
        xw3[] xw3VarArr;
        int I;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int i8;
        dez dezVar2;
        int i9;
        int i10;
        boolean z3;
        long j2;
        int iG;
        int i11;
        float f;
        mez mezVar;
        ArrayList arrayList;
        int[] iArr5;
        int i12;
        ArrayList arrayList2;
        int i13;
        ArrayList arrayList3;
        int[] iArr6;
        List list;
        ArrayList arrayList4;
        mez mezVar2;
        dbz dbzVar;
        float f2;
        int i14;
        androidx.compose.foundation.lazy.layout.c cVar;
        cez cezVar;
        boolean z4;
        int i15;
        boolean zM;
        boolean z5;
        int i16;
        int length;
        int i17;
        int i18;
        int i19;
        int i20;
        int length2;
        int i21;
        boolean z6;
        int i22;
        long jB;
        int i23;
        int iG2;
        int iF;
        int i24;
        int size;
        int i25;
        int i26;
        int i27;
        int i28;
        int[] iArr7;
        int iT;
        int[] iArr8;
        int length3;
        int i29;
        int i30;
        int i31;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size2;
        int i32;
        int i33;
        List list2;
        hez hezVar;
        int i34;
        int iMin;
        List list3;
        Object obj;
        int i35;
        ydz ydzVar;
        int iN;
        int[] iArr9;
        int i36;
        int i37;
        int i38;
        int[] iArrS;
        ydz ydzVar2;
        int[] iArrS2;
        dezVar = dezVar;
        kez kezVar = dezVar.d;
        jbz jbzVar = dezVar.g;
        c5n0 c5n0Var = jbzVar.b;
        MutableIntList mutableIntList = dezVar.b;
        int i39 = dezVar.k;
        int i40 = dezVar.l;
        List list4 = dezVar.o;
        boolean z7 = dezVar.f;
        mez mezVar3 = dezVar.f5975a;
        int i41 = dezVar.s;
        int i42 = dezVar.h;
        int i43 = dezVar.j;
        cez cezVar2 = dezVar.q;
        jbz jbzVar2 = jbzVar;
        long j3 = dezVar.e;
        zz2 zz2Var = dezVar.r;
        List list5 = list4;
        ydz ydzVar3 = dezVar.c;
        kez kezVar2 = kezVar;
        int iB = ydzVar3.b();
        xdz xdzVar2 = ydzVar3.b;
        long j4 = j3;
        if (iB <= 0 || i41 == 0) {
            int iK = p4e.k(j4);
            int iJ = p4e.j(j4);
            mezVar3.t.d(0, iK, iJ, new ArrayList(), cezVar2.d.c, dezVar.q, dezVar.f, c5n0Var.M(), dezVar.s, dezVar.n, 0, 0, dezVar.m, dezVar.p);
            if (c5n0Var.M()) {
                j = j4;
            } else {
                long jB2 = mezVar3.t.b();
                if (qkx.a(jB2, 0L)) {
                    j = j4;
                } else {
                    j = j4;
                    iK = r4e.g((int) (jB2 >> 32), j);
                    iJ = r4e.f((int) (jB2 & 4294967295L), j);
                }
            }
            uj30 uj30VarX = vj30.x(jbzVar2, iK, iJ, new z8z((byte) 7));
            boolean z8 = dezVar.f;
            iun iunVar = iun.f15405a;
            long jK = (((long) p4e.k(j)) << 32) | (((long) p4e.j(j)) & 4294967295L);
            int i44 = dezVar.j;
            int i45 = dezVar.k;
            return new fez(iArr, iArr2, 0.0f, uj30VarX, 0.0f, false, z8, false, dezVar.d, xdzVar2.b, jbzVar2, iB, iunVar, jK, -i44, i42 + i45, i44, i45, dezVar.l, dezVar.m);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        int length4 = iArrCopyOf.length - 1;
        if (length4 >= 0) {
            while (true) {
                int i46 = length4 - 1;
                while (true) {
                    int i47 = iArrCopyOf[length4];
                    if (i47 < iB && zz2Var.d(i47, length4)) {
                        break;
                    }
                    xdz xdzVar3 = xdzVar2;
                    mez mezVar4 = mezVar3;
                    iArrCopyOf[length4] = zz2Var.o(iArrCopyOf[length4], length4);
                    xdzVar2 = xdzVar3;
                    mezVar3 = mezVar4;
                }
                int i48 = iArrCopyOf[length4];
                xdzVar = xdzVar2;
                if (i48 >= 0 && !ydzVar3.b.b.q(i48)) {
                    if (zz2Var.t(i48) == -2) {
                        int length5 = iArrCopyOf.length;
                        int i49 = 0;
                        while (true) {
                            if (i49 >= length5) {
                                i49 = -1;
                                break;
                            }
                            int i50 = length5;
                            if (iArrCopyOf[i49] == i48) {
                                break;
                            }
                            i49++;
                            length5 = i50;
                        }
                        int i51 = i49 + 1;
                        int i52 = i49;
                        if (i51 <= length4) {
                            while (true) {
                                if (iArrCopyOf[i51] == i48) {
                                    iArrCopyOf[i51] = zz2Var.o(i48, i51);
                                }
                                if (i51 == length4) {
                                    break;
                                }
                                i51++;
                            }
                        }
                        length4 = i52;
                    }
                    zz2Var.H(i48, length4);
                }
                if (i46 < 0) {
                    break;
                }
                length4 = i46;
                xdzVar2 = xdzVar;
                mezVar3 = mezVar3;
            }
        } else {
            xdzVar = xdzVar2;
            mezVar3 = mezVar3;
        }
        F(iArrCopyOf2, -i);
        xw3[] xw3VarArr2 = new xw3[i41];
        for (int i53 = 0; i53 < i41; i53++) {
            xw3VarArr2[i53] = new xw3(16);
        }
        int i54 = -i43;
        F(iArrCopyOf2, i54);
        boolean z9 = false;
        loop5: while (true) {
            int length6 = iArrCopyOf.length;
            int i55 = 0;
            while (true) {
                z2 = z9;
                if (i55 >= length6) {
                    xw3VarArr = xw3VarArr2;
                    I = -1;
                    break loop5;
                }
                int i56 = iArrCopyOf[i55];
                int i57 = i55;
                xw3VarArr = xw3VarArr2;
                if (iArrCopyOf2[i55] >= Math.max(-i40, 0) || i56 <= 0) {
                    i55 = i57 + 1;
                    z9 = z2;
                    iB = iB;
                    xw3VarArr2 = xw3VarArr;
                    ydzVar3 = ydzVar3;
                    i40 = i40;
                }
            }
            I = y(iArrCopyOf);
            int i58 = iArrCopyOf[I];
            int length7 = iArrCopyOf2.length;
            int i59 = 0;
            while (i59 < length7) {
                int i60 = length7;
                int i61 = i59;
                if (iArrCopyOf[i59] != iArrCopyOf[I]) {
                    int i62 = iArrCopyOf2[i61];
                    int i63 = iArrCopyOf2[I];
                    if (i62 < i63) {
                        iArrCopyOf2[i61] = i63;
                    }
                }
                i59 = i61 + 1;
                length7 = i60;
            }
            int iO = zz2Var.o(i58, I);
            if (iO < 0) {
                break;
            }
            int i64 = iB;
            long jA = dezVar.a(ydzVar3, iO, I);
            int i65 = i40;
            ydz ydzVar4 = ydzVar3;
            int i66 = (int) (jA & 4294967295L);
            int i67 = (int) (jA >> 32);
            int i68 = i66 - i67;
            zz2Var.H(iO, i68 != 1 ? -2 : i67);
            hez hezVarN1 = cezVar2.n1(iO, jA);
            int iB2 = B(iArrCopyOf2, jA);
            int[] iArrS3 = i68 != 1 ? zz2Var.s(iO) : null;
            boolean z10 = z2;
            while (i67 < i66) {
                iArrCopyOf[i67] = iO;
                int iN2 = hezVarN1.n() + iB2 + (iArrS3 == null ? 0 : iArrS3[i67]);
                iArrCopyOf2[i67] = iN2;
                if (i42 + iN2 <= 0) {
                    z10 = true;
                }
                i67++;
            }
            z9 = z10;
            iB = i64;
            xw3VarArr2 = xw3VarArr;
            ydzVar3 = ydzVar4;
            i40 = i65;
        }
        int i69 = iB;
        int i70 = i40;
        ydz ydzVar5 = ydzVar3;
        int i71 = iArrCopyOf2[0];
        if (i71 < i54) {
            int i72 = i54 - i71;
            F(iArrCopyOf2, i72);
            i2 = i - i72;
        } else {
            i2 = i;
        }
        F(iArrCopyOf2, i43);
        int i73 = -1;
        if (I == -1) {
            I = tx3.I(iArrCopyOf, 0);
        }
        if (I != -1 && D(iArrCopyOf, dezVar, iArrCopyOf2, I) && z) {
            zz2Var.D();
            int length8 = iArrCopyOf.length;
            int[] iArr10 = new int[length8];
            int i74 = 0;
            while (i74 < length8) {
                iArr10[i74] = i73;
                i74++;
                i73 = -1;
            }
            int length9 = iArrCopyOf2.length;
            int[] iArr11 = new int[length9];
            for (int i75 = 0; i75 < length9; i75++) {
                iArr11[i75] = iArrCopyOf2[I];
            }
            return C(dezVar, i2, iArr10, iArr11, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        int length10 = iArrCopyOf2.length;
        int[] iArr12 = new int[length10];
        for (int i76 = 0; i76 < length10; i76++) {
            iArr12[i76] = -iArrCopyOf2[i76];
        }
        int i77 = i54 + i70;
        int i78 = i42 + i39;
        int i79 = i78 < 0 ? 0 : i78;
        int iZ = z(iArrCopyOf3);
        boolean z11 = z2;
        int i80 = i54;
        int i81 = 0;
        while (true) {
            i2 = i2;
            if (iZ == -1 || i81 >= i41) {
                break;
            }
            int i82 = iArrCopyOf3[iZ];
            int i83 = i81;
            int length11 = iArrCopyOf3.length;
            iArrCopyOf = iArrCopyOf;
            i43 = i43;
            int i84 = Integer.MAX_VALUE;
            int i85 = 0;
            iZ = -1;
            while (i85 < length11) {
                int i86 = i85;
                int i87 = i82 + 1;
                int i88 = length11;
                int i89 = iArrCopyOf3[i86];
                if (i87 <= i89 && i89 < i84) {
                    i84 = i89;
                    iZ = i86;
                }
                i85 = i86 + 1;
                length11 = i88;
            }
            i81 = i83 + 1;
            if (i82 >= 0) {
                int[] iArr13 = iArrCopyOf2;
                ydzVar2 = ydzVar5;
                long jA2 = dezVar.a(ydzVar2, i82, iZ);
                hez hezVarN2 = cezVar2.n1(i82, jA2);
                int i90 = i42;
                int i91 = (int) (jA2 & 4294967295L);
                int[] iArr14 = iArrCopyOf3;
                int i92 = (int) (jA2 >> 32);
                int i93 = i91 - i92;
                zz2Var.H(i82, i93 != 1 ? -2 : i92);
                int iB3 = B(iArr12, jA2);
                if (i93 != 1) {
                    iArrS2 = zz2Var.s(i82);
                    if (iArrS2 == null) {
                        iArrS2 = new int[i41];
                    }
                } else {
                    iArrS2 = null;
                }
                int i94 = i92;
                while (i94 < i91) {
                    if (iArrS2 != null) {
                        iArrS2[i94] = iB3 - iArr12[i94];
                    }
                    iArr12[i94] = hezVarN2.n() + iB3;
                    iArr14[i94] = i82;
                    int i95 = i94;
                    xw3VarArr[i95].addLast(hezVarN2);
                    i94 = i95 + 1;
                }
                if (iB3 < i77 && iArr12[i92] <= i77) {
                    hezVarN2.l = false;
                    z11 = true;
                }
                if (i93 != 1) {
                    zz2Var.F(iArrS2, i82);
                    dezVar = dezVar;
                    i2 = i2;
                    ydzVar5 = ydzVar2;
                    i81 = i41;
                    iArrCopyOf3 = iArr14;
                    iZ = iZ;
                    i42 = i90;
                    i43 = i43;
                    iArrCopyOf2 = iArr13;
                } else {
                    iArrCopyOf3 = iArr14;
                    i81 = i81;
                    i42 = i90;
                    iArrCopyOf2 = iArr13;
                }
            } else {
                ydzVar2 = ydzVar5;
            }
            ydzVar5 = ydzVar2;
        }
        int[] iArr15 = iArrCopyOf;
        int[] iArr16 = iArrCopyOf2;
        int i96 = i42;
        int i97 = i43;
        ydz ydzVar6 = ydzVar5;
        int[] iArr17 = iArrCopyOf3;
        loop15: while (true) {
            int i98 = 0;
            while (true) {
                if (i98 >= length10) {
                    for (int i99 = 0; i99 < i41; i99++) {
                        if (!xw3VarArr[i99].isEmpty()) {
                            i3 = i69;
                            i4 = 1;
                            break loop15;
                        }
                    }
                    break;
                }
                int i100 = iArr12[i98];
                if (i100 < i79 || i100 <= 0) {
                    break;
                }
                i98++;
            }
            int iZ2 = z(iArr12);
            i4 = 1;
            int iS = tx3.S(iArr17) + 1;
            i3 = i69;
            if (iS >= i3) {
                break;
            }
            int[] iArr18 = iArr16;
            kez kezVar3 = kezVar2;
            mez mezVar5 = mezVar3;
            int i101 = i41;
            int i102 = length10;
            int[] iArr19 = iArr12;
            int i103 = i79;
            ydz ydzVar7 = ydzVar6;
            jbz jbzVar3 = jbzVar2;
            List list6 = list5;
            long j5 = j4;
            int i104 = i70;
            int i105 = i96;
            int i106 = i80;
            int[] iArr20 = iArr17;
            long jA3 = dezVar.a(ydzVar7, iS, iZ2);
            int i107 = (int) (jA3 & 4294967295L);
            int i108 = (int) (jA3 >> 32);
            int i109 = i107 - i108;
            zz2Var.H(iS, i109 != 1 ? -2 : i108);
            hez hezVarN3 = cezVar2.n1(iS, jA3);
            int iB4 = B(iArr19, jA3);
            if (i109 != 1) {
                iArrS = zz2Var.s(iS);
                i38 = i101;
                if (iArrS == null) {
                    iArrS = new int[i38];
                }
            } else {
                i38 = i101;
                iArrS = null;
            }
            int i110 = i108;
            while (i110 < i107) {
                if (iArrS != null) {
                    iArrS[i110] = iB4 - iArr19[i110];
                }
                iArr20[i110] = iS;
                iArr19[i110] = hezVarN3.n() + iB4;
                int i111 = i110;
                xw3VarArr[i111].addLast(hezVarN3);
                i110 = i111 + 1;
            }
            zz2Var.F(iArrS, iS);
            if (iB4 < i77 && iArr19[i108] <= i77) {
                hezVarN3.l = false;
            }
            ydzVar6 = ydzVar7;
            length10 = i102;
            mezVar3 = mezVar5;
            i41 = i38;
            i80 = i106;
            iArr17 = iArr20;
            jbzVar2 = jbzVar3;
            iArr12 = iArr19;
            i69 = i3;
            i79 = i103;
            list5 = list6;
            iArr16 = iArr18;
            kezVar2 = kezVar3;
            i96 = i105;
            j4 = j5;
            i70 = i104;
        }
        int i112 = 0;
        while (i112 < i41) {
            xw3 xw3Var = xw3VarArr[i112];
            while (xw3Var.b() > i4 && !((hez) xw3Var.first()).l) {
                hez hezVar2 = (hez) xw3Var.removeFirst();
                int[] iArrS4 = hezVar2.f != i4 ? zz2Var.s(hezVar2.f12949a) : null;
                iArr16[i112] = iArr16[i112] - (hezVar2.n() + (iArrS4 == null ? 0 : iArrS4[i112]));
                i4 = 1;
            }
            hez hezVar3 = (hez) xw3Var.h();
            iArr15[i112] = hezVar3 != null ? hezVar3.f12949a : -1;
            i112++;
            i4 = 1;
        }
        int length12 = iArr17.length;
        int i113 = 0;
        while (true) {
            if (i113 >= length12) {
                i5 = i70;
                break;
            }
            if (iArr17[i113] == i3 - 1) {
                i5 = i70;
                F(iArr12, -i5);
                break;
            }
            i113++;
        }
        int i114 = 0;
        while (true) {
            if (i114 >= length10) {
                i6 = i96;
                int i115 = i6 - iArr12[y(iArr12)];
                iArr3 = iArr16;
                F(iArr3, -i115);
                F(iArr12, i115);
                boolean z12 = false;
                loop43: while (true) {
                    int length13 = iArr3.length;
                    int i116 = 0;
                    while (true) {
                        if (i116 >= length13) {
                            i7 = i115;
                            iArr4 = iArr15;
                            i8 = i97;
                            dezVar2 = dezVar;
                            i9 = i2;
                            break loop43;
                        }
                        z3 = z12;
                        int i117 = iArr3[i116];
                        int i118 = i116;
                        i8 = i97;
                        if (i117 < i8) {
                            break;
                        }
                        i115 = i115;
                        iArr17 = iArr17;
                        iArr15 = iArr15;
                        i97 = i8;
                        length10 = length10;
                        i116 = i118 + 1;
                        z12 = z3;
                    }
                    int iZ3 = z(iArr3);
                    int iY = y(iArr15);
                    if (iZ3 != iY) {
                        if (iArr3[iZ3] == iArr3[iY]) {
                            iZ3 = iY;
                        } else {
                            iZ3 = iZ3;
                            z3 = true;
                        }
                    }
                    int i119 = iArr15[iZ3];
                    i7 = i115;
                    if (i119 == -1) {
                        i119 = i3;
                    }
                    int iO2 = zz2Var.o(i119, iZ3);
                    if (iO2 < 0) {
                        dezVar2 = dezVar;
                        int[] iArr21 = iArr15;
                        if ((!z3 && !D(iArr21, dezVar2, iArr3, iZ3)) || !z) {
                            i9 = i2;
                            iArr4 = iArr21;
                            z12 = z3;
                            break;
                        }
                        zz2Var.D();
                        int length14 = iArr21.length;
                        int[] iArr22 = new int[length14];
                        for (int i120 = 0; i120 < length14; i120++) {
                            iArr22[i120] = -1;
                        }
                        int length15 = iArr3.length;
                        int[] iArr23 = new int[length15];
                        for (int i121 = 0; i121 < length15; i121++) {
                            iArr23[i121] = iArr3[iZ3];
                        }
                        return C(dezVar2, i2, iArr22, iArr23, false);
                    }
                    int i122 = length10;
                    int i123 = i3;
                    int i124 = i41;
                    int[] iArr24 = iArr15;
                    int[] iArr25 = iArr17;
                    int i125 = i2;
                    long jA4 = dezVar.a(ydzVar6, iO2, iZ3);
                    int i126 = i79;
                    ydz ydzVar8 = ydzVar6;
                    int i127 = (int) (jA4 & 4294967295L);
                    int i128 = (int) (jA4 >> 32);
                    int i129 = i127 - i128;
                    zz2Var.H(iO2, i129 != 1 ? -2 : i128);
                    hez hezVarN4 = cezVar2.n1(iO2, jA4);
                    int iB5 = B(iArr3, jA4);
                    int[] iArrS5 = i129 != 1 ? zz2Var.s(iO2) : null;
                    int i130 = i128;
                    while (i130 < i127) {
                        int i131 = i127;
                        if (iArr3[i130] != iB5) {
                            z3 = true;
                        }
                        xw3VarArr[i130].addFirst(hezVarN4);
                        iArr24[i130] = iO2;
                        iArr3[i130] = hezVarN4.n() + iB5 + (iArrS5 == null ? 0 : iArrS5[i130]);
                        i130++;
                        i127 = i131;
                    }
                    i2 = i125;
                    z12 = z3;
                    i115 = i7;
                    iArr17 = iArr25;
                    i41 = i124;
                    i3 = i123;
                    i79 = i126;
                    ydzVar6 = ydzVar8;
                    iArr15 = iArr24;
                    i97 = i8;
                    length10 = i122;
                }
                if (!z12 || !z) {
                    i10 = i9 + i7;
                    int i132 = iArr3[z(iArr3)];
                    if (i132 >= 0) {
                        break;
                    }
                    i10 += i132;
                    F(iArr12, i132);
                    F(iArr3, -i132);
                    break;
                }
                zz2Var.D();
                return C(dezVar2, i9, iArr4, iArr3, false);
            }
            i6 = i96;
            if (iArr12[i114] >= i6) {
                dezVar2 = dezVar;
                i10 = i2;
                length10 = length10;
                i79 = i79;
                ydzVar6 = ydzVar6;
                iArr4 = iArr15;
                i8 = i97;
                iArr3 = iArr16;
                i3 = i3;
                i41 = i41;
                iArr17 = iArr17;
                i9 = i10;
                break;
            }
            i114++;
            i96 = i6;
        }
        mez mezVar6 = mezVar3;
        float fFloatValue = (c5n0Var.M() || !mezVar6.f21671a) ? mezVar6.o : ((Number) ((hgk0) ((l73) mezVar6.w.c).b).getValue()).floatValue();
        float f3 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i10) || Math.abs(Math.round(fFloatValue)) < Math.abs(i10)) ? fFloatValue : i10;
        float f4 = fFloatValue - f3;
        float f5 = 0.0f;
        if (c5n0Var.M() && i10 > i9 && f4 <= 0.0f) {
            f5 = (i10 - i9) + f4;
        }
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        int length16 = iArrCopyOf4.length;
        for (int i133 = 0; i133 < length16; i133++) {
            iArrCopyOf4[i133] = -iArrCopyOf4[i133];
        }
        int i134 = i41;
        if (i8 > i5) {
            int i135 = 0;
            while (i135 < i134) {
                xw3 xw3Var2 = xw3VarArr[i135];
                int iB6 = xw3Var2.b();
                int i136 = i135;
                int i137 = 0;
                while (true) {
                    if (i137 >= iB6) {
                        iArr9 = iArr4;
                        i36 = i8;
                        break;
                    }
                    iArr9 = iArr4;
                    hez hezVar4 = (hez) xw3Var2.get(i137);
                    i36 = i8;
                    int[] iArrS6 = zz2Var.s(hezVar4.f12949a);
                    int iN3 = hezVar4.n() + (iArrS6 == null ? 0 : iArrS6[i136]);
                    if (i137 == xw3Var2.size() - 1 || (i37 = iArr3[i136]) == 0 || i37 < iN3) {
                        break;
                    }
                    iArr3[i136] = i37 - iN3;
                    i137++;
                    iArr9[i136] = ((hez) xw3Var2.get(i137)).f12949a;
                    iArr4 = iArr9;
                    i8 = i36;
                }
                i135 = i136 + 1;
                iArr4 = iArr9;
                i8 = i36;
            }
        }
        int[] iArr26 = iArr4;
        int i138 = i8;
        int i139 = i138 + i39;
        if (z7) {
            iG = p4e.i(j4);
            j2 = j4;
        } else {
            j2 = j4;
            iG = r4e.g(tx3.S(iArr12) + i139, j2);
        }
        int i140 = iG;
        int iF2 = z7 ? r4e.f(tx3.S(iArr12) + i139, j2) : p4e.h(j2);
        int iMin2 = (Math.min(z7 ? iF2 : i140, i6) - i138) + i39;
        int i141 = iArrCopyOf4[0];
        MutableIntList mutableIntList2 = mutableIntList;
        float f6 = f5;
        int[] iArr27 = mutableIntList2.f45342a;
        int i142 = mutableIntList2.b - 1;
        List arrayList7 = null;
        while (-1 < i142) {
            int i143 = iArr27[i142];
            int i144 = i142;
            int iT2 = zz2Var.t(i143);
            int[] iArr28 = iArr12;
            if (iT2 == -2 || iT2 == -1) {
                int i145 = 0;
                while (true) {
                    if (i145 >= i134) {
                        ydzVar = ydzVar6;
                        long jA5 = dezVar2.a(ydzVar, i143, 0);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        List list7 = arrayList7;
                        hez hezVarN5 = cezVar2.n1(i143, jA5);
                        iN = i141 - hezVarN5.n();
                        hezVarN5.o(iN, 0, iMin2);
                        list7.add(hezVarN5);
                        arrayList7 = list7;
                    } else {
                        hez hezVar5 = (hez) xw3VarArr[i145].h();
                        if ((hezVar5 != null ? hezVar5.f12949a : -1) > i143) {
                            i145++;
                        } else {
                            ydzVar = ydzVar6;
                            iN = i141;
                        }
                    }
                }
            } else {
                hez hezVar6 = (hez) xw3VarArr[iT2].h();
                if ((hezVar6 != null ? hezVar6.f12949a : -1) > i143) {
                    ydzVar = ydzVar6;
                    long jA6 = dezVar2.a(ydzVar, i143, 0);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    List list8 = arrayList7;
                    hez hezVarN6 = cezVar2.n1(i143, jA6);
                    iN = i141 - hezVarN6.n();
                    hezVarN6.o(iN, 0, iMin2);
                    list8.add(hezVarN6);
                    arrayList7 = list8;
                } else {
                    ydzVar = ydzVar6;
                    iN = i141;
                }
            }
            i142 = i144 - 1;
            i141 = iN;
            ydzVar6 = ydzVar;
            iArr12 = iArr28;
            j2 = j2;
        }
        long j6 = j2;
        int[] iArr29 = iArr12;
        ydz ydzVar9 = ydzVar6;
        if (arrayList7 == null) {
            arrayList7 = iun.f15405a;
        }
        List list9 = arrayList7;
        int i146 = 0;
        for (int i147 = 0; i147 < i134; i147++) {
            i146 += xw3VarArr[i147].c;
        }
        ArrayList arrayList8 = new ArrayList(i146);
        loop28: while (true) {
            int i148 = 0;
            while (true) {
                if (i148 >= i134) {
                    break loop28;
                }
                if (!xw3VarArr[i148].isEmpty()) {
                    break;
                }
                i148++;
                iArrCopyOf4 = iArrCopyOf4;
                kezVar2 = kezVar2;
                i134 = i134;
            }
            i6 = i6;
            int i149 = Integer.MAX_VALUE;
            int i150 = -1;
            int i151 = 0;
            while (i151 < i134) {
                int i152 = i151;
                hez hezVar7 = (hez) xw3VarArr[i151].h();
                int i153 = hezVar7 != null ? hezVar7.f12949a : Integer.MAX_VALUE;
                if (i149 > i153) {
                    i149 = i153;
                    i150 = i152;
                }
                i151 = i152 + 1;
            }
            hez hezVar8 = (hez) xw3VarArr[i150].removeFirst();
            int i154 = hezVar8.e;
            if (i154 == i150) {
                int i155 = i150;
                int i156 = i134;
                long j7 = (((long) i154) << 32) | (((long) (hezVar8.f + i154)) & 4294967295L);
                int iB7 = B(iArrCopyOf4, j7);
                kez kezVar4 = kezVar2;
                int i157 = kezVar4.f18173a[i155];
                int[] iArr30 = iArrCopyOf4;
                int[] iArr31 = iArr3;
                int i158 = i80;
                if (hezVar8.m + iB7 >= i158) {
                    i35 = i79;
                    if (iB7 <= i35) {
                        hezVar8.o(iB7, i157, iMin2);
                        arrayList8.add(hezVar8);
                    }
                } else {
                    i35 = i79;
                }
                i80 = i158;
                mez mezVar7 = mezVar6;
                int i159 = (int) (j7 & 4294967295L);
                for (int i160 = (int) (j7 >> 32); i160 < i159; i160++) {
                    iArr30[i160] = hezVar8.n() + iB7;
                }
                i79 = i35;
                mezVar6 = mezVar7;
                iArr3 = iArr31;
                iArrCopyOf4 = iArr30;
                kezVar2 = kezVar4;
                i134 = i156;
            }
        }
        int[] iArr32 = iArrCopyOf4;
        int i161 = i6;
        mez mezVar8 = mezVar6;
        kez kezVar5 = kezVar2;
        int i162 = i79;
        int[] iArr33 = iArr3;
        int iN4 = iArr32[0];
        hez hezVar9 = (hez) CollectionsKt.f0(arrayList8);
        int i163 = hezVar9 != null ? hezVar9.f12949a : -1;
        if (c5n0Var.M() && list5 != null && !list5.isEmpty()) {
            int size3 = list5.size() - 1;
            while (true) {
                if (-1 >= size3) {
                    i11 = i162;
                    list2 = list5;
                    hezVar = null;
                    break;
                }
                list2 = list5;
                i11 = i162;
                if (((hez) list2.get(size3)).f12949a > i163 && (size3 == 0 || ((hez) list2.get(size3 - 1)).f12949a <= i163)) {
                    hezVar = (hez) list2.get(size3);
                    break;
                }
                size3--;
                list5 = list2;
                i162 = i11;
            }
            hez hezVar10 = (hez) CollectionsKt.d0(list2);
            if (hezVar != null && (i34 = hezVar.f12949a) <= (iMin = Math.min(hezVar10.f12949a, i3 - 1))) {
                arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        mezVar = mezVar8;
                        int size4 = arrayList.size();
                        f = f3;
                        int i164 = 0;
                        while (true) {
                            if (i164 < size4) {
                                ArrayList arrayList9 = arrayList;
                                if (((hez) arrayList.get(i164)).f12949a == i34) {
                                    list3 = list2;
                                    arrayList = arrayList9;
                                } else {
                                    i164++;
                                    arrayList = arrayList9;
                                }
                            }
                            if (i34 != iMin) {
                                break;
                            }
                            i34++;
                            mutableIntList2 = mutableIntList2;
                            f3 = f;
                            list2 = list3;
                            mezVar8 = mezVar;
                        }
                    } else {
                        f = f3;
                        mezVar = mezVar8;
                    }
                    ArrayList arrayList10 = arrayList;
                    ArrayList arrayList11 = arrayList10 == null ? new ArrayList() : arrayList10;
                    int size5 = list2.size();
                    int i165 = 0;
                    while (true) {
                        if (i165 >= size5) {
                            list3 = list2;
                            obj = null;
                            break;
                        }
                        obj = list2.get(i165);
                        list3 = list2;
                        if (((hez) obj).f12949a == i34) {
                            break;
                        }
                        i165++;
                        list2 = list3;
                    }
                    hez hezVar11 = (hez) obj;
                    int i166 = hezVar11 != null ? hezVar11.e : 0;
                    hez hezVarN7 = cezVar2.n1(i34, dezVar2.a(ydzVar9, i34, i166));
                    arrayList11.add(hezVarN7);
                    int[] iArr34 = kezVar5.f18173a;
                    ArrayList arrayList12 = arrayList11;
                    hezVarN7.o(iN4, iArr34.length > i166 ? iArr34[i166] : 0, iMin2);
                    iN4 = hezVarN7.n() + iN4;
                    arrayList = arrayList12;
                    if (i34 != iMin) {
                        break;
                        break;
                    }
                    i34++;
                    mutableIntList2 = mutableIntList2;
                    f3 = f;
                    list2 = list3;
                    mezVar8 = mezVar;
                }
            }
            MutableIntList mutableIntList3 = mutableIntList2;
            iArr5 = mutableIntList3.f45342a;
            i12 = mutableIntList3.b;
            arrayList2 = null;
            i13 = 0;
            while (i13 < i12) {
                i28 = iArr5[i13];
                i3 = i3;
                if (i28 >= i3) {
                    iArr7 = iArr5;
                } else {
                    if (arrayList != null) {
                        size2 = arrayList.size();
                        iArr7 = iArr5;
                        i32 = 0;
                        while (true) {
                            if (i32 < size2) {
                                i33 = i32;
                                if (((hez) arrayList.get(i32)).f12949a == i28) {
                                    i32 = i33 + 1;
                                }
                            }
                        }
                    } else {
                        iArr7 = iArr5;
                    }
                    iT = zz2Var.t(i28);
                    if (iT != -2 || iT == -1) {
                        iArr8 = iArr17;
                        length3 = iArr8.length;
                        i29 = i12;
                        i30 = 0;
                        while (true) {
                            if (i30 < length3) {
                                i31 = i30;
                                if (iArr8[i31] < i28) {
                                    i30 = i31 + 1;
                                } else {
                                    i3 = i3;
                                    i13++;
                                    iArr17 = iArr8;
                                    iArr5 = iArr7;
                                    i12 = i29;
                                }
                            }
                        }
                    } else if (iArr17[iT] < i28) {
                        i29 = i12;
                        iArr8 = iArr17;
                    }
                    arrayList5 = arrayList2;
                    long jA7 = dezVar2.a(ydzVar9, i28, 0);
                    if (arrayList5 == null) {
                        arrayList6 = new ArrayList();
                    } else {
                        arrayList6 = arrayList5;
                    }
                    hez hezVarN8 = cezVar2.n1(i28, jA7);
                    hezVarN8.o(iN4, 0, iMin2);
                    int iN5 = hezVarN8.n() + iN4;
                    arrayList6.add(hezVarN8);
                    iN4 = iN5;
                    arrayList2 = arrayList6;
                    i13++;
                    iArr17 = iArr8;
                    iArr5 = iArr7;
                    i12 = i29;
                }
                i29 = i12;
                iArr8 = iArr17;
                i3 = i3;
                i13++;
                iArr17 = iArr8;
                iArr5 = iArr7;
                i12 = i29;
            }
            arrayList3 = arrayList2;
            iArr6 = iArr17;
            if (arrayList3 == null) {
                list = iun.f15405a;
            } else {
                list = arrayList3;
            }
            arrayList4 = new ArrayList();
            arrayList4.addAll(list9);
            arrayList4.addAll(arrayList8);
            if (arrayList != null) {
                arrayList4.addAll(arrayList);
            }
            arrayList4.addAll(list);
            mezVar2 = mezVar;
            dbzVar = mezVar2.t;
            f2 = f;
            i14 = (int) f2;
            cVar = cezVar2.d.c;
            cezVar = dezVar2.q;
            z4 = dezVar2.f;
            i15 = dezVar2.s;
            zM = c5n0Var.M();
            z5 = dezVar2.n;
            if (iArr33.length != 0) {
                itt0.a();
                return null;
            }
            i16 = iArr33[0];
            length = iArr33.length - 1;
            if (1 <= length) {
                i26 = 1;
                while (true) {
                    i27 = iArr33[i26];
                    if (i16 > i27) {
                        i16 = i27;
                    }
                    if (i26 != length) {
                        break;
                    }
                    i26++;
                }
            }
            dbzVar.d(i14, i140, iF2, arrayList4, cVar, cezVar, z4, zM, i15, z5, i16, tx3.S(iArr29) + i139, dezVar2.m, dezVar2.p);
            if (c5n0Var.M()) {
                i17 = i140;
                i18 = iF2;
            } else {
                jB = mezVar2.t.b();
                if (qkx.a(jB, 0L)) {
                    i17 = i140;
                    i18 = iF2;
                } else {
                    if (z7) {
                        i23 = iF2;
                    } else {
                        i23 = i140;
                    }
                    iG2 = r4e.g(Math.max(i140, (int) (jB >> 32)), j6);
                    iF = r4e.f(Math.max(iF2, (int) (jB & 4294967295L)), j6);
                    if (z7) {
                        i24 = iF;
                    } else {
                        i24 = iG2;
                    }
                    if (i24 != i23) {
                        size = arrayList4.size();
                        for (i25 = 0; i25 < size; i25++) {
                            hez hezVar12 = (hez) arrayList4.get(i25);
                            hezVar12.r = i24;
                            hezVar12.t = hezVar12.h + i24;
                        }
                    }
                    i17 = iG2;
                    i18 = iF;
                }
            }
            i19 = length10;
            i20 = 0;
            while (true) {
                if (i20 >= i19) {
                    length2 = iArr6.length;
                    i21 = 0;
                    while (true) {
                        if (i21 < length2) {
                            if (iArr6[i21] < i3 - 1) {
                                z6 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                } else {
                    i22 = i161;
                    if (iArr29[i20] > i22) {
                        i20++;
                        i161 = i22;
                    }
                }
                z6 = true;
                break;
            }
            dez dezVar3 = dezVar2;
            jbz jbzVar4 = jbzVar2;
            return new fez(iArr26, iArr33, f2, vj30.x(jbzVar4, i17, i18, new as0((Object) dezVar3, (Object) arrayList4, dezVar2.i, (Object) jbzVar4, (byte) 6)), f6, z6, dezVar3.f, z11, dezVar3.d, xdzVar.b, jbzVar4, i3, arrayList8, (((long) i17) << 32) | (((long) i18) & 4294967295L), i80, i11, dezVar3.j, dezVar3.k, dezVar3.l, dezVar3.m);
        }
        i11 = i162;
        f = f3;
        mezVar = mezVar8;
        mutableIntList2 = mutableIntList2;
        arrayList = null;
        MutableIntList mutableIntList4 = mutableIntList2;
        iArr5 = mutableIntList4.f45342a;
        i12 = mutableIntList4.b;
        arrayList2 = null;
        i13 = 0;
        while (i13 < i12) {
            i28 = iArr5[i13];
            i3 = i3;
            if (i28 >= i3) {
                iArr7 = iArr5;
            } else {
                if (arrayList != null) {
                    size2 = arrayList.size();
                    iArr7 = iArr5;
                    i32 = 0;
                    while (true) {
                        if (i32 < size2) {
                            i33 = i32;
                            if (((hez) arrayList.get(i32)).f12949a == i28) {
                                i32 = i33 + 1;
                            }
                        }
                    }
                } else {
                    iArr7 = iArr5;
                }
                iT = zz2Var.t(i28);
                if (iT != -2) {
                    iArr8 = iArr17;
                    length3 = iArr8.length;
                    i29 = i12;
                    i30 = 0;
                    while (true) {
                        if (i30 < length3) {
                            i31 = i30;
                            if (iArr8[i31] < i28) {
                                i30 = i31 + 1;
                            } else {
                                i3 = i3;
                            }
                        } else {
                            arrayList5 = arrayList2;
                            long jA8 = dezVar2.a(ydzVar9, i28, 0);
                            if (arrayList5 == null) {
                                arrayList6 = new ArrayList();
                            } else {
                                arrayList6 = arrayList5;
                            }
                            hez hezVarN9 = cezVar2.n1(i28, jA8);
                            hezVarN9.o(iN4, 0, iMin2);
                            int iN6 = hezVarN9.n() + iN4;
                            arrayList6.add(hezVarN9);
                            iN4 = iN6;
                            arrayList2 = arrayList6;
                        }
                    }
                } else {
                    iArr8 = iArr17;
                    length3 = iArr8.length;
                    i29 = i12;
                    i30 = 0;
                    while (true) {
                        if (i30 < length3) {
                            i31 = i30;
                            if (iArr8[i31] < i28) {
                                i30 = i31 + 1;
                            } else {
                                i3 = i3;
                            }
                        } else {
                            arrayList5 = arrayList2;
                            long jA9 = dezVar2.a(ydzVar9, i28, 0);
                            if (arrayList5 == null) {
                                arrayList6 = new ArrayList();
                            } else {
                                arrayList6 = arrayList5;
                            }
                            hez hezVarN10 = cezVar2.n1(i28, jA9);
                            hezVarN10.o(iN4, 0, iMin2);
                            int iN7 = hezVarN10.n() + iN4;
                            arrayList6.add(hezVarN10);
                            iN4 = iN7;
                            arrayList2 = arrayList6;
                        }
                    }
                }
                i13++;
                iArr17 = iArr8;
                iArr5 = iArr7;
                i12 = i29;
            }
            i29 = i12;
            iArr8 = iArr17;
            i3 = i3;
            i13++;
            iArr17 = iArr8;
            iArr5 = iArr7;
            i12 = i29;
        }
        arrayList3 = arrayList2;
        iArr6 = iArr17;
        if (arrayList3 == null) {
            list = iun.f15405a;
        } else {
            list = arrayList3;
        }
        arrayList4 = new ArrayList();
        arrayList4.addAll(list9);
        arrayList4.addAll(arrayList8);
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        arrayList4.addAll(list);
        mezVar2 = mezVar;
        dbzVar = mezVar2.t;
        f2 = f;
        i14 = (int) f2;
        cVar = cezVar2.d.c;
        cezVar = dezVar2.q;
        z4 = dezVar2.f;
        i15 = dezVar2.s;
        zM = c5n0Var.M();
        z5 = dezVar2.n;
        if (iArr33.length != 0) {
            itt0.a();
            return null;
        }
        i16 = iArr33[0];
        length = iArr33.length - 1;
        if (1 <= length) {
            i26 = 1;
            while (true) {
                i27 = iArr33[i26];
                if (i16 > i27) {
                    i16 = i27;
                }
                if (i26 != length) {
                    break;
                    break;
                }
                i26++;
            }
        }
        dbzVar.d(i14, i140, iF2, arrayList4, cVar, cezVar, z4, zM, i15, z5, i16, tx3.S(iArr29) + i139, dezVar2.m, dezVar2.p);
        if (c5n0Var.M()) {
            jB = mezVar2.t.b();
            if (qkx.a(jB, 0L)) {
                if (z7) {
                    i23 = iF2;
                } else {
                    i23 = i140;
                }
                iG2 = r4e.g(Math.max(i140, (int) (jB >> 32)), j6);
                iF = r4e.f(Math.max(iF2, (int) (jB & 4294967295L)), j6);
                if (z7) {
                    i24 = iF;
                } else {
                    i24 = iG2;
                }
                if (i24 != i23) {
                    size = arrayList4.size();
                    while (i25 < size) {
                        hez hezVar13 = (hez) arrayList4.get(i25);
                        hezVar13.r = i24;
                        hezVar13.t = hezVar13.h + i24;
                    }
                }
                i17 = iG2;
                i18 = iF;
            } else {
                i17 = i140;
                i18 = iF2;
            }
        } else {
            i17 = i140;
            i18 = iF2;
        }
        i19 = length10;
        i20 = 0;
        while (true) {
            if (i20 >= i19) {
                length2 = iArr6.length;
                i21 = 0;
                while (true) {
                    if (i21 < length2) {
                        if (iArr6[i21] < i3 - 1) {
                            z6 = false;
                            break;
                        }
                        i21++;
                    }
                }
            } else {
                i22 = i161;
                if (iArr29[i20] > i22) {
                    i20++;
                    i161 = i22;
                }
            }
            z6 = true;
            break;
        }
        dez dezVar4 = dezVar2;
        jbz jbzVar5 = jbzVar2;
        return new fez(iArr26, iArr33, f2, vj30.x(jbzVar5, i17, i18, new as0((Object) dezVar4, (Object) arrayList4, dezVar2.i, (Object) jbzVar5, (byte) 6)), f6, z6, dezVar4.f, z11, dezVar4.d, xdzVar.b, jbzVar5, i3, arrayList8, (((long) i17) << 32) | (((long) i18) & 4294967295L), i80, i11, dezVar4.j, dezVar4.k, dezVar4.l, dezVar4.m);
    }

    public static final boolean D(int[] iArr, dez dezVar, int[] iArr2, int i) {
        zz2 zz2Var = dezVar.r;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zz2Var.o(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (zz2Var.o(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iT = zz2Var.t(0);
        return (iT == 0 || iT == -1 || iT == -2) ? false : true;
    }

    public static String E(CharSequence charSequence, boolean z) {
        charSequence.getClass();
        Map map = tzn.f34812a;
        String strA = tzn.a(r(charSequence, "<>"), true, z);
        StringBuilder sb = new StringBuilder();
        s43 s43Var = new s43(sb, (byte) 7);
        strA.getClass();
        int i = 0;
        while (i < strA.length()) {
            char cCharAt = strA.charAt(i);
            boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
            int i2 = cCharAt;
            if (zIsHighSurrogate) {
                int i3 = i + 1;
                i2 = cCharAt;
                if (i3 < strA.length()) {
                    char cCharAt2 = strA.charAt(i3);
                    i2 = cCharAt;
                    if (Character.isLowSurrogate(cCharAt2)) {
                        i2 = ((cCharAt << '\n') + cCharAt2) - 56613888;
                    }
                }
            }
            s43Var.invoke(Integer.valueOf(i2));
            i += i2 >= 65536 ? 2 : 1;
        }
        return sb.toString();
    }

    public static final void F(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static vr00 G(wvq0 wvq0Var, qb00 qb00Var) {
        wvq0 wvq0VarA;
        vr00 vr00VarL;
        vr00 vr00VarM;
        vr00 vr00Var;
        wvq0Var.getClass();
        int i = wvq0Var.f39851a;
        if (qb00Var != null) {
            wvq0VarA = qb00Var.a(wvq0Var, qb00Var.b, 0);
        } else {
            vr00 vr00VarM2 = gfx.M(wvq0Var);
            wvq0VarA = vr00VarM2 != null ? vr00VarM2.f37876a : null;
        }
        if (wvq0VarA == null) {
            vr00Var = null;
        } else {
            wvq0 wvq0VarA2 = wvq0VarA.a();
            if (wvq0VarA2.d() != wvq0VarA.c() || (vr00VarL = gfx.L(wvq0VarA2)) == null || (vr00VarM = gfx.M(wvq0Var)) == null) {
                vr00Var = null;
            } else {
                wvq0 wvq0Var2 = vr00VarL.f37876a;
                vr00Var = new vr00(wvq0Var2, (Collection) CollectionsKt.r0(CollectionsKt.q0(vr00VarM.b, vr00VarL.b), new sgi0(new IntRange(i, wvq0Var2.f39851a + 1, 1), wb.E)), (Collection) CollectionsKt.q0(vr00VarM.c, vr00VarL.c));
            }
        }
        if (vr00Var != null) {
            return vr00Var;
        }
        vr00 vr00VarL2 = gfx.L(wvq0Var);
        if (vr00VarL2 == null) {
            return null;
        }
        wvq0 wvq0VarA3 = vr00VarL2.f37876a;
        wvq0 wvq0VarA4 = wvq0VarA3.a();
        if (wvq0VarA4.d() == wvq0VarA3.c() && Intrinsics.d(wvq0VarA4.e(), cy2.F) && Intrinsics.d(wvq0VarA4.g(), cy2.G)) {
            wvq0VarA3 = wvq0VarA4.a();
        }
        return new vr00(wvq0VarA3, CollectionsKt.r0(vr00VarL2.b, new sgi0(new IntRange(i, wvq0VarA3.f39851a + 1, 1), wb.F)), vr00VarL2.c);
    }

    public static final Object H(glz glzVar, lkz lkzVar, Function2 function2, bnn0 bnn0Var) {
        if (lkzVar == lkz.b) {
            jf4.o("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (glzVar.i == lkz.f20223a) {
            return Unit.f46060a;
        }
        Object objJ = d5c.J(bnn0Var, new wmq((Object) glzVar, (Object) lkzVar, (Object) function2, (yje) null, (byte) 23));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    public static final ExtractedText I(a8q0 a8q0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = a8q0Var.f440a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = a8q0Var.b;
        extractedText.selectionStart = o9q0.f(j);
        extractedText.selectionEnd = o9q0.e(j);
        extractedText.flags = !StringsKt.P(a8q0Var.f440a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String J(long j) {
        if (j <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strH = axq.h(j, "/sfiles/sppic1/cyber/mlbb/heroes/", ".png");
        if (strH.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strH, ujn.h, false) || kotlin.text.c.x(strH, "https://", false)) {
            sb.setLength(0);
            sb.append(strH);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strH, '/'));
        }
        return sb.toString();
    }

    public static final r510 K(u510 u510Var) {
        u510Var.getClass();
        Integer num = u510Var.f35074a;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = u510Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = u510Var.c;
        if (str == null) {
            str = "";
        }
        String str2 = u510Var.d;
        return new r510(iIntValue, jLongValue, str, str2 != null ? str2 : "");
    }

    public static final kx20 L(dt20 dt20Var, int i) {
        Integer num;
        dt20Var.getClass();
        at20 at20Var = dt20Var.f6642a;
        if (at20Var == null || (num = at20Var.f1415a) == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        List<gt20> list = dt20Var.b;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (gt20 gt20Var : list) {
            Float f = gt20Var.f11860a;
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            Long l = gt20Var.c;
            long millis = TimeUnit.SECONDS.toMillis(l != null ? l.longValue() : 0L);
            String str = gt20Var.b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new jx20(fFloatValue, millis, str));
        }
        jfo jfoVar = at20Var.c;
        List list2 = jfoVar != null ? jfoVar.f16438a : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = jfoVar != null ? jfoVar.b : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        return new kx20(iIntValue, i, arrayList, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static final el40 M(bj40 bj40Var, jch jchVar) {
        ni40 ni40Var;
        ?? arrayList;
        e9h e9hVar;
        Long l;
        Integer num;
        List list;
        Long l2;
        List<a9h> list2;
        bj40Var.getClass();
        t9h t9hVar = bj40Var.f2688a;
        fl40 fl40VarN = N(t9hVar != null ? t9hVar.f33562a : null);
        fl40 fl40VarN2 = N(t9hVar != null ? t9hVar.b : null);
        e9h e9hVar2 = t9hVar != null ? t9hVar.c : null;
        Integer num2 = e9hVar2 != null ? e9hVar2.f7420a : null;
        if (num2 != null && num2.intValue() == 0) {
            ni40Var = ni40.f23564a;
        } else if (num2 != null && num2.intValue() == 1) {
            ni40Var = ni40.b;
        } else if (num2 != null && num2.intValue() == 2) {
            ni40Var = ni40.c;
        } else if (num2 != null && num2.intValue() == 3) {
            ni40Var = ni40.d;
        } else if (num2 != null && num2.intValue() == 4) {
            ni40Var = ni40.e;
        } else {
            ni40Var = (num2 != null && num2.intValue() == 6) ? ni40.f : ni40.f23564a;
        }
        ni40 ni40Var2 = ni40Var;
        int iIntValue = 0;
        long jLongValue = 0;
        if (t9hVar == null || (list2 = t9hVar.g) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (a9h a9hVar : list2) {
                Long l3 = a9hVar.b;
                long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                String strJ = J(jLongValue2);
                Integer num3 = a9hVar.c;
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                arrayList.add(Intrinsics.d(a9hVar.f476a, Boolean.TRUE) ? new vh40(strJ, iIntValue2, jLongValue2) : new wh40(strJ, iIntValue2, jLongValue2));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        long jLongValue3 = (t9hVar == null || (l2 = t9hVar.d) == null) ? 0L : l2.longValue();
        Long l4 = t9hVar != null ? t9hVar.e : null;
        Long l5 = t9hVar != null ? t9hVar.f : null;
        List listL = (jchVar == null || (list = jchVar.b) == null) ? null : nkb.L(list);
        if (listL == null) {
            listL = iun.f15405a;
        }
        if (jchVar != null && (num = jchVar.c) != null) {
            iIntValue = num.intValue();
        }
        int i = iIntValue;
        if (t9hVar != null && (e9hVar = t9hVar.c) != null && (l = e9hVar.b) != null) {
            jLongValue = l.longValue();
        }
        return new el40(fl40VarN, fl40VarN2, ni40Var2, arrayList, jLongValue3, l4, l5, listL, i, jLongValue);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public static final fl40 N(w9h w9hVar) {
        ?? arrayList;
        Object next;
        ?? arrayList2;
        Float f;
        Integer num;
        Integer num2;
        Integer num3;
        List list;
        String string;
        ?? arrayList3;
        wi40 wi40Var;
        int i;
        int i2;
        char c;
        Integer num4;
        Integer num5;
        Integer num6;
        int i3;
        char c2;
        iun iunVar = iun.f15405a;
        cl40 cl40Var = cl40.BLUE;
        iunVar.getClass();
        if (w9hVar == null || (list = w9hVar.f38780a) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n9h n9hVar = (n9h) it.next();
                Long l = n9hVar.f23138a;
                q9h q9hVar = n9hVar.i;
                long jLongValue = l != null ? l.longValue() : 0L;
                String strJ = J(jLongValue);
                if (jLongValue > 0) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String strH = axq.h(jLongValue, "/sfiles/sppic1/cyber/mlbb/bw/heroes/", ".png");
                    if (strH.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(strH, ujn.h, false) || kotlin.text.c.x(strH, "https://", false)) {
                        sb.setLength(0);
                        sb.append(strH);
                    } else {
                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                            i3 = 1;
                            c2 = '/';
                        } else {
                            sb.append('/');
                            c2 = '/';
                            i3 = 1;
                        }
                        char[] cArr = new char[i3];
                        cArr[0] = c2;
                        sb.append(StringsKt.y0(strH, cArr));
                    }
                    string = sb.toString();
                } else {
                    string = "";
                }
                String str = n9hVar.b;
                if (str == null) {
                    str = "";
                }
                String str2 = n9hVar.f;
                String str3 = str2 != null ? str2 : "";
                Long l2 = n9hVar.c;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                Integer num7 = n9hVar.d;
                int iIntValue = num7 != null ? num7.intValue() : 0;
                Integer num8 = n9hVar.e;
                int iIntValue2 = num8 != null ? num8.intValue() : 0;
                Integer num9 = n9hVar.g;
                int iIntValue3 = num9 != null ? num9.intValue() : 0;
                Float f2 = n9hVar.h;
                float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
                int iIntValue4 = (q9hVar == null || (num6 = q9hVar.f28346a) == null) ? 0 : num6.intValue();
                int iIntValue5 = (q9hVar == null || (num5 = q9hVar.b) == null) ? 0 : num5.intValue();
                int iIntValue6 = (q9hVar == null || (num4 = q9hVar.c) == null) ? 0 : num4.intValue();
                List list2 = n9hVar.j;
                if (list2 != null) {
                    arrayList3 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        k9h k9hVar = (k9h) it2.next();
                        String str4 = string;
                        String str5 = k9hVar.b;
                        if (str5 == null) {
                            wi40Var = null;
                        } else {
                            if (StringsKt.W(str5)) {
                                str5 = null;
                            }
                            if (str5 == null) {
                                wi40Var = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String lowerCase = str5.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                String str6 = "/sfiles/sppic1/cyber/mlbb/items/" + lowerCase + ".png";
                                if (str6.length() == 0) {
                                    sb2.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str6, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c = '/';
                                        } else {
                                            sb2.append('/');
                                            c = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr2 = new char[i2];
                                        i = 0;
                                        cArr2[0] = c;
                                        sb2.append(StringsKt.y0(str6, cArr2));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str6);
                                }
                                String string2 = sb2.toString();
                                Integer num10 = k9hVar.c;
                                wi40Var = new wi40(num10 != null ? num10.intValue() : i, str5, string2);
                            }
                        }
                        if (wi40Var != null) {
                            arrayList3.add(wi40Var);
                        }
                        string = str4;
                        it = it;
                        it2 = it2;
                        str = str;
                        str3 = str3;
                        iIntValue = iIntValue;
                    }
                } else {
                    arrayList3 = 0;
                }
                String str7 = string;
                Iterator it3 = it;
                String str8 = str;
                String str9 = str3;
                int i4 = iIntValue;
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                arrayList.add(new xi40(jLongValue, str8, strJ, str7, str9, jLongValue2, i4, iIntValue2, iIntValue3, fFloatValue, iIntValue4, iIntValue5, iIntValue6, arrayList3));
                it = it3;
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r5 = arrayList;
        Integer num11 = w9hVar != null ? w9hVar.b : null;
        Iterator it4 = cl40.f.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            byte b = ((cl40) next).f4539a;
            if (num11 != null && b == num11.intValue()) {
                break;
            }
        }
        cl40 cl40Var2 = (cl40) next;
        if (cl40Var2 == null) {
            cl40Var2 = cl40.UNKNOWN;
        }
        cl40 cl40Var3 = cl40Var2;
        int iIntValue7 = -1;
        int iIntValue8 = (w9hVar == null || (num3 = w9hVar.c) == null) ? -1 : num3.intValue();
        int iIntValue9 = (w9hVar == null || (num2 = w9hVar.d) == null) ? -1 : num2.intValue();
        if (w9hVar != null && (num = w9hVar.e) != null) {
            iIntValue7 = num.intValue();
        }
        int i5 = iIntValue7;
        float fFloatValue2 = (w9hVar == null || (f = w9hVar.f) == null) ? -1.0f : f.floatValue();
        List<h9h> list3 = w9hVar != null ? w9hVar.g : null;
        if (list3 != null) {
            arrayList2 = new ArrayList();
            for (h9h h9hVar : list3) {
                Integer num12 = h9hVar.f12676a;
                Integer num13 = h9hVar.b;
                vi40 vi40Var = (num12 == null || num13 == null) ? null : new vi40(num12.intValue(), num13.intValue());
                if (vi40Var != null) {
                    arrayList2.add(vi40Var);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new fl40(r5, cl40Var3, iIntValue8, iIntValue9, i5, fFloatValue2, arrayList2);
    }

    public static final q56 O(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        q56 l56Var;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal != 0) {
            boolean z5 = true;
            if (iOrdinal != 1) {
                d2i d2iVar = null;
                if (iOrdinal == 2) {
                    long j = d0tVar.f5282a;
                    k4i k4iVarQ = s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    String strM = zdx.M(d0tVar);
                    uxm uxmVarY = dyb.Y(d0tVar);
                    String strG = kpb.G(d0tVar, ctf0Var);
                    if (d0tVar.S && z4) {
                        d2iVar = new d2i();
                    }
                    l56Var = new o56(j, k4iVarQ, new a76(strM, uxmVarY, strG, d2iVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                } else if (iOrdinal == 3) {
                    long j2 = d0tVar.f5282a;
                    n0x n0xVar = new n0x(dtb.F(str));
                    if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
                        z5 = false;
                    }
                    l56Var = new n56(j2, s7n0.p(d0tVar, str, kpb.G(d0tVar, ctf0Var), list, z2, z3, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new s66(zdx.M(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    l56Var = new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new k66(zdx.M(d0tVar), dyb.Y(d0tVar), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new i76(zdx.M(d0tVar), dyb.Y(d0tVar), kpb.G(d0tVar, ctf0Var), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            l56Var = new l56(d0tVar.f5282a, s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new c66(zdx.M(d0tVar), dyb.Y(d0tVar), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return l56Var;
    }

    public static final afc0 P(hfc0 hfc0Var) {
        zcc0 zcc0Var;
        cfc0 cfc0Var;
        zcc0 zcc0Var2;
        cfc0 cfc0Var2;
        Object obj;
        Object next;
        hfc0Var.getClass();
        String str = hfc0Var.f12967a;
        List list = hfc0Var.h;
        String str2 = str == null ? "" : str;
        Double d = hfc0Var.b;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str3 = hfc0Var.c;
        String str4 = str3 == null ? "" : str3;
        Long l = hfc0Var.d;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = hfc0Var.e;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Integer num = hfc0Var.f;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = hfc0Var.g;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((zcc0) next).f44159a, "TypeCoupon"));
            zcc0Var = (zcc0) next;
        } else {
            zcc0Var = null;
        }
        if (zcc0Var != null) {
            String str5 = zcc0Var.c;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = zcc0Var.b;
            if (str6 == null) {
                str6 = "";
            }
            cfc0Var = new cfc0(str5, str6);
        } else {
            cfc0Var = new cfc0("", "");
        }
        cfc0 cfc0Var3 = cfc0Var;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                Object next2 = it2.next();
                Iterator it3 = it2;
                if (Intrinsics.d(((zcc0) next2).f44159a, "MinCoefficient")) {
                    obj = next2;
                    break;
                }
                it2 = it3;
            }
            zcc0Var2 = (zcc0) obj;
        } else {
            zcc0Var2 = null;
        }
        if (zcc0Var2 != null) {
            String str7 = zcc0Var2.c;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = zcc0Var2.b;
            if (str8 == null) {
                str8 = "";
            }
            cfc0Var2 = new cfc0(str7, str8);
        } else {
            cfc0Var2 = new cfc0("", "");
        }
        cfc0 cfc0Var4 = cfc0Var2;
        String str9 = hfc0Var.i;
        String str10 = str9 == null ? "" : str9;
        Integer num3 = hfc0Var.j;
        return new afc0(str2, dDoubleValue, str4, jLongValue, jLongValue2, iIntValue, iIntValue2, cfc0Var3, cfc0Var4, str10, num3 != null ? num3.intValue() : 0);
    }

    public static final qjg0 Q(tjg0 tjg0Var) {
        Integer num = tjg0Var.f34047a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = tjg0Var.b;
        if (str == null) {
            str = "";
        }
        Integer num2 = tjg0Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Boolean bool = tjg0Var.d;
        return new qjg0(iIntValue, iIntValue2, str, bool != null ? bool.booleanValue() : false);
    }

    public static final jo20 R(List list, cne0 cne0Var, int i, q7f0 q7f0Var, boolean z) {
        String strValueOf;
        list.getClass();
        cne0Var.getClass();
        jo20 jo20Var = new jo20();
        n6x.O(jo20Var, q7f0Var);
        n6x.u(jo20Var, list);
        n6x.v(jo20Var, list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof k1q) {
                arrayList.add(obj);
            }
        }
        k1q k1qVar = (k1q) ((j2q) CollectionsKt.firstOrNull(arrayList));
        String str = k1qVar != null ? k1qVar.b : null;
        if (str != null && str.length() != 0) {
            jo20Var.put("Name", ncy.c(str));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof l1q) {
                arrayList2.add(obj2);
            }
        }
        l1q l1qVar = (l1q) ((j2q) CollectionsKt.firstOrNull(arrayList2));
        String str2 = l1qVar != null ? l1qVar.b : null;
        if (str2 != null && str2.length() != 0) {
            jo20Var.put("Surname", ncy.c(str2));
        }
        n6x.P(jo20Var, list);
        n6x.t(jo20Var, list);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof d1q) {
                arrayList3.add(obj3);
            }
        }
        d1q d1qVar = (d1q) ((j2q) CollectionsKt.firstOrNull(arrayList3));
        Integer numValueOf = d1qVar != null ? Integer.valueOf(d1qVar.b) : null;
        if (numValueOf != null) {
            jo20Var.put("Nationality", ncy.b(numValueOf));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof u1q) {
                arrayList4.add(obj4);
            }
        }
        u1q u1qVar = (u1q) ((j2q) CollectionsKt.firstOrNull(arrayList4));
        String str3 = u1qVar != null ? u1qVar.b : null;
        if (str3 != null && str3.length() != 0) {
            jo20Var.put("Phone", ncy.c(str3));
        }
        n6x.q(jo20Var, list);
        n6x.x(jo20Var, list);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof s1q) {
                arrayList5.add(obj5);
            }
        }
        s1q s1qVar = (s1q) ((j2q) CollectionsKt.firstOrNull(arrayList5));
        String str4 = s1qVar != null ? s1qVar.b : null;
        if (str4 != null && str4.length() != 0) {
            jo20Var.put("Password", ncy.c(str4));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            if (obj6 instanceof t1q) {
                arrayList6.add(obj6);
            }
        }
        t1q t1qVar = (t1q) ((j2q) CollectionsKt.firstOrNull(arrayList6));
        if (t1qVar != null) {
            jo20Var.put("Date", ncy.b(Long.valueOf(t1qVar.f33179a)));
        }
        n6x.a0(jo20Var, list);
        n6x.Z(jo20Var, list);
        n6x.M(jo20Var, list, z, cne0Var.f4650a);
        n6x.z(jo20Var, list, i);
        n6x.x0(jo20Var, list);
        n6x.K(jo20Var, list);
        n6x.j0(jo20Var, list);
        n6x.f0(jo20Var, list);
        n6x.j(jo20Var, list);
        n6x.L(jo20Var, list);
        n6x.W(jo20Var, list);
        n6x.X(jo20Var, list);
        n6x.g0(jo20Var, list);
        n6x.E(jo20Var, list);
        n6x.l0(jo20Var);
        n6x.N(jo20Var, cne0Var);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            if (obj7 instanceof f1q) {
                arrayList7.add(obj7);
            }
        }
        f1q f1qVar = (f1q) ((j2q) CollectionsKt.firstOrNull(arrayList7));
        if (f1qVar == null || (strValueOf = String.valueOf(f1qVar.b ? 1 : 0)) == null) {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj8 : list) {
                if (obj8 instanceof f2q) {
                    arrayList8.add(obj8);
                }
            }
            f2q f2qVar = (f2q) ((j2q) CollectionsKt.firstOrNull(arrayList8));
            strValueOf = f2qVar != null ? String.valueOf(f2qVar.b ? 1 : 0) : null;
        }
        if (strValueOf != null) {
            jo20Var.put("SendSmsEvents", ncy.c(strValueOf));
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list) {
            if (obj9 instanceof f1q) {
                arrayList9.add(obj9);
            }
        }
        f1q f1qVar2 = (f1q) ((j2q) CollectionsKt.firstOrNull(arrayList9));
        if (f1qVar2 != null) {
            jo20Var.put("CommercialCommunicationSettings", ncy.c(String.valueOf(f1qVar2.b ? 1 : 0)));
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : list) {
            if (obj10 instanceof f1q) {
                arrayList10.add(obj10);
            }
        }
        f1q f1qVar3 = (f1q) ((j2q) CollectionsKt.firstOrNull(arrayList10));
        if (f1qVar3 != null) {
            jo20Var.put("SendSmsBet", ncy.c(String.valueOf(f1qVar3.b ? 1 : 0)));
        }
        n6x.I(jo20Var, list);
        ArrayList arrayList11 = new ArrayList();
        for (Object obj11 : list) {
            if (obj11 instanceof q1q) {
                arrayList11.add(obj11);
            }
        }
        q1q q1qVar = (q1q) ((j2q) CollectionsKt.firstOrNull(arrayList11));
        String str5 = q1qVar != null ? q1qVar.b : null;
        if (str5 != null && str5.length() != 0) {
            jo20Var.put("PassportDt", ncy.c(str5));
        }
        ArrayList arrayList12 = new ArrayList();
        for (Object obj12 : list) {
            if (obj12 instanceof p1q) {
                arrayList12.add(obj12);
            }
        }
        p1q p1qVar = (p1q) ((j2q) CollectionsKt.firstOrNull(arrayList12));
        String str6 = p1qVar != null ? p1qVar.b : null;
        if (str6 != null && str6.length() != 0) {
            jo20Var.put("PassportDateExpire", ncy.c(str6));
        }
        n6x.H(jo20Var, list);
        n6x.l(jo20Var, list);
        return jo20Var.b();
    }

    public static final hrn0 S(krn0 krn0Var, boolean z, List list) {
        Object next;
        Long l;
        String string;
        lel0 lel0Var;
        List list2;
        List list3;
        Object next2;
        lel0 lel0Var2;
        krn0Var.getClass();
        Long l2 = krn0Var.f18775a;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j = ((ril0) next).f30549a;
            if (l2 != null && j == l2.longValue()) {
                break;
            }
        }
        ril0 ril0Var = (ril0) next;
        List<a3q> list4 = krn0Var.h;
        Long l3 = krn0Var.c;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l2.longValue();
        String str = krn0Var.b;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue2 = l3 != null ? l3.longValue() : -1L;
        String str2 = krn0Var.d;
        if (str2 == null) {
            str2 = "";
        }
        int size = list4 != null ? list4.size() : 0;
        if (ril0Var == null || (list3 = ril0Var.f) == null || list3.isEmpty()) {
            l = l3;
            string = (ril0Var == null || (lel0Var = ril0Var.g) == null) ? null : lel0Var.j;
            if (string == null) {
                string = "";
            }
        } else {
            StringBuilder sb = new StringBuilder(ujn.h);
            Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    l = l3;
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                Iterator it3 = it2;
                l = l3;
                long j2 = ((f3n0) next2).f8872a;
                if (l != null && j2 == l.longValue()) {
                    break;
                }
                l3 = l;
                it2 = it3;
            }
            f3n0 f3n0Var = (f3n0) next2;
            String str3 = (f3n0Var == null || (lel0Var2 = f3n0Var.c) == null) ? null : lel0Var2.j;
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
                sb.setLength(0);
                sb.append(str3);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str3, '/'));
            }
            string = sb.toString();
        }
        Boolean bool = krn0Var.g;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (list4 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
            for (a3q a3qVar : list4) {
                long jLongValue3 = l2.longValue();
                long jLongValue4 = l != null ? l.longValue() : -1L;
                a3qVar.getClass();
                Integer num = a3qVar.f184a;
                if (num == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue = num.intValue();
                String str4 = a3qVar.b;
                if (str4 == null) {
                    jf4.k(null);
                    return null;
                }
                String str5 = a3qVar.c;
                arrayList.add(new epn0(iIntValue, jLongValue3, jLongValue4, str4, str5 == null ? "" : str5, z));
            }
            list2 = arrayList;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new hrn0(size, jLongValue, jLongValue2, str, str2, string, list2, z, zBooleanValue);
    }

    public static final m2u0 T(s2u0 s2u0Var) {
        nie nieVar;
        Long l = s2u0Var.f31522a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = s2u0Var.b;
        if (num != null) {
            int iIntValue = num.intValue();
            nie.b.getClass();
            nie[] nieVarArrValues = nie.values();
            int length = nieVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    nieVar = null;
                    break;
                }
                nieVar = nieVarArrValues[i];
                if (nieVar.f23582a == iIntValue) {
                    break;
                }
                i++;
            }
            if (nieVar == null) {
                nieVar = nie.UNKNOWN;
            }
        } else {
            nieVar = nie.UNKNOWN;
        }
        nie nieVar2 = nieVar;
        List list = s2u0Var.c;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        String str = s2u0Var.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer num2 = s2u0Var.e;
        return new m2u0(jLongValue, nieVar2, list2, str2, num2 != null ? num2.intValue() : 0);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-644621084);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_info_circle, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 12.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar2, 56, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 10);
        }
    }

    public static final void b(mm40 mm40Var, String str, boolean z, Function1 function1, fet fetVar, int i) {
        f6q0 d6q0Var;
        function1.getClass();
        fetVar.g0(464248462);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.e(R.drawable.ic_glyph_lock) ? 256 : 128) | (fetVar.e(R.string.operator_language) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            String strS = xsm0.s(R.string.operator_language, fetVar);
            if (z) {
                fetVar.e0(-533807479);
                fetVar.r(false);
                d6q0Var = e6q0.f7299a;
            } else {
                fetVar.e0(-533811945);
                d6q0Var = new d6q0(new y3d(qcc.S(R.attr.uikitSecondary, fetVar)), new m0x(R.drawable.ic_glyph_lock, null, 6), null);
                fetVar.r(false);
            }
            s6q0 s6q0Var = new s6q0(str, d6q0Var, !z ? o6q0.f24750a : k6q0.f17783a, r7q0.f29989a, z, false, null, strS, null, 32128);
            boolean z2 = (458752 & i2) == 131072;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new i1y(function1, (byte) 12);
                fetVar.o0(objP);
            }
            jwb.o(mm40Var, s6q0Var, 0, null, (Function1) objP, fetVar, i2 & 14, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 14, i, (Object) mm40Var, (Object) str, (Object) function1, z);
        }
    }

    public static final void c(mm40 mm40Var, ton tonVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1381963121);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(tonVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.b(16.0f, 16.0f, 16.0f, 16.0f));
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarL = s5x0.L(s5x0.N(i120.Q(mm40VarJ, backgroundContent, ljcVar), 0.0f, 0.0f, 0.0f, 6.0f, 7), 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(mm40Var, s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 16.0f), 128.0f);
            zcl zclVar2 = qmk.f;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            agc.t(s5x0.L(jm40Var, 0.0f, 6.0f, 1), tonVar.f34293a, z, null, null, fetVar, i2 & 896, 24);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpn(mm40Var, tonVar, z, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, nt30 nt30Var, fet fetVar, int i) {
        t33 t33Var;
        long jM126getWhite200d7_KjU;
        nt30Var.getClass();
        fetVar.g0(1431063078);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(nt30Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var2 = (t33) objP;
            Boolean boolValueOf = Boolean.valueOf(nt30Var.a());
            boolean zI = fetVar.i(t33Var2) | ((i2 & 112) == 32) | fetVar.h(z);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                boolean z2 = z;
                t33Var = t33Var2;
                Object ys8Var = new ys8((Object) nt30Var, (Object) t33Var, z2, (yje) null, (byte) 21);
                fetVar.o0(ys8Var);
                objP2 = ys8Var;
            } else {
                t33Var = t33Var2;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            boolean zI2 = fetVar.i(t33Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new m53(t33Var, (byte) 20);
                fetVar.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40Var, (Function1) objP3);
            pm80 pm80VarF = a8k0.F(nt30Var.b(), 0, fetVar);
            if (nt30Var.a()) {
                pz40 pz40Var = s6t0.f31722a;
                jM126getWhite200d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                jM126getWhite200d7_KjU = StaticColors.INSTANCE.m126getWhite200d7_KjU();
            }
            dww.c(pm80VarF, null, mm40VarT, jM126getWhite200d7_KjU, fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, nt30Var, i, b);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1240635766);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_glyph_color_optionbet, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 16.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 12);
        }
    }

    public static final void f(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        str.getClass();
        function0.getClass();
        fetVar.g0(-1248384488);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, (gy40) objP, null, false, null, function0, 28);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            e(0, fetVar, null);
            g(6, fetVar, null, str);
            a(0, fetVar, null);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var2, str, function0, i, (byte) 6);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-1783316211);
        int i2 = i | 48 | (fetVar.g(str) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, x7zVar, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, (i2 >> 6) & 14, 24960, 110588);
            mm40Var2 = jm40.b;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 13);
        }
    }

    public static final void h(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-324099807);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        boolean zU = fetVar.U(i3 & 1, (i3 & 3) != 2);
        byte b = 12;
        if (zU) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.e(mm40VarD, 22.0f), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, b);
        }
    }

    public static final void i(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        ugd ugdVar2;
        fetVar.g0(790527681);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b = 6;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.d(null, m2a.v);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new rip(pz40Var, (byte) 19);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            wmb0 wmb0Var = xxj.f41661a;
            v96 v96VarV = cy2.v(epv0.c, fetVar, 6);
            mm40Var2 = mm40Var;
            ugdVar2 = ugdVar;
            obc.e(new l5d0[]{e5q0.b.a(mrv.m0(2, fetVar, function0)), e5q0.f7246a.a(v96VarV)}, u1c.M(1070596993, new ajw((Object) mm40Var2, (Object) pz40Var, (Object) ugdVar2, (Object) v96VarV, (Object) function0, (byte) 17), fetVar), fetVar, 56);
        } else {
            mm40Var2 = mm40Var;
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var2, ugdVar2, i, b);
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(155925518);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(e5q0.f7246a) != null;
            boolean z2 = fetVar.k(e5q0.b) != null;
            if (z && z2) {
                fetVar.e0(-1977187922);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, true);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                ugdVar.invoke(fetVar, Integer.valueOf((i2 >> 3) & 14));
                fetVar.r(true);
                fetVar.r(false);
            } else if (z) {
                fetVar.e0(-1976997706);
                mrv.U(mm40Var, ugdVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (z2) {
                fetVar.e0(-1976846922);
                xxj.d(mm40Var, ugdVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                fetVar.e0(-1976716505);
                i(mm40Var, ugdVar, fetVar, i2 & 126);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i, (byte) 5);
        }
    }

    public static final void k(mm40 mm40Var, boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        function0.getClass();
        fetVar.g0(624488997);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            dww.c(z2 ? iom0.r(jpm0.t(R.drawable.ic_glyph_quick_bet_active, 6, fetVar), fetVar) : iom0.r(jpm0.t(R.drawable.ic_glyph_quick_bet_inactive, 6, fetVar), fetVar), null, epv0.N(y860.W(mm40Var2, null, null, z, null, function0, 24), z ? 1.0f : 0.5f), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new and0(mm40Var, z, z2, function0, i, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, ehm0 ehm0Var, fet fetVar, int i, int i2) {
        int i3;
        ufx ufxVar = ehm0Var.d;
        fetVar.g0(-449212077);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(ehm0Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (ufxVar instanceof vam0) {
                fetVar.e0(641285782);
                fetVar.r(false);
            } else if (Intrinsics.d(ufxVar, wam0.f38836a)) {
                fetVar.e0(2098898712);
                lmc.d(i3 & 14, 0, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                if (!(ufxVar instanceof xam0)) {
                    throw b1j.f(2098894892, fetVar, false);
                }
                fetVar.e0(641453058);
                p(mm40Var, ((m5h0) ((xam0) ufxVar).f40564a).f21219a, fetVar, i3 & 14);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx(mm40Var2, (Object) ehm0Var, i, i2, (byte) 9);
        }
    }

    public static final void m(Function1 function1, wgj0 wgj0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        wgj0Var.getClass();
        fetVar.g0(-65523309);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wgj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = shj0.f32215a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 29);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new pb(wgj0Var, function1, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) wgj0Var, mm40Var, i, (byte) 13);
        }
    }

    public static final void n(mm40 mm40Var, bhk0 bhk0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        dn8 dn8VarH;
        qe9 qe9Var;
        mm40 mm40VarT;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-79557288);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(bhk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            long warning = ((ThemeColors) fetVar2.k(zfnVar)).getWarning();
            ygk0 ygk0Var = bhk0Var.c;
            boolean zE = fetVar2.e(ygk0Var.ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = ygk0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        zcl zclVar = qmk.f28987a;
                        dn8VarH = j120.h(1.0f, warning);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        dn8VarH = null;
                    }
                    objP = dn8VarH;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    objP = j120.h(2.0f, primary);
                }
                fetVar2.o0(objP);
            }
            dn8 dn8Var = (dn8) objP;
            boolean zE2 = fetVar2.e(ygk0Var.ordinal());
            Object objP2 = fetVar2.P();
            if (zE2 || objP2 == cl5Var) {
                int iOrdinal2 = ygk0Var.ordinal();
                if (iOrdinal2 == 0) {
                    qe9Var = qe9.f28572a;
                } else if (iOrdinal2 == 1) {
                    qe9Var = qe9.b;
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return;
                    }
                    qe9Var = qe9.c;
                }
                objP2 = qe9Var;
                fetVar2.o0(objP2);
            }
            qe9 qe9Var2 = (qe9) objP2;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            jm40 jm40Var = jm40.b;
            if (dn8Var != null) {
                zcl zclVar4 = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40VarT = i120.T(jm40Var, dn8Var.f6356a, dn8Var.b, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
            } else {
                mm40VarT = jm40Var;
            }
            mm40 mm40VarE = mm40VarN.e(mm40VarT);
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar5 = qmk.g;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP3;
            boolean z = (i2 & 896) == 256;
            int i3 = i2 & 112;
            boolean z2 = z | (i3 == 32);
            Object objP4 = fetVar2.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new o0k0((Object) function1, (Object) bhk0Var, (byte) 5);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.K(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP4, 28), 2.0f, 8.0f), "SOCIAL_BUTTON" + bhk0Var.d);
            boolean zE3 = fetVar2.e(qe9Var2.ordinal());
            Object objP5 = fetVar2.P();
            if (zE3 || objP5 == cl5Var) {
                objP5 = new rai0(qe9Var2, (byte) 24);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP5);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(bhk0Var.b, 0, fetVar2);
            long j = y3d.g;
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 20.0f), "SOCIAL_BUTTON_ICON");
            boolean z3 = i3 == 32;
            Object objP6 = fetVar2.P();
            if (z3 || objP6 == cl5Var) {
                objP6 = new rai0(bhk0Var, (byte) 25);
                fetVar2.o0(objP6);
            }
            dww.c(pm80VarF, null, pai0.a(mm40VarE1, false, (Function1) objP6), j, fetVar2, 3128, 0);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            String str = bhk0Var.d;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) bhk0Var, (Object) function1, i, (byte) 23);
        }
    }

    public static final void o(mm40 mm40Var, npo npoVar, fet fetVar, int i) {
        float f;
        float f2;
        fetVar.g0(895483894);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(npoVar.ordinal()) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                int iOrdinal = npoVar.ordinal();
                if (iOrdinal == 0) {
                    zcl zclVar = qmk.f28987a;
                    f2 = 138.0f;
                } else if (iOrdinal == 1) {
                    zcl zclVar2 = qmk.f28987a;
                    f2 = 132.0f;
                } else if (iOrdinal == 2) {
                    zcl zclVar3 = qmk.f28987a;
                    f2 = 148.0f;
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    f2 = 152.0f;
                }
                objP = twn.j(f2, fetVar);
            }
            float f3 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                int iOrdinal2 = npoVar.ordinal();
                if (iOrdinal2 == 0) {
                    zcl zclVar5 = qmk.f28987a;
                    f = 16.0f;
                } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar6 = qmk.f28987a;
                    f = 20.0f;
                }
                objP2 = twn.j(f, fetVar);
            }
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), f3), vgg0.a(((ycl) objP2).f42389a)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ykb0(mm40Var, npoVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void p(mm40 mm40Var, fos fosVar, fet fetVar, int i) {
        int i2;
        ?? r6;
        ?? r0;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(805478101);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(fosVar) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarW, 12.0f, 4.0f, 8.0f, 4.0f);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x7z x7zVar = new x7z(1.0f, true);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zcm0.c(fosVar.f9897a, gqw0.d, true, null, fetVar2, 432, 8);
            btm0.e(fosVar.b, fetVar2, 0);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            btm0.e(fosVar.c, fetVar, 0);
            fetVar.r(true);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
            thg0 thg0VarA2 = shg0.a(uc9.b, yx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            if (fosVar.e.size() > 3) {
                fetVar.e0(1331572079);
                mm40 mm40VarA2 = o7k0.A(jm40Var, null, 3);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarA2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                z = false;
                q(0, 1, fetVar, null);
                q(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 8.0f, 5));
                q(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                r0 = 1;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                r0 = 1;
                z = false;
                fetVar.e0(1331977621);
                fetVar.r(false);
            }
            mm40 mm40VarA3 = o7k0.A(o7k0.u(jm40Var, 0.0f, 136.0f, r0), null, 3);
            ?? r12 = (i3 & 112) == 32 ? r0 : z;
            Object objP = fetVar.P();
            if (r12 != 0 || objP == ukd.f35823a) {
                objP = new gwg0((Object) fosVar, (byte) 4);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarA3, null, null, false, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
            ?? r7 = fetVar;
            n2x.f(fosVar.d, true, o7k0.s(jm40Var, 56.0f), cfx0.l, r7, 3120, 0);
            r7.r(r0);
            r7.r(r0);
            r6 = r7;
        } else {
            fetVar2.X();
            r6 = fetVar2;
        }
        yfe0 yfe0VarU = r6.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) fosVar, i, (byte) 24);
        }
    }

    public static final void q(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fet fetVar2;
        fetVar.g0(-1205396895);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            jcb.H(o7k0.e(o7k0.s(mm40Var, 1.0f), 28.0f), 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), fetVar2, 0, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 13);
        }
    }

    public static CharSequence r(CharSequence charSequence, String... strArr) {
        if (charSequence.length() != 0) {
            for (String str : strArr) {
                if (charSequence.charAt(0) == str.charAt(0) && charSequence.charAt(charSequence.length() - 1) == str.charAt(1)) {
                    return charSequence.subSequence(1, charSequence.length() - 1);
                }
            }
        }
        return charSequence;
    }

    public static final String s(ctf0 ctf0Var, boolean z, boolean z2) {
        int i;
        ctf0Var.getClass();
        if (z) {
            i = R.string.summary_possible_win;
        } else {
            i = z2 ? R.string.make_bet_max_possible_win : R.string.history_possible_win;
        }
        return ctf0Var.f(i, new Object[0]);
    }

    public static final ArrayList t(c0o c0oVar, boolean z) {
        c0oVar.getClass();
        List listJ = z ? q3d.j(n310.LOL_TEAM_STAT_RED, n310.LOL_TEAM_STAT_BLUE) : kotlin.collections.a.c(n310.LOL_TEAM_STAT_RED_BLUE);
        ArrayList arrayList = new ArrayList();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            if (!listJ.contains((n310) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final ArrayList u(ArrayList arrayList, boolean z) {
        List listC = z ? kotlin.collections.a.c(n310.LOL_MINI_MAP) : iun.f15405a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!listC.contains((n310) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final cb50 v(Fragment fragment) {
        fragment.getClass();
        Fragment fragment2 = fragment.y;
        if (fragment2 == null) {
            return new bb50(false);
        }
        return fragment2 instanceof sao0 ? ((sao0) fragment2).H0() : v(fragment2);
    }

    public static final Object w(az40 az40Var, zsb0 zsb0Var, Serializable serializable) {
        az40Var.getClass();
        zsb0Var.getClass();
        Object objCopyOf = az40Var.f1700a.get(zsb0Var);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    public static final wvh0 x(Object obj) {
        if (obj != sqd.f32624a) {
            return (wvh0) obj;
        }
        jf4.n("Does not contain segment");
        return null;
    }

    public static final int y(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static int z(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }
}
