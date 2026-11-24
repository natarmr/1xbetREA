package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.championships.universal.domain.model.calendar_tournament.CalendarTournamentMatchStatusModel;

/* JADX INFO: loaded from: classes4.dex */
public final class xm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41113a;
    public final long b;
    public final long c;
    public final bn9 d;
    public final bn9 e;
    public final String f;
    public final String g;
    public final CalendarTournamentMatchStatusModel h;
    public final String i;
    public final long j;

    public xm9(String str, long j, long j2, bn9 bn9Var, bn9 bn9Var2, String str2, String str3, CalendarTournamentMatchStatusModel calendarTournamentMatchStatusModel, String str4, long j3) {
        this.f41113a = str;
        this.b = j;
        this.c = j2;
        this.d = bn9Var;
        this.e = bn9Var2;
        this.f = str2;
        this.g = str3;
        this.h = calendarTournamentMatchStatusModel;
        this.i = str4;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm9)) {
            return false;
        }
        xm9 xm9Var = (xm9) obj;
        return this.f41113a.equals(xm9Var.f41113a) && this.b == xm9Var.b && this.c == xm9Var.c && this.d.equals(xm9Var.d) && this.e.equals(xm9Var.e) && this.f.equals(xm9Var.f) && this.g.equals(xm9Var.g) && this.h == xm9Var.h && this.i.equals(xm9Var.i) && this.j == xm9Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ua80.b((this.h.hashCode() + ua80.b(ua80.b((this.e.hashCode() + ((this.d.hashCode() + rw2.b(rw2.b(this.f41113a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CalendarTournamentMatchModel(id=", this.f41113a, ", feedConstId=");
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
