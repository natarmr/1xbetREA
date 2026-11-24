package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36368a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public uvv0(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f36368a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvv0)) {
            return false;
        }
        uvv0 uvv0Var = (uvv0) obj;
        return this.f36368a == uvv0Var.f36368a && this.b == uvv0Var.b && this.c == uvv0Var.c && this.d == uvv0Var.d && this.e == uvv0Var.e && this.f == uvv0Var.f && this.g == uvv0Var.g && this.h == uvv0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, brm0.e(Boolean.hashCode(this.f36368a) * 31, 31, this.b), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("XBottomSheetPinPreviousState(isArmed=", ", isPinning=", ", itemBottomCachedPx=", this.f36368a, this.b);
        axq.r(this.c, this.d, ", cachedItemCount=", ", consumedSincePx=", sbQ);
        axq.r(this.e, this.f, ", consecutiveClampCount=", ", lastDispatchConsumedPx=", sbQ);
        return w6x.o(this.g, this.h, ", lastPlainViewportHeightPx=", Separators.RPAREN, sbQ);
    }
}
