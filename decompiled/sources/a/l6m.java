package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19513a;
    public final int b;
    public final int c;
    public final long d;

    public l6m(int i, int i2, int i3, long j) {
        this.f19513a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6m)) {
            return false;
        }
        l6m l6mVar = (l6m) obj;
        if (this.f19513a != l6mVar.f19513a || this.b != l6mVar.b || this.c != l6mVar.c) {
            return false;
        }
        long j = l6mVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f19513a) * 31, 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iA;
    }

    public final String toString() {
        return rw2.k(this.c, ", activeColor=", y3d.i(this.d), Separators.RPAREN, dw9.t("DsCyberGameHeaderVictoryIndicatorUiModel(totalCount=", this.f19513a, ", leftWinCount=", ", rightWinCount=", this.b));
    }
}
