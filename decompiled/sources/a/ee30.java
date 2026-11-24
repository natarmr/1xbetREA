package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ee30 implements fe30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7650a;
    public final int b;
    public final zg30 c;

    public ee30(int i, int i2, zg30 zg30Var) {
        this.f7650a = i;
        this.b = i2;
        this.c = zg30Var;
    }

    @Override // a.fe30
    public final zg30 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee30)) {
            return false;
        }
        ee30 ee30Var = (ee30) obj;
        return this.f7650a == ee30Var.f7650a && this.b == ee30Var.b && this.c.equals(ee30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f7650a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("WithScore(teamOneScore=", this.f7650a, ", teamTwoScore=", ", winner=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
