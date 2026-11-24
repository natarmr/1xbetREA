package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10612a;
    public final String b;
    public final pip0 c;
    public final String d;
    public final pip0 e;

    public g3h0(String str, String str2, pip0 pip0Var, String str3, pip0 pip0Var2) {
        this.f10612a = str;
        this.b = str2;
        this.c = pip0Var;
        this.d = str3;
        this.e = pip0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3h0)) {
            return false;
        }
        g3h0 g3h0Var = (g3h0) obj;
        return this.f10612a.equals(g3h0Var.f10612a) && this.b.equals(g3h0Var.b) && this.c == g3h0Var.c && this.d.equals(g3h0Var.d) && this.e == g3h0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + ua80.b(this.f10612a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ScoreCellsColumnUiModel(title=", this.f10612a, ", firstTeamScore=", this.b, ", firstTeamScoreState=");
        sbN.append(this.c);
        sbN.append(", secondTeamScore=");
        sbN.append(this.d);
        sbN.append(", secondTeamScoreState=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
