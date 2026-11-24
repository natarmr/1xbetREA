package a;

import androidx.collection.MutableIntList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t5u0 implements o5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableIntList f33387a;
    public final ey40 b;
    public final int c;
    public final ghn d;
    public int[] e = m5u0.f21235a;
    public float[] f;
    public t73 g;
    public t73 h;
    public t73 i;
    public t73 j;
    public float[] k;
    public float[] l;
    public wsf0 m;

    public t5u0(MutableIntList mutableIntList, ey40 ey40Var, int i, ghn ghnVar) {
        this.f33387a = mutableIntList;
        this.b = ey40Var;
        this.c = i;
        this.d = ghnVar;
        float[] fArr = m5u0.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = m5u0.c;
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        t73 t73Var4;
        t73 t73Var5;
        t73 t73Var6 = t73Var;
        long j2 = j / 1000000;
        int[] iArr = m5u0.f21235a;
        int i = this.c;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        ey40 ey40Var = this.b;
        s5u0 s5u0Var = (s5u0) ey40Var.b(i2);
        if (s5u0Var != null) {
            return s5u0Var.f31673a;
        }
        if (i2 >= i) {
            return t73Var2;
        }
        if (i2 <= 0) {
            return t73Var6;
        }
        j(t73Var6, t73Var2, t73Var3);
        t73 t73Var7 = this.g;
        t73Var7.getClass();
        int i3 = 0;
        if (this.m != m5u0.c) {
            float fI = i(d(i2), i2, false);
            float[] fArr = this.k;
            dw3[][] dw3VarArr = (dw3[][]) this.m.b;
            int length = dw3VarArr.length - 1;
            float f = dw3VarArr[0][0].f6776a;
            float f2 = dw3VarArr[length][0].b;
            int length2 = fArr.length;
            if (fI < f || fI > f2) {
                if (fI > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fI - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    dw3 dw3Var = dw3VarArr[length][i5];
                    boolean z = dw3Var.p;
                    float f4 = dw3Var.r;
                    float f5 = dw3Var.q;
                    if (z) {
                        float f6 = dw3Var.f6776a;
                        float f7 = dw3Var.k;
                        float f8 = dw3Var.c;
                        fArr[i4] = (f5 * f3) + rw2.a(dw3Var.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = dw3Var.d;
                        fArr[i4 + 1] = (f4 * f3) + rw2.a(dw3Var.f, f10, f9, f10);
                    } else {
                        dw3Var.c(f);
                        fArr[i4] = (dw3Var.a() * f3) + (dw3Var.n * dw3Var.h) + f5;
                        fArr[i4 + 1] = (dw3Var.b() * f3) + (dw3Var.o * dw3Var.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    dw3VarArr = dw3VarArr;
                }
            } else {
                int length3 = dw3VarArr.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        dw3 dw3Var2 = dw3VarArr[i6][i8];
                        if (fI <= dw3Var2.b) {
                            if (dw3Var2.p) {
                                float f11 = dw3Var2.f6776a;
                                float f12 = dw3Var2.k;
                                float f13 = dw3Var2.c;
                                fArr[i7] = rw2.a(dw3Var2.e, f13, (fI - f11) * f12, f13);
                                float f14 = dw3Var2.d;
                                fArr[i7 + 1] = rw2.a(dw3Var2.f, f14, (fI - f11) * f12, f14);
                            } else {
                                dw3Var2.c(fI);
                                fArr[i7] = (dw3Var2.n * dw3Var2.h) + dw3Var2.q;
                                fArr[i7 + 1] = (dw3Var2.o * dw3Var2.i) + dw3Var2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                t73Var7.e(fArr[i9], i9);
            }
        } else {
            int iD = d(i2);
            float fI2 = i(iD, i2, true);
            MutableIntList mutableIntList = this.f33387a;
            s5u0 s5u0Var2 = (s5u0) ey40Var.b(mutableIntList.c(iD));
            if (s5u0Var2 != null && (t73Var5 = s5u0Var2.f31673a) != null) {
                t73Var6 = t73Var5;
            }
            s5u0 s5u0Var3 = (s5u0) ey40Var.b(mutableIntList.c(iD + 1));
            if (s5u0Var3 == null || (t73Var4 = s5u0Var3.f31673a) == null) {
                t73Var4 = t73Var2;
            }
            int iB = t73Var7.b();
            for (int i10 = 0; i10 < iB; i10++) {
                t73Var7.e((t73Var4.a(i10) * fI2) + ((1.0f - fI2) * t73Var6.a(i10)), i10);
            }
        }
        return t73Var7;
    }

    public final int d(int i) {
        int i2;
        MutableIntList mutableIntList = this.f33387a;
        int i3 = mutableIntList.b;
        int i4 = 0;
        if (i3 < 0) {
            v4i0.m(f140.j(i3, "fromIndex (0) and toIndex (", i3, ") must be in range 0.."));
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = mutableIntList.f45342a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    @Override // a.o5u0
    public final int e() {
        return 0;
    }

    @Override // a.o5u0
    public final int f() {
        return this.c;
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        long j2 = j / 1000000;
        int[] iArr = m5u0.f21235a;
        long j3 = this.c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return t73Var3;
        }
        j(t73Var, t73Var2, t73Var3);
        t73 t73Var4 = this.h;
        t73Var4.getClass();
        int i = 0;
        if (this.m != m5u0.c) {
            int i2 = (int) j4;
            float fI = i(d(i2), i2, false);
            float[] fArr = this.l;
            dw3[][] dw3VarArr = (dw3[][]) this.m.b;
            float f = dw3VarArr[0][0].f6776a;
            float f2 = dw3VarArr[dw3VarArr.length - 1][0].b;
            if (fI < f) {
                fI = f;
            }
            if (fI <= f2) {
                f2 = fI;
            }
            int length = fArr.length;
            boolean z = false;
            for (dw3[] dw3VarArr2 : dw3VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    dw3 dw3Var = dw3VarArr2[i4];
                    if (f2 <= dw3Var.b) {
                        if (dw3Var.p) {
                            fArr[i3] = dw3Var.q;
                            fArr[i3 + 1] = dw3Var.r;
                        } else {
                            dw3Var.c(f2);
                            fArr[i3] = dw3Var.a();
                            fArr[i3 + 1] = dw3Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                t73Var4.e(fArr[i], i);
                i++;
            }
        } else {
            t73 t73VarC = c((j4 - 1) * 1000000, t73Var, t73Var2, t73Var3);
            t73 t73VarC2 = c(j4 * 1000000, t73Var, t73Var2, t73Var3);
            int iB = t73VarC.b();
            while (i < iB) {
                t73Var4.e((t73VarC.a(i) - t73VarC2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return t73Var4;
    }

    public final float i(int i, int i2, boolean z) {
        ghn ghnVar;
        float f;
        MutableIntList mutableIntList = this.f33387a;
        if (i >= mutableIntList.b - 1) {
            f = i2;
        } else {
            int iC = mutableIntList.c(i);
            int iC2 = mutableIntList.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                s5u0 s5u0Var = (s5u0) this.b.b(iC);
                if (s5u0Var == null || (ghnVar = s5u0Var.b) == null) {
                    ghnVar = this.d;
                }
                float f2 = i3;
                float fA = ghnVar.a((i2 - iC) / f2);
                return z ? fA : ((f2 * fA) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void j(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        float[] fArr;
        boolean z = this.m != m5u0.c;
        t73 t73Var4 = this.g;
        ey40 ey40Var = this.b;
        MutableIntList mutableIntList = this.f33387a;
        if (t73Var4 == null) {
            this.g = t73Var.c();
            this.h = t73Var3.c();
            int i = mutableIntList.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = mutableIntList.c(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = mutableIntList.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != m5u0.c && Intrinsics.d(this.i, t73Var) && Intrinsics.d(this.j, t73Var2)) {
                return;
            }
            this.i = t73Var;
            this.j = t73Var2;
            int iB = t73Var.b() + (t73Var.b() % 2);
            this.k = new float[iB];
            this.l = new float[iB];
            int i5 = mutableIntList.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = mutableIntList.c(i6);
                s5u0 s5u0Var = (s5u0) ey40Var.b(iC);
                if (iC == 0 && s5u0Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = t73Var.a(i7);
                    }
                } else if (iC == this.c && s5u0Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = t73Var2.a(i8);
                    }
                } else {
                    s5u0Var.getClass();
                    t73 t73Var5 = s5u0Var.f31673a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = t73Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new wsf0(this.e, this.f, fArr3);
        }
    }
}
