package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class oge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gkx f25215a;
    public final AndroidComposeView b;
    public final zz2 c;
    public final vn00 d;
    public final vy40 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public fx2 i;
    public long j;
    public final p7d0 k;
    public final gz40 l;

    public oge0(ey40 ey40Var, AndroidComposeView androidComposeView) {
        this.f25215a = ey40Var;
        this.b = androidComposeView;
        zz2 zz2Var = new zz2();
        zz2Var.b = new long[192];
        zz2Var.c = new long[192];
        this.c = zz2Var;
        this.d = new vn00();
        this.e = new vy40();
        this.j = -1L;
        this.k = new p7d0(this, (byte) 29);
        this.l = new gz40();
    }

    public static boolean c(s460 s460Var) {
        bg80 bg80Var = s460Var.u1;
        return (bg80Var == null || a8k0.z(((gfv) bg80Var).b())) ? false : true;
    }

    public static long f(e7z e7zVar) {
        tzi tziVar = e7zVar.h1;
        s460 s460Var = (s460) tziVar.e;
        long jD = 0;
        for (s460 s460Var2 = (rdx) tziVar.d; s460Var2 != null && s460Var2 != s460Var; s460Var2 = s460Var2.w) {
            if (c(s460Var2)) {
                return 9223372034707292159L;
            }
            jD = ikx.d(jD, s460Var2.g1);
        }
        return jD;
    }

    public static void i(e7z e7zVar) {
        if (!e7zVar.c || c((s460) e7zVar.h1.e)) {
            return;
        }
        e7zVar.c = false;
        if (e7zVar.e) {
            e7zVar.d = f(e7zVar);
            e7zVar.e = false;
        }
        if (ikx.b(e7zVar.d, 9223372034707292159L)) {
            return;
        }
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            i((e7z) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:0x0259 A[LOOP:11: B:102:0x0257->B:103:0x0259, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0264 A[LOOP:9: B:95:0x0233->B:107:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x026d A[ADDED_TO_REGION, LOOP:12: B:110:0x026d->B:111:0x026f, LOOP_START, PHI: r1
  0x026d: PHI (r1v9 a.scq0) = (r1v8 a.scq0), (r1v10 a.scq0) binds: [B:109:0x026b, B:111:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x026f A[LOOP:12: B:110:0x026d->B:111:0x026f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x027a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0267 A[EDGE_INSN: B:136:0x0267->B:108:0x0267 BREAK  A[LOOP:9: B:95:0x0233->B:107:0x0264], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0267 A[EDGE_INSN: B:137:0x0267->B:108:0x0267 BREAK  A[LOOP:9: B:95:0x0233->B:107:0x0264], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197 A[ADDED_TO_REGION, LOOP:7: B:73:0x0197->B:74:0x0199, LOOP_START, PHI: r3
  0x0197: PHI (r3v8 a.scq0) = (r3v7 a.scq0), (r3v9 a.scq0) binds: [B:72:0x0195, B:74:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0199 A[LOOP:7: B:73:0x0197->B:74:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0225  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:97:0x023f  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        scq0 scq0Var;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        scq0 scq0Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        scq0 scq0Var3;
        long[] jArr4;
        long j9;
        long j10;
        fx2 fx2Var = this.i;
        if (fx2Var != null) {
            this.b.removeCallbacks(fx2Var);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        zz2 zz2Var = this.c;
        boolean z4 = true;
        vn00 vn00Var = this.d;
        if (z2) {
            this.f = false;
            vy40 vy40Var = this.e;
            Object[] objArr2 = vy40Var.f38232a;
            int i9 = vy40Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((Function0) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) zz2Var.b;
            int i11 = zz2Var.f45232a;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    scq0 scq0Var4 = (scq0) ((ey40) vn00Var.e).b(((int) j11) & 33554431);
                    while (scq0Var4 != null) {
                        scq0 scq0Var5 = scq0Var4.d;
                        boolean z6 = z3;
                        long j14 = scq0Var4.g;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        scq0Var4.e = j12;
                        scq0Var4.f = j13;
                        if (z7) {
                            scq0Var4.g = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            scq0Var4.a(j9, j10, vn00Var.b, vn00Var.c, (float[]) vn00Var.g);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        scq0Var4 = scq0Var5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) zz2Var.b;
            int i14 = zz2Var.f45232a;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j15 = vn00Var.b;
            long j16 = vn00Var.c;
            float[] fArr2 = (float[]) vn00Var.g;
            ey40 ey40Var = (ey40) vn00Var.e;
            j2 = 128;
            Object[] objArr3 = ey40Var.c;
            long[] jArr7 = ey40Var.f11466a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    zz2Var = zz2Var;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                scq0 scq0Var6 = (scq0) objArr3[(i17 << 3) + i21];
                                while (scq0Var6 != null) {
                                    vn00Var.a(scq0Var6, j17, j16, fArr2, jCurrentTimeMillis);
                                    scq0Var6 = scq0Var6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    zz2Var = zz2Var;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = vn00Var.b;
                j8 = vn00Var.c;
                fArr = (float[]) vn00Var.g;
                scq0Var3 = (scq0) vn00Var.f;
                if (scq0Var3 != null) {
                    while (scq0Var3 != null) {
                        e7z e7zVarZ = vcc.Z(scq0Var3.b);
                        long jB = h7z.a(e7zVarZ).getRectManager().b(e7zVarZ);
                        scq0Var3.e = jB;
                        sj30 sj30Var = e7zVarZ.i1.p;
                        scq0Var3.f = (((long) (sj30Var.f27604a + ((int) (jB >> 32)))) << 32) | (((long) (sj30Var.b + ((int) (jB & 4294967295L)))) & 4294967295L);
                        vn00Var.a(scq0Var3, j7, j8, fArr, jCurrentTimeMillis);
                        scq0Var3 = scq0Var3.d;
                    }
                }
            }
            if (this.h) {
                i2 = 0;
                this.h = false;
                zz2 zz2Var2 = zz2Var;
                jArr2 = (long[]) zz2Var2.b;
                int i23 = zz2Var2.f45232a;
                jArr3 = (long[]) zz2Var2.c;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != nge0.c) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                zz2Var2.f45232a = i7;
                zz2Var2.b = jArr3;
                zz2Var2.c = jArr2;
            } else {
                i2 = 0;
            }
            j4 = vn00Var.f37693a;
            if (j4 <= jCurrentTimeMillis) {
                ey40 ey40Var2 = (ey40) vn00Var.e;
                objArr = ey40Var2.c;
                jArr = ey40Var2.f11466a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (scq0Var2 = (scq0) objArr[(i3 << 3) + i5]; scq0Var2 != null; scq0Var2 = scq0Var2.d) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                scq0Var = (scq0) vn00Var.f;
                if (scq0Var != null) {
                    while (scq0Var != null) {
                        scq0Var = scq0Var.d;
                    }
                }
                j4 = -1;
                vn00Var.f37693a = -1L;
            }
            if (j4 > j) {
                j();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = vn00Var.b;
            j8 = vn00Var.c;
            fArr = (float[]) vn00Var.g;
            scq0Var3 = (scq0) vn00Var.f;
            if (scq0Var3 != null) {
                while (scq0Var3 != null) {
                    e7z e7zVarZ2 = vcc.Z(scq0Var3.b);
                    long jB2 = h7z.a(e7zVarZ2).getRectManager().b(e7zVarZ2);
                    scq0Var3.e = jB2;
                    sj30 sj30Var2 = e7zVarZ2.i1.p;
                    scq0Var3.f = (((long) (sj30Var2.f27604a + ((int) (jB2 >> 32)))) << 32) | (((long) (sj30Var2.b + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    vn00Var.a(scq0Var3, j7, j8, fArr, jCurrentTimeMillis);
                    scq0Var3 = scq0Var3.d;
                }
            }
        }
        if (this.h) {
            i2 = 0;
            this.h = false;
            zz2 zz2Var3 = zz2Var;
            jArr2 = (long[]) zz2Var3.b;
            int i24 = zz2Var3.f45232a;
            jArr3 = (long[]) zz2Var3.c;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != nge0.c) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            zz2Var3.f45232a = i7;
            zz2Var3.b = jArr3;
            zz2Var3.c = jArr2;
        } else {
            i2 = 0;
        }
        j4 = vn00Var.f37693a;
        if (j4 <= jCurrentTimeMillis) {
            ey40 ey40Var3 = (ey40) vn00Var.e;
            objArr = ey40Var3.c;
            jArr = ey40Var3.f11466a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (scq0Var2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            scq0Var = (scq0) vn00Var.f;
            if (scq0Var != null) {
                while (scq0Var != null) {
                    scq0Var = scq0Var.d;
                }
            }
            j4 = -1;
            vn00Var.f37693a = -1L;
        }
        if (j4 > j) {
            j();
        }
    }

    public final long b(e7z e7zVar) {
        if (e7zVar.g == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.b)[d(e7zVar)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int d(e7z e7zVar) {
        int i = e7zVar.g;
        if (i != -4) {
            int i2 = e7zVar.b;
            zz2 zz2Var = this.c;
            long[] jArr = (long[]) zz2Var.b;
            if (i < 0 || i >= zz2Var.f45232a - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = zz2Var.f45232a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            xcx.a("LayoutNode " + e7zVar.b + " not found in RectList");
        }
        e7zVar.g = i;
        return i;
    }

    public final void e(e7z e7zVar) {
        e7zVar.c = true;
        tzi tziVar = e7zVar.h1;
        sj30 sj30Var = e7zVar.i1.p;
        int iE0 = sj30Var.e0();
        float fD0 = sj30Var.d0();
        gz40 gz40Var = this.l;
        gz40Var.b = 0.0f;
        gz40Var.c = 0.0f;
        gz40Var.d = iE0;
        gz40Var.e = fD0;
        for (s460 s460Var = (s460) tziVar.e; s460Var != null; s460Var = s460Var.w) {
            e7z e7zVar2 = s460Var.u;
            if (s460Var == ((s460) e7zVar2.h1.e) && !e7zVar2.c) {
                long jB = b(e7zVar2);
                if (!ikx.b(jB, 9223372034707292159L)) {
                    gz40Var.e((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            bg80 bg80Var = s460Var.u1;
            if (bg80Var != null) {
                float[] fArrB = ((gfv) bg80Var).b();
                if (!a8k0.z(fArrB)) {
                    ui30.c(fArrB, gz40Var);
                }
            }
            long j = s460Var.g1;
            gz40Var.e((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) gz40Var.b;
        int i2 = (int) gz40Var.c;
        int i3 = (int) gz40Var.d;
        int i4 = (int) gz40Var.e;
        int i5 = e7zVar.b;
        int i6 = e7zVar.g;
        zz2 zz2Var = this.c;
        if (i6 != -4) {
            int iD = d(e7zVar);
            long[] jArr = (long[]) zz2Var.b;
            jArr[iD] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iD + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iD + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            e7z e7zVarV = e7zVar.v();
            e7zVar.g = zz2Var.x(i5, i, i2, i3, i4, e7zVarV != null ? e7zVarV.b : -1, e7zVarV != null ? d(e7zVarV) : -4, tziVar.j(1024), tziVar.j(16), ((ey40) this.d.e).a(i5));
        }
        e7zVar.f = false;
        this.f = true;
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i8 = xz40VarA.c;
        for (int i9 = 0; i9 < i8; i9++) {
            e7z e7zVar3 = (e7z) objArr[i9];
            if (e7zVar3.J()) {
                e(e7zVar3);
            }
        }
    }

    public final void g(e7z e7zVar) {
        long j;
        boolean zJ = e7zVar.J();
        tzi tziVar = e7zVar.h1;
        if (zJ && e7zVar.f) {
            e7z e7zVarV = e7zVar.v();
            if (e7zVarV == null || e7zVarV.c) {
                j = e7zVarV == null ? 0L : 9223372034707292159L;
            } else {
                if (e7zVarV.e) {
                    e7zVarV.e = false;
                    e7zVarV.d = f(e7zVarV);
                }
                j = e7zVarV.d;
            }
            s460 s460Var = (s460) tziVar.e;
            if (ikx.b(j, 9223372034707292159L) || c(s460Var)) {
                e(e7zVar);
            } else if (e7zVar.c) {
                e(e7zVar);
                i(e7zVar);
            } else {
                long jD = ikx.d(j, s460Var.g1);
                sj30 sj30Var = e7zVar.i1.p;
                int iE0 = sj30Var.e0();
                int iD0 = sj30Var.d0();
                int i = e7zVar.g;
                zz2 zz2Var = this.c;
                if (i != -4) {
                    int iD = d(e7zVar);
                    if (e7zVarV != null) {
                        int iD2 = d(e7zVarV);
                        long[] jArr = (long[]) zz2Var.b;
                        long j2 = jArr[iD2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jD >> 32));
                        int i3 = ((int) j2) + ((int) (jD & 4294967295L));
                        long j3 = jArr[iD];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iD + 2;
                        long j4 = jArr[i6];
                        jArr[iD] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iD + 1] = (((long) (iE0 + i2)) << 32) | (((long) (iD0 + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            zz2Var.J(iD, i4, i5, j4);
                        }
                    } else {
                        int iD3 = d(e7zVar);
                        int i7 = (int) (jD >> 32);
                        int i8 = (int) (jD & 4294967295L);
                        long[] jArr2 = (long[]) zz2Var.b;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iD3 + 1] = (((long) (iD0 + i8)) & 4294967295L) | (((long) (iE0 + i7)) << 32);
                        int i9 = iD3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            zz2Var.J(iD3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = e7zVar.b;
                    boolean zJ2 = tziVar.j(1024);
                    boolean zJ3 = tziVar.j(16);
                    boolean zA = ((ey40) this.d.e).a(i12);
                    if (e7zVarV != null) {
                        int i13 = e7zVarV.b;
                        int iD4 = d(e7zVarV);
                        int i14 = (int) (jD >> 32);
                        int i15 = (int) (jD & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) zz2Var.b;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i13)) {
                            xcx.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        e7zVar.g = zz2Var.x(i16, i17, i18, i17 + iE0, i18 + iD0, i13, iD4, zJ2, zJ3, zA);
                    } else {
                        int i19 = (int) (jD >> 32);
                        int i20 = (int) (jD & 4294967295L);
                        e7zVar.g = zz2Var.x(i12, i19, i20, i19 + iE0, i20 + iD0, -1, -4, zJ2, zJ3, zA);
                    }
                }
            }
            e7zVar.f = false;
            this.f = true;
            j();
        }
    }

    public final void h(e7z e7zVar) {
        if (e7zVar.g != -4) {
            int iD = d(e7zVar);
            long[] jArr = (long[]) this.c.b;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = nge0.c;
            e7zVar.g = -4;
            e7zVar.f = true;
            this.f = true;
            this.h = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        fx2 fx2Var = this.i;
        boolean z = fx2Var != null;
        long j = this.d.f37693a;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.b;
            if (fx2Var != null) {
                androidComposeView.removeCallbacks(fx2Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            fx2 fx2Var2 = new fx2(this.k, (byte) 1);
            androidComposeView.postDelayed(fx2Var2, jMax - jCurrentTimeMillis);
            this.i = fx2Var2;
        }
    }
}
