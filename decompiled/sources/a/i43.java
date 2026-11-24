package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14126a;
    public final int b;
    public final pu90 c;
    public final pu90 d;
    public final pu90 e;
    public final pu90 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final k6z o;

    public i43(int i, int i2, pu90 pu90Var, pu90 pu90Var2, pu90 pu90Var3, pu90 pu90Var4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, k6z k6zVar) {
        k6zVar.getClass();
        this.f14126a = i;
        this.b = i2;
        this.c = pu90Var;
        this.d = pu90Var2;
        this.e = pu90Var3;
        this.f = pu90Var4;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = k6zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i43)) {
            return false;
        }
        i43 i43Var = (i43) obj;
        return this.f14126a == i43Var.f14126a && this.b == i43Var.b && Intrinsics.d(this.c, i43Var.c) && Intrinsics.d(this.d, i43Var.d) && Intrinsics.d(this.e, i43Var.e) && Intrinsics.d(this.f, i43Var.f) && this.g == i43Var.g && this.h == i43Var.h && this.i == i43Var.i && this.j == i43Var.j && this.k == i43Var.k && this.l == i43Var.l && this.m == i43Var.m && this.n == i43Var.n && this.o == i43Var.o;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f14126a) * 31, 31);
        pu90 pu90Var = this.c;
        int iHashCode = (iA + (pu90Var == null ? 0 : pu90Var.hashCode())) * 31;
        pu90 pu90Var2 = this.d;
        int iHashCode2 = (iHashCode + (pu90Var2 == null ? 0 : pu90Var2.hashCode())) * 31;
        pu90 pu90Var3 = this.e;
        int iHashCode3 = (iHashCode2 + (pu90Var3 == null ? 0 : pu90Var3.hashCode())) * 31;
        pu90 pu90Var4 = this.f;
        return this.o.hashCode() + twn.a(this.n, twn.a(this.m, twn.a(this.l, twn.a(this.k, twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, (iHashCode3 + (pu90Var4 != null ? pu90Var4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("AnimatedCoefficientLayoutParams(parentWidthPx=", this.f14126a, ", parentHeightPx=", ", curCoefPlaceable=", this.b);
        sbT.append(this.c);
        sbT.append(", oldCoefPlaceable=");
        sbT.append(this.d);
        sbT.append(", arrowIconPlaceable=");
        sbT.append(this.e);
        sbT.append(", blockedIconPlaceable=");
        sbT.append(this.f);
        sbT.append(", curCoefWidth=");
        axq.r(this.g, this.h, ", oldCoefWidth=", ", arrowIconWidth=", sbT);
        axq.r(this.i, this.j, ", blockedIconWidth=", ", curCoefHeight=", sbT);
        axq.r(this.k, this.l, ", oldCoefHeight=", ", arrowIconHeight=", sbT);
        axq.r(this.m, this.n, ", blockedIconHeight=", ", layoutDirection=", sbT);
        sbT.append(this.o);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
