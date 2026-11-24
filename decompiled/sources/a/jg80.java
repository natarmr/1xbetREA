package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1d f16470a = new a1d((byte) 21);

    /* JADX WARN: Code duplicated, block: B:79:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    public static sq8 a(egk egkVar) {
        sq8 sq8Var;
        int[] iArr;
        int i;
        d3g0 d3g0Var;
        d3g0 d3g0Var2;
        d3g0 d3g0Var3;
        d3g0 d3g0Var4;
        d3g0 d3g0Var5;
        int i2;
        int i3;
        d3g0 d3g0Var6;
        if (egkVar == null) {
            return null;
        }
        boolean z = egkVar.d;
        sq8 sq8Var2 = (sq8) egkVar.b;
        d3g0 d3g0Var7 = (d3g0) sq8Var2.i;
        d3g0 d3g0Var8 = (d3g0) sq8Var2.g;
        d3g0 d3g0Var9 = (d3g0) sq8Var2.h;
        d3g0 d3g0Var10 = (d3g0) sq8Var2.f;
        ku5[] ku5VarArr = (ku5[]) egkVar.c;
        ku5 ku5VarQ = egkVar.q();
        int iMax = -1;
        if (ku5VarQ == null) {
            iArr = null;
            sq8Var = null;
        } else {
            int i4 = ku5VarQ.f;
            int iD = egkVar.d((int) (z ? d3g0Var8 : d3g0Var7).b);
            int i5 = -1;
            for (int iD2 = egkVar.d((int) (z ? d3g0Var10 : d3g0Var9).b); iD2 < iD; iD2++) {
                ku5 ku5Var = ku5VarArr[iD2];
                if (ku5Var != null) {
                    ku5Var.c();
                    int i6 = ku5Var.f;
                    int i7 = i6 - i5;
                    if (i7 != 0) {
                        if (i7 != 1 && i6 >= i4) {
                            ku5VarArr[iD2] = null;
                        } else {
                            i5 = i6;
                        }
                    }
                }
            }
            sq8Var = null;
            iArr = new int[i4];
            for (ku5 ku5Var2 : ku5VarArr) {
                if (ku5Var2 != null && (i = ku5Var2.f) < i4) {
                    iArr[i] = iArr[i] + 1;
                }
            }
        }
        if (iArr == null) {
            return sq8Var;
        }
        for (int i8 : iArr) {
            iMax = Math.max(iMax, i8);
        }
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += iMax - i10;
            if (i10 > 0) {
                break;
            }
        }
        for (int i11 = 0; i9 > 0 && ku5VarArr[i11] == null; i11++) {
            i9--;
        }
        int i12 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i13 = iArr[length];
            i12 += iMax - i13;
            if (i13 > 0) {
                break;
            }
        }
        for (int length2 = ku5VarArr.length - 1; i12 > 0 && ku5VarArr[length2] == null; length2--) {
            i12--;
        }
        if (i9 > 0) {
            d3g0 d3g0Var11 = z ? d3g0Var10 : d3g0Var9;
            int i14 = ((int) d3g0Var11.b) - i9;
            d3g0 d3g0Var12 = new d3g0(d3g0Var11.f5402a, i14 >= 0 ? i14 : 0);
            if (z) {
                d3g0Var2 = d3g0Var12;
                d3g0Var = d3g0Var9;
            } else {
                d3g0Var = d3g0Var12;
            }
            if (i12 > 0) {
                if (z) {
                    d3g0Var5 = d3g0Var8;
                } else {
                    d3g0Var5 = d3g0Var7;
                }
                i2 = ((int) d3g0Var5.b) + i12;
                i3 = ((r68) sq8Var2.e).b;
                if (i2 >= i3) {
                    i2 = i3 - 1;
                }
                d3g0Var6 = new d3g0(d3g0Var5.f5402a, i2);
                if (z) {
                    d3g0Var3 = d3g0Var7;
                    d3g0Var4 = d3g0Var6;
                } else {
                    d3g0Var4 = d3g0Var8;
                    d3g0Var3 = d3g0Var6;
                }
            } else {
                d3g0Var3 = d3g0Var7;
                d3g0Var4 = d3g0Var8;
            }
            return new sq8((r68) sq8Var2.e, d3g0Var2, d3g0Var4, d3g0Var, d3g0Var3);
        }
        d3g0Var = d3g0Var9;
        d3g0Var2 = d3g0Var10;
        if (i12 > 0) {
            if (z) {
                d3g0Var5 = d3g0Var8;
            } else {
                d3g0Var5 = d3g0Var7;
            }
            i2 = ((int) d3g0Var5.b) + i12;
            i3 = ((r68) sq8Var2.e).b;
            if (i2 >= i3) {
                i2 = i3 - 1;
            }
            d3g0Var6 = new d3g0(d3g0Var5.f5402a, i2);
            if (z) {
                d3g0Var3 = d3g0Var7;
                d3g0Var4 = d3g0Var6;
            } else {
                d3g0Var4 = d3g0Var8;
                d3g0Var3 = d3g0Var6;
            }
        } else {
            d3g0Var3 = d3g0Var7;
            d3g0Var4 = d3g0Var8;
        }
        return new sq8((r68) sq8Var2.e, d3g0Var2, d3g0Var4, d3g0Var, d3g0Var3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:246:0x045d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0484  */
    public static ykj b(int[] iArr, int i, int[] iArr2) throws bwq, q9c {
        int[] iArr3;
        byte[] bArr;
        int[] iArr4;
        int i2;
        int i3;
        on40 on40Var;
        j910 j910Var;
        j910 j910Var2;
        ig80 ig80Var;
        StringBuilder sb;
        boolean z;
        int i4;
        ig80 ig80Var2;
        int i5;
        int i6;
        int iA;
        int i7;
        if (iArr.length == 0) {
            throw bwq.a();
        }
        int i8 = 1;
        int i9 = 1 << (i + 1);
        if (iArr2.length > (i9 / 2) + 3 || i9 < 0 || i9 > 512) {
            throw q9c.a();
        }
        on40 on40Var2 = (on40) f16470a.b;
        if (iArr.length == 0) {
            e9d0.o();
            return null;
        }
        int length = iArr.length;
        int i10 = 0;
        if (length <= 1 || iArr[0] != 0) {
            iArr3 = iArr;
        } else {
            int i11 = 1;
            while (i11 < length && iArr[i11] == 0) {
                i11++;
            }
            if (i11 == length) {
                iArr3 = new int[]{0};
            } else {
                int i12 = length - i11;
                int[] iArr5 = new int[i12];
                System.arraycopy(iArr, i11, iArr5, 0, i12);
                iArr3 = iArr5;
            }
        }
        int[] iArr6 = new int[i9];
        boolean z2 = false;
        for (int i13 = i9; i13 > 0; i13--) {
            int i14 = on40Var2.f25530a[i13];
            if (i14 == 0) {
                i7 = iArr3[iArr3.length - 1];
            } else {
                if (i14 == 1) {
                    iA = 0;
                    for (int i15 : iArr3) {
                        iA = on40Var2.a(iA, i15);
                    }
                } else {
                    iA = iArr3[0];
                    int length2 = iArr3.length;
                    for (int i16 = 1; i16 < length2; i16++) {
                        iA = on40Var2.a(on40Var2.c(i14, iA), iArr3[i16]);
                    }
                }
                i7 = iA;
            }
            iArr6[i9 - i13] = i7;
            if (i7 != 0) {
                z2 = true;
            }
        }
        if (z2) {
            j910 j910VarY = on40Var2.d;
            j910 j910Var3 = on40Var2.c;
            for (int i17 : iArr2) {
                j910VarY = j910VarY.y(new j910(on40Var2, new int[]{(929 - on40Var2.f25530a[(iArr.length - 1) - i17]) % 929, 1}));
            }
            j910 j910Var4 = new j910(on40Var2, iArr6);
            if (i9 < 0) {
                e9d0.o();
                return null;
            }
            int[] iArr7 = new int[i9 + 1];
            iArr7[0] = 1;
            j910 j910Var5 = new j910(on40Var2, iArr7);
            if (j910Var5.k() >= j910Var4.k()) {
                j910Var5 = j910Var4;
                j910Var4 = j910Var5;
            }
            j910 j910VarB = j910Var4;
            j910 j910Var6 = j910Var5;
            j910 j910Var7 = on40Var2.d;
            j910 j910Var8 = j910Var3;
            while (j910Var6.k() >= i9 / 2) {
                if (j910Var6.v()) {
                    throw q9c.a();
                }
                int iB = on40Var2.b(j910Var6.j(j910Var6.k()));
                j910 j910VarC = j910Var3;
                while (j910VarB.k() >= j910Var6.k() && !j910VarB.v()) {
                    int iK = j910VarB.k() - j910Var6.k();
                    int iC = on40Var2.c(j910VarB.j(j910VarB.k()), iB);
                    if (iK < 0) {
                        e9d0.o();
                        return null;
                    }
                    if (iC == 0) {
                        j910Var = j910Var3;
                    } else {
                        int[] iArr8 = new int[iK + 1];
                        iArr8[i10] = iC;
                        j910Var = new j910(on40Var2, iArr8);
                    }
                    j910VarC = j910VarC.c(j910Var);
                    int[] iArr9 = (int[]) j910Var6.c;
                    on40 on40Var3 = (on40) j910Var6.b;
                    if (iK < 0) {
                        e9d0.o();
                        return null;
                    }
                    if (iC == 0) {
                        j910Var2 = on40Var3.c;
                    } else {
                        int length3 = iArr9.length;
                        int[] iArr10 = new int[iK + length3];
                        int i18 = 0;
                        while (i18 < length3) {
                            int i19 = i18;
                            iArr10[i19] = on40Var3.c(iArr9[i19], iC);
                            i18 = i19 + 1;
                        }
                        j910Var2 = new j910(on40Var3, iArr10);
                    }
                    j910VarB = j910VarB.B(j910Var2);
                    i8 = i8;
                    i10 = 0;
                }
                int i20 = i8;
                j910 j910VarB2 = j910VarC.y(j910Var7).B(j910Var8);
                int[] iArr11 = (int[]) j910VarB2.c;
                int length4 = iArr11.length;
                int[] iArr12 = new int[length4];
                int i21 = 0;
                while (true) {
                    on40Var = (on40) j910VarB2.b;
                    if (i21 < length4) {
                        int i22 = iArr11[i21];
                        on40Var.getClass();
                        iArr12[i21] = (929 - i22) % 929;
                        i21++;
                    }
                }
                j910 j910Var9 = new j910(on40Var, iArr12);
                j910 j910Var10 = j910VarB;
                j910VarB = j910Var6;
                j910Var6 = j910Var10;
                j910Var8 = j910Var7;
                i10 = 0;
                j910Var7 = j910Var9;
                i8 = i20;
            }
            int i23 = i8;
            int i24 = i10;
            bArr = null;
            int iJ = j910Var7.j(i24);
            if (iJ == 0) {
                throw q9c.a();
            }
            int iB2 = on40Var2.b(iJ);
            j910[] j910VarArr = {j910Var7.x(iB2), j910Var6.x(iB2)};
            j910 j910Var11 = j910VarArr[i24];
            j910 j910Var12 = j910VarArr[i23];
            int iK2 = j910Var11.k();
            int[] iArr13 = new int[iK2];
            int i25 = 0;
            for (int i26 = i23; i26 < 929 && i25 < iK2; i26++) {
                if (j910Var11.g(i26) == 0) {
                    iArr13[i25] = on40Var2.b(i26);
                    i25++;
                }
            }
            if (i25 != iK2) {
                throw q9c.a();
            }
            int iK3 = j910Var11.k();
            if (iK3 < i23) {
                iArr4 = new int[0];
            } else {
                int[] iArr14 = new int[iK3];
                for (int i27 = 1; i27 <= iK3; i27++) {
                    iArr14[iK3 - i27] = on40Var2.c(i27, j910Var11.j(i27));
                }
                if (iK3 == 0) {
                    e9d0.o();
                    return null;
                }
                if (iK3 > 1 && iArr14[0] == 0) {
                    int i28 = 1;
                    while (i28 < iK3 && iArr14[i28] == 0) {
                        i28++;
                    }
                    if (i28 == iK3) {
                        iArr14 = new int[]{0};
                    } else {
                        int i29 = iK3 - i28;
                        int[] iArr15 = new int[i29];
                        System.arraycopy(iArr14, i28, iArr15, 0, i29);
                        iArr14 = iArr15;
                    }
                }
                int[] iArr16 = new int[iK2];
                for (int i30 = 0; i30 < iK2; i30++) {
                    int iB3 = on40Var2.b(iArr13[i30]);
                    int iG = (929 - j910Var12.g(iB3)) % 929;
                    if (iB3 == 0) {
                        i2 = iArr14[iArr14.length - 1];
                    } else if (iB3 == 1) {
                        int iA2 = 0;
                        for (int i31 : iArr14) {
                            iA2 = on40Var2.a(iA2, i31);
                        }
                        i2 = iA2;
                    } else {
                        int iA3 = iArr14[0];
                        int length5 = iArr14.length;
                        for (int i32 = 1; i32 < length5; i32++) {
                            iA3 = on40Var2.a(on40Var2.c(iB3, iA3), iArr14[i32]);
                        }
                        i2 = iA3;
                    }
                    iArr16[i30] = on40Var2.c(iG, on40Var2.b(i2));
                }
                iArr4 = iArr16;
            }
            for (int i33 = 0; i33 < iK2; i33++) {
                int length6 = iArr.length - 1;
                int i34 = iArr13[i33];
                if (i34 == 0) {
                    e9d0.o();
                    return null;
                }
                int i35 = length6 - on40Var2.b[i34];
                if (i35 < 0) {
                    throw q9c.a();
                }
                iArr[i35] = ((929 + iArr[i35]) - iArr4[i33]) % 929;
            }
            i3 = iK2;
        } else {
            i3 = 0;
            bArr = null;
        }
        if (iArr.length < 4) {
            throw bwq.a();
        }
        int i36 = iArr[0];
        if (i36 > iArr.length) {
            throw bwq.a();
        }
        if (i36 == 0) {
            if (i9 >= iArr.length) {
                throw bwq.a();
            }
            iArr[0] = iArr.length - i9;
        }
        String strValueOf = String.valueOf(i);
        char[] cArr = jkj.f16671a;
        int i37 = 2;
        oif0 oif0Var = new oif0(iArr.length * 2);
        int iD = jkj.d(iArr, 1, oif0Var);
        ig80 ig80Var3 = new ig80();
        char c = 0;
        while (true) {
            int i38 = iArr[c];
            if (iD >= i38) {
                ig80 ig80Var4 = ig80Var3;
                if (((StringBuilder) oif0Var.b).length() == 0 && ((sb = (StringBuilder) oif0Var.c) == null || sb.length() == 0)) {
                    ig80Var = ig80Var4;
                    if (ig80Var.f14725a == null) {
                        throw bwq.a();
                    }
                } else {
                    ig80Var = ig80Var4;
                }
                ykj ykjVar = new ykj(oif0Var.toString(), strValueOf, bArr);
                ykjVar.g = ig80Var;
                ykjVar.e = Integer.valueOf(i3);
                ykjVar.f = Integer.valueOf(iArr2.length);
                return ykjVar;
            }
            int iC2 = iD + 1;
            int i39 = iArr[iD];
            if (i39 != 913) {
                switch (i39) {
                    case 900:
                        ig80Var3 = ig80Var3;
                        c = 0;
                        iD = jkj.d(iArr, iC2, oif0Var);
                        break;
                    case 901:
                        z = false;
                        c = 0;
                        while (iC2 < iArr[c] && !z) {
                            while (true) {
                                i4 = iArr[c];
                                if (iC2 >= i4 && iArr[iC2] == 927) {
                                    oif0Var.c(iArr[iC2 + 1]);
                                    iC2 += 2;
                                    c = 0;
                                }
                            }
                            if (iC2 < i4 || iArr[iC2] >= 900) {
                                ig80Var2 = ig80Var3;
                                c = 0;
                                z = true;
                            } else {
                                long j = 0;
                                int i40 = 0;
                                while (true) {
                                    i5 = iC2 + 1;
                                    ig80Var2 = ig80Var3;
                                    j = (j * 900) + ((long) iArr[iC2]);
                                    i40++;
                                    if (i40 < 5 && i5 < iArr[0] && iArr[i5] < 900) {
                                        iC2 = i5;
                                        ig80Var3 = ig80Var2;
                                    }
                                }
                                if (i40 != 5 || (i39 != 924 && (i5 >= iArr[0] || iArr[i5] >= 900))) {
                                    i5 -= i40;
                                    boolean z3 = z;
                                    c = 0;
                                    while (i5 < iArr[0] && !z3) {
                                        int i41 = i5 + 1;
                                        int i42 = iArr[i5];
                                        if (i42 < 900) {
                                            ((StringBuilder) oif0Var.b).append((char) (((byte) i42) & 255));
                                            i5 = i41;
                                        } else if (i42 == 927) {
                                            i5 += 2;
                                            oif0Var.c(iArr[i41]);
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                    z = z3;
                                } else {
                                    for (int i43 = 0; i43 < 6; i43++) {
                                        ((StringBuilder) oif0Var.b).append((char) (((byte) (j >> ((5 - i43) * 8))) & 255));
                                    }
                                    c = 0;
                                }
                                iC2 = i5;
                            }
                            ig80Var3 = ig80Var2;
                        }
                        ig80Var3 = ig80Var3;
                        iD = iC2;
                        break;
                    case 902:
                        iD = jkj.c(iArr, iC2, oif0Var);
                        c = 0;
                        break;
                    default:
                        switch (i39) {
                            case 922:
                            case 923:
                                throw bwq.a();
                            case 924:
                                z = false;
                                c = 0;
                                while (iC2 < iArr[c]) {
                                    while (true) {
                                        i4 = iArr[c];
                                        if (iC2 >= i4) {
                                        }
                                        if (iC2 < i4) {
                                            ig80Var2 = ig80Var3;
                                            c = 0;
                                            z = true;
                                        } else {
                                            ig80Var2 = ig80Var3;
                                            c = 0;
                                            z = true;
                                        }
                                        ig80Var3 = ig80Var2;
                                        oif0Var.c(iArr[iC2 + 1]);
                                        iC2 += 2;
                                        c = 0;
                                    }
                                }
                                ig80Var3 = ig80Var3;
                                iD = iC2;
                                break;
                            case 925:
                                iD += 2;
                                c = 0;
                                break;
                            case 926:
                                iD += 3;
                                c = 0;
                                break;
                            case 927:
                                iD += 2;
                                oif0Var.c(iArr[iC2]);
                                c = 0;
                                break;
                            case 928:
                                if (iD + 3 > i38) {
                                    throw bwq.a();
                                }
                                int[] iArr17 = new int[i37];
                                int i44 = 0;
                                while (i44 < i37) {
                                    iArr17[i44] = iArr[iC2];
                                    i44++;
                                    iC2++;
                                }
                                String strA = jkj.a(iArr17, i37);
                                if (!strA.isEmpty()) {
                                    try {
                                        Integer.parseInt(strA);
                                    } catch (NumberFormatException unused) {
                                        throw bwq.a();
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (iC2 < iArr[0] && iC2 < iArr.length && (i6 = iArr[iC2]) != 922 && i6 != 923) {
                                    sb2.append(String.format("%03d", Integer.valueOf(i6)));
                                    iC2++;
                                }
                                if (sb2.length() == 0) {
                                    throw bwq.a();
                                }
                                ig80Var3.f14725a = sb2.toString();
                                int i45 = iArr[iC2] == 923 ? iC2 + 1 : -1;
                                while (iC2 < iArr[0]) {
                                    int i46 = iArr[iC2];
                                    if (i46 == 922) {
                                        iC2++;
                                        ig80Var3.b = true;
                                    } else {
                                        if (i46 != 923) {
                                            throw bwq.a();
                                        }
                                        switch (iArr[iC2 + 1]) {
                                            case 0:
                                                oif0 oif0Var2 = new oif0((byte) 17);
                                                iC2 = jkj.d(iArr, iC2 + 2, oif0Var2);
                                                oif0Var2.toString();
                                                break;
                                            case 1:
                                                oif0 oif0Var3 = new oif0((byte) 17);
                                                iC2 = jkj.c(iArr, iC2 + 2, oif0Var3);
                                                try {
                                                    Integer.parseInt(oif0Var3.toString());
                                                } catch (NumberFormatException unused2) {
                                                    throw bwq.a();
                                                }
                                                break;
                                            case 2:
                                                oif0 oif0Var4 = new oif0((byte) 17);
                                                iC2 = jkj.c(iArr, iC2 + 2, oif0Var4);
                                                try {
                                                    Long.parseLong(oif0Var4.toString());
                                                } catch (NumberFormatException unused3) {
                                                    throw bwq.a();
                                                }
                                                break;
                                            case 3:
                                                oif0 oif0Var5 = new oif0((byte) 17);
                                                iC2 = jkj.d(iArr, iC2 + 2, oif0Var5);
                                                oif0Var5.toString();
                                                break;
                                            case 4:
                                                oif0 oif0Var6 = new oif0((byte) 17);
                                                iC2 = jkj.d(iArr, iC2 + 2, oif0Var6);
                                                oif0Var6.toString();
                                                break;
                                            case 5:
                                                oif0 oif0Var7 = new oif0((byte) 17);
                                                iC2 = jkj.c(iArr, iC2 + 2, oif0Var7);
                                                try {
                                                    Long.parseLong(oif0Var7.toString());
                                                } catch (NumberFormatException unused4) {
                                                    throw bwq.a();
                                                }
                                                break;
                                            case 6:
                                                oif0 oif0Var8 = new oif0((byte) 17);
                                                iC2 = jkj.c(iArr, iC2 + 2, oif0Var8);
                                                try {
                                                    Integer.parseInt(oif0Var8.toString());
                                                } catch (NumberFormatException unused5) {
                                                    throw bwq.a();
                                                }
                                                break;
                                            default:
                                                throw bwq.a();
                                        }
                                    }
                                }
                                if (i45 != -1) {
                                    int i47 = iC2 - i45;
                                    if (ig80Var3.b) {
                                        i47--;
                                    }
                                    if (i47 > 0) {
                                        Arrays.copyOfRange(iArr, i45, i47 + i45);
                                    }
                                }
                                iD = iC2;
                                c = 0;
                                break;
                                break;
                            default:
                                iD = jkj.d(iArr, iD, oif0Var);
                                c = 0;
                                break;
                        }
                        break;
                }
            } else {
                ig80Var3 = ig80Var3;
                c = 0;
                iD += 2;
                oif0Var.b((char) iArr[iC2]);
            }
            ig80Var3 = ig80Var3;
            i37 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0035 A[EDGE_INSN: B:122:0x0035->B:19:0x0035 BREAK  A[LOOP:1: B:9:0x001b->B:18:0x0033], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x004f A[EDGE_INSN: B:125:0x004f->B:28:0x004f BREAK  A[LOOP:2: B:25:0x004a->B:34:0x0064], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[LOOP:1: B:9:0x001b->B:18:0x0033, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    public static ku5 c(r68 r68Var, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        char c;
        int i7;
        int i8 = i;
        int[] iArr = y0x0.l;
        int[] iArr2 = y0x0.k;
        int i9 = z ? -1 : 1;
        boolean z2 = z;
        int i10 = i3;
        int i11 = 0;
        loop0: while (true) {
            c = 2;
            if (i11 >= 2) {
                break;
            }
            while (true) {
                if (!z2) {
                    if (i10 >= i2) {
                        break;
                    }
                    if (z2 == r68Var.b(i10, i4)) {
                        break;
                        break;
                    }
                    if (Math.abs(i3 - i10) > 2) {
                        i10 = i3;
                        break loop0;
                    }
                    i10 += i9;
                } else {
                    if (i10 < i8) {
                        break;
                    }
                    if (z2 == r68Var.b(i10, i4)) {
                        break;
                    }
                    if (Math.abs(i3 - i10) > 2) {
                        i10 = i3;
                        break loop0;
                    }
                    i10 += i9;
                }
            }
            i9 = -i9;
            z2 = !z2;
            i11++;
        }
        int[] iArr3 = new int[8];
        int i12 = z ? 1 : -1;
        boolean z3 = z;
        int i13 = i10;
        int i14 = 0;
        while (true) {
            if (!z) {
                if (i13 < i8) {
                    break;
                }
                if (i14 < 8) {
                    break;
                    break;
                }
                char c2 = c;
                if (r68Var.b(i13, i4) == z3) {
                    iArr3[i14] = iArr3[i14] + 1;
                    i13 += i12;
                } else {
                    i14++;
                    z3 = !z3;
                }
                c = c2;
            } else {
                if (i13 >= i2) {
                    break;
                }
                if (i14 < 8) {
                    break;
                }
                char c3 = c;
                if (r68Var.b(i13, i4) == z3) {
                    iArr3[i14] = iArr3[i14] + 1;
                    i13 += i12;
                } else {
                    i14++;
                    z3 = !z3;
                }
                c = c3;
            }
        }
        char c4 = c;
        if (i14 != 8) {
            if (z) {
                i8 = i2;
            }
            if (i13 != i8 || i14 != 7) {
                iArr3 = null;
            }
        }
        if (iArr3 != null) {
            int iH = q7x.H(iArr3);
            if (z) {
                i7 = i10 + iH;
            } else {
                for (int i15 = 0; i15 < iArr3.length / 2; i15++) {
                    int i16 = iArr3[i15];
                    iArr3[i15] = iArr3[(iArr3.length - 1) - i15];
                    iArr3[(iArr3.length - 1) - i15] = i16;
                }
                int i17 = i10;
                i10 -= iH;
                i7 = i17;
            }
            if (i5 - 2 <= iH && iH <= i6 + 2) {
                float[][] fArr = gg80.f11243a;
                float fH = q7x.H(iArr3);
                int[] iArr4 = new int[8];
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < 17; i20++) {
                    float f = ((i20 * fH) / 17.0f) + (fH / 34.0f);
                    int i21 = iArr3[i19] + i18;
                    if (i21 <= f) {
                        i19++;
                        i18 = i21;
                    }
                    iArr4[i19] = iArr4[i19] + 1;
                }
                long j = 0;
                for (int i22 = 0; i22 < 8; i22++) {
                    for (int i23 = 0; i23 < iArr4[i22]; i23++) {
                        j = (j << 1) | ((long) (i22 % 2 == 0 ? 1 : 0));
                    }
                }
                int i24 = (int) j;
                int iBinarySearch = Arrays.binarySearch(iArr2, i24 & 262143);
                if ((iBinarySearch < 0 ? -1 : (iArr[iBinarySearch] - 1) % 929) == -1) {
                    i24 = -1;
                }
                if (i24 == -1) {
                    int iH2 = q7x.H(iArr3);
                    float[] fArr2 = new float[8];
                    if (iH2 > 1) {
                        for (int i25 = 0; i25 < 8; i25++) {
                            fArr2[i25] = iArr3[i25] / iH2;
                        }
                    }
                    float f2 = Float.MAX_VALUE;
                    i24 = -1;
                    int i26 = 0;
                    while (true) {
                        float[][] fArr3 = gg80.f11243a;
                        if (i26 >= fArr3.length) {
                            break;
                        }
                        float[] fArr4 = fArr3[i26];
                        float f3 = 0.0f;
                        for (int i27 = 0; i27 < 8; i27++) {
                            float f4 = fArr4[i27] - fArr2[i27];
                            f3 += f4 * f4;
                            if (f3 >= f2) {
                                break;
                            }
                        }
                        if (f3 < f2) {
                            i24 = iArr2[i26];
                            f2 = f3;
                        }
                        i26++;
                    }
                }
                int iBinarySearch2 = Arrays.binarySearch(iArr2, 262143 & i24);
                int i28 = iBinarySearch2 < 0 ? -1 : (iArr[iBinarySearch2] - 1) % 929;
                if (i28 == -1) {
                    return null;
                }
                int[] iArr5 = new int[8];
                int i29 = 0;
                int i30 = 7;
                while (true) {
                    int i31 = i24 & 1;
                    if (i31 != i29) {
                        i30--;
                        if (i30 < 0) {
                            return new ku5(i10, i7, ((((iArr5[0] - iArr5[c4]) + iArr5[4]) - iArr5[6]) + 9) % 9, i28, (byte) 2);
                        }
                        i29 = i31;
                    }
                    iArr5[i30] = iArr5[i30] + 1;
                    i24 >>= 1;
                    ku5 ku5Var = ku5Var;
                    i28 = i28;
                }
            }
        }
        return null;
    }

    public static egk d(r68 r68Var, sq8 sq8Var, d3g0 d3g0Var, boolean z, int i, int i2) {
        egk egkVar = new egk(sq8Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int i5 = (int) d3g0Var.f5402a;
            int i6 = (int) d3g0Var.b;
            while (i6 <= sq8Var.d && i6 >= sq8Var.c) {
                ku5 ku5VarC = c(r68Var, 0, r68Var.f29923a, z, i5, i6, i, i2);
                if (ku5VarC != null) {
                    ((ku5[]) egkVar.c)[egkVar.d(i6)] = ku5VarC;
                    i5 = z ? ku5VarC.b : ku5VarC.c;
                }
                i6 += i4;
                z = z;
            }
            i3++;
        }
        return egkVar;
    }
}
