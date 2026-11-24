package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class twr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34666a;
    public final int b;
    public final wwr0 c;

    public twr0(int i, int i2, wwr0 wwr0Var) {
        this.f34666a = i;
        this.b = i2;
        this.c = wwr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twr0)) {
            return false;
        }
        twr0 twr0Var = (twr0) obj;
        return this.f34666a == twr0Var.f34666a && this.b == twr0Var.b && this.c.equals(twr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f34666a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("TournamentBracketLineSpec(topRow=", this.f34666a, ", heightRows=", ", type=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
