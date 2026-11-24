package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5049a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final bsv0 g;

    public cvv0(int i, int i2, int i3, int i4, int i5, int i6, bsv0 bsv0Var) {
        bsv0Var.getClass();
        this.f5049a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = bsv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvv0)) {
            return false;
        }
        cvv0 cvv0Var = (cvv0) obj;
        return this.f5049a == cvv0Var.f5049a && this.b == cvv0Var.b && this.c == cvv0Var.c && this.d == cvv0Var.d && this.e == cvv0Var.e && this.f == cvv0Var.f && Intrinsics.d(this.g, cvv0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f5049a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("XBottomSheetMetrics(hostHeightPx=", this.f5049a, ", statusBarPx=", ", windowBottomGapPx=", this.b);
        axq.r(this.c, this.d, ", sheetNavBarPx=", ", featureBottomReservePx=", sbT);
        axq.r(this.e, this.f, ", contentHeightPx=", ", anchors=", sbT);
        sbT.append(this.g);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
