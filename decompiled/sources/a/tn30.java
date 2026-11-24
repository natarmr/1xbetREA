package a;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class tn30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ukg0 f34217a;
    public final skg0 b;
    public final v34 c;
    public final o34 d;
    public final u24 e;
    public final oiv f;
    public final nb90 g;
    public final sje h;
    public final k050 i;
    public c4m0 j;
    public c4m0 k;
    public c4m0 l;
    public q99 m;
    public c4m0 n;
    public tyc o;
    public ah80 p;
    public final AtomicInteger q;

    public tn30(ukg0 ukg0Var, skg0 skg0Var, v34 v34Var, o34 o34Var, u24 u24Var, oiv oivVar, nb90 nb90Var) {
        ukg0Var.getClass();
        skg0Var.getClass();
        v34Var.getClass();
        o34Var.getClass();
        u24Var.getClass();
        oivVar.getClass();
        nb90Var.getClass();
        this.f34217a = ukg0Var;
        this.b = skg0Var;
        this.c = v34Var;
        this.d = o34Var;
        this.e = u24Var;
        this.f = oivVar;
        this.g = nb90Var;
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.h = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        this.i = new k050();
        this.q = new AtomicInteger(-1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        qn30 qn30Var;
        long j2;
        long j3;
        if (zjeVar instanceof qn30) {
            qn30Var = (qn30) zjeVar;
            int i = qn30Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn30Var.m = i - Integer.MIN_VALUE;
            } else {
                qn30Var = new qn30(this, zjeVar);
            }
        } else {
            qn30Var = new qn30(this, zjeVar);
        }
        Object obj = qn30Var.k;
        wne wneVar = wne.f39444a;
        int i2 = qn30Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            j2 = 20000000;
            if (j == 0 || jElapsedRealtimeNanos - j > 20000000) {
                j = jElapsedRealtimeNanos + 20000000;
            }
            long j4 = (j - jElapsedRealtimeNanos) / 1000000;
            if (j4 > 0) {
                uen uenVar = wen.b;
                long jW0 = ibc.w0(j4, bfn.MILLISECONDS);
                qn30Var.i = 20000000;
                qn30Var.j = j;
                qn30Var.m = 1;
                if (qcc.P(jW0, qn30Var) == wneVar) {
                    return wneVar;
                }
                j3 = 20000000;
            }
            return new Long(j + j2);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = qn30Var.j;
        j3 = qn30Var.i;
        z1x.P(obj);
        j2 = j3;
        return new Long(j + j2);
    }

    public final void b() {
        c4m0 c4m0Var = this.j;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.j = null;
        c4m0 c4m0Var2 = this.n;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.n = null;
        q99 q99Var = this.m;
        if (q99Var != null) {
            q99Var.d(null);
        }
        this.m = null;
        c4m0 c4m0Var3 = this.k;
        if (c4m0Var3 != null) {
            c4m0Var3.cancel(null);
        }
        this.k = null;
        c4m0 c4m0Var4 = this.l;
        if (c4m0Var4 != null) {
            c4m0Var4.cancel(null);
        }
        this.l = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0264  */
    /* JADX WARN: Code duplicated, block: B:102:0x0267  */
    /* JADX WARN: Code duplicated, block: B:105:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x026e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0274  */
    /* JADX WARN: Code duplicated, block: B:149:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0254 A[PHI: r2
  0x0254: PHI (r2v50 short) = (r2v44 short), (r2v45 short) binds: [B:91:0x0252, B:95:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x025d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public final short[] c(byte[] bArr) {
        short s;
        int i;
        short s2;
        short s3;
        int i2;
        short s4;
        short s5;
        int i3;
        int length = bArr.length;
        short s6 = 15;
        short s7 = 7;
        int i4 = 4;
        if (length != 33) {
            if (length != 160) {
                return new short[160];
            }
            this.g.getClass();
            if (bArr.length != 160) {
                return new short[0];
            }
            short[] sArr = new short[160];
            for (int i5 = 0; i5 < 160; i5++) {
                int i6 = ~(bArr[i5] & 255);
                int i7 = i6 & 128;
                int i8 = (((i6 & 15) << 3) + 132) << (((i6 & 255) >> 4) & 7);
                sArr[i5] = (short) (i7 == 0 ? i8 - 132 : 132 - i8);
            }
            return sArr;
        }
        oiv oivVar = this.f;
        oivVar.getClass();
        if (bArr.length != 33) {
            return new short[0];
        }
        byte b = bArr[0];
        if (((b >> 4) & 15) != 13) {
            return new short[0];
        }
        miv mivVar = oivVar.b;
        short[] sArr2 = mivVar.g;
        short[] sArr3 = mivVar.f21864a;
        short[] sArr4 = mivVar.h;
        short[] sArr5 = mivVar.i;
        short[] sArr6 = mivVar.j;
        short[] sArr7 = mivVar.k;
        short[] sArr8 = mivVar.l;
        byte b2 = bArr[1];
        sArr2[0] = (short) (((b & 15) << 2) | ((b2 >> 6) & 3));
        sArr2[1] = (short) (b2 & 63);
        byte b3 = bArr[2];
        int i9 = 0;
        sArr2[2] = (short) ((b3 >> 3) & 31);
        byte b4 = bArr[3];
        sArr2[3] = (short) (((b3 & 7) << 2) | ((b4 >> 6) & 3));
        sArr2[4] = (short) ((b4 >> 2) & 15);
        int i10 = (b4 & 3) << 2;
        byte b5 = bArr[4];
        int i11 = 5;
        sArr2[5] = (short) (i10 | ((b5 >> 6) & 3));
        sArr2[6] = (short) ((b5 >> 3) & 7);
        sArr2[7] = (short) (b5 & 7);
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i12 * 13;
            byte b6 = bArr[i11];
            sArr4[i12] = (short) ((b6 >> 1) & 127);
            int i14 = (b6 & 1) << 1;
            byte b7 = bArr[i11 + 1];
            sArr5[i12] = (short) (i14 | ((b7 >> 7) & 1));
            sArr6[i12] = (short) ((b7 >> 5) & 3);
            int i15 = (b7 & 31) << 1;
            byte b8 = bArr[i11 + 2];
            sArr7[i12] = (short) (i15 | ((b8 >> 7) & 1));
            sArr8[i13] = (short) ((b8 >> 4) & 7);
            sArr8[i13 + 1] = (short) ((b8 >> 1) & 7);
            int i16 = (b8 & 1) << 2;
            byte b9 = bArr[i11 + 3];
            sArr8[i13 + 2] = (short) (i16 | ((b9 >> 6) & 3));
            sArr8[i13 + 3] = (short) ((b9 >> 3) & 7);
            sArr8[i13 + 4] = (short) (b9 & 7);
            byte b10 = bArr[i11 + 4];
            sArr8[i13 + 5] = (short) ((b10 >> 5) & 7);
            sArr8[i13 + 6] = (short) ((b10 >> 2) & 7);
            byte b11 = bArr[i11 + 5];
            sArr8[i13 + 7] = (short) (((b10 & 3) << 1) | ((b11 >> 7) & 1));
            sArr8[i13 + 8] = (short) ((b11 >> 4) & 7);
            sArr8[i13 + 9] = (short) ((b11 >> 1) & 7);
            int i17 = (b11 & 1) << 2;
            byte b12 = bArr[i11 + 6];
            sArr8[i13 + 10] = (short) (i17 | ((b12 >> 6) & 3));
            sArr8[i13 + 11] = (short) ((b12 >> 3) & 7);
            sArr8[i13 + 12] = (short) (b12 & 7);
            i11 += 7;
        }
        short[] sArr9 = mivVar.m;
        short[] sArr10 = mivVar.n;
        int i18 = 0;
        while (i18 < i4) {
            short s8 = sArr7[i18];
            short s9 = sArr6[i18];
            int i19 = i18 * 13;
            short[] sArr11 = (short[]) mivVar.p.f10580a;
            short s10 = s8 > s6 ? (short) ((s8 >> 3) - 1) : (short) 0;
            short s11 = (short) (s8 - (s10 << 3));
            if (s11 == 0) {
                s10 = -4;
                s = s7;
            } else {
                while (s11 <= s7) {
                    s11 = (short) ((s11 << 1) | 1);
                    s10 = (short) (s10 - 1);
                }
                s = (short) (s11 - 8);
            }
            short s12 = oiv.f[s];
            int i20 = 6 - s10;
            short s13 = s7;
            short s14 = i20 < -32768 ? Short.MIN_VALUE : i20 > 32767 ? Short.MAX_VALUE : (short) i20;
            int i21 = s14 - 1;
            short[] sArr12 = sArr9;
            short s15 = i21 < -32768 ? Short.MIN_VALUE : i21 > 32767 ? Short.MAX_VALUE : (short) i21;
            if (s15 < 16 && s15 > -16) {
                if (s15 < 0) {
                    int i22 = -s15;
                    if (i22 < 16 && i22 > -16) {
                        i = i22 < 0 ? 1 << (-i22) : 1 >> i22;
                    } else {
                        s2 = 0;
                    }
                } else {
                    i = 1 << s15;
                }
                s2 = (short) i;
            } else {
                s2 = 0;
            }
            int i23 = 0;
            while (true) {
                short s16 = -1;
                short s17 = s2;
                if (i23 >= 13) {
                    break;
                }
                int i24 = i19 + 1;
                short s18 = (short) (((short) ((sArr8[i19] << 1) - 7)) << 12);
                short[] sArr13 = sArr10;
                if (s12 == Short.MIN_VALUE && s18 == Short.MIN_VALUE) {
                    s3 = Short.MAX_VALUE;
                } else {
                    int i25 = ((s18 * s12) + 16384) >> 15;
                    if (i25 < -32768) {
                        s3 = Short.MIN_VALUE;
                    } else {
                        s3 = i25 > 32767 ? Short.MAX_VALUE : (short) i25;
                    }
                    i2 = s3 + s17;
                    s4 = Short.MIN_VALUE;
                    if (i2 < -32768) {
                        s5 = s4;
                    } else {
                        s4 = Short.MAX_VALUE;
                        if (i2 > 32767) {
                            s5 = s4;
                        } else {
                            s5 = (short) i2;
                        }
                    }
                    if (s14 >= 16) {
                        if (s5 < 0) {
                            s16 = 0;
                        }
                    } else if (s14 <= -16) {
                        s16 = 0;
                    } else {
                        if (s14 < 0) {
                            i3 = s5 << (-s14);
                        } else {
                            i3 = s5 >> s14;
                        }
                        s16 = (short) i3;
                    }
                    sArr11[i23] = s16;
                    i23++;
                    sArr10 = sArr13;
                    i19 = i24;
                    s2 = s17;
                }
                i2 = s3 + s17;
                s4 = Short.MIN_VALUE;
                if (i2 < -32768) {
                    s5 = s4;
                } else {
                    s4 = Short.MAX_VALUE;
                    if (i2 > 32767) {
                        s5 = s4;
                    } else {
                        s5 = (short) i2;
                    }
                }
                if (s14 >= 16) {
                    if (s5 < 0) {
                        s16 = 0;
                    }
                } else if (s14 <= -16) {
                    s16 = 0;
                } else {
                    if (s14 < 0) {
                        i3 = s5 << (-s14);
                    } else {
                        i3 = s5 >> s14;
                    }
                    s16 = (short) i3;
                }
                sArr11[i23] = s16;
                i23++;
                sArr10 = sArr13;
                i19 = i24;
                s2 = s17;
            }
            short[] sArr14 = sArr10;
            int i26 = 0;
            int i27 = 0;
            while (i26 < s9) {
                sArr12[i27] = 0;
                i26++;
                i27++;
            }
            int i28 = i27 + 1;
            sArr12[i27] = sArr11[0];
            int i29 = 12;
            int i30 = 1;
            while (true) {
                sArr12[i28] = 0;
                int i31 = i28 + 2;
                sArr12[i28 + 1] = 0;
                i28 += 3;
                int i32 = i30 + 1;
                sArr12[i31] = sArr11[i30];
                i29--;
                if (i29 <= 0) {
                    break;
                }
                i30 = i32;
            }
            while (true) {
                s9++;
                if (s9 >= 4) {
                    break;
                }
                sArr12[i28] = 0;
                i28++;
            }
            short s19 = sArr4[i18];
            short s20 = sArr5[i18];
            if (s19 < 40 || s19 > 120) {
                s19 = mivVar.d;
            }
            mivVar.d = s19;
            short s21 = oiv.d[s20];
            for (int i33 = 0; i33 < 40; i33++) {
                sArr3[i33 + 120] = obb.k0(sArr12[i33] + obb.i0(s21, sArr3[(i33 - s19) + 120]));
            }
            for (int i34 = 0; i34 < 120; i34++) {
                sArr3[i34] = sArr3[i34 + 40];
            }
            for (int i35 = 0; i35 < 40; i35++) {
                sArr14[(i18 * 40) + i35] = sArr3[i35 + 120];
            }
            i18++;
            i4 = 4;
            sArr10 = sArr14;
            s7 = s13;
            s6 = s6;
            sArr9 = sArr12;
        }
        short[] sArr15 = sArr10;
        short[] sArr16 = mivVar.o;
        int i36 = mivVar.b;
        int i37 = i36 ^ 1;
        mivVar.b = i37;
        short[][] sArr17 = mivVar.c;
        short[] sArr18 = sArr17[i36];
        short[] sArr19 = sArr17[i37];
        short[] sArr20 = new short[160];
        oiv.e(sArr2, sArr18);
        oiv.b(sArr19, sArr18, sArr16);
        oiv.a(sArr16);
        oiv.g(mivVar, sArr16, 13, sArr15, sArr20, 0);
        oiv.c(sArr19, sArr18, sArr16);
        oiv.a(sArr16);
        oiv.g(mivVar, sArr16, 14, sArr15, sArr20, 13);
        oiv.d(sArr19, sArr18, sArr16);
        oiv.a(sArr16);
        oiv.g(mivVar, sArr16, 13, sArr15, sArr20, 27);
        for (int i38 = 0; i38 < 8; i38++) {
            sArr16[i38] = sArr18[i38];
        }
        oiv.a(sArr16);
        oiv.g(mivVar, sArr16, 120, sArr15, sArr20, 40);
        short sK0 = mivVar.f;
        for (int i39 = 0; i39 < 160; i39++) {
            sK0 = obb.k0(sArr20[i9] + obb.i0(sK0, (short) 28180));
            sArr20[i9] = (short) (obb.k0(sK0 + sK0) & 65528);
            i9++;
        }
        mivVar.f = sK0;
        return sArr20;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:37:0x00a9, B:39:0x00b2, B:40:0x00ba), top: B:47:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(int i, zje zjeVar, String str) throws Throwable {
        rn30 rn30Var;
        i050 i050Var;
        Throwable th;
        i050 i050Var2;
        int i2;
        sje sjeVar = this.h;
        if (zjeVar instanceof rn30) {
            rn30Var = (rn30) zjeVar;
            int i3 = rn30Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rn30Var.n = i3 - Integer.MIN_VALUE;
            } else {
                rn30Var = new rn30(this, zjeVar);
            }
        } else {
            rn30Var = new rn30(this, zjeVar);
        }
        Object obj = rn30Var.l;
        wne wneVar = wne.f39444a;
        int i4 = rn30Var.n;
        yje yjeVar = null;
        try {
            if (i4 == 0) {
                z1x.P(obj);
                if (i <= 0) {
                    return Unit.f46060a;
                }
                rn30Var.i = str;
                i050Var = this.i;
                rn30Var.j = i050Var;
                rn30Var.k = i;
                rn30Var.n = 1;
                if (i050Var.d(rn30Var) != wneVar) {
                }
                return wneVar;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var2 = rn30Var.j;
                try {
                    z1x.P(obj);
                    i2 = this.q.get();
                    if (i2 != -1) {
                        this.b.d.set((byte) i2);
                    }
                    q99 q99VarD = vtb.d(10, null, null, 6);
                    this.m = q99VarD;
                    this.n = qjj.W(sjeVar, null, null, new mt00(q99VarD, this, yjeVar, (byte) 20), 3);
                    this.j = qjj.W(sjeVar, null, null, new o3s(this.c.a(), this, q99VarD, yjeVar, (byte) 19), 3);
                    tyc tycVar = new tyc((byte) 2);
                    ah80 ah80Var = new ah80();
                    this.o = tycVar;
                    this.p = ah80Var;
                    this.k = qjj.W(sjeVar, null, null, new o3s(this, tycVar, new lie0(), yjeVar, (byte) 20), 3);
                    this.l = qjj.W(sjeVar, null, null, new ze1(tycVar, ah80Var, this, (yje) null), 3);
                    i050Var2.c(null);
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var2.c(null);
                    throw th;
                }
            }
            i = rn30Var.k;
            i050 i050Var3 = rn30Var.j;
            String str2 = rn30Var.i;
            z1x.P(obj);
            i050Var = i050Var3;
            str = str2;
            b();
            oiv oivVar = this.f;
            oivVar.getClass();
            oivVar.f25330a = new niv();
            oivVar.b = new miv();
            ukg0 ukg0Var = this.f34217a;
            ukg0Var.getClass();
            str.getClass();
            if (str.length() != 0 && i > 0) {
                ukg0Var.c.set(null);
                ukg0Var.b.set(new InetSocketAddress(str, i));
            }
            o34 o34Var = this.d;
            rn30Var.i = null;
            rn30Var.j = i050Var;
            rn30Var.k = i;
            rn30Var.n = 2;
            if (o34Var.a(rn30Var) != wneVar) {
                i050Var2 = i050Var;
                i2 = this.q.get();
                if (i2 != -1) {
                    this.b.d.set((byte) i2);
                }
                q99 q99VarD2 = vtb.d(10, null, null, 6);
                this.m = q99VarD2;
                this.n = qjj.W(sjeVar, null, null, new mt00(q99VarD2, this, yjeVar, (byte) 20), 3);
                this.j = qjj.W(sjeVar, null, null, new o3s(this.c.a(), this, q99VarD2, yjeVar, (byte) 19), 3);
                tyc tycVar2 = new tyc((byte) 2);
                ah80 ah80Var2 = new ah80();
                this.o = tycVar2;
                this.p = ah80Var2;
                this.k = qjj.W(sjeVar, null, null, new o3s(this, tycVar2, new lie0(), yjeVar, (byte) 20), 3);
                this.l = qjj.W(sjeVar, null, null, new ze1(tycVar2, ah80Var2, this, (yje) null), 3);
                i050Var2.c(null);
                return Unit.f46060a;
            }
            return wneVar;
        } catch (Throwable th3) {
            th = th3;
            i050Var2 = i050Var;
            i050Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b4 A[Catch: all -> 0x0066, TryCatch #3 {all -> 0x0066, blocks: (B:49:0x00a2, B:52:0x00b0, B:54:0x00b7, B:56:0x00c6, B:53:0x00b4, B:29:0x005e, B:31:0x0062, B:34:0x006a, B:36:0x0070, B:37:0x0073, B:39:0x0079, B:40:0x007c, B:42:0x0082, B:43:0x0085, B:45:0x008b, B:46:0x008e), top: B:76:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #3 {all -> 0x0066, blocks: (B:49:0x00a2, B:52:0x00b0, B:54:0x00b7, B:56:0x00c6, B:53:0x00b4, B:29:0x005e, B:31:0x0062, B:34:0x006a, B:36:0x0070, B:37:0x0073, B:39:0x0079, B:40:0x007c, B:42:0x0082, B:43:0x0085, B:45:0x008b, B:46:0x008e), top: B:76:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:14:0x002d, B:60:0x00d2, B:62:0x00d8, B:63:0x00dc, B:65:0x00fa), top: B:73:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        if (r2.e0(r0) == r1) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.zje r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tn30.e(a.zje):java.lang.Object");
    }
}
