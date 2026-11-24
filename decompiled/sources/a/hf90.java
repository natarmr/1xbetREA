package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hf90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12962a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;

    public hf90(int i, int i2, int i3, int i4, String str, String str2) {
        this.f12962a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf90)) {
            return false;
        }
        hf90 hf90Var = (hf90) obj;
        return this.f12962a == hf90Var.f12962a && this.b == hf90Var.b && this.c == hf90Var.c && this.d.equals(hf90Var.d) && this.e.equals(hf90Var.e) && this.f == hf90Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b(twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f12962a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("PeriodScoresModel(period=", this.f12962a, ", scoreOpp1=", ", scoreOpp2=", this.b);
        kng0.w(this.c, ", periodName=", this.d, ", periodNameFull=", sbT);
        return brm0.j(this.f, this.e, ", winner=", Separators.RPAREN, sbT);
    }
}
