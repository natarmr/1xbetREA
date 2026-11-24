package a;

import android.graphics.Rect;
import android.view.View;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class vu40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uu40 f38034a;
    public uu40 b;
    public uu40 c;
    public uu40 d;
    public int e;
    public int f;
    public int g;
    public qb8 h;
    public qb8 i;
    public qb8 j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public final void a() {
        this.f38034a = uu40.d;
        uu40 uu40Var = uu40.f36284a;
        this.b = uu40Var;
        this.c = uu40Var;
        this.d = uu40Var;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = -1;
        this.v = -1;
    }

    public final qb8 b() {
        qb8 qb8Var = this.i;
        return qb8Var == null ? this.j : qb8Var;
    }

    public final qb8 c() {
        qb8 qb8Var = this.h;
        return qb8Var == null ? this.j : qb8Var;
    }

    public final void d(View view, qb8 qb8Var, Rect rect, boolean z) {
        qb8Var.getClass();
        rect.getClass();
        if (this.v == -1 && this.u == -1) {
            f(view, qb8Var, rect, z);
            this.u = qb8Var.p;
            this.v = qb8Var.q;
            this.j = qb8Var;
            return;
        }
        if (qb8Var.c) {
            e(view, qb8Var, rect, z);
            int i = qb8Var.p;
            if (i == this.u) {
                i = qb8Var.q;
            }
            this.u = i;
            return;
        }
        f(view, qb8Var, rect, z);
        int i2 = qb8Var.p;
        if (i2 == this.v) {
            i2 = qb8Var.q;
        }
        this.v = i2;
    }

    public final void e(View view, qb8 qb8Var, Rect rect, boolean z) {
        int i;
        int i2;
        int i3;
        if (this.i == null && this.h != null) {
            int i4 = -this.g;
            this.o = i4;
            if (this.f38034a == uu40.b) {
                this.o = i4 >> 1;
                this.p = i4;
            }
        }
        boolean z2 = qb8Var.p == this.u;
        uu40 uu40Var = this.f38034a;
        uu40 uu40Var2 = uu40.d;
        if (uu40Var == uu40Var2) {
            this.b = uu40Var2;
            if (this.o - this.g < (-this.e) + this.m) {
                this.f38034a = uu40.b;
                int i5 = this.p;
                qb8 qb8VarB = b();
                if (qb8VarB == null || !qb8VarB.d) {
                    int i6 = this.g;
                    int i7 = this.f;
                    i3 = ((i6 - i7) >> 1) + i7;
                } else {
                    i3 = this.g;
                }
                this.p = i5 - i3;
                int i8 = this.o;
                qb8 qb8VarB2 = b();
                this.o = i8 + ((qb8VarB2 == null || !qb8VarB2.d) ? this.g >> 1 : this.f);
                e(view, qb8Var, rect, z);
                return;
            }
            if (qb8Var.d) {
                qb8Var.f(view, 0.0f, z);
                int i9 = this.o;
                int i10 = this.p;
                rect.set(i9, i10, this.f + i9, this.g + i10);
                int i11 = this.o;
                int i12 = this.f;
                int i13 = (-i11) - i12;
                if (i13 > this.k) {
                    this.k = i13;
                }
                this.o = i11 - i12;
                qb8Var.o = (byte) 5;
            } else {
                qb8Var.f(view, z2 ? 90 : SubsamplingScaleImageView.ORIENTATION_270, z);
                int i14 = this.o;
                int i15 = this.p;
                rect.set(i14, i15, this.f + i14, this.g + i15);
                int i16 = this.o;
                int i17 = -i16;
                if (i17 > this.k) {
                    this.k = i17;
                }
                this.o = i16 - this.g;
            }
        }
        uu40 uu40Var3 = this.f38034a;
        uu40 uu40Var4 = uu40.b;
        if (uu40Var3 == uu40Var4) {
            int i18 = this.t + 1;
            this.t = i18;
            if (i18 > 2 && !qb8Var.d) {
                uu40 uu40Var5 = this.b;
                uu40 uu40Var6 = uu40.f36284a;
                if (uu40Var5 == uu40Var6) {
                    uu40Var6 = uu40Var2;
                }
                this.f38034a = uu40Var6;
                this.t = 0;
                int i19 = this.o;
                if (uu40Var6 == uu40Var2) {
                    i2 = this.f;
                    this.o = i19 - i2;
                } else {
                    int i20 = this.g;
                    int i21 = this.f;
                    this.o = (i20 - i21) + i19;
                    i2 = i21;
                }
                this.p = (i2 - ((this.g - i2) >> 1)) + this.p;
                e(view, qb8Var, rect, z);
                return;
            }
            if (qb8Var.d) {
                qb8Var.f(view, 90.0f, z);
                int i22 = this.o;
                int i23 = this.p;
                rect.set(i22, i23, this.f + i22, this.g + i23);
                if (this.b == uu40.f36284a) {
                    qb8Var.o = (byte) 83;
                } else {
                    qb8Var.o = (byte) 85;
                }
                int i24 = this.p;
                int i25 = -i24;
                if (i25 > this.l) {
                    this.l = i25;
                }
                this.p = i24 - this.f;
            } else {
                qb8Var.f(view, z2 ? 180 : 0, z);
                int i26 = this.o;
                int i27 = this.p;
                rect.set(i26, i27, this.f + i26, this.g + i27);
                int i28 = this.p;
                int i29 = -i28;
                if (i29 > this.l) {
                    this.l = i29;
                }
                this.p = i28 - this.g;
                if (this.b == uu40.f36284a) {
                    qb8Var.o = (byte) 3;
                } else {
                    qb8Var.o = (byte) 5;
                }
            }
        }
        uu40 uu40Var7 = this.f38034a;
        uu40 uu40Var8 = uu40.f36284a;
        if (uu40Var7 == uu40Var8) {
            this.b = uu40Var8;
            if (this.o + this.g + this.f > this.e - this.k) {
                this.f38034a = uu40Var4;
                int i30 = this.p;
                qb8 qb8VarB3 = b();
                if (qb8VarB3 == null || !qb8VarB3.d) {
                    int i31 = this.g;
                    int i32 = this.f;
                    i = ((i31 - i32) >> 1) + i32;
                } else {
                    i = this.g;
                }
                this.p = i30 - i;
                int i33 = this.o;
                qb8 qb8VarB4 = b();
                this.o = i33 - ((qb8VarB4 == null || !qb8VarB4.d) ? this.g >> 1 : this.f);
                e(view, qb8Var, rect, z);
                return;
            }
            if (qb8Var.d) {
                qb8Var.f(view, 0.0f, z);
                int i34 = this.o;
                int i35 = this.p;
                rect.set(i34, i35, this.f + i34, this.g + i35);
                this.o += this.f;
                qb8Var.o = (byte) 3;
            } else {
                qb8Var.f(view, z2 ? SubsamplingScaleImageView.ORIENTATION_270 : 90, z);
                int i36 = this.o;
                int i37 = this.p;
                rect.set(i36, i37, this.f + i36, this.g + i37);
                this.o += this.g;
            }
        }
        this.i = qb8Var;
    }

    public final void f(View view, qb8 qb8Var, Rect rect, boolean z) {
        int i;
        int i2;
        int i3;
        qb8Var.getClass();
        rect.getClass();
        if (this.i != null && this.h == null) {
            this.q = this.g;
        }
        boolean z2 = qb8Var.q == this.v;
        uu40 uu40Var = this.c;
        uu40 uu40Var2 = uu40.f36284a;
        if (uu40Var == uu40Var2) {
            this.d = uu40Var2;
            if (this.q + this.g > this.e - this.k) {
                this.c = uu40.c;
                int i4 = this.r;
                qb8 qb8VarC = c();
                if (qb8VarC == null || !qb8VarC.d) {
                    int i5 = this.g;
                    int i6 = this.f;
                    i3 = ((i5 - i6) >> 1) + i6;
                } else {
                    i3 = this.g;
                }
                this.r = i4 + i3;
                int i7 = this.q;
                qb8 qb8VarC2 = c();
                this.q = i7 - ((qb8VarC2 == null || !qb8VarC2.d) ? this.g >> 1 : this.f);
                f(view, qb8Var, rect, z);
                return;
            }
            if (qb8Var.d) {
                qb8Var.f(view, 0.0f, z);
                int i8 = this.q;
                int i9 = this.r;
                rect.set(i8, i9, this.f + i8, this.g + i9);
                int i10 = this.q + this.f;
                if (i10 > this.m) {
                    this.m = i10;
                }
                this.q = i10;
                qb8Var.o = (byte) 3;
            } else {
                qb8Var.f(view, z2 ? 90 : SubsamplingScaleImageView.ORIENTATION_270, z);
                int i11 = this.q;
                int i12 = this.r;
                rect.set(i11, i12, this.f + i11, this.g + i12);
                int i13 = this.q + this.g;
                if (i13 > this.m) {
                    this.m = i13;
                }
                this.q = i13;
            }
        }
        uu40 uu40Var3 = this.c;
        uu40 uu40Var4 = uu40.c;
        if (uu40Var3 == uu40Var4) {
            int i14 = this.s + 1;
            this.s = i14;
            if (i14 > 2 && !qb8Var.d) {
                if (this.d == uu40Var2) {
                    uu40Var2 = uu40.d;
                }
                this.c = uu40Var2;
                this.s = 0;
                uu40 uu40Var5 = uu40.d;
                int i15 = this.q;
                if (uu40Var2 == uu40Var5) {
                    i2 = this.f;
                    this.q = i15 - i2;
                } else {
                    int i16 = this.g;
                    int i17 = this.f;
                    this.q = (i16 - i17) + i15;
                    i2 = i17;
                }
                this.r -= (this.g - i2) >> 1;
                f(view, qb8Var, rect, z);
                return;
            }
            if (qb8Var.d) {
                qb8Var.f(view, 90.0f, z);
                int i18 = this.q;
                int i19 = this.r;
                rect.set(i18, i19, this.f + i18, this.g + i19);
                if (this.d == uu40Var2) {
                    qb8Var.o = (byte) 51;
                } else {
                    qb8Var.o = (byte) 53;
                }
                int i20 = this.r + this.f;
                if (i20 > this.n) {
                    this.n = i20;
                }
                this.r = i20;
            } else {
                qb8Var.f(view, z2 ? 180 : 0, z);
                int i21 = this.q;
                int i22 = this.r;
                rect.set(i21, i22, this.f + i21, this.g + i22);
                int i23 = this.r + this.g;
                if (i23 > this.n) {
                    this.n = i23;
                }
                this.r = i23;
                if (this.d == uu40Var2) {
                    qb8Var.o = (byte) 3;
                } else {
                    qb8Var.o = (byte) 5;
                }
            }
        }
        uu40 uu40Var6 = this.c;
        uu40 uu40Var7 = uu40.d;
        if (uu40Var6 == uu40Var7) {
            this.d = uu40Var7;
            if (this.q < (-this.k)) {
                this.c = uu40Var4;
                int i24 = this.r;
                qb8 qb8VarC3 = c();
                if (qb8VarC3 == null || !qb8VarC3.d) {
                    int i25 = this.g;
                    int i26 = this.f;
                    i = ((i25 - i26) >> 1) + i26;
                } else {
                    i = this.g;
                }
                this.r = i24 + i;
                int i27 = this.q;
                qb8 qb8VarC4 = c();
                this.q = i27 + ((qb8VarC4 == null || !qb8VarC4.d) ? this.g >> 1 : this.f);
                f(view, qb8Var, rect, z);
                return;
            }
            if (qb8Var.d) {
                qb8Var.f(view, 0.0f, z);
                int i28 = this.q;
                int i29 = this.r;
                rect.set(i28, i29, this.f + i28, this.g + i29);
                this.q -= this.f;
                qb8Var.o = (byte) 5;
            } else {
                qb8Var.f(view, z2 ? SubsamplingScaleImageView.ORIENTATION_270 : 90, z);
                int i30 = this.q;
                int i31 = this.r;
                rect.set(i30, i31, this.f + i30, this.g + i31);
                this.q -= this.g;
            }
        }
        this.h = qb8Var;
    }
}
