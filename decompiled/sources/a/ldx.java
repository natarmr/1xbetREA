package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ldx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19875a;
    public final int b;
    public final double c;
    public final String d;

    public ldx(double d, int i, int i2, String str) {
        this.f19875a = i;
        this.b = i2;
        this.c = d;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldx)) {
            return false;
        }
        ldx ldxVar = (ldx) obj;
        return this.f19875a == ldxVar.f19875a && this.b == ldxVar.b && Double.compare(this.c, ldxVar.c) == 0 && this.d.equals(ldxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f19875a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("InnStatsModel(team=", this.f19875a, ", wickets=", ", over=", this.b);
        hne.w(sbT, this.c, ", overStr=", this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
