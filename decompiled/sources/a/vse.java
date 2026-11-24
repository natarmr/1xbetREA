package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vse implements yse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37945a;
    public final pip0 b;
    public final String c;
    public final pip0 d;

    public vse(String str, pip0 pip0Var, String str2, pip0 pip0Var2) {
        this.f37945a = str;
        this.b = pip0Var;
        this.c = str2;
        this.d = pip0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vse)) {
            return false;
        }
        vse vseVar = (vse) obj;
        return this.f37945a.equals(vseVar.f37945a) && this.b == vseVar.b && this.c.equals(vseVar.c) && this.d == vseVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f37945a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "DefaultScoreUiModel(firstTeamScore=" + this.f37945a + ", firstTeamScoreState=" + this.b + ", secondTeamScore=" + this.c + ", secondTeamScoreState=" + this.d + Separators.RPAREN;
    }
}
