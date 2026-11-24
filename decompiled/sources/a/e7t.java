package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7343a;
    public final double b;
    public final int c;

    public e7t(double d, double d2, int i) {
        this.f7343a = d;
        this.b = d2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7t)) {
            return false;
        }
        e7t e7tVar = (e7t) obj;
        return Double.compare(this.f7343a, e7tVar.f7343a) == 0 && Double.compare(this.b, e7tVar.b) == 0 && this.c == e7tVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.d(this.b, Double.hashCode(this.f7343a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f7343a, "GamesManiaCellInfoModel(currentWinSumm=", ", winCoef=");
        rz4.w(sbP, this.b, ", cellType=", this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
