package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ym6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42872a;
    public final double b;
    public final String c;
    public final String d;
    public final boolean e;

    public ym6(long j, double d, String str, String str2, boolean z) {
        this.f42872a = j;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym6)) {
            return false;
        }
        ym6 ym6Var = (ym6) obj;
        return this.f42872a == ym6Var.f42872a && Double.compare(this.b, ym6Var.b) == 0 && this.c.equals(ym6Var.c) && this.d.equals(ym6Var.d) && this.e == ym6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(brm0.d(this.b, Long.hashCode(this.f42872a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f42872a, "BetChoiceButtonUiModel(betId=", ", param=");
        hne.w(sbQ, this.b, ", title=", this.c);
        w6x.z(", extra=", this.d, ", isSelected=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
