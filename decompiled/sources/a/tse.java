package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tse implements yse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34457a;
    public final String b;
    public final pip0 c;
    public final String d;
    public final String e;
    public final pip0 f;

    public tse(String str, String str2, pip0 pip0Var, String str3, String str4, pip0 pip0Var2) {
        str.getClass();
        str3.getClass();
        this.f34457a = str;
        this.b = str2;
        this.c = pip0Var;
        this.d = str3;
        this.e = str4;
        this.f = pip0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tse)) {
            return false;
        }
        tse tseVar = (tse) obj;
        return Intrinsics.d(this.f34457a, tseVar.f34457a) && this.b.equals(tseVar.b) && this.c == tseVar.c && Intrinsics.d(this.d, tseVar.d) && this.e.equals(tseVar.e) && this.f == tseVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ua80.b(this.f34457a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CricketScoreUiModel(firstTeamMainScore=", this.f34457a, ", firstTeamOversScore=", this.b, ", firstTeamScoreState=");
        sbN.append(this.c);
        sbN.append(", secondTeamMainScore=");
        sbN.append(this.d);
        sbN.append(", secondTeamOversScore=");
        sbN.append(this.e);
        sbN.append(", secondTeamScoreState=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
