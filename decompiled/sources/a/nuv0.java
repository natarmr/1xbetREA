package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nuv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24164a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public nuv0(int i, int i2, int i3, int i4, int i5) {
        this.f24164a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuv0)) {
            return false;
        }
        nuv0 nuv0Var = (nuv0) obj;
        return this.f24164a == nuv0Var.f24164a && this.b == nuv0Var.b && this.c == nuv0Var.c && this.d == nuv0Var.d && this.e == nuv0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f24164a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("XBottomSheetInsets(screenHeightPx=", this.f24164a, ", statusBarPx=", ", windowBottomGapPx=", this.b);
        axq.r(this.c, this.d, ", sheetNavBarPx=", ", featureBottomReservePx=", sbT);
        return rz4.j(this.e, Separators.RPAREN, sbT);
    }
}
