package a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class exw extends zdx {
    public static final ohq c = new ohq((byte) 17);
    public static final ohq d = new ohq((byte) 18);
    public final cxw b;

    public exw(cxw cxwVar) {
        this.b = cxwVar;
    }

    public static xa3 R(fq80 fq80Var, int i, int i2) {
        int iJ0;
        String strConcat;
        int iZ = fq80Var.z();
        Charset charsetG0 = g0(iZ);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        fq80Var.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + j47.H0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iJ0 = 2;
        } else {
            iJ0 = j0(bArr, 0);
            String strH0 = j47.H0(new String(bArr, 0, iJ0, StandardCharsets.ISO_8859_1));
            strConcat = strH0.indexOf(47) == -1 ? "image/".concat(strH0) : strH0;
        }
        int i4 = bArr[iJ0 + 1] & 255;
        int i5 = iJ0 + 2;
        int iI0 = i0(bArr, i5, iZ);
        String str = new String(bArr, i5, iI0 - i5, charsetG0);
        int iF0 = f0(iZ) + iI0;
        return new xa3(strConcat, str, i4, i3 <= iF0 ? vtt0.b : Arrays.copyOfRange(bArr, iF0, i3));
    }

    public static fub S(fq80 fq80Var, int i, int i2, boolean z, int i3, cxw cxwVar) throws Throwable {
        int i4 = fq80Var.b;
        int iJ0 = j0(fq80Var.f9961a, i4);
        String str = new String(fq80Var.f9961a, i4, iJ0 - i4, StandardCharsets.ISO_8859_1);
        fq80Var.M(iJ0 + 1);
        int iM = fq80Var.m();
        int iM2 = fq80Var.m();
        if (iM > iM2) {
            return null;
        }
        long jB = fq80Var.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = fq80Var.B();
        long j = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (fq80Var.b < i5) {
            fxw fxwVarV = V(i2, fq80Var, z, i3, cxwVar);
            if (fxwVarV != null) {
                arrayList.add(fxwVarV);
            }
        }
        return new fub(str, iM, iM2, jB, j, (fxw[]) arrayList.toArray(new fxw[0]));
    }

    public static hub T(fq80 fq80Var, int i, int i2, boolean z, int i3, cxw cxwVar) throws Throwable {
        int i4 = fq80Var.b;
        int iJ0 = j0(fq80Var.f9961a, i4);
        String str = new String(fq80Var.f9961a, i4, iJ0 - i4, StandardCharsets.ISO_8859_1);
        fq80Var.M(iJ0 + 1);
        int iZ = fq80Var.z();
        boolean z2 = (iZ & 2) != 0;
        boolean z3 = (iZ & 1) != 0;
        int iZ2 = fq80Var.z();
        String[] strArr = new String[iZ2];
        for (int i5 = 0; i5 < iZ2; i5++) {
            int i6 = fq80Var.b;
            int iJ1 = j0(fq80Var.f9961a, i6);
            strArr[i5] = new String(fq80Var.f9961a, i6, iJ1 - i6, StandardCharsets.ISO_8859_1);
            fq80Var.M(iJ1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (fq80Var.b < i7) {
            fxw fxwVarV = V(i2, fq80Var, z, i3, cxwVar);
            if (fxwVarV != null) {
                arrayList.add(fxwVarV);
            }
        }
        return new hub(str, z2, z3, strArr, (fxw[]) arrayList.toArray(new fxw[0]));
    }

    public static k8d U(int i, fq80 fq80Var) {
        if (i < 4) {
            return null;
        }
        int iZ = fq80Var.z();
        Charset charsetG0 = g0(iZ);
        byte[] bArr = new byte[3];
        fq80Var.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        fq80Var.k(bArr2, 0, i2);
        int iI0 = i0(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iI0, charsetG0);
        int iF0 = f0(iZ) + iI0;
        return new k8d(str, str2, Z(bArr2, iF0, i0(bArr2, iF0, iZ), charsetG0));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.fxw] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [a.fq80] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [a.fq80] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [a.fq80] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static fxw V(int i, fq80 fq80Var, boolean z, int i2, cxw cxwVar) throws Throwable {
        int iD;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        fq80 fq80Var2;
        Object y18Var;
        int i6 = i;
        int iZ = fq80Var.z();
        int iZ2 = fq80Var.z();
        int iZ3 = fq80Var.z();
        int iZ4 = i6 >= 3 ? fq80Var.z() : 0;
        if (i6 == 4) {
            iD = fq80Var.D();
            if (!z) {
                iD = (((iD >> 24) & 255) << 21) | (iD & 255) | (((iD >> 8) & 255) << 7) | (((iD >> 16) & 255) << 14);
            }
        } else {
            iD = i6 == 3 ? fq80Var.D() : fq80Var.C();
        }
        int iK0 = iD;
        int iG = i6 >= 3 ? fq80Var.G() : 0;
        if (iZ == 0 && iZ2 == 0 && iZ3 == 0 && iZ4 == 0 && iK0 == 0 && iG == 0) {
            fq80Var.M(fq80Var.c);
            return null;
        }
        int i7 = fq80Var.b + iK0;
        if (i7 > fq80Var.c) {
            f1t0.g0("Id3Decoder", "Frame size exceeds remaining tag data");
            fq80Var.M(fq80Var.c);
            return null;
        }
        if (cxwVar != null) {
            boolean zE = cxwVar.e(i6, iZ, iZ2, iZ3, iZ4);
            i6 = i6;
            r1 = iZ;
            i3 = iZ2;
            if (!zE) {
                fq80Var.M(i7);
                return null;
            }
        } else {
            i3 = iZ2;
            r1 = iZ;
        }
        if (i6 == 3) {
            z2 = (iG & 128) != 0;
            z5 = (iG & 64) != 0;
            z6 = false;
            z4 = (iG & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iG & 64) != 0;
            boolean z8 = (iG & 8) != 0;
            z5 = (iG & 4) != 0;
            z6 = (iG & 2) != 0;
            z3 = (iG & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            f1t0.g0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            fq80Var.M(i7);
            return null;
        }
        if (z4) {
            iK0--;
            fq80Var.N(1);
        }
        if (z3) {
            iK0 -= 4;
            fq80Var.N(4);
        }
        if (z6) {
            iK0 = k0(iK0, fq80Var);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iZ3 == 88 && (i6 == 2 || iZ4 == 88)) {
                    y18Var = c0(iK0, fq80Var);
                } else if (r1 == 84) {
                    y18Var = a0(iK0, fq80Var, h0(i6, r1, i3, iZ3, iZ4));
                } else if (r1 == 87 && i3 == 88 && iZ3 == 88 && (i6 == 2 || iZ4 == 88)) {
                    y18Var = e0(iK0, fq80Var);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iZ3 == 73 && iZ4 == 86) {
                            y18Var = Y(iK0, fq80Var);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iZ3 != 79 || (iZ4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iZ3 == 67) {
                                            y18Var = R(fq80Var, iK0, i6);
                                        } else if (r1 != 67 && i3 == 79 && iZ3 == 77 && (iZ4 == 77 || i6 == 2)) {
                                            y18Var = U(iK0, fq80Var);
                                        } else if (r1 != 67 && i3 == 72 && iZ3 == 65 && iZ4 == 80) {
                                            int i8 = iK0;
                                            iK0 = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            try {
                                                y18Var = S(fq80Var, i3, i6, z, i2, cxwVar);
                                                i6 = i;
                                                r1 = fq80Var;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = fq80Var;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = fq80Var;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = fq80Var;
                                                r3.M(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iK0;
                                            iK0 = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            try {
                                                if (r11 != 67 && iK0 == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    fq80 fq80Var3 = fq80Var;
                                                    y18Var = T(fq80Var3, i3, i6, z, i2, cxwVar);
                                                    r1 = fq80Var3;
                                                } else {
                                                    i6 = i;
                                                    fq80Var2 = fq80Var;
                                                    if (r11 != 77 && iK0 == 76 && i4 == 76 && i5 == 84) {
                                                        y18Var = X(i3, fq80Var2);
                                                        r1 = fq80Var2;
                                                    } else {
                                                        String strH0 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        fq80Var2.k(bArr, 0, i3);
                                                        y18Var = new y18(strH0, bArr);
                                                        r1 = fq80Var2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.M(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iZ3 == 73 && iZ4 == 67) {
                                        y18Var = R(fq80Var, iK0, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iK0;
                                            iK0 = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                fq80Var2 = fq80Var;
                                                if (r11 != 77) {
                                                    String strH1 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    fq80Var2.k(bArr2, 0, i3);
                                                    y18Var = new y18(strH1, bArr2);
                                                    r1 = fq80Var2;
                                                } else {
                                                    String strH2 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    fq80Var2.k(bArr3, 0, i3);
                                                    y18Var = new y18(strH2, bArr3);
                                                    r1 = fq80Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                fq80Var2 = fq80Var;
                                                if (r11 != 77) {
                                                    String strH3 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    fq80Var2.k(bArr4, 0, i3);
                                                    y18Var = new y18(strH3, bArr4);
                                                    r1 = fq80Var2;
                                                } else {
                                                    String strH4 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    fq80Var2.k(bArr5, 0, i3);
                                                    y18Var = new y18(strH4, bArr5);
                                                    r1 = fq80Var2;
                                                }
                                            }
                                        } else {
                                            int i11 = iK0;
                                            iK0 = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                fq80Var2 = fq80Var;
                                                if (r11 != 77) {
                                                    String strH5 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    fq80Var2.k(bArr6, 0, i3);
                                                    y18Var = new y18(strH5, bArr6);
                                                    r1 = fq80Var2;
                                                } else {
                                                    String strH6 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    fq80Var2.k(bArr7, 0, i3);
                                                    y18Var = new y18(strH6, bArr7);
                                                    r1 = fq80Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                fq80Var2 = fq80Var;
                                                if (r11 != 77) {
                                                    String strH7 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    fq80Var2.k(bArr8, 0, i3);
                                                    y18Var = new y18(strH7, bArr8);
                                                    r1 = fq80Var2;
                                                } else {
                                                    String strH8 = h0(i6, r11 == true ? 1 : 0, iK0, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    fq80Var2.k(bArr9, 0, i3);
                                                    y18Var = new y18(strH8, bArr9);
                                                    r1 = fq80Var2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                y18Var = W(iK0, fq80Var);
                                int i12 = iK0;
                                iK0 = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r1 = fq80Var;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = iK0;
                                iK0 = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r2 = fq80Var;
                                r2.M(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = iK0;
                                iK0 = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r2 = fq80Var;
                                r2.M(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.M(i7);
                        r12 = y18Var;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    y18Var = d0(iK0, fq80Var, h0(i6, r1, i3, iZ3, iZ4));
                }
                int i15 = iK0;
                iK0 = i3;
                i3 = i15;
                r11 = r1;
                i4 = iZ3;
                i5 = iZ4;
                r1 = fq80Var;
                th = null;
                r1.M(i7);
                r12 = y18Var;
                e = th;
                r10 = r11;
            } catch (Throwable th4) {
                th = th4;
                r3 = fq80Var;
            }
        } catch (Exception e7) {
            e = e7;
            int i16 = iK0;
            iK0 = i3;
            i3 = i16;
            r9 = r1;
            i4 = iZ3;
            i5 = iZ4;
            r2 = fq80Var;
            th = null;
            r2.M(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (OutOfMemoryError e8) {
            e = e8;
            int i17 = iK0;
            iK0 = i3;
            i3 = i17;
            r9 = r1;
            i4 = iZ3;
            i5 = iZ4;
            r2 = fq80Var;
            th = null;
            r2.M(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        }
        if (r12 == 0) {
            f1t0.h0("Id3Decoder", "Failed to decode frame: id=" + h0(i6, r10, iK0, i4, i5) + ", frameSize=" + i3, e);
        }
        return r12;
    }

    public static slt W(int i, fq80 fq80Var) {
        int iZ = fq80Var.z();
        Charset charsetG0 = g0(iZ);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fq80Var.k(bArr, 0, i2);
        int iJ0 = j0(bArr, 0);
        String strN = mg40.n(new String(bArr, 0, iJ0, StandardCharsets.ISO_8859_1));
        int i3 = iJ0 + 1;
        int iI0 = i0(bArr, i3, iZ);
        String strZ = Z(bArr, i3, iI0, charsetG0);
        int iF0 = f0(iZ) + iI0;
        int iI1 = i0(bArr, iF0, iZ);
        String strZ2 = Z(bArr, iF0, iI1, charsetG0);
        int iF1 = f0(iZ) + iI1;
        return new slt(strN, strZ, strZ2, i2 <= iF1 ? vtt0.b : Arrays.copyOfRange(bArr, iF1, i2));
    }

    public static ol40 X(int i, fq80 fq80Var) {
        int iG = fq80Var.G();
        int iC = fq80Var.C();
        int iC2 = fq80Var.C();
        int iZ = fq80Var.z();
        int iZ2 = fq80Var.z();
        q8b q8bVar = new q8b();
        q8bVar.k(fq80Var);
        int i2 = ((i - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG2 = q8bVar.g(iZ);
            int iG3 = q8bVar.g(iZ2);
            iArr[i3] = iG2;
            iArr2[i3] = iG3;
        }
        return new ol40(iG, iC, iC2, iArr, iArr2);
    }

    public static rwb0 Y(int i, fq80 fq80Var) {
        byte[] bArr = new byte[i];
        fq80Var.k(bArr, 0, i);
        int iJ0 = j0(bArr, 0);
        String str = new String(bArr, 0, iJ0, StandardCharsets.ISO_8859_1);
        int i2 = iJ0 + 1;
        return new rwb0(str, i <= i2 ? vtt0.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String Z(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static h8q0 a0(int i, fq80 fq80Var, String str) {
        if (i < 1) {
            return null;
        }
        int iZ = fq80Var.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fq80Var.k(bArr, 0, i2);
        return new h8q0(str, null, b0(bArr, iZ, 0));
    }

    public static rcf0 b0(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return b4x.t("");
        }
        u3x u3xVarL = b4x.l();
        int iI0 = i0(bArr, i2, i);
        while (i2 < iI0) {
            u3xVarL.b(new String(bArr, i2, iI0 - i2, g0(i)));
            i2 = f0(i) + iI0;
            iI0 = i0(bArr, i2, i);
        }
        rcf0 rcf0VarG = u3xVarL.g();
        return rcf0VarG.isEmpty() ? b4x.t("") : rcf0VarG;
    }

    public static h8q0 c0(int i, fq80 fq80Var) {
        if (i < 1) {
            return null;
        }
        int iZ = fq80Var.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fq80Var.k(bArr, 0, i2);
        int iI0 = i0(bArr, 0, iZ);
        return new h8q0("TXXX", new String(bArr, 0, iI0, g0(iZ)), b0(bArr, iZ, f0(iZ) + iI0));
    }

    public static dot0 d0(int i, fq80 fq80Var, String str) {
        byte[] bArr = new byte[i];
        fq80Var.k(bArr, 0, i);
        return new dot0(str, null, new String(bArr, 0, j0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static dot0 e0(int i, fq80 fq80Var) {
        if (i < 1) {
            return null;
        }
        int iZ = fq80Var.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fq80Var.k(bArr, 0, i2);
        int iI0 = i0(bArr, 0, iZ);
        String str = new String(bArr, 0, iI0, g0(iZ));
        int iF0 = f0(iZ) + iI0;
        return new dot0("WXXX", str, Z(bArr, iF0, j0(bArr, iF0), StandardCharsets.ISO_8859_1));
    }

    public static int f0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset g0(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String h0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int i0(byte[] bArr, int i, int i2) {
        int iJ0 = j0(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iJ0;
        }
        while (iJ0 < bArr.length - 1) {
            if ((iJ0 - i) % 2 == 0 && bArr[iJ0 + 1] == 0) {
                return iJ0;
            }
            iJ0 = j0(bArr, iJ0 + 1);
        }
        return bArr.length;
    }

    public static int j0(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int k0(int i, fq80 fq80Var) {
        byte[] bArr = fq80Var.f9961a;
        int i2 = fq80Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean l0(fq80 fq80Var, int i, int i2, boolean z) {
        int iC;
        long jC;
        int iG;
        int i3;
        int i4 = fq80Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (fq80Var.a() < i2) {
                    fq80Var.M(i4);
                    return true;
                }
                if (i >= 3) {
                    iC = fq80Var.m();
                    jC = fq80Var.B();
                    iG = fq80Var.G();
                } else {
                    iC = fq80Var.C();
                    jC = fq80Var.C();
                    iG = 0;
                }
                if (iC == 0 && jC == 0 && iG == 0) {
                    fq80Var.M(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jC) != 0) {
                        fq80Var.M(i4);
                        return false;
                    }
                    jC = (((jC >> 24) & 255) << 21) | (jC & 255) | (((jC >> 8) & 255) << 7) | (((jC >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iG & 64) != 0 ? 1 : 0;
                    if ((iG & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iG & 32) != 0 ? 1 : 0;
                    if ((iG & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jC < i3) {
                    fq80Var.M(i4);
                    return false;
                }
                if (fq80Var.a() < jC) {
                    fq80Var.M(i4);
                    return false;
                }
                fq80Var.N((int) jC);
            } catch (Throwable th) {
                fq80Var.M(i4);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb A[SYNTHETIC] */
    public final ed40 Q(byte[] bArr, int i) {
        dxw dxwVar;
        short s;
        int i2;
        int iK0;
        fxw fxwVarV;
        ArrayList arrayList = new ArrayList();
        fq80 fq80Var = new fq80(bArr, i);
        boolean z = false;
        if (fq80Var.a() < 10) {
            f1t0.g0("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iC = fq80Var.C();
            if (iC != 4801587) {
                f1t0.g0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iC))));
            } else {
                int iZ = fq80Var.z();
                if (iZ >= 2 && iZ <= 4) {
                    fq80Var.N(1);
                    int iZ2 = fq80Var.z();
                    int iY = fq80Var.y();
                    if (iZ == 2) {
                        if ((iZ2 & 64) != 0) {
                            f1t0.g0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        }
                        if (dxwVar == null) {
                            return null;
                        }
                        s = dxwVar.f6866a;
                        int i3 = fq80Var.b;
                        i2 = s == 2 ? 6 : 10;
                        iK0 = dxwVar.c;
                        if (dxwVar.b) {
                            iK0 = k0(iK0, fq80Var);
                        }
                        fq80Var.L(i3 + iK0);
                        if (!l0(fq80Var, s, i2, false)) {
                            if (s == 4 || !l0(fq80Var, 4, i2, true)) {
                                rw2.u(s, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                                return null;
                            }
                            z = true;
                        }
                        while (fq80Var.a() >= i2) {
                            fxwVarV = V(s, fq80Var, z, i2, this.b);
                            if (fxwVarV != null) {
                                arrayList.add(fxwVarV);
                            }
                        }
                        return new ed40(arrayList);
                    }
                    if (iZ == 3) {
                        if ((iZ2 & 64) != 0) {
                            int iM = fq80Var.m();
                            fq80Var.N(iM);
                            iY -= iM + 4;
                        }
                    } else if (iZ == 4) {
                        if ((iZ2 & 64) != 0) {
                            int iY2 = fq80Var.y();
                            fq80Var.N(iY2 - 4);
                            iY -= iY2;
                        }
                        if ((iZ2 & 16) != 0) {
                            iY -= 10;
                        }
                    }
                    dxwVar = new dxw(iZ, iY, iZ < 4 && (iZ2 & 128) != 0);
                    if (dxwVar == null) {
                        return null;
                    }
                    s = dxwVar.f6866a;
                    int i4 = fq80Var.b;
                    if (s == 2) {
                    }
                    iK0 = dxwVar.c;
                    if (dxwVar.b) {
                        iK0 = k0(iK0, fq80Var);
                    }
                    fq80Var.L(i4 + iK0);
                    if (!l0(fq80Var, s, i2, false)) {
                        if (s == 4) {
                        }
                        rw2.u(s, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    while (fq80Var.a() >= i2) {
                        fxwVarV = V(s, fq80Var, z, i2, this.b);
                        if (fxwVarV != null) {
                            arrayList.add(fxwVarV);
                        }
                    }
                    return new ed40(arrayList);
                }
                rw2.u(iZ, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
            }
        }
        dxwVar = null;
        if (dxwVar == null) {
            return null;
        }
        s = dxwVar.f6866a;
        int i5 = fq80Var.b;
        if (s == 2) {
        }
        iK0 = dxwVar.c;
        if (dxwVar.b) {
            iK0 = k0(iK0, fq80Var);
        }
        fq80Var.L(i5 + iK0);
        if (!l0(fq80Var, s, i2, false)) {
            if (s == 4) {
            }
            rw2.u(s, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (fq80Var.a() >= i2) {
            fxwVarV = V(s, fq80Var, z, i2, this.b);
            if (fxwVarV != null) {
                arrayList.add(fxwVarV);
            }
        }
        return new ed40(arrayList);
    }

    @Override // a.zdx
    public final ed40 y(md40 md40Var, ByteBuffer byteBuffer) {
        return Q(byteBuffer.array(), byteBuffer.limit());
    }
}
