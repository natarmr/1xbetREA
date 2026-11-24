package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cf90 implements wpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4250a;
    public final zmk0 b;
    public final zmk0 c;

    public cf90(String str, zmk0 zmk0Var, zmk0 zmk0Var2) {
        this.f4250a = str;
        this.b = zmk0Var;
        this.c = zmk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf90)) {
            return false;
        }
        cf90 cf90Var = (cf90) obj;
        return this.f4250a.equals(cf90Var.f4250a) && this.b.equals(cf90Var.b) && this.c.equals(cf90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + axq.b(this.b, this.f4250a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PeriodScoreUiModel(period=" + this.f4250a + ", teamOneScore=" + this.b + ", teamTwoScore=" + this.c + Separators.RPAREN;
    }
}
