package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class byr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3433a;
    public final boolean b;
    public final String c;
    public final String d;
    public final zxr0 e;
    public final ayr0 f;

    public byr0(String str, boolean z, String str2, String str3, zxr0 zxr0Var, ayr0 ayr0Var) {
        this.f3433a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = zxr0Var;
        this.f = ayr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byr0)) {
            return false;
        }
        byr0 byr0Var = (byr0) obj;
        return this.f3433a.equals(byr0Var.f3433a) && this.b == byr0Var.b && this.c.equals(byr0Var.c) && this.d.equals(byr0Var.d) && this.e.equals(byr0Var.e) && this.f == byr0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(brm0.e(this.f3433a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("TournamentBracketSwissSectionMatchUiModel(matchId=", this.f3433a, ", selected=", this.b, ", teamOneIcon=");
        f140.v(sbU, this.c, ", teamTwoIcon=", this.d, ", centerType=");
        sbU.append(this.e);
        sbU.append(", teamWinType=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
