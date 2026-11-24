package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wi10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39192a;
    public final int b;
    public final long c;
    public final vi10 d;
    public final long e;
    public final double f;
    public final th10 g;

    public wi10(int i, int i2, long j, vi10 vi10Var, long j2, double d, th10 th10Var) {
        this.f39192a = i;
        this.b = i2;
        this.c = j;
        this.d = vi10Var;
        this.e = j2;
        this.f = d;
        this.g = th10Var;
    }

    public static wi10 a(wi10 wi10Var, long j, vi10 vi10Var, long j2, th10 th10Var) {
        int i = wi10Var.f39192a;
        int i2 = wi10Var.b;
        wi10Var.getClass();
        return new wi10(i, i2, j, vi10Var, j2, 0.0d, th10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi10)) {
            return false;
        }
        wi10 wi10Var = (wi10) obj;
        return this.f39192a == wi10Var.f39192a && this.b == wi10Var.b && this.c == wi10Var.c && this.d == wi10Var.d && this.e == wi10Var.e && Double.compare(this.f, wi10Var.f) == 0 && this.g.equals(wi10Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.d(this.f, rw2.b((this.d.hashCode() + rw2.b(twn.a(this.b, Integer.hashCode(this.f39192a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LoyaltyProgramUserInfoModel(level=", this.f39192a, ", experience=", ", paymentAvailableFrom=", this.b);
        sbT.append(this.c);
        sbT.append(", cashbackState=");
        sbT.append(this.d);
        kng0.A(sbT, ", updatedTime=", this.e, ", cashbackSum=");
        sbT.append(this.f);
        sbT.append(", userCurrencyModel=");
        sbT.append(this.g);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
