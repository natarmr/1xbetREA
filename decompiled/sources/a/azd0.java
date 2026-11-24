package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class azd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1712a;
    public final String b;
    public final int c;
    public final String d;

    public azd0(int i, String str, int i2, String str2) {
        this.f1712a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azd0)) {
            return false;
        }
        azd0 azd0Var = (azd0) obj;
        return this.f1712a == azd0Var.f1712a && this.b.equals(azd0Var.b) && this.c == azd0Var.c && this.d.equals(azd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Integer.hashCode(this.f1712a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", image=", this.d, Separators.RPAREN, vqd.r(this.f1712a, "RainbowStatisticMatchesComparisonTeamBannedOperatorModel(id=", ", name=", this.b, ", count="));
    }
}
