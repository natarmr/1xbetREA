package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ysq {
    public static final ek5 d = new ek5((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43182a;
    public final zmk0 b;
    public final zmk0 c;

    public ysq(String str, zmk0 zmk0Var, zmk0 zmk0Var2) {
        this.f43182a = str;
        this.b = zmk0Var;
        this.c = zmk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysq)) {
            return false;
        }
        ysq ysqVar = (ysq) obj;
        return this.f43182a.equals(ysqVar.f43182a) && this.b.equals(ysqVar.b) && this.c.equals(ysqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + axq.b(this.b, this.f43182a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FootballPeriodScoreUiModel(period=" + this.f43182a + ", teamOneScore=" + this.b + ", teamTwoScore=" + this.c + Separators.RPAREN;
    }
}
