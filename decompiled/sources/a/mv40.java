package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22441a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;

    public mv40(r68 r68Var, int i, int i2, int i3) throws o660 {
        this.g = r68Var;
        int i4 = r68Var.b;
        this.f22441a = i4;
        int i5 = r68Var.f29923a;
        this.b = i5;
        int i6 = i / 2;
        int i7 = i2 - i6;
        this.c = i7;
        int i8 = i2 + i6;
        this.d = i8;
        int i9 = i3 - i6;
        this.f = i9;
        int i10 = i3 + i6;
        this.e = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i4 || i8 >= i5) {
            throw o660.a();
        }
    }

    public boolean a(int i, int i2, int i3, boolean z) {
        r68 r68Var = (r68) this.g;
        if (z) {
            while (i <= i2) {
                if (r68Var.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (r68Var.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public d3g0[] b() throws o660 {
        int i = this.f22441a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.f;
        int i6 = this.e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (z6) {
            boolean z7 = false;
            boolean zA = true;
            while (true) {
                if ((!zA && z2) || i4 >= i2) {
                    break;
                }
                zA = a(i5, i6, i4, false);
                if (zA) {
                    i4++;
                    z2 = true;
                    z7 = true;
                } else if (!z2) {
                    i4++;
                }
            }
            if (i4 < i2) {
                boolean zA2 = true;
                while (true) {
                    if ((!zA2 && z3) || i6 >= i) {
                        break;
                    }
                    zA2 = a(i3, i4, i6, true);
                    if (zA2) {
                        i6++;
                        z3 = true;
                        z7 = true;
                    } else if (!z3) {
                        i6++;
                    }
                }
                if (i6 < i) {
                    boolean zA3 = true;
                    while (true) {
                        if ((!zA3 && z4) || i3 < 0) {
                            break;
                        }
                        zA3 = a(i5, i6, i3, false);
                        if (zA3) {
                            i3--;
                            z4 = true;
                            z7 = true;
                        } else if (!z4) {
                            i3--;
                        }
                    }
                    if (i3 >= 0) {
                        z6 = z7;
                        boolean zA4 = true;
                        while (true) {
                            if ((!zA4 && z5) || i5 < 0) {
                                break;
                            }
                            zA4 = a(i3, i4, i5, true);
                            if (zA4) {
                                i5--;
                                z6 = true;
                                z5 = true;
                            } else if (!z5) {
                                i5--;
                            }
                        }
                        if (i5 < 0) {
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z) {
            throw o660.a();
        }
        int i7 = i4 - i3;
        d3g0 d3g0VarC = null;
        d3g0 d3g0VarC2 = null;
        for (int i8 = 1; d3g0VarC2 == null && i8 < i7; i8++) {
            d3g0VarC2 = c(i3, i6 - i8, i3 + i8, i6);
        }
        if (d3g0VarC2 == null) {
            throw o660.a();
        }
        d3g0 d3g0VarC3 = null;
        for (int i9 = 1; d3g0VarC3 == null && i9 < i7; i9++) {
            d3g0VarC3 = c(i3, i5 + i9, i3 + i9, i5);
        }
        if (d3g0VarC3 == null) {
            throw o660.a();
        }
        d3g0 d3g0VarC4 = null;
        for (int i10 = 1; d3g0VarC4 == null && i10 < i7; i10++) {
            d3g0VarC4 = c(i4, i5 + i10, i4 - i10, i5);
        }
        if (d3g0VarC4 == null) {
            throw o660.a();
        }
        for (int i11 = 1; d3g0VarC == null && i11 < i7; i11++) {
            d3g0VarC = c(i4, i6 - i11, i4 - i11, i6);
        }
        if (d3g0VarC == null) {
            throw o660.a();
        }
        float f = d3g0VarC.f5402a;
        float f2 = d3g0VarC.b;
        float f3 = d3g0VarC2.f5402a;
        float f4 = d3g0VarC2.b;
        float f5 = d3g0VarC4.f5402a;
        float f6 = d3g0VarC4.b;
        float f7 = d3g0VarC3.f5402a;
        float f8 = d3g0VarC3.b;
        return f < ((float) i2) / 2.0f ? new d3g0[]{new d3g0(f7 - 1.0f, f8 + 1.0f), new d3g0(f3 + 1.0f, f4 + 1.0f), new d3g0(f5 - 1.0f, f6 - 1.0f), new d3g0(f + 1.0f, f2 - 1.0f)} : new d3g0[]{new d3g0(f7 + 1.0f, f8 + 1.0f), new d3g0(f3 + 1.0f, f4 - 1.0f), new d3g0(f5 - 1.0f, f6 + 1.0f), new d3g0(f - 1.0f, f2 - 1.0f)};
    }

    public d3g0 c(float f, float f2, float f3, float f4) {
        int iE = q7x.E(q7x.v(f, f2, f3, f4));
        float f5 = iE;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iE; i++) {
            float f8 = i;
            int iE2 = q7x.E((f8 * f6) + f);
            int iE3 = q7x.E((f8 * f7) + f2);
            if (((r68) this.g).b(iE2, iE3)) {
                return new d3g0(iE2, iE3);
            }
        }
        return null;
    }

    public boolean d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f22441a = i2;
        this.g = saj.f[3 - i3];
        int i6 = saj.g[i5];
        this.c = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.c = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.c = i6;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    e9d0.o();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? saj.h[i4 - 1] : saj.i[i4 - 1];
            this.e = i9;
            this.b = (((i9 * 12) / i6) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? saj.j[i4 - 1] : saj.k[i4 - 1];
                this.e = i10;
                this.b = ua80.a(i10, 144, i6, i7);
            } else {
                int i11 = saj.l[i4 - 1];
                this.e = i11;
                this.b = ua80.a(i3 == 1 ? 72 : 144, i11, i6, i7);
            }
        }
        this.d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public mv40(r68 r68Var) {
        this(r68Var, 10, r68Var.f29923a / 2, r68Var.b / 2);
    }
}
