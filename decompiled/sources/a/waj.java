package a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class waj implements rae0 {
    public static final d3g0[] c = new d3g0[0];
    public static final d3g0[] d = new d3g0[0];
    public static final d3g0[] e = new d3g0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38829a;
    public final Object b;

    public waj(byte b) {
        this.f38829a = b;
        switch (b) {
            case 1:
                this.b = new psc((byte) 19);
                break;
            case 2:
                this.b = new prc((byte) 22);
                break;
            default:
                this.b = new rrc();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:230:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:235:0x051a  */
    /* JADX WARN: Code duplicated, block: B:236:0x052a  */
    /* JADX WARN: Code duplicated, block: B:351:0x074b  */
    /* JADX WARN: Code duplicated, block: B:353:0x075b  */
    /* JADX WARN: Code duplicated, block: B:354:0x076d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0772  */
    /* JADX WARN: Code duplicated, block: B:358:0x077e A[LOOP:19: B:357:0x077c->B:358:0x077e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:363:0x07ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:362:0x07ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:363:0x07ef, please report this as an issue */
    @Override // a.rae0
    public final i0g0 a(chf0 chf0Var, Map map) throws bwq, q9c, o660 {
        char c2;
        char c3;
        char c4;
        ykj ykjVarW;
        d3g0[] d3g0VarArr;
        char c5;
        int[] iArr;
        int iF;
        byte[] bArr;
        StringBuilder sb;
        byte[][] bArr2;
        int i;
        String string;
        String str;
        String str2;
        int iR;
        int iR2;
        a3g0 a3g0Var;
        sdq sdqVar;
        sdq sdqVar2;
        sdq sdqVar3;
        a3g0 a3g0Var2;
        float f;
        c22 c22VarF;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        d3g0[] d3g0VarArr2;
        ykj ykjVarI;
        d3g0[] d3g0VarArr3;
        double d2;
        a3g0 a3g0Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        int iAbs;
        int i7;
        byte b = this.f38829a;
        a3g0 a3g0Var4 = a3g0.m;
        a3g0 a3g0Var5 = a3g0.b;
        gkj gkjVar = gkj.b;
        a3g0 a3g0Var6 = a3g0.d;
        a3g0 a3g0Var7 = a3g0.c;
        char c6 = 5;
        Object obj = this.b;
        switch (b) {
            case 0:
                rrc rrcVar = (rrc) obj;
                if (map == null || !map.containsKey(gkjVar)) {
                    r68 r68VarX = chf0Var.x();
                    wti wtiVar = new wti(r68VarX);
                    d3g0[] d3g0VarArrB = ((mv40) wtiVar.c).b();
                    d3g0 d3g0Var = d3g0VarArrB[0];
                    d3g0 d3g0Var2 = d3g0VarArrB[1];
                    d3g0 d3g0Var3 = d3g0VarArrB[3];
                    d3g0 d3g0Var4 = d3g0VarArrB[2];
                    int iC = wtiVar.C(d3g0Var, d3g0Var2);
                    int iC2 = wtiVar.C(d3g0Var2, d3g0Var3);
                    int iC3 = wtiVar.C(d3g0Var3, d3g0Var4);
                    int iC4 = wtiVar.C(d3g0Var4, d3g0Var);
                    d3g0[] d3g0VarArr4 = {d3g0Var4, d3g0Var, d3g0Var2, d3g0Var3};
                    if (iC > iC2) {
                        d3g0VarArr4[0] = d3g0Var;
                        d3g0VarArr4[1] = d3g0Var2;
                        d3g0VarArr4[2] = d3g0Var3;
                        d3g0VarArr4[3] = d3g0Var4;
                        iC = iC2;
                    }
                    if (iC > iC3) {
                        d3g0VarArr4[0] = d3g0Var2;
                        d3g0VarArr4[1] = d3g0Var3;
                        d3g0VarArr4[2] = d3g0Var4;
                        d3g0VarArr4[3] = d3g0Var;
                    } else {
                        iC3 = iC;
                    }
                    if (iC3 > iC4) {
                        d3g0VarArr4[0] = d3g0Var3;
                        d3g0VarArr4[1] = d3g0Var4;
                        d3g0VarArr4[2] = d3g0Var;
                        d3g0VarArr4[3] = d3g0Var2;
                    }
                    d3g0 d3g0Var5 = d3g0VarArr4[0];
                    d3g0 d3g0Var6 = d3g0VarArr4[1];
                    d3g0 d3g0Var7 = d3g0VarArr4[2];
                    d3g0 d3g0Var8 = d3g0VarArr4[3];
                    int iC5 = (wtiVar.C(d3g0Var5, d3g0Var8) + 1) * 4;
                    if (wtiVar.C(wti.B(d3g0Var6, d3g0Var7, iC5), d3g0Var5) < wtiVar.C(wti.B(d3g0Var7, d3g0Var6, iC5), d3g0Var8)) {
                        c3 = 0;
                        d3g0VarArr4[0] = d3g0Var5;
                        d3g0VarArr4[1] = d3g0Var6;
                        c2 = 2;
                        d3g0VarArr4[2] = d3g0Var7;
                        c4 = 3;
                        d3g0VarArr4[3] = d3g0Var8;
                    } else {
                        c2 = 2;
                        c3 = 0;
                        c4 = 3;
                        d3g0VarArr4[0] = d3g0Var6;
                        d3g0VarArr4[1] = d3g0Var7;
                        d3g0VarArr4[2] = d3g0Var8;
                        d3g0VarArr4[3] = d3g0Var5;
                    }
                    d3g0 d3g0Var9 = d3g0VarArr4[c3];
                    d3g0 d3g0Var10 = d3g0VarArr4[1];
                    d3g0 d3g0Var11 = d3g0VarArr4[c2];
                    d3g0 d3g0Var12 = d3g0VarArr4[c4];
                    int iC6 = wtiVar.C(d3g0Var9, d3g0Var12);
                    d3g0 d3g0VarB = wti.B(d3g0Var9, d3g0Var10, (wtiVar.C(d3g0Var10, d3g0Var12) + 1) * 4);
                    d3g0 d3g0VarB2 = wti.B(d3g0Var11, d3g0Var10, (iC6 + 1) * 4);
                    int iC7 = wtiVar.C(d3g0VarB, d3g0Var12);
                    int iC8 = wtiVar.C(d3g0VarB2, d3g0Var12);
                    float f6 = d3g0Var12.f5402a;
                    float f7 = d3g0Var11.f5402a;
                    float f8 = d3g0Var10.f5402a;
                    float f9 = f7 - f8;
                    float f10 = iC7 + 1;
                    float f11 = d3g0Var12.b;
                    float f12 = d3g0Var11.b;
                    float f13 = d3g0Var10.b;
                    d3g0 d3g0Var13 = new d3g0((f9 / f10) + f6, rw2.z(f12, f13, f10, f11));
                    float f14 = iC8 + 1;
                    d3g0 d3g0Var14 = new d3g0(((d3g0Var9.f5402a - f8) / f14) + f6, rw2.z(d3g0Var9.b, f13, f14, f11));
                    if (wtiVar.r(d3g0Var13)) {
                        if (!wtiVar.r(d3g0Var14) || wtiVar.C(d3g0VarB2, d3g0Var13) + wtiVar.C(d3g0VarB, d3g0Var13) > wtiVar.C(d3g0VarB2, d3g0Var14) + wtiVar.C(d3g0VarB, d3g0Var14)) {
                            d3g0Var14 = d3g0Var13;
                        }
                    } else if (!wtiVar.r(d3g0Var14)) {
                        d3g0Var14 = null;
                    }
                    d3g0VarArr4[3] = d3g0Var14;
                    if (d3g0Var14 == null) {
                        throw o660.a();
                    }
                    d3g0 d3g0Var15 = d3g0VarArr4[0];
                    d3g0 d3g0Var16 = d3g0VarArr4[1];
                    d3g0 d3g0Var17 = d3g0VarArr4[2];
                    int iC9 = wtiVar.C(d3g0Var15, d3g0Var14) + 1;
                    d3g0 d3g0VarB3 = wti.B(d3g0Var15, d3g0Var16, (wtiVar.C(d3g0Var17, d3g0Var14) + 1) * 4);
                    d3g0 d3g0VarB4 = wti.B(d3g0Var17, d3g0Var16, iC9 * 4);
                    int iC10 = wtiVar.C(d3g0VarB3, d3g0Var14);
                    int i8 = iC10 + 1;
                    int iC11 = wtiVar.C(d3g0VarB4, d3g0Var14);
                    int i9 = iC11 + 1;
                    if ((i8 & 1) == 1) {
                        i8 = iC10 + 2;
                    }
                    if ((i9 & 1) == 1) {
                        i9 = iC11 + 2;
                    }
                    float f15 = (((d3g0Var15.f5402a + d3g0Var16.f5402a) + d3g0Var17.f5402a) + d3g0Var14.f5402a) / 4.0f;
                    float f16 = (((d3g0Var15.b + d3g0Var16.b) + d3g0Var17.b) + d3g0Var14.b) / 4.0f;
                    d3g0 d3g0VarV = wti.v(d3g0Var15, f15, f16);
                    d3g0 d3g0VarV2 = wti.v(d3g0Var16, f15, f16);
                    d3g0 d3g0VarV3 = wti.v(d3g0Var17, f15, f16);
                    d3g0 d3g0VarV4 = wti.v(d3g0Var14, f15, f16);
                    int i10 = i9 * 4;
                    int i11 = i8 * 4;
                    d3g0[] d3g0VarArr5 = {wti.B(wti.B(d3g0VarV, d3g0VarV2, i10), d3g0VarV4, i11), wti.B(wti.B(d3g0VarV2, d3g0VarV, i10), d3g0VarV3, i11), wti.B(wti.B(d3g0VarV3, d3g0VarV4, i10), d3g0VarV2, i11), wti.B(wti.B(d3g0VarV4, d3g0VarV3, i10), d3g0VarV, i11)};
                    d3g0 d3g0Var18 = d3g0VarArr5[0];
                    d3g0 d3g0Var19 = d3g0VarArr5[1];
                    d3g0 d3g0Var20 = d3g0VarArr5[2];
                    d3g0 d3g0Var21 = d3g0VarArr5[3];
                    int iC12 = wtiVar.C(d3g0Var18, d3g0Var21);
                    int iMax = iC12 + 1;
                    int iC13 = wtiVar.C(d3g0Var20, d3g0Var21);
                    int i12 = iC13 + 1;
                    if ((iMax & 1) == 1) {
                        iMax = iC12 + 2;
                    }
                    if ((i12 & 1) == 1) {
                        i12 = iC13 + 2;
                    }
                    if (iMax * 4 < i12 * 6 && i12 * 4 < iMax * 6) {
                        iMax = Math.max(iMax, i12);
                        i12 = iMax;
                    }
                    float f17 = iMax - 0.5f;
                    float f18 = i12 - 0.5f;
                    ykjVarW = rrcVar.w(ebc.j0(r68VarX, iMax, i12, zk90.a(0.5f, 0.5f, f17, 0.5f, f17, f18, 0.5f, f18, d3g0Var18.f5402a, d3g0Var18.b, d3g0Var21.f5402a, d3g0Var21.b, d3g0Var20.f5402a, d3g0Var20.b, d3g0Var19.f5402a, d3g0Var19.b)));
                    d3g0VarArr = new d3g0[]{d3g0Var18, d3g0Var19, d3g0Var20, d3g0Var21};
                } else {
                    r68 r68VarX2 = chf0Var.x();
                    int[] iArrE = r68VarX2.e();
                    int[] iArrC = r68VarX2.c();
                    if (iArrE == null || iArrC == null) {
                        throw o660.a();
                    }
                    int i13 = r68VarX2.f29923a;
                    int i14 = iArrE[0];
                    int i15 = iArrE[1];
                    while (i14 < i13 && r68VarX2.b(i14, i15)) {
                        i14++;
                    }
                    if (i14 == i13) {
                        throw o660.a();
                    }
                    int i16 = iArrE[0];
                    int i17 = i14 - i16;
                    if (i17 == 0) {
                        throw o660.a();
                    }
                    int i18 = iArrE[1];
                    int i19 = iArrC[1];
                    int i20 = ((iArrC[0] - i16) + 1) / i17;
                    int i21 = ((i19 - i18) + 1) / i17;
                    if (i20 <= 0 || i21 <= 0) {
                        throw o660.a();
                    }
                    int i22 = i17 / 2;
                    int i23 = i18 + i22;
                    int i24 = i16 + i22;
                    r68 r68Var = new r68(i20, i21);
                    for (int i25 = 0; i25 < i21; i25++) {
                        int i26 = (i25 * i17) + i23;
                        for (int i27 = 0; i27 < i20; i27++) {
                            if (r68VarX2.b((i27 * i17) + i24, i26)) {
                                r68Var.h(i27, i25);
                            }
                        }
                    }
                    ykjVarW = rrcVar.w(r68Var);
                    d3g0VarArr = c;
                }
                i0g0 i0g0Var = new i0g0(ykjVarW.b, ykjVarW.f42791a, d3g0VarArr, ju5.f);
                List list = ykjVarW.c;
                if (list != null) {
                    i0g0Var.b(a3g0Var5, list);
                }
                String str3 = ykjVarW.d;
                if (str3 != null) {
                    i0g0Var.b(a3g0Var7, str3);
                }
                i0g0Var.b(a3g0Var6, ykjVarW.e);
                i0g0Var.b(a3g0Var4, "]d" + ykjVarW.j);
                return i0g0Var;
            case 1:
                r68 r68VarX3 = chf0Var.x();
                int i28 = r68VarX3.f29923a;
                int i29 = r68VarX3.b;
                int i30 = -1;
                int i31 = -1;
                for (int i32 = 0; i32 < r68VarX3.b; i32++) {
                    int i33 = 0;
                    while (true) {
                        int i34 = r68VarX3.c;
                        if (i33 < i34) {
                            int i35 = r68VarX3.d[(i34 * i32) + i33];
                            if (i35 != 0) {
                                if (i32 < i29) {
                                    i29 = i32;
                                }
                                if (i32 > i31) {
                                    i31 = i32;
                                }
                                int i36 = i33 * 32;
                                if (i36 < i28) {
                                    int i37 = 0;
                                    while ((i35 << (31 - i37)) == 0) {
                                        i37++;
                                    }
                                    int i38 = i37 + i36;
                                    if (i38 < i28) {
                                        i28 = i38;
                                    }
                                }
                                if (i36 + 31 > i30) {
                                    int i39 = 31;
                                    while ((i35 >>> i39) == 0) {
                                        i39--;
                                    }
                                    int i40 = i36 + i39;
                                    if (i40 > i30) {
                                        i30 = i40;
                                    }
                                }
                            }
                            i33++;
                        }
                    }
                }
                if (i30 < i28 || i31 < i29) {
                    c5 = 1;
                    iArr = null;
                } else {
                    c5 = 1;
                    iArr = new int[]{i28, i29, (i30 - i28) + 1, (i31 - i29) + 1};
                }
                if (iArr == null) {
                    throw o660.a();
                }
                int i41 = iArr[0];
                int i42 = iArr[c5];
                int i43 = iArr[2];
                int i44 = iArr[3];
                int[] iArr2 = new int[33];
                for (int i45 = 0; i45 < 33; i45++) {
                    int iMin = Math.min(((i44 / 2) + (i45 * i44)) / 33, i44 - 1) + i42;
                    for (int i46 = 0; i46 < 30; i46++) {
                        if (r68VarX3.b(Math.min(((((i45 & 1) * i43) / 2) + ((i43 / 2) + (i46 * i43))) / 30, i43 - 1) + i41, iMin)) {
                            int i47 = (i46 / 32) + i45;
                            iArr2[i47] = iArr2[i47] | (1 << (i46 & 31));
                        }
                    }
                }
                psc pscVar = (psc) obj;
                byte[] bArr3 = new byte[144];
                for (int i48 = 0; i48 < 33; i48++) {
                    int[] iArr3 = ccq0.f4125a[i48];
                    for (int i49 = 0; i49 < 30; i49++) {
                        int i50 = iArr3[i49];
                        if (i50 >= 0 && ((iArr2[(i49 / 32) + i48] >>> (i49 & 31)) & 1) != 0) {
                            int i51 = i50 / 6;
                            bArr3[i51] = (byte) (((byte) (1 << (5 - (i50 % 6)))) | bArr3[i51]);
                        }
                    }
                }
                int iF2 = pscVar.f(bArr3, 0, 10, 10, 0);
                int i52 = bArr3[0] & 15;
                if (i52 == 2 || i52 == 3 || i52 == 4) {
                    iF = iF2 + pscVar.f(bArr3, 20, 84, 40, 1) + pscVar.f(bArr3, 20, 84, 40, 2);
                    bArr = new byte[94];
                } else {
                    if (i52 != 5) {
                        throw bwq.a();
                    }
                    iF = iF2 + pscVar.f(bArr3, 20, 68, 56, 1) + pscVar.f(bArr3, 20, 68, 56, 2);
                    bArr = new byte[78];
                }
                System.arraycopy(bArr3, 0, bArr, 0, 10);
                System.arraycopy(bArr3, 20, bArr, 10, bArr.length - 10);
                StringBuilder sb2 = new StringBuilder(144);
                int i53 = 2;
                if (i52 == 2) {
                    if (i52 == i53) {
                        iR = i4w0.R(bArr, i4w0.i);
                        iR2 = i4w0.R(bArr, i4w0.h);
                        if (iR2 <= 10) {
                            throw bwq.a();
                        }
                        string = new DecimalFormat("0000000000".substring(0, iR2)).format(iR);
                    } else {
                        bArr2 = i4w0.j;
                        sb = new StringBuilder(6);
                        for (i = 0; i < 6; i++) {
                            sb.append(i4w0.k[0].charAt(i4w0.R(bArr, bArr2[i])));
                        }
                        string = sb.toString();
                    }
                    DecimalFormat decimalFormat = new DecimalFormat("000");
                    str = decimalFormat.format(i4w0.R(bArr, i4w0.f));
                    str2 = decimalFormat.format(i4w0.R(bArr, i4w0.g));
                    sb2.append(i4w0.S(bArr, 10, 84));
                    if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                        sb2.insert(9, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    } else {
                        sb2.insert(0, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    }
                } else if (i52 == 3) {
                    i53 = 2;
                    if (i52 == i53) {
                        iR = i4w0.R(bArr, i4w0.i);
                        iR2 = i4w0.R(bArr, i4w0.h);
                        if (iR2 <= 10) {
                            throw bwq.a();
                        }
                        string = new DecimalFormat("0000000000".substring(0, iR2)).format(iR);
                    } else {
                        bArr2 = i4w0.j;
                        sb = new StringBuilder(6);
                        while (i < 6) {
                            sb.append(i4w0.k[0].charAt(i4w0.R(bArr, bArr2[i])));
                        }
                        string = sb.toString();
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat("000");
                    str = decimalFormat2.format(i4w0.R(bArr, i4w0.f));
                    str2 = decimalFormat2.format(i4w0.R(bArr, i4w0.g));
                    sb2.append(i4w0.S(bArr, 10, 84));
                    if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                        sb2.insert(9, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    } else {
                        sb2.insert(0, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    }
                } else if (i52 == 4) {
                    sb2.append(i4w0.S(bArr, 1, 93));
                } else if (i52 == 5) {
                    sb2.append(i4w0.S(bArr, 1, 77));
                }
                String string2 = sb2.toString();
                String strValueOf = String.valueOf(i52);
                Integer numValueOf = Integer.valueOf(iF);
                i0g0 i0g0Var2 = new i0g0(string2, bArr, d, ju5.j);
                i0g0Var2.b(a3g0Var6, numValueOf);
                if (strValueOf != null) {
                    i0g0Var2.b(a3g0Var7, strValueOf);
                }
                return i0g0Var2;
            default:
                prc prcVar = (prc) obj;
                if (map != null && map.containsKey(gkjVar)) {
                    r68 r68VarX4 = chf0Var.x();
                    int[] iArrE2 = r68VarX4.e();
                    int[] iArrC2 = r68VarX4.c();
                    if (iArrE2 == null || iArrC2 == null) {
                        throw o660.a();
                    }
                    int i54 = r68VarX4.b;
                    int i55 = r68VarX4.f29923a;
                    int i56 = iArrE2[0];
                    int i57 = 0;
                    boolean z = true;
                    for (int i58 = iArrE2[1]; i56 < i55 && i58 < i54; i58++) {
                        if (z != r68VarX4.b(i56, i58)) {
                            int i59 = i57 + 1;
                            if (i59 != 5) {
                                z = !z;
                                i57 = i59;
                            } else {
                                if (i56 != i55 || i58 == i54) {
                                    throw o660.a();
                                }
                                int i60 = iArrE2[0];
                                float f19 = (i56 - i60) / 7.0f;
                                int i61 = iArrE2[1];
                                int i62 = iArrC2[1];
                                int i63 = iArrC2[0];
                                if (i60 >= i63 || i61 >= i62) {
                                    throw o660.a();
                                }
                                int i64 = i62 - i61;
                                if (i64 != i63 - i60 && (i63 = i60 + i64) >= r68VarX4.f29923a) {
                                    throw o660.a();
                                }
                                int iRound = Math.round(((i63 - i60) + 1) / f19);
                                int iRound2 = Math.round((i64 + 1) / f19);
                                if (iRound <= 0 || iRound2 <= 0) {
                                    throw o660.a();
                                }
                                if (iRound2 != iRound) {
                                    throw o660.a();
                                }
                                int i65 = (int) (f19 / 2.0f);
                                int i66 = i61 + i65;
                                int i67 = i60 + i65;
                                int i68 = (((int) ((iRound - 1) * f19)) + i67) - i63;
                                if (i68 > 0) {
                                    if (i68 > i65) {
                                        throw o660.a();
                                    }
                                    i67 -= i68;
                                }
                                int i69 = (((int) ((iRound2 - 1) * f19)) + i66) - i62;
                                if (i69 > 0) {
                                    if (i69 > i65) {
                                        throw o660.a();
                                    }
                                    i66 -= i69;
                                }
                                r68 r68Var2 = new r68(iRound, iRound2);
                                for (int i70 = 0; i70 < iRound2; i70++) {
                                    int i71 = ((int) (i70 * f19)) + i66;
                                    int i72 = 0;
                                    while (i72 < iRound) {
                                        int i73 = i67;
                                        if (r68VarX4.b(i73 + ((int) (i72 * f19)), i71)) {
                                            r68Var2.h(i72, i70);
                                        }
                                        i72++;
                                        i67 = i73;
                                    }
                                }
                                ykjVarI = prcVar.i(r68Var2, map);
                                d3g0VarArr3 = e;
                                a3g0Var = a3g0Var4;
                                a3g0Var2 = a3g0Var6;
                                i2 = 3;
                            }
                        }
                        i56++;
                    }
                    if (i56 != i55) {
                    }
                    throw o660.a();
                }
                int i74 = 0;
                int i75 = 1;
                r68 r68VarX5 = chf0Var.x();
                hsj hsjVar = new hsj();
                hsjVar.f13586a = r68VarX5;
                e3g0 e3g0Var = map == null ? null : (e3g0) map.get(gkj.j);
                hsjVar.b = e3g0Var;
                td9 td9Var = new td9();
                td9Var.b = r68VarX5;
                td9Var.c = new ArrayList();
                td9Var.d = new int[5];
                td9Var.e = e3g0Var;
                ArrayList arrayList = (ArrayList) td9Var.c;
                boolean z2 = map != null && map.containsKey(gkj.d);
                int i76 = r68VarX5.b;
                int i77 = r68VarX5.f29923a;
                int i78 = (i76 * 3) / 388;
                if (i78 < 3 || z2) {
                    i78 = 3;
                }
                int[] iArr4 = new int[5];
                int i79 = i78 - 1;
                boolean zE = false;
                while (i79 < i76 && !zE) {
                    char c7 = c6;
                    Arrays.fill(iArr4, i74);
                    int i80 = i78;
                    int i81 = 0;
                    int i82 = 0;
                    while (i82 < i77) {
                        if (r68VarX5.b(i82, i79)) {
                            i3 = i76;
                            a3g0Var3 = a3g0Var4;
                            int i83 = i75;
                            if ((i81 & 1) == i83) {
                                i81++;
                            }
                            iArr4[i81] = iArr4[i81] + i83;
                            i4 = i80;
                        } else {
                            a3g0Var3 = a3g0Var4;
                            i3 = i76;
                            if ((i81 & 1) == 0) {
                                if (i81 != 4) {
                                    i81++;
                                    iArr4[i81] = iArr4[i81] + 1;
                                } else if (!td9.b(iArr4)) {
                                    iArr4[0] = iArr4[2];
                                    iArr4[1] = iArr4[3];
                                    iArr4[2] = iArr4[4];
                                    iArr4[3] = 1;
                                    iArr4[4] = 0;
                                    i4 = i80;
                                    i81 = 3;
                                } else if (td9Var.d(i79, i82, iArr4)) {
                                    if (td9Var.f33756a) {
                                        zE = td9Var.e();
                                        i6 = 2;
                                    } else {
                                        if (arrayList.size() <= 1) {
                                            i5 = i82;
                                            iAbs = 0;
                                            i6 = 2;
                                        } else {
                                            Iterator it = arrayList.iterator();
                                            sdq sdqVar4 = null;
                                            while (true) {
                                                if (it.hasNext()) {
                                                    sdq sdqVar5 = (sdq) it.next();
                                                    Iterator it2 = it;
                                                    i5 = i82;
                                                    if (sdqVar5.d >= 2) {
                                                        if (sdqVar4 == null) {
                                                            sdqVar4 = sdqVar5;
                                                        } else {
                                                            td9Var.f33756a = true;
                                                            i6 = 2;
                                                            iAbs = ((int) (Math.abs(sdqVar4.f5402a - sdqVar5.f5402a) - Math.abs(sdqVar4.b - sdqVar5.b))) / 2;
                                                        }
                                                    }
                                                    it = it2;
                                                    i82 = i5;
                                                } else {
                                                    i5 = i82;
                                                    i6 = 2;
                                                    iAbs = 0;
                                                }
                                            }
                                        }
                                        int i84 = iArr4[i6];
                                        if (iAbs > i84) {
                                            i79 += (iAbs - i84) - 2;
                                            i82 = i77 - 1;
                                        } else {
                                            i82 = i5;
                                        }
                                    }
                                    Arrays.fill(iArr4, 0);
                                    i81 = 0;
                                    i4 = i6;
                                } else {
                                    iArr4[0] = iArr4[2];
                                    iArr4[1] = iArr4[3];
                                    iArr4[2] = iArr4[4];
                                    iArr4[3] = 1;
                                    iArr4[4] = 0;
                                    i4 = i80;
                                    i81 = 3;
                                }
                                i82++;
                                i80 = i4;
                                i76 = i3;
                                a3g0Var4 = a3g0Var3;
                                i75 = 1;
                            } else {
                                iArr4[i81] = iArr4[i81] + 1;
                            }
                            i4 = i80;
                            i82++;
                            i80 = i4;
                            i76 = i3;
                            a3g0Var4 = a3g0Var3;
                            i75 = 1;
                        }
                        i82++;
                        i80 = i4;
                        i76 = i3;
                        a3g0Var4 = a3g0Var3;
                        i75 = 1;
                    }
                    a3g0 a3g0Var8 = a3g0Var4;
                    int i85 = i76;
                    if (td9.b(iArr4) && td9Var.d(i79, i77, iArr4)) {
                        int i86 = iArr4[0];
                        if (td9Var.f33756a) {
                            zE = td9Var.e();
                        }
                        i78 = i86;
                    } else {
                        i78 = i80;
                    }
                    i79 += i78;
                    c6 = c7;
                    i76 = i85;
                    a3g0Var4 = a3g0Var8;
                    i75 = 1;
                    i74 = 0;
                }
                a3g0Var = a3g0Var4;
                if (arrayList.size() < 3) {
                    throw o660.a();
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((sdq) it3.next()).d < 2) {
                        it3.remove();
                    }
                }
                Collections.sort(arrayList, td9.g);
                sdq[] sdqVarArr = new sdq[3];
                int i87 = 0;
                double d3 = Double.MAX_VALUE;
                for (int i88 = 2; i87 < arrayList.size() - i88; i88 = 2) {
                    sdq sdqVar6 = (sdq) arrayList.get(i87);
                    float f20 = sdqVar6.c;
                    i87++;
                    int i89 = i87;
                    while (i89 < arrayList.size() - 1) {
                        sdq sdqVar7 = (sdq) arrayList.get(i89);
                        double dJ = td9.j(sdqVar6, sdqVar7);
                        i89++;
                        sdq[] sdqVarArr2 = sdqVarArr;
                        int i90 = i87;
                        int i91 = i89;
                        while (i91 < arrayList.size()) {
                            sdq sdqVar8 = (sdq) arrayList.get(i91);
                            int i92 = i91;
                            if (sdqVar8.c <= 1.4f * f20) {
                                double dJ2 = td9.j(sdqVar7, sdqVar8);
                                double dJ3 = td9.j(sdqVar6, sdqVar8);
                                if (dJ < dJ2) {
                                    if (dJ2 <= dJ3) {
                                        dJ3 = dJ2;
                                        dJ2 = dJ3;
                                    } else if (dJ >= dJ3) {
                                        d2 = dJ3;
                                        dJ3 = dJ;
                                    }
                                    d2 = dJ;
                                } else {
                                    if (dJ2 >= dJ3) {
                                        d2 = dJ3;
                                        dJ3 = dJ2;
                                    } else if (dJ < dJ3) {
                                        d2 = dJ2;
                                        dJ2 = dJ3;
                                        dJ3 = dJ;
                                    } else {
                                        d2 = dJ2;
                                    }
                                    dJ2 = dJ;
                                }
                                double dAbs = Math.abs(dJ2 - (d2 * 2.0d)) + Math.abs(dJ2 - (dJ3 * 2.0d));
                                if (dAbs < d3) {
                                    sdqVarArr2[0] = sdqVar6;
                                    sdqVarArr2[1] = sdqVar7;
                                    sdqVarArr2[2] = sdqVar8;
                                    d3 = dAbs;
                                }
                            }
                            i91 = i92 + 1;
                        }
                        i87 = i90;
                        sdqVarArr = sdqVarArr2;
                    }
                }
                sdq[] sdqVarArr3 = sdqVarArr;
                if (d3 == Double.MAX_VALUE) {
                    throw o660.a();
                }
                float fA = d3g0.a(sdqVarArr3[0], sdqVarArr3[1]);
                float fA2 = d3g0.a(sdqVarArr3[1], sdqVarArr3[2]);
                float fA3 = d3g0.a(sdqVarArr3[0], sdqVarArr3[2]);
                if (fA2 >= fA && fA2 >= fA3) {
                    sdqVar = sdqVarArr3[0];
                    sdqVar2 = sdqVarArr3[1];
                    sdqVar3 = sdqVarArr3[2];
                } else if (fA3 < fA2 || fA3 < fA) {
                    sdqVar = sdqVarArr3[2];
                    sdqVar2 = sdqVarArr3[0];
                    sdqVar3 = sdqVarArr3[1];
                } else {
                    sdqVar = sdqVarArr3[1];
                    sdqVar2 = sdqVarArr3[0];
                    sdqVar3 = sdqVarArr3[2];
                }
                float f21 = sdqVar.f5402a;
                float f22 = sdqVar.b;
                if (((sdqVar2.b - f22) * (sdqVar3.f5402a - f21)) - ((sdqVar2.f5402a - f21) * (sdqVar3.b - f22)) < 0.0f) {
                    sdq sdqVar9 = sdqVar3;
                    sdqVar3 = sdqVar2;
                    sdqVar2 = sdqVar9;
                }
                sdqVarArr3[0] = sdqVar2;
                sdqVarArr3[1] = sdqVar;
                sdqVarArr3[2] = sdqVar3;
                float fC = hsjVar.c(sdqVar, sdqVar3);
                float f23 = sdqVar.f5402a;
                float f24 = sdqVar3.b;
                float f25 = sdqVar3.f5402a;
                float fC2 = hsjVar.c(sdqVar, sdqVar2);
                float f26 = sdqVar2.b;
                float f27 = sdqVar2.f5402a;
                float f28 = (fC2 + fC) / 2.0f;
                if (f28 < 1.0f) {
                    throw o660.a();
                }
                int iE = (q7x.E(d3g0.a(sdqVar, sdqVar2) / f28) + q7x.E(d3g0.a(sdqVar, sdqVar3) / f28)) / 2;
                int i93 = iE + 7;
                int i94 = i93 & 3;
                if (i94 == 0) {
                    i93 = iE + 8;
                } else if (i94 == 2) {
                    i93 = iE + 6;
                } else if (i94 == 3) {
                    i93 = iE + 5;
                }
                int i95 = i93;
                int[] iArr5 = ubu0.e;
                if (i95 % 4 != 1) {
                    throw bwq.a();
                }
                try {
                    ubu0 ubu0VarC = ubu0.c((i95 - 17) / 4);
                    int i96 = (ubu0VarC.f35401a * 4) + 10;
                    if (ubu0VarC.b.length > 0) {
                        float f29 = (f25 - f23) + f27;
                        a3g0Var2 = a3g0Var6;
                        float f30 = (f24 - f22) + f26;
                        float f31 = 1.0f - (3.0f / i96);
                        int iA = (int) rw2.a(f29, f23, f31, f23);
                        int iA2 = (int) rw2.a(f30, f22, f31, f22);
                        f = f22;
                        int i97 = 4;
                        while (true) {
                            if (i97 <= 16) {
                                try {
                                    c22VarF = hsjVar.f(f28, i97, iA, iA2);
                                } catch (o660 unused) {
                                    i97 <<= 1;
                                }
                            }
                        }
                        f2 = i95 - 3.5f;
                        if (c22VarF != null) {
                            f3 = c22VarF.f5402a;
                            f4 = c22VarF.b;
                            f5 = f2 - 3.0f;
                        } else {
                            f3 = (f25 - f23) + f27;
                            f4 = (f24 - f) + f26;
                            f5 = f2;
                        }
                        r68 r68VarJ0 = ebc.j0(r68VarX5, i95, i95, zk90.a(3.5f, 3.5f, f2, 3.5f, f5, f5, 3.5f, f2, sdqVar.f5402a, sdqVar.b, sdqVar3.f5402a, sdqVar3.b, f3, f4, sdqVar2.f5402a, sdqVar2.b));
                        if (c22VarF == null) {
                            i2 = 3;
                            d3g0VarArr2 = new d3g0[]{sdqVar2, sdqVar, sdqVar3};
                        } else {
                            i2 = 3;
                            d3g0VarArr2 = new d3g0[]{sdqVar2, sdqVar, sdqVar3, c22VarF};
                        }
                        ykjVarI = prcVar.i(r68VarJ0, map);
                        d3g0VarArr3 = d3g0VarArr2;
                    } else {
                        a3g0Var2 = a3g0Var6;
                        f = f22;
                    }
                    c22VarF = null;
                    f2 = i95 - 3.5f;
                    if (c22VarF != null) {
                        f3 = c22VarF.f5402a;
                        f4 = c22VarF.b;
                        f5 = f2 - 3.0f;
                    } else {
                        f3 = (f25 - f23) + f27;
                        f4 = (f24 - f) + f26;
                        f5 = f2;
                    }
                    r68 r68VarJ1 = ebc.j0(r68VarX5, i95, i95, zk90.a(3.5f, 3.5f, f2, 3.5f, f5, f5, 3.5f, f2, sdqVar.f5402a, sdqVar.b, sdqVar3.f5402a, sdqVar3.b, f3, f4, sdqVar2.f5402a, sdqVar2.b));
                    if (c22VarF == null) {
                        i2 = 3;
                        d3g0VarArr2 = new d3g0[]{sdqVar2, sdqVar, sdqVar3};
                    } else {
                        i2 = 3;
                        d3g0VarArr2 = new d3g0[]{sdqVar2, sdqVar, sdqVar3, c22VarF};
                    }
                    ykjVarI = prcVar.i(r68VarJ1, map);
                    d3g0VarArr3 = d3g0VarArr2;
                } catch (IllegalArgumentException unused2) {
                    throw bwq.a();
                }
                int i98 = ykjVarI.h;
                if ((ykjVarI.g instanceof red0) && d3g0VarArr3.length >= i2) {
                    d3g0 d3g0Var22 = d3g0VarArr3[0];
                    d3g0VarArr3[0] = d3g0VarArr3[2];
                    d3g0VarArr3[2] = d3g0Var22;
                }
                i0g0 i0g0Var3 = new i0g0(ykjVarI.b, ykjVarI.f42791a, d3g0VarArr3, ju5.l);
                List list2 = ykjVarI.c;
                if (list2 != null) {
                    i0g0Var3.b(a3g0Var5, list2);
                }
                String str4 = ykjVarI.d;
                if (str4 != null) {
                    i0g0Var3.b(a3g0Var7, str4);
                }
                if (i98 >= 0 && (i7 = ykjVarI.i) >= 0) {
                    i0g0Var3.b(a3g0.k, Integer.valueOf(i7));
                    i0g0Var3.b(a3g0.l, Integer.valueOf(i98));
                }
                i0g0Var3.b(a3g0Var2, ykjVarI.e);
                i0g0Var3.b(a3g0Var, "]Q" + ykjVarI.j);
                return i0g0Var3;
        }
    }

    @Override // a.rae0
    public final void reset() {
        byte b = this.f38829a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
