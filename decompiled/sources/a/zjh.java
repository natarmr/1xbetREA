package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;

/* JADX INFO: loaded from: classes4.dex */
public final class zjh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44481a;
    public final long b;
    public final long c;
    public final mkh d;
    public final mkh e;
    public final String f;
    public final String g;
    public final CyberTournamentBracketMatchStatusModel h;
    public final String i;
    public final long j;

    public zjh(String str, long j, long j2, mkh mkhVar, mkh mkhVar2, String str2, String str3, CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel, String str4, long j3) {
        this.f44481a = str;
        this.b = j;
        this.c = j2;
        this.d = mkhVar;
        this.e = mkhVar2;
        this.f = str2;
        this.g = str3;
        this.h = cyberTournamentBracketMatchStatusModel;
        this.i = str4;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjh)) {
            return false;
        }
        zjh zjhVar = (zjh) obj;
        return this.f44481a.equals(zjhVar.f44481a) && this.b == zjhVar.b && this.c == zjhVar.c && this.d.equals(zjhVar.d) && this.e.equals(zjhVar.e) && this.f.equals(zjhVar.f) && this.g.equals(zjhVar.g) && this.h == zjhVar.h && this.i.equals(zjhVar.i) && this.j == zjhVar.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ua80.b((this.h.hashCode() + ua80.b(ua80.b((this.e.hashCode() + ((this.d.hashCode() + rw2.b(rw2.b(this.f44481a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CyberTournamentBracketMatchModel(id=", this.f44481a, ", feedConstId=");
        kng0.A(sbO, ", feedGameId=", this.c, ", team1=");
        sbO.append(this.d);
        sbO.append(", team2=");
        sbO.append(this.e);
        sbO.append(", toTeam1MatchId=");
        f140.v(sbO, this.f, ", toTeam2MatchId=", this.g, ", status=");
        sbO.append(this.h);
        sbO.append(", startedAt=");
        sbO.append(this.i);
        sbO.append(", startedAtStamp=");
        return brm0.k(this.j, Separators.RPAREN, sbO);
    }
}
