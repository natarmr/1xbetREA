package a;

import android.gov.nist.javax.sip.parser.TokenTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class fgk {
    public static final int[] g = {3808, 476, TokenTypes.REASON, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r68 f9496a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public fgk(r68 r68Var) {
        this.f9496a = r68Var;
    }

    public static d3g0[] b(d3g0[] d3g0VarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        d3g0 d3g0Var = d3g0VarArr[0];
        float f2 = d3g0Var.f5402a;
        d3g0 d3g0Var2 = d3g0VarArr[2];
        float f3 = d3g0Var2.f5402a;
        float f4 = f2 - f3;
        float f5 = d3g0Var.b;
        float f6 = d3g0Var2.b;
        float f7 = f5 - f6;
        float f8 = (f2 + f3) / 2.0f;
        float f9 = (f5 + f6) / 2.0f;
        float f10 = f4 * f;
        float f11 = f7 * f;
        d3g0 d3g0Var3 = new d3g0(f8 + f10, f9 + f11);
        d3g0 d3g0Var4 = new d3g0(f8 - f10, f9 - f11);
        d3g0 d3g0Var5 = d3g0VarArr[1];
        float f12 = d3g0Var5.f5402a;
        d3g0 d3g0Var6 = d3g0VarArr[3];
        float f13 = d3g0Var6.f5402a;
        float f14 = f12 - f13;
        float f15 = d3g0Var5.b;
        float f16 = d3g0Var6.b;
        float f17 = f15 - f16;
        float f18 = (f12 + f13) / 2.0f;
        float f19 = (f15 + f16) / 2.0f;
        float f20 = f14 * f;
        float f21 = f * f17;
        return new d3g0[]{d3g0Var3, new d3g0(f18 + f20, f19 + f21), d3g0Var4, new d3g0(f18 - f20, f19 - f21)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final db5 a(boolean z) throws o660 {
        d3g0 d3g0VarC;
        d3g0 d3g0Var;
        d3g0 d3g0Var2;
        d3g0 d3g0Var3;
        d3g0 d3g0VarC2;
        d3g0 d3g0VarC3;
        d3g0 d3g0Var4;
        d3g0 d3g0Var5;
        eld0 eld0Var;
        boolean z2;
        eld0 eld0Var2;
        eld0 eld0Var3;
        eld0 eld0Var4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        r68 r68Var = this.f9496a;
        int i9 = -1;
        int i10 = 1;
        try {
            d3g0[] d3g0VarArrB = new mv40(r68Var).b();
            d3g0Var2 = d3g0VarArrB[0];
            d3g0Var3 = d3g0VarArrB[1];
            d3g0Var = d3g0VarArrB[2];
            d3g0VarC = d3g0VarArrB[3];
        } catch (o660 unused) {
            int i11 = r68Var.f29923a / 2;
            int i12 = r68Var.b / 2;
            int i13 = i11 + 7;
            int i14 = i12 - 7;
            d3g0 d3g0VarC4 = e(new eld0(i13, i14, (byte) 3), false, 1, -1).c();
            int i15 = i12 + 7;
            d3g0 d3g0VarC5 = e(new eld0(i13, i15, (byte) 3), false, 1, 1).c();
            int i16 = i11 - 7;
            d3g0 d3g0VarC6 = e(new eld0(i16, i15, (byte) 3), false, -1, 1).c();
            d3g0VarC = e(new eld0(i16, i14, (byte) 3), false, -1, -1).c();
            d3g0Var = d3g0VarC6;
            d3g0Var2 = d3g0VarC4;
            d3g0Var3 = d3g0VarC5;
        }
        int iE = q7x.E((((d3g0Var2.f5402a + d3g0VarC.f5402a) + d3g0Var3.f5402a) + d3g0Var.f5402a) / 4.0f);
        int iE2 = q7x.E((((d3g0Var2.b + d3g0VarC.b) + d3g0Var3.b) + d3g0Var.b) / 4.0f);
        char c = 15;
        try {
            d3g0[] d3g0VarArrB2 = new mv40(r68Var, 15, iE, iE2).b();
            d3g0Var5 = d3g0VarArrB2[0];
            d3g0Var4 = d3g0VarArrB2[1];
            d3g0VarC2 = d3g0VarArrB2[2];
            d3g0VarC3 = d3g0VarArrB2[3];
            while (true) {
                i = eld0Var4.c;
                i2 = eld0Var4.b;
                char c2 = c;
                i3 = eld0Var.c;
                i4 = eld0Var.b;
                if (this.e >= 9) {
                    i5 = i10;
                    break;
                }
                eld0 eld0VarE = e(eld0Var, z2, i10, i9);
                int i17 = eld0VarE.c;
                int i18 = eld0VarE.b;
                eld0 eld0VarE2 = e(eld0Var2, z2, i10, i10);
                eld0 eld0VarE3 = e(eld0Var3, z2, i9, i10);
                eld0 eld0VarE4 = e(eld0Var4, z2, i9, i9);
                int i19 = eld0VarE4.c;
                i5 = i10;
                int i20 = eld0VarE4.b;
                boolean z3 = z2;
                if (this.e > 2) {
                    double dW = (q7x.w(i20, i19, i18, i17) * this.e) / (q7x.w(i2, i, i4, i3) * (this.e + 2));
                    if (dW < 0.75d || dW > 1.25d) {
                        break;
                    }
                    eld0 eld0Var5 = new eld0(Math.max(0, i18 - 3), Math.min(r68Var.b - 1, i17 + 3), (byte) 3);
                    eld0 eld0Var6 = new eld0(Math.max(0, eld0VarE2.b - 3), Math.max(0, eld0VarE2.c - 3), (byte) 3);
                    eld0 eld0Var7 = new eld0(Math.min(r68Var.f29923a - 1, eld0VarE3.b + 3), Math.max(0, Math.min(r68Var.b - 1, eld0VarE3.c - 3)), (byte) 3);
                    eld0 eld0Var8 = new eld0(Math.min(r68Var.f29923a - 1, i20 + 3), Math.min(r68Var.b - 1, i19 + 3), (byte) 3);
                    int iC = c(eld0Var8, eld0Var5);
                    if (iC == 0 || c(eld0Var5, eld0Var6) != iC || c(eld0Var6, eld0Var7) != iC || c(eld0Var7, eld0Var8) != iC) {
                        break;
                    }
                }
                z2 = !z3;
                this.e++;
                eld0Var3 = eld0VarE3;
                c = c2;
                eld0Var = eld0VarE;
                i10 = i5;
                eld0Var4 = eld0VarE4;
                eld0Var2 = eld0VarE2;
                i9 = -1;
            }
        } catch (o660 unused2) {
            int i21 = iE + 7;
            int i22 = iE2 - 7;
            d3g0 d3g0VarC7 = e(new eld0(i21, i22, (byte) 3), false, 1, -1).c();
            int i23 = iE2 + 7;
            d3g0 d3g0VarC8 = e(new eld0(i21, i23, (byte) 3), false, 1, 1).c();
            int i24 = iE - 7;
            d3g0VarC2 = e(new eld0(i24, i23, (byte) 3), false, -1, 1).c();
            d3g0VarC3 = e(new eld0(i24, i22, (byte) 3), false, -1, -1).c();
            d3g0Var4 = d3g0VarC8;
            d3g0Var5 = d3g0VarC7;
        }
        eld0Var = new eld0(q7x.E((((d3g0Var5.f5402a + d3g0VarC3.f5402a) + d3g0Var4.f5402a) + d3g0VarC2.f5402a) / 4.0f), q7x.E((((d3g0Var5.b + d3g0VarC3.b) + d3g0Var4.b) + d3g0VarC2.b) / 4.0f), (byte) 3);
        this.e = 1;
        z2 = true;
        eld0Var2 = eld0Var;
        eld0Var3 = eld0Var2;
        eld0Var4 = eld0Var3;
        int i25 = this.e;
        if (i25 != 5 && i25 != 7) {
            throw o660.a();
        }
        this.b = i25 == 5 ? i5 : 0;
        int i26 = i25 * 2;
        d3g0[] d3g0VarArrB3 = b(new d3g0[]{new d3g0(i4 + 0.5f, i3 - 0.5f), new d3g0(eld0Var2.b + 0.5f, eld0Var2.c + 0.5f), new d3g0(eld0Var3.b - 0.5f, eld0Var3.c + 0.5f), new d3g0(i2 - 0.5f, i - 0.5f)}, i26 - 3, i26);
        if (z) {
            d3g0 d3g0Var6 = d3g0VarArrB3[0];
            d3g0VarArrB3[0] = d3g0VarArrB3[2];
            d3g0VarArrB3[2] = d3g0Var6;
        }
        if (!g(d3g0VarArrB3[0]) || !g(d3g0VarArrB3[i5]) || !g(d3g0VarArrB3[2]) || !g(d3g0VarArrB3[3])) {
            throw o660.a();
        }
        int i27 = this.e * 2;
        int[] iArr = {h(d3g0VarArrB3[0], d3g0VarArrB3[i5], i27), h(d3g0VarArrB3[i5], d3g0VarArrB3[2], i27), h(d3g0VarArrB3[2], d3g0VarArrB3[3], i27), h(d3g0VarArrB3[3], d3g0VarArrB3[0], i27)};
        int i28 = 0;
        for (int i29 = 0; i29 < 4; i29++) {
            int i30 = iArr[i29];
            i28 = (i28 << 3) + ((i30 >> (i27 - 2)) << 1) + (i30 & 1);
        }
        int i31 = ((i28 & 1) << 11) + (i28 >> 1);
        for (int i32 = 0; i32 < 4; i32++) {
            if (Integer.bitCount(g[i32] ^ i31) <= 2) {
                this.f = i32;
                long j2 = 0;
                int i33 = 0;
                while (true) {
                    i6 = 10;
                    if (i33 >= 4) {
                        break;
                    }
                    int i34 = iArr[(this.f + i33) % 4];
                    if (this.b) {
                        j = j2 << 7;
                        i8 = (i34 >> 1) & 127;
                    } else {
                        j = j2 << 10;
                        i8 = ((i34 >> 2) & 992) + ((i34 >> 1) & 31);
                    }
                    j2 = j + ((long) i8);
                    i33++;
                }
                if (this.b) {
                    i6 = 7;
                    i7 = 2;
                } else {
                    i7 = 4;
                }
                int i35 = i6 - i7;
                int[] iArr2 = new int[i6];
                for (int i36 = i6 - 1; i36 >= 0; i36--) {
                    iArr2[i36] = ((int) j2) & 15;
                    j2 >>= 4;
                }
                try {
                    int iF = new yox(wjt.k).f(iArr2, i35);
                    int i37 = 0;
                    for (int i38 = 0; i38 < i7; i38++) {
                        i37 = (i37 << 4) + iArr2[i38];
                    }
                    if (this.b) {
                        this.c = (i37 >> 6) + 1;
                        this.d = (i37 & 63) + 1;
                    } else {
                        this.c = (i37 >> 11) + 1;
                        this.d = (i37 & 2047) + 1;
                    }
                    int i39 = this.f;
                    d3g0 d3g0Var7 = d3g0VarArrB3[i39 % 4];
                    d3g0 d3g0Var8 = d3g0VarArrB3[(i39 + 1) % 4];
                    d3g0 d3g0Var9 = d3g0VarArrB3[(i39 + 2) % 4];
                    d3g0 d3g0Var10 = d3g0VarArrB3[(i39 + 3) % 4];
                    int iD = d();
                    float f = iD / 2.0f;
                    float f2 = this.e;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    return new db5(ebc.j0(r68Var, iD, iD, zk90.a(f3, f3, f4, f3, f4, f4, f3, f4, d3g0Var7.f5402a, d3g0Var7.b, d3g0Var8.f5402a, d3g0Var8.b, d3g0Var9.f5402a, d3g0Var9.b, d3g0Var10.f5402a, d3g0Var10.b)), b(d3g0VarArrB3, this.e * 2, d()), this.b, this.d, this.c, iF);
                } catch (eie0 unused3) {
                    throw o660.a();
                }
            }
        }
        throw o660.a();
    }

    public final int c(eld0 eld0Var, eld0 eld0Var2) {
        int i = eld0Var.b;
        int i2 = eld0Var.c;
        int i3 = eld0Var2.b;
        int i4 = eld0Var2.c;
        float fW = q7x.w(i, i2, i3, i4);
        if (fW != 0.0f) {
            float f = (i3 - i) / fW;
            float f2 = (i4 - i2) / fW;
            float f3 = i;
            float f4 = i2;
            r68 r68Var = this.f9496a;
            boolean zB = r68Var.b(i, i2);
            int iFloor = (int) Math.floor(fW);
            int i5 = 0;
            for (int i6 = 0; i6 < iFloor; i6++) {
                if (r68Var.b(q7x.E(f3), q7x.E(f4)) != zB) {
                    i5++;
                }
                f3 += f;
                f4 += f2;
            }
            float f5 = i5 / fW;
            if (f5 <= 0.1f || f5 >= 0.9f) {
                return (f5 <= 0.1f) == zB ? 1 : -1;
            }
        }
        return 0;
    }

    public final int d() {
        boolean z = this.b;
        int i = this.c;
        if (z) {
            return (i * 4) + 11;
        }
        return ((((i * 2) + 6) / 15) * 2) + (i * 4) + 15;
    }

    public final eld0 e(eld0 eld0Var, boolean z, int i, int i2) {
        r68 r68Var;
        int i3 = eld0Var.b + i;
        int i4 = eld0Var.c;
        while (true) {
            i4 += i2;
            boolean zF = f(i3, i4);
            r68Var = this.f9496a;
            if (!zF || r68Var.b(i3, i4) != z) {
                break;
            }
            i3 += i;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        while (f(i5, i6) && r68Var.b(i5, i6) == z) {
            i5 += i;
        }
        int i7 = i5 - i;
        while (f(i7, i6) && r68Var.b(i7, i6) == z) {
            i6 += i2;
        }
        return new eld0(i7, i6 - i2, (byte) 3);
    }

    public final boolean f(int i, int i2) {
        if (i < 0) {
            return false;
        }
        r68 r68Var = this.f9496a;
        return i < r68Var.f29923a && i2 >= 0 && i2 < r68Var.b;
    }

    public final boolean g(d3g0 d3g0Var) {
        return f(q7x.E(d3g0Var.f5402a), q7x.E(d3g0Var.b));
    }

    public final int h(d3g0 d3g0Var, d3g0 d3g0Var2, int i) {
        float f = d3g0Var.f5402a;
        float f2 = d3g0Var.b;
        float f3 = d3g0Var2.f5402a;
        float f4 = d3g0Var2.b;
        float fV = q7x.v(f, f2, f3, f4);
        float f5 = fV / i;
        float f6 = d3g0Var.f5402a;
        float f7 = ((d3g0Var2.f5402a - f6) * f5) / fV;
        float f8 = ((f4 - f2) * f5) / fV;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f9 = i3;
            if (this.f9496a.b(q7x.E((f9 * f7) + f6), q7x.E((f9 * f8) + f2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
