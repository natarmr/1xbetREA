package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16602a;
    public final short b;
    public final short c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    /* JADX WARN: Multi-variable type inference failed */
    public jj3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, float f2, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f16602a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = f;
        this.j = f2;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = i12;
        this.o = i13;
        this.p = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj3)) {
            return false;
        }
        jj3 jj3Var = (jj3) obj;
        return this.f16602a == jj3Var.f16602a && this.b == jj3Var.b && this.c == jj3Var.c && this.d == jj3Var.d && this.e == jj3Var.e && this.f == jj3Var.f && this.g == jj3Var.g && this.h == jj3Var.h && Float.compare(this.i, jj3Var.i) == 0 && Float.compare(this.j, jj3Var.j) == 0 && this.k == jj3Var.k && this.l == jj3Var.l && this.m == jj3Var.m && this.n == jj3Var.n && this.o == jj3Var.o && this.p == jj3Var.p;
    }

    public final int hashCode() {
        return Integer.hashCode(this.p) + twn.a(R.dimen.space_0, twn.a(R.dimen.space_0, twn.a(this.o, twn.a(R.dimen.space_0, twn.a(R.dimen.space_0, twn.a(this.n, twn.a(this.m, twn.a(this.l, twn.a(this.k, twn.a(-321, twn.a(-321, defpackage.c.a(defpackage.c.a(twn.a(-1, twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(-1, twn.a(this.e, twn.a(-1, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f16602a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), this.i, 31), this.j, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("AppStartViewParams(id=", this.f16602a, ", width=", ", height=", this.b);
        axq.r(this.c, this.d, ", topToTop=", ", topToBottom=-1, startToStart=", sbT);
        axq.r(this.e, this.f, ", startToEnd=-1, bottomToBottom=", ", bottomToTop=", sbT);
        axq.r(this.g, this.h, ", endToEnd=", ", endToStart=-1, verticalBias=", sbT);
        vqd.v(sbT, this.i, ", horizontalBias=", this.j, ", horizontalChainStyle=-321, verticalChainStyle=-321, marginLeft=");
        axq.r(this.k, this.l, ", marginTop=", ", marginRight=", sbT);
        axq.r(this.m, this.n, ", marginBottom=", ", paddingStart=", sbT);
        axq.r(R.dimen.space_0, R.dimen.space_0, ", paddingLeft=", ", paddingTop=", sbT);
        axq.r(this.o, R.dimen.space_0, ", paddingEnd=", ", paddingRight=", sbT);
        return w6x.o(R.dimen.space_0, this.p, ", paddingBottom=", Separators.RPAREN, sbT);
    }
}
