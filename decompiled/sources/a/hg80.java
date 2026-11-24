package a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hg80 implements rae0 {
    public static final i0g0[] b = new i0g0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13006a;

    public /* synthetic */ hg80(byte b2) {
        this.f13006a = b2;
    }

    public static int b(d3g0 d3g0Var, d3g0 d3g0Var2) {
        if (d3g0Var == null || d3g0Var2 == null) {
            return 0;
        }
        return (int) Math.abs(d3g0Var.f5402a - d3g0Var2.f5402a);
    }

    public static int c(d3g0 d3g0Var, d3g0 d3g0Var2) {
        if (d3g0Var == null || d3g0Var2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(d3g0Var.f5402a - d3g0Var2.f5402a);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02ed A[PHI: r31
  0x02ed: PHI (r31v2 java.util.Iterator) = (r31v0 java.util.Iterator), (r31v4 java.util.Iterator) binds: [B:126:0x02f0, B:124:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0335  */
    /* JADX WARN: Code duplicated, block: B:184:0x03dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x03de  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:192:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:198:0x0405 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x0407  */
    /* JADX WARN: Code duplicated, block: B:200:0x040a  */
    /* JADX WARN: Code duplicated, block: B:201:0x040d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0455  */
    /* JADX WARN: Code duplicated, block: B:221:0x0458  */
    /* JADX WARN: Code duplicated, block: B:223:0x045c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0460  */
    /* JADX WARN: Code duplicated, block: B:228:0x0468  */
    /* JADX WARN: Code duplicated, block: B:230:0x0471  */
    /* JADX WARN: Code duplicated, block: B:233:0x0489  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080 A[LOOP:0: B:41:0x007e->B:42:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:466:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x08ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [a.ku5] */
    /* JADX WARN: Type inference failed for: r0v37, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r0v55, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r11v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v14, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v15, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v16, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v23, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v30, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v50, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v53, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v94, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r11v96, types: [a.ku5[]] */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r12v19, types: [a.sbx0] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r13v24, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r13v47, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r13v56, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r13v7, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r14v19, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r14v42, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r14v51, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r14v63, types: [a.zri] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [a.egk] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v2, types: [a.egk] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r9v11, types: [a.ku5] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [a.zri[]] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // a.rae0
    public final i0g0 a(chf0 chf0Var, Map map) throws bwq, q9c, o660 {
        char c;
        char c2;
        int i;
        char c3;
        char c4;
        byte[] bArr;
        zz2 zz2Var;
        i0g0 i0g0Var;
        int i2;
        char c5;
        int i3;
        int i4;
        int i5;
        r68 r68Var;
        sq8 sq8Var;
        ?? D;
        d3g0 d3g0Var;
        ?? D2;
        sq8 sq8Var2;
        Iterator it;
        ?? Q;
        ku5 ku5VarQ;
        ku5 ku5VarQ2;
        ?? sbx0Var;
        int i6;
        ?? r9;
        int i7;
        ku5[] ku5VarArr;
        int i8;
        int i9;
        ku5[] ku5VarArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ku5[] ku5VarArr3;
        int i16;
        ykj ykjVarB;
        int i17;
        int i18;
        ?? r14;
        ku5 ku5Var;
        int i19;
        int i20;
        ArrayList arrayList;
        int i21;
        ?? r0;
        ku5 ku5VarB;
        int i22;
        int i23;
        int i24;
        int i25;
        sq8 sq8Var3;
        int iB;
        int i26;
        int i27;
        int i28;
        int iMax;
        int i29;
        ku5 ku5VarC;
        r68 r68Var2;
        int i30;
        int i31;
        d3g0[] d3g0VarArr;
        o660 o660Var;
        d3g0[] d3g0VarArr2;
        int i32;
        ykj ykjVarA;
        bwq bwqVar;
        d3g0[] d3g0VarArr3;
        i0g0 i0g0Var2;
        List list;
        String str;
        e3g0 e3g0Var;
        int length;
        byte b2 = this.f13006a;
        a3g0 a3g0Var = a3g0.m;
        a3g0 a3g0Var2 = a3g0.d;
        a3g0 a3g0Var3 = a3g0.c;
        int i33 = 0;
        int i34 = 1;
        switch (b2) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                r68 r68VarX = chf0Var.x();
                int[] iArr = s5x0.k;
                int i35 = 0;
                while (true) {
                    c = '\b';
                    c2 = 4;
                    if (i35 < 4) {
                        int i36 = iArr[i35];
                        int i37 = i36 % 360;
                        if (i37 == 0) {
                            r68Var2 = r68VarX;
                            i30 = i33;
                            i = i34;
                            c3 = 3;
                            c4 = 5;
                            bArr = null;
                        } else {
                            c3 = 3;
                            c4 = 5;
                            int i38 = r68VarX.f29923a;
                            bArr = null;
                            int i39 = r68VarX.b;
                            i = i34;
                            int i40 = r68VarX.c;
                            i30 = i33;
                            int[] iArr2 = (int[]) r68VarX.d.clone();
                            r68Var2 = new r68();
                            r68Var2.f29923a = i38;
                            r68Var2.b = i39;
                            r68Var2.c = i40;
                            r68Var2.d = iArr2;
                            if (i37 != 0) {
                                if (i37 == 90) {
                                    r68Var2.g();
                                } else if (i37 == 180) {
                                    r68Var2.f();
                                } else {
                                    if (i37 != 270) {
                                        jf4.o("degrees must be a multiple of 0, 90, 180, or 270");
                                        return null;
                                    }
                                    r68Var2.g();
                                    r68Var2.f();
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int i41 = r68Var2.b;
                        if (i41 > 0) {
                            int i42 = r68Var2.f29923a;
                            d3g0[] d3g0VarArr4 = new d3g0[8];
                            int i43 = 0;
                            int i44 = 0;
                            int iMax2 = 10;
                            r68 r68Var3 = r68Var2;
                            d3g0[] d3g0VarArrG = s5x0.G(r68Var3, i41, i42, 0, 0, 10, s5x0.i);
                            int[] iArr3 = s5x0.g;
                            for (int i45 = i30; i45 < 4; i45++) {
                                d3g0VarArr4[iArr3[i45]] = d3g0VarArrG[i45];
                            }
                            d3g0 d3g0Var2 = d3g0VarArr4[4];
                            if (d3g0Var2 != null) {
                                int i46 = (int) d3g0Var2.f5402a;
                                int i47 = (int) d3g0Var2.b;
                                d3g0 d3g0Var3 = d3g0VarArr4[c4];
                                if (d3g0Var3 != null) {
                                    i43 = i47;
                                    i44 = i46;
                                    iMax2 = (int) Math.max((((int) d3g0Var3.b) - i47) * 0.5f, 10.0f);
                                } else {
                                    i43 = i47;
                                    i44 = i46;
                                }
                            }
                            d3g0[] d3g0VarArrG2 = s5x0.G(r68Var3, i41, i42, i43, i44, iMax2, s5x0.j);
                            r68Var2 = r68Var3;
                            int[] iArr4 = s5x0.h;
                            for (int i48 = i30; i48 < 4; i48++) {
                                d3g0VarArr4[iArr4[i48]] = d3g0VarArrG2[i48];
                            }
                            if (d3g0VarArr4[i30] != null || d3g0VarArr4[c3] != null) {
                                arrayList3.add(d3g0VarArr4);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            i35++;
                            i34 = i;
                            i33 = i30;
                        } else {
                            zz2Var = new zz2(r68Var2, arrayList3, i36);
                        }
                    } else {
                        i = i34;
                        c3 = 3;
                        c4 = 5;
                        bArr = null;
                        zz2Var = new zz2(r68VarX, new ArrayList(), i33);
                    }
                }
                Iterator it2 = ((ArrayList) zz2Var.b).iterator();
                while (it2.hasNext()) {
                    d3g0[] d3g0VarArr5 = (d3g0[]) it2.next();
                    r68 r68Var4 = (r68) zz2Var.c;
                    d3g0 d3g0Var4 = d3g0VarArr5[c2];
                    d3g0 d3g0Var5 = d3g0VarArr5[c4];
                    d3g0 d3g0Var6 = d3g0VarArr5[6];
                    d3g0 d3g0Var7 = d3g0VarArr5[7];
                    int iMin = Math.min(Math.min(c(d3g0VarArr5[0], d3g0Var4), (c(d3g0VarArr5[6], d3g0VarArr5[2]) * 17) / 18), Math.min(c(d3g0VarArr5[i], d3g0VarArr5[c4]), (c(d3g0VarArr5[7], d3g0VarArr5[c3]) * 17) / 18));
                    int iMax3 = Math.max(Math.max(b(d3g0VarArr5[0], d3g0VarArr5[c2]), (b(d3g0VarArr5[6], d3g0VarArr5[2]) * 17) / 18), Math.max(b(d3g0VarArr5[i], d3g0VarArr5[c4]), (b(d3g0VarArr5[7], d3g0VarArr5[c3]) * 17) / 18));
                    a1d a1dVar = jg80.f16470a;
                    r68 r68Var5 = r68Var4;
                    d3g0 d3g0Var8 = d3g0Var4;
                    d3g0 d3g0Var9 = d3g0Var6;
                    char c6 = c;
                    byte[] bArr2 = bArr;
                    ?? r25 = bArr2;
                    int i49 = i;
                    sq8 sq8Var4 = new sq8(r68Var5, d3g0Var8, d3g0Var5, d3g0Var6, d3g0Var7);
                    ?? r15 = bArr2;
                    while (true) {
                        i2 = sq8Var4.d;
                        c5 = c2;
                        i3 = sq8Var4.c;
                        if (d3g0Var8 != null) {
                            i4 = iMin;
                            i5 = iMax3;
                            r68Var = r68Var5;
                            sq8Var = sq8Var4;
                            D = jg80.d(r68Var, sq8Var, d3g0Var8, true, i4, i5);
                        } else {
                            i4 = iMin;
                            i5 = iMax3;
                            r68Var = r68Var5;
                            sq8Var = sq8Var4;
                            D = r15;
                        }
                        d3g0 d3g0Var10 = d3g0Var8;
                        if (d3g0Var9 != null) {
                            d3g0Var = d3g0Var9;
                            D2 = jg80.d(r68Var, sq8Var, d3g0Var, false, i4, i5);
                        } else {
                            d3g0Var = d3g0Var9;
                            D2 = r25;
                        }
                        sq8Var2 = sq8Var;
                        if (D == 0 && D2 == 0) {
                            it = it2;
                        } else {
                            if (D == 0 || (ku5VarQ = D.q()) == null) {
                                it = it2;
                                if (D2 == 0) {
                                    Q = bArr;
                                } else {
                                    Q = D2.q();
                                }
                            } else if (D2 == 0 || (ku5VarQ2 = D2.q()) == null) {
                                it = it2;
                                Q = ku5VarQ;
                            } else {
                                int i50 = ku5VarQ.b;
                                it = it2;
                                Q = ku5VarQ;
                                if (i50 != ku5VarQ2.b) {
                                    int i51 = ku5VarQ.c;
                                    Q = ku5VarQ;
                                    if (i51 != ku5VarQ2.c) {
                                        int i52 = ku5VarQ.f;
                                        Q = ku5VarQ;
                                        if (i52 != ku5VarQ2.f) {
                                            Q = bArr;
                                        }
                                    }
                                }
                            }
                            if (Q != 0) {
                                sq8 sq8VarA = jg80.a(D);
                                sq8 sq8VarA2 = jg80.a(D2);
                                if (sq8VarA == null) {
                                    sq8VarA = sq8VarA2;
                                } else if (sq8VarA2 != null) {
                                    sq8VarA = new sq8((r68) sq8VarA.e, (d3g0) sq8VarA.f, (d3g0) sq8VarA.g, (d3g0) sq8VarA2.h, (d3g0) sq8VarA2.i);
                                }
                                sbx0Var = new sbx0((ku5) Q, sq8VarA);
                            }
                            if (sbx0Var != 0) {
                                throw o660.a();
                            }
                            i6 = sbx0Var.b;
                            r9 = (zri[]) sbx0Var.d;
                            sq8 sq8Var5 = (sq8) sbx0Var.e;
                            if (i49 == 0 && sq8Var5 != null && (sq8Var5.c < i3 || sq8Var5.d > i2)) {
                                sq8Var4 = sq8Var5;
                                r68Var5 = r68Var;
                                d3g0Var9 = d3g0Var;
                                iMax3 = i5;
                                c2 = c5;
                                it2 = it;
                                i49 = 0;
                                d3g0Var8 = d3g0Var10;
                                iMin = i4;
                                r15 = D;
                                r25 = D2;
                            }
                        }
                        sbx0Var = bArr;
                        if (sbx0Var != 0) {
                            throw o660.a();
                        }
                        i6 = sbx0Var.b;
                        r9 = (zri[]) sbx0Var.d;
                        sq8 sq8Var6 = (sq8) sbx0Var.e;
                        if (i49 == 0) {
                        }
                    }
                    sbx0Var.e = sq8Var2;
                    int i53 = i6 + 1;
                    r9[0] = D;
                    r9[i53] = D2;
                    ?? r22 = D != 0 ? i : 0;
                    int i54 = i;
                    while (i54 <= i53) {
                        int i55 = r22 != 0 ? i54 : i53 - i54;
                        if (r9[i55] != 0) {
                            arrayList = arrayList2;
                            i54 = i54;
                            i20 = i3;
                        } else {
                            zri egkVar = (i55 == 0 || i55 == i53) ? new egk(sq8Var2, i55 == 0 ? i : 0) : new zri(sq8Var2);
                            r9[i55] = egkVar;
                            int i56 = i3;
                            i20 = i56;
                            int i57 = i4;
                            int i58 = i5;
                            int i59 = -1;
                            while (i56 <= i2) {
                                int i60 = r22 != 0 ? i : -1;
                                int i61 = i2;
                                int i62 = i55 - i60;
                                if (i62 >= 0) {
                                    i21 = i55;
                                    if (i62 <= i6 + 1) {
                                        ?? r16 = r9[i62];
                                        r0 = ((ku5[]) r16.c)[r16.d(i56)];
                                    }
                                    if (r0 != 0) {
                                        ku5VarB = r9[i21].b(i56);
                                        if (ku5VarB != null) {
                                            if (i62 >= 0 && i62 <= i6 + 1) {
                                                ku5VarB = r9[i62].b(i56);
                                            }
                                            if (ku5VarB != null) {
                                                i22 = i21;
                                                i23 = 0;
                                                while (true) {
                                                    i24 = i22 - i60;
                                                    if (i24 >= 0 || i24 > i6 + 1) {
                                                        i25 = i56;
                                                        sq8Var3 = (sq8) sbx0Var.e;
                                                        if (r22 != 0) {
                                                            iB = sq8Var3.f32615a;
                                                        } else {
                                                            iB = sq8Var3.b;
                                                        }
                                                    } else {
                                                        ku5[] ku5VarArr4 = (ku5[]) r9[i24].c;
                                                        i26 = i23;
                                                        int length2 = ku5VarArr4.length;
                                                        int i63 = 0;
                                                        while (true) {
                                                            if (i63 < length2) {
                                                                int i64 = length2;
                                                                ku5 ku5Var2 = ku5VarArr4[i63];
                                                                if (ku5Var2 != null) {
                                                                    int i65 = ku5Var2.b;
                                                                    int i66 = ku5Var2.c;
                                                                    i25 = i56;
                                                                    iB = twn.b(i66, i65, i60 * i26, r22 != 0 ? i66 : i65);
                                                                } else {
                                                                    i63++;
                                                                    length2 = i64;
                                                                }
                                                            } else {
                                                                i23 = i26 + 1;
                                                                i22 = i24;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (r22 != 0) {
                                                iB = ku5VarB.c;
                                            } else {
                                                iB = ku5VarB.b;
                                            }
                                            if (iB >= 0 || iB > sq8Var2.b) {
                                                if (i59 == -1) {
                                                    i28 = i57;
                                                    iMax = i58;
                                                    i29 = i25;
                                                } else {
                                                    i27 = i59;
                                                }
                                                i57 = i28;
                                                i58 = iMax;
                                                i56 = i29 + 1;
                                                sq8Var2 = sq8Var2;
                                                i2 = i61;
                                                i55 = i21;
                                                arrayList2 = arrayList2;
                                            } else {
                                                i27 = iB;
                                            }
                                            int i67 = i25;
                                            ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i67, i57, i58);
                                            i29 = i67;
                                            i28 = i57;
                                            iMax = i58;
                                            if (ku5VarC != null) {
                                                int i68 = ku5VarC.b;
                                                int i69 = ku5VarC.c;
                                                ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                                int iMin2 = Math.min(i28, i69 - i68);
                                                iMax = Math.max(iMax, i69 - i68);
                                                i57 = iMin2;
                                                i59 = i27;
                                            } else {
                                                i57 = i28;
                                            }
                                            i58 = iMax;
                                            i56 = i29 + 1;
                                            sq8Var2 = sq8Var2;
                                            i2 = i61;
                                            i55 = i21;
                                            arrayList2 = arrayList2;
                                        } else if (r22 != 0) {
                                            iB = ku5VarB.b;
                                        } else {
                                            iB = ku5VarB.c;
                                        }
                                    } else if (r22 != 0) {
                                        iB = r0.c;
                                    } else {
                                        iB = r0.b;
                                    }
                                    i25 = i56;
                                    if (iB >= 0) {
                                        if (i59 == -1) {
                                            i28 = i57;
                                            iMax = i58;
                                            i29 = i25;
                                        } else {
                                            i27 = i59;
                                            int i610 = i25;
                                            ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i610, i57, i58);
                                            i29 = i610;
                                            i28 = i57;
                                            iMax = i58;
                                            if (ku5VarC != null) {
                                                int i611 = ku5VarC.b;
                                                int i612 = ku5VarC.c;
                                                ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                                int iMin3 = Math.min(i28, i612 - i611);
                                                iMax = Math.max(iMax, i612 - i611);
                                                i57 = iMin3;
                                                i59 = i27;
                                            }
                                            i58 = iMax;
                                            i56 = i29 + 1;
                                            sq8Var2 = sq8Var2;
                                            i2 = i61;
                                            i55 = i21;
                                            arrayList2 = arrayList2;
                                        }
                                    } else if (i59 == -1) {
                                        i28 = i57;
                                        iMax = i58;
                                        i29 = i25;
                                    } else {
                                        i27 = i59;
                                        int i613 = i25;
                                        ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i613, i57, i58);
                                        i29 = i613;
                                        i28 = i57;
                                        iMax = i58;
                                        if (ku5VarC != null) {
                                            int i614 = ku5VarC.b;
                                            int i615 = ku5VarC.c;
                                            ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                            int iMin4 = Math.min(i28, i615 - i614);
                                            iMax = Math.max(iMax, i615 - i614);
                                            i57 = iMin4;
                                            i59 = i27;
                                        }
                                        i58 = iMax;
                                        i56 = i29 + 1;
                                        sq8Var2 = sq8Var2;
                                        i2 = i61;
                                        i55 = i21;
                                        arrayList2 = arrayList2;
                                    }
                                    i57 = i28;
                                    i58 = iMax;
                                    i56 = i29 + 1;
                                    sq8Var2 = sq8Var2;
                                    i2 = i61;
                                    i55 = i21;
                                    arrayList2 = arrayList2;
                                } else {
                                    i21 = i55;
                                }
                                r0 = bArr;
                                if (r0 != 0) {
                                    ku5VarB = r9[i21].b(i56);
                                    if (ku5VarB != null) {
                                        if (i62 >= 0) {
                                            ku5VarB = r9[i62].b(i56);
                                        }
                                        if (ku5VarB != null) {
                                            i22 = i21;
                                            i23 = 0;
                                            while (true) {
                                                i24 = i22 - i60;
                                                if (i24 >= 0) {
                                                }
                                                i25 = i56;
                                                sq8Var3 = (sq8) sbx0Var.e;
                                                if (r22 != 0) {
                                                    iB = sq8Var3.f32615a;
                                                } else {
                                                    iB = sq8Var3.b;
                                                }
                                                i23 = i26 + 1;
                                                i22 = i24;
                                            }
                                        } else if (r22 != 0) {
                                            iB = ku5VarB.c;
                                        } else {
                                            iB = ku5VarB.b;
                                        }
                                        if (iB >= 0) {
                                            if (i59 == -1) {
                                                i28 = i57;
                                                iMax = i58;
                                                i29 = i25;
                                            } else {
                                                i27 = i59;
                                                int i616 = i25;
                                                ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i616, i57, i58);
                                                i29 = i616;
                                                i28 = i57;
                                                iMax = i58;
                                                if (ku5VarC != null) {
                                                    int i617 = ku5VarC.b;
                                                    int i618 = ku5VarC.c;
                                                    ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                                    int iMin5 = Math.min(i28, i618 - i617);
                                                    iMax = Math.max(iMax, i618 - i617);
                                                    i57 = iMin5;
                                                    i59 = i27;
                                                }
                                                i58 = iMax;
                                                i56 = i29 + 1;
                                                sq8Var2 = sq8Var2;
                                                i2 = i61;
                                                i55 = i21;
                                                arrayList2 = arrayList2;
                                            }
                                        } else if (i59 == -1) {
                                            i28 = i57;
                                            iMax = i58;
                                            i29 = i25;
                                        } else {
                                            i27 = i59;
                                            int i619 = i25;
                                            ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i619, i57, i58);
                                            i29 = i619;
                                            i28 = i57;
                                            iMax = i58;
                                            if (ku5VarC != null) {
                                                int i6110 = ku5VarC.b;
                                                int i6111 = ku5VarC.c;
                                                ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                                int iMin6 = Math.min(i28, i6111 - i6110);
                                                iMax = Math.max(iMax, i6111 - i6110);
                                                i57 = iMin6;
                                                i59 = i27;
                                            }
                                            i58 = iMax;
                                            i56 = i29 + 1;
                                            sq8Var2 = sq8Var2;
                                            i2 = i61;
                                            i55 = i21;
                                            arrayList2 = arrayList2;
                                        }
                                        i57 = i28;
                                        i58 = iMax;
                                        i56 = i29 + 1;
                                        sq8Var2 = sq8Var2;
                                        i2 = i61;
                                        i55 = i21;
                                        arrayList2 = arrayList2;
                                    } else if (r22 != 0) {
                                        iB = ku5VarB.b;
                                    } else {
                                        iB = ku5VarB.c;
                                    }
                                } else if (r22 != 0) {
                                    iB = r0.c;
                                } else {
                                    iB = r0.b;
                                }
                                i25 = i56;
                                if (iB >= 0) {
                                    if (i59 == -1) {
                                        i28 = i57;
                                        iMax = i58;
                                        i29 = i25;
                                    } else {
                                        i27 = i59;
                                        int i6112 = i25;
                                        ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i6112, i57, i58);
                                        i29 = i6112;
                                        i28 = i57;
                                        iMax = i58;
                                        if (ku5VarC != null) {
                                            int i6113 = ku5VarC.b;
                                            int i6114 = ku5VarC.c;
                                            ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                            int iMin7 = Math.min(i28, i6114 - i6113);
                                            iMax = Math.max(iMax, i6114 - i6113);
                                            i57 = iMin7;
                                            i59 = i27;
                                        }
                                        i58 = iMax;
                                        i56 = i29 + 1;
                                        sq8Var2 = sq8Var2;
                                        i2 = i61;
                                        i55 = i21;
                                        arrayList2 = arrayList2;
                                    }
                                } else if (i59 == -1) {
                                    i28 = i57;
                                    iMax = i58;
                                    i29 = i25;
                                } else {
                                    i27 = i59;
                                    int i6115 = i25;
                                    ku5VarC = jg80.c(r68Var, sq8Var2.f32615a, sq8Var2.b, r22, i27, i6115, i57, i58);
                                    i29 = i6115;
                                    i28 = i57;
                                    iMax = i58;
                                    if (ku5VarC != null) {
                                        int i6116 = ku5VarC.b;
                                        int i6117 = ku5VarC.c;
                                        ((ku5[]) egkVar.c)[egkVar.d(i29)] = ku5VarC;
                                        int iMin8 = Math.min(i28, i6117 - i6116);
                                        iMax = Math.max(iMax, i6117 - i6116);
                                        i57 = iMin8;
                                        i59 = i27;
                                    }
                                    i58 = iMax;
                                    i56 = i29 + 1;
                                    sq8Var2 = sq8Var2;
                                    i2 = i61;
                                    i55 = i21;
                                    arrayList2 = arrayList2;
                                }
                                i57 = i28;
                                i58 = iMax;
                                i56 = i29 + 1;
                                sq8Var2 = sq8Var2;
                                i2 = i61;
                                i55 = i21;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            i5 = i58;
                            i4 = i57;
                        }
                        i54++;
                        sq8Var2 = sq8Var2;
                        i3 = i20;
                        i2 = i2;
                        arrayList2 = arrayList;
                    }
                    ArrayList arrayList4 = arrayList2;
                    ku5 ku5Var3 = (ku5) sbx0Var.c;
                    int i70 = ku5Var3.f;
                    int[] iArr5 = new int[2];
                    iArr5[i] = i6 + 2;
                    iArr5[0] = i70;
                    xu5[][] xu5VarArr = (xu5[][]) Array.newInstance((Class<?>) xu5.class, iArr5);
                    for (xu5[] xu5VarArr2 : xu5VarArr) {
                        int i71 = 0;
                        while (true) {
                            if (i71 < xu5VarArr2.length) {
                                xu5VarArr2[i71] = new xu5();
                                i71++;
                            }
                        }
                    }
                    char c7 = 0;
                    sbx0Var.a(r9[0]);
                    sbx0Var.a(r9[i53]);
                    int i72 = 928;
                    while (true) {
                        ?? r13 = r9[c7];
                        if (r13 != 0 && (r14 = r9[i53]) != 0) {
                            ku5[] ku5VarArr5 = (ku5[]) r13.c;
                            ku5[] ku5VarArr6 = (ku5[]) r14.c;
                            int i73 = 0;
                            while (i73 < ku5VarArr5.length) {
                                ku5 ku5Var4 = ku5VarArr5[i73];
                                ku5[] ku5VarArr7 = ku5VarArr5;
                                if (ku5Var4 != null && (ku5Var = ku5VarArr6[i73]) != null && ku5Var4.f == ku5Var.f) {
                                    int i74 = i;
                                    while (i74 <= i6) {
                                        ku5 ku5Var5 = ((ku5[]) r9[i74].c)[i73];
                                        if (ku5Var5 == null) {
                                            i19 = i74;
                                        } else {
                                            i19 = i74;
                                            int i75 = ku5VarArr7[i73].f;
                                            ku5Var5.f = i75;
                                            if (!ku5Var5.b(i75)) {
                                                ((ku5[]) r9[i19].c)[i73] = bArr;
                                            }
                                        }
                                        i74 = i19 + 1;
                                    }
                                }
                                i73++;
                                ku5VarArr5 = ku5VarArr7;
                            }
                        }
                        ?? r11 = r9[0];
                        if (r11 == 0) {
                            i7 = 0;
                        } else {
                            ku5[] ku5VarArr8 = (ku5[]) r11.c;
                            int i76 = 0;
                            i7 = 0;
                            while (i76 < ku5VarArr8.length) {
                                ku5 ku5Var6 = ku5VarArr8[i76];
                                if (ku5Var6 != null) {
                                    int i77 = ku5Var6.f;
                                    ku5VarArr = ku5VarArr8;
                                    i8 = i76;
                                    int i78 = i;
                                    int i79 = 0;
                                    while (i78 < i53) {
                                        int i80 = i78;
                                        if (i79 >= 2) {
                                        }
                                        ku5 ku5Var7 = ((ku5[]) r9[i80].c)[i8];
                                        int i81 = i79;
                                        if (ku5Var7 != null) {
                                            if (!ku5Var7.b(ku5Var7.f)) {
                                                if (ku5Var7.b(i77)) {
                                                    ku5Var7.f = i77;
                                                    i81 = 0;
                                                } else {
                                                    i81++;
                                                }
                                            }
                                            if (!ku5Var7.b(ku5Var7.f)) {
                                                i7++;
                                            }
                                            i79 = i81;
                                        }
                                        i78 = i80 + 1;
                                    }
                                } else {
                                    ku5VarArr = ku5VarArr8;
                                    i8 = i76;
                                }
                                i76 = i8 + 1;
                                ku5VarArr8 = ku5VarArr;
                            }
                        }
                        ?? r12 = r9[i53];
                        if (r12 == 0) {
                            i9 = 0;
                        } else {
                            ku5[] ku5VarArr9 = (ku5[]) r12.c;
                            int i82 = 0;
                            i9 = 0;
                            while (i82 < ku5VarArr9.length) {
                                ku5 ku5Var8 = ku5VarArr9[i82];
                                if (ku5Var8 == null) {
                                    ku5VarArr2 = ku5VarArr9;
                                    i10 = i82;
                                } else {
                                    int i83 = ku5Var8.f;
                                    int i84 = i53;
                                    ku5VarArr2 = ku5VarArr9;
                                    int i85 = 0;
                                    while (true) {
                                        i10 = i82;
                                        if (i84 <= 0 || i85 >= 2) {
                                        }
                                        ku5 ku5Var9 = ((ku5[]) r9[i84].c)[i10];
                                        int i86 = i85;
                                        if (ku5Var9 != null) {
                                            if (!ku5Var9.b(ku5Var9.f)) {
                                                if (ku5Var9.b(i83)) {
                                                    ku5Var9.f = i83;
                                                    i86 = 0;
                                                } else {
                                                    i86++;
                                                }
                                            }
                                            if (!ku5Var9.b(ku5Var9.f)) {
                                                i9++;
                                            }
                                            i85 = i86;
                                        }
                                        i84--;
                                        i82 = i10;
                                    }
                                }
                                i82 = i10 + 1;
                                ku5VarArr9 = ku5VarArr2;
                            }
                        }
                        int i87 = i7 + i9;
                        if (i87 == 0) {
                            i11 = i53;
                            i12 = 0;
                        } else {
                            int i88 = i;
                            while (i88 < i53) {
                                ku5[] ku5VarArr10 = (ku5[]) r9[i88].c;
                                int i89 = i53;
                                int i90 = 0;
                                while (i90 < ku5VarArr10.length) {
                                    ku5 ku5Var10 = ku5VarArr10[i90];
                                    if (ku5Var10 == null) {
                                        i13 = i87;
                                    } else {
                                        i13 = i87;
                                        if (!ku5Var10.b(ku5Var10.f)) {
                                            ku5 ku5Var11 = ku5VarArr10[i90];
                                            ku5[] ku5VarArr11 = (ku5[]) r9[i88 - 1].c;
                                            ?? r17 = r9[i88 + 1];
                                            ku5[] ku5VarArr12 = r17 != 0 ? (ku5[]) r17.c : ku5VarArr11;
                                            i14 = i88;
                                            ku5[] ku5VarArr13 = new ku5[14];
                                            ku5VarArr13[2] = ku5VarArr11[i90];
                                            ku5VarArr13[c3] = ku5VarArr12[i90];
                                            if (i90 > 0) {
                                                int i91 = i90 - 1;
                                                ku5VarArr13[0] = ku5VarArr10[i91];
                                                ku5VarArr13[c5] = ku5VarArr11[i91];
                                                ku5VarArr13[c4] = ku5VarArr12[i91];
                                            }
                                            if (i90 > i) {
                                                int i92 = i90 - 2;
                                                ku5VarArr13[c6] = ku5VarArr10[i92];
                                                ku5VarArr13[10] = ku5VarArr11[i92];
                                                ku5VarArr13[11] = ku5VarArr12[i92];
                                            }
                                            if (i90 < ku5VarArr10.length - 1) {
                                                int i93 = i90 + 1;
                                                ku5VarArr13[1] = ku5VarArr10[i93];
                                                ku5VarArr13[6] = ku5VarArr11[i93];
                                                ku5VarArr13[7] = ku5VarArr12[i93];
                                            }
                                            if (i90 < ku5VarArr10.length - 2) {
                                                int i94 = i90 + 2;
                                                ku5VarArr13[9] = ku5VarArr10[i94];
                                                ku5VarArr13[12] = ku5VarArr11[i94];
                                                ku5VarArr13[13] = ku5VarArr12[i94];
                                            }
                                            int i95 = 0;
                                            while (true) {
                                                if (i95 < 14) {
                                                    ku5 ku5Var12 = ku5VarArr13[i95];
                                                    if (ku5Var12 == null) {
                                                        i15 = i95;
                                                    } else {
                                                        i15 = i95;
                                                        if (ku5Var12.b(ku5Var12.f)) {
                                                            ku5VarArr3 = ku5VarArr10;
                                                            if (ku5Var12.d == ku5Var11.d) {
                                                                ku5Var11.f = ku5Var12.f;
                                                            }
                                                        }
                                                        i95 = i15 + 1;
                                                        ku5VarArr10 = ku5VarArr3;
                                                    }
                                                    ku5VarArr3 = ku5VarArr10;
                                                    i95 = i15 + 1;
                                                    ku5VarArr10 = ku5VarArr3;
                                                    break;
                                                }
                                            }
                                            i90++;
                                            i87 = i13;
                                            i88 = i14;
                                            ku5VarArr10 = ku5VarArr3;
                                            i = 1;
                                        }
                                        ku5VarArr3 = ku5VarArr10;
                                        i90++;
                                        i87 = i13;
                                        i88 = i14;
                                        ku5VarArr10 = ku5VarArr3;
                                        i = 1;
                                    }
                                    i14 = i88;
                                    ku5VarArr3 = ku5VarArr10;
                                    i90++;
                                    i87 = i13;
                                    i88 = i14;
                                    ku5VarArr10 = ku5VarArr3;
                                    i = 1;
                                }
                                i88++;
                                i53 = i89;
                                i = 1;
                            }
                            i11 = i53;
                            i12 = i87;
                        }
                        if (i12 > 0 && i12 < i72) {
                            i72 = i12;
                            i53 = i11;
                            i = 1;
                            c7 = 0;
                        }
                        break;
                    }
                    int length3 = r9.length;
                    int i96 = 0;
                    int i97 = 0;
                    ?? r10 = r9;
                    while (i96 < length3) {
                        ?? r18 = r10[i96];
                        if (r18 != 0) {
                            ku5[] ku5VarArr14 = (ku5[]) r18.c;
                            int length4 = ku5VarArr14.length;
                            int i98 = 0;
                            r10 = r10;
                            while (i98 < length4) {
                                int i99 = length3;
                                ku5 ku5Var13 = ku5VarArr14[i98];
                                ?? r41 = r10;
                                if (ku5Var13 != null) {
                                    int i100 = ku5Var13.f;
                                    i18 = i96;
                                    if (i100 >= 0 && i100 < xu5VarArr.length) {
                                        xu5VarArr[i100][i97].b(ku5Var13.e);
                                    }
                                } else {
                                    i18 = i96;
                                }
                                i98++;
                                r10 = r41;
                                length3 = i99;
                                i96 = i18;
                            }
                        }
                        i97++;
                        i96++;
                        r10 = r10;
                        length3 = length3;
                    }
                    xu5 xu5Var = xu5VarArr[0][1];
                    int[] iArrA = xu5Var.a();
                    int i101 = ku5Var3.c;
                    int i102 = i6 * i70;
                    int i103 = i102 - (2 << i101);
                    if (iArrA.length == 0) {
                        if (i103 < 1 || i103 > 928) {
                            throw o660.a();
                        }
                        xu5Var.b(i103);
                    } else if (iArrA[0] != i103 && i103 >= 1 && i103 <= 928) {
                        xu5Var.b(i103);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int[] iArr6 = new int[i102];
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (int i104 = 0; i104 < i70; i104++) {
                        int i105 = 0;
                        while (i105 < i6) {
                            int i106 = i105 + 1;
                            int[] iArrA2 = xu5VarArr[i104][i106].a();
                            int i107 = (i104 * i6) + i105;
                            if (iArrA2.length == 0) {
                                arrayList5.add(Integer.valueOf(i107));
                                i17 = i6;
                            } else {
                                i17 = i6;
                                if (iArrA2.length == 1) {
                                    iArr6[i107] = iArrA2[0];
                                } else {
                                    arrayList7.add(Integer.valueOf(i107));
                                    arrayList6.add(iArrA2);
                                }
                            }
                            i105 = i106;
                            i6 = i17;
                        }
                    }
                    int size = arrayList6.size();
                    int[][] iArr7 = new int[size][];
                    for (int i108 = 0; i108 < size; i108++) {
                        iArr7[i108] = (int[]) arrayList6.get(i108);
                    }
                    int[] iArrN = y0x0.N(arrayList5);
                    int[] iArrN2 = y0x0.N(arrayList7);
                    int length5 = iArrN2.length;
                    int[] iArr8 = new int[length5];
                    int i109 = 100;
                    while (true) {
                        int i110 = i109 - 1;
                        if (i109 <= 0) {
                            throw q9c.a();
                        }
                        for (int i111 = 0; i111 < length5; i111++) {
                            iArr6[iArrN2[i111]] = iArr7[i111][iArr8[i111]];
                        }
                        try {
                            ykjVarB = jg80.b(iArr6, i101, iArrN);
                        } catch (q9c unused) {
                            ArrayList arrayList8 = arrayList4;
                            if (length5 == 0) {
                                throw q9c.a();
                            }
                            int i112 = 0;
                            while (true) {
                                if (i112 >= length5) {
                                    i16 = i101;
                                }
                                int i113 = iArr8[i112];
                                i16 = i101;
                                if (i113 < iArr7[i112].length - 1) {
                                    iArr8[i112] = i113 + 1;
                                }
                                iArr8[i112] = 0;
                                if (i112 == length5 - 1) {
                                    throw q9c.a();
                                }
                                i112++;
                                i101 = i16;
                                break;
                                break;
                            }
                            i109 = i110;
                            arrayList4 = arrayList8;
                            i101 = i16;
                            bArr = null;
                        }
                        break;
                    }
                    byte[] bArr3 = bArr;
                    i0g0 i0g0Var3 = new i0g0(ykjVarB.b, bArr3, d3g0VarArr5, ju5.k);
                    i0g0Var3.b(a3g0Var3, ykjVarB.d);
                    i0g0Var3.b(a3g0Var2, ykjVarB.e);
                    i0g0Var3.b(a3g0.e, ykjVarB.f);
                    ig80 ig80Var = (ig80) ykjVarB.g;
                    if (ig80Var != null) {
                        i0g0Var3.b(a3g0.j, ig80Var);
                    }
                    i0g0Var3.b(a3g0.f170a, Integer.valueOf(zz2Var.f45232a));
                    i0g0Var3.b(a3g0Var, "]L0");
                    ArrayList arrayList9 = arrayList4;
                    arrayList9.add(i0g0Var3);
                    bArr = bArr3;
                    arrayList2 = arrayList9;
                    c = c6;
                    c2 = c5;
                    it2 = it;
                    i = 1;
                }
                i0g0[] i0g0VarArr = (i0g0[]) arrayList2.toArray(b);
                if (i0g0VarArr.length == 0 || (i0g0Var = i0g0VarArr[0]) == null) {
                    throw o660.a();
                }
                return i0g0Var;
            default:
                fgk fgkVar = new fgk(chf0Var.x());
                try {
                    db5 db5VarA = fgkVar.a(false);
                    d3g0VarArr = db5VarA.b;
                    try {
                        i31 = db5VarA.f;
                        try {
                            ykjVarA = new pkj().a(db5VarA);
                            d3g0VarArr2 = d3g0VarArr;
                            i32 = i31;
                            o660Var = null;
                        } catch (bwq e) {
                            e = e;
                            i32 = i31;
                            ykjVarA = null;
                            bwqVar = e;
                            d3g0VarArr2 = d3g0VarArr;
                            o660Var = null;
                            if (ykjVarA == null) {
                                try {
                                    db5 db5VarA2 = fgkVar.a(true);
                                    d3g0[] d3g0VarArr6 = db5VarA2.b;
                                    i32 = db5VarA2.f;
                                    ykjVarA = new pkj().a(db5VarA2);
                                    d3g0VarArr3 = d3g0VarArr6;
                                } catch (bwq | o660 e2) {
                                    if (o660Var != null) {
                                        throw o660Var;
                                    }
                                    if (bwqVar != null) {
                                        throw bwqVar;
                                    }
                                    throw e2;
                                }
                            } else {
                                d3g0VarArr3 = d3g0VarArr2;
                            }
                            int i114 = i32;
                            if (map != null) {
                                length = d3g0VarArr3.length;
                                while (i33 < length) {
                                    e3g0Var.a(d3g0VarArr3[i33]);
                                    i33++;
                                }
                            }
                            String str2 = ykjVarA.b;
                            byte[] bArr4 = ykjVarA.f42791a;
                            System.currentTimeMillis();
                            i0g0Var2 = new i0g0(str2, bArr4, d3g0VarArr3, ju5.f17135a, 0);
                            list = ykjVarA.c;
                            if (list != null) {
                                i0g0Var2.b(a3g0.b, list);
                            }
                            str = ykjVarA.d;
                            if (str != null) {
                                i0g0Var2.b(a3g0Var3, str);
                            }
                            i0g0Var2.b(a3g0Var2, Integer.valueOf(ykjVarA.e.intValue() + i114));
                            i0g0Var2.b(a3g0Var, "]z" + ykjVarA.j);
                            return i0g0Var2;
                        } catch (o660 e3) {
                            e = e3;
                            d3g0[] d3g0VarArr7 = d3g0VarArr;
                            o660Var = e;
                            d3g0VarArr2 = d3g0VarArr7;
                            i32 = i31;
                            ykjVarA = null;
                        }
                    } catch (bwq e4) {
                        e = e4;
                        i31 = 0;
                    } catch (o660 e5) {
                        e = e5;
                        i31 = 0;
                    }
                } catch (bwq e6) {
                    e = e6;
                    i31 = 0;
                    d3g0VarArr = null;
                } catch (o660 e7) {
                    e = e7;
                    i31 = 0;
                    d3g0VarArr = null;
                }
                bwqVar = null;
                if (ykjVarA == null) {
                    db5 db5VarA3 = fgkVar.a(true);
                    d3g0[] d3g0VarArr8 = db5VarA3.b;
                    i32 = db5VarA3.f;
                    ykjVarA = new pkj().a(db5VarA3);
                    d3g0VarArr3 = d3g0VarArr8;
                } else {
                    d3g0VarArr3 = d3g0VarArr2;
                }
                int i115 = i32;
                if (map != null && (e3g0Var = (e3g0) map.get(gkj.j)) != null) {
                    length = d3g0VarArr3.length;
                    while (i33 < length) {
                        e3g0Var.a(d3g0VarArr3[i33]);
                        i33++;
                    }
                }
                String str3 = ykjVarA.b;
                byte[] bArr5 = ykjVarA.f42791a;
                System.currentTimeMillis();
                i0g0Var2 = new i0g0(str3, bArr5, d3g0VarArr3, ju5.f17135a, 0);
                list = ykjVarA.c;
                if (list != null) {
                    i0g0Var2.b(a3g0.b, list);
                }
                str = ykjVarA.d;
                if (str != null) {
                    i0g0Var2.b(a3g0Var3, str);
                }
                i0g0Var2.b(a3g0Var2, Integer.valueOf(ykjVarA.e.intValue() + i115));
                i0g0Var2.b(a3g0Var, "]z" + ykjVarA.j);
                return i0g0Var2;
        }
    }

    @Override // a.rae0
    public final void reset() {
        byte b2 = this.f13006a;
    }

    private final void d() {
    }

    private final void e() {
    }
}
