package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ly5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20849a;
    public final lnm0 b;
    public final boolean c;
    public final double d;
    public final double e;
    public final esr f;
    public final long g;

    public ly5(double d, lnm0 lnm0Var, boolean z, double d2, double d3, esr esrVar, long j) {
        lnm0Var.getClass();
        this.f20849a = d;
        this.b = lnm0Var;
        this.c = z;
        this.d = d2;
        this.e = d3;
        this.f = esrVar;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly5)) {
            return false;
        }
        ly5 ly5Var = (ly5) obj;
        return Double.compare(this.f20849a, ly5Var.f20849a) == 0 && this.b == ly5Var.b && this.c == ly5Var.c && Double.compare(this.d, ly5Var.d) == 0 && Double.compare(this.e, ly5Var.e) == 0 && this.f == ly5Var.f && this.g == ly5Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ((this.f.hashCode() + brm0.d(this.e, brm0.d(this.d, brm0.e((this.b.hashCode() + (Double.hashCode(this.f20849a) * 31)) * 31, 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameFinishedCommand(winAmount=");
        sb.append(this.f20849a);
        sb.append(", statusBet=");
        sb.append(this.b);
        rz4.A(sb, ", draw=", this.c, ", newBalance=");
        sb.append(this.d);
        ohs0.A(sb, this.e, ", coefficient=", ", bonusType=");
        sb.append(this.f);
        sb.append(", accountId=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
