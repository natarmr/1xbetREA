package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2871a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public bn9(int i, long j, String str, String str2, boolean z) {
        this.f2871a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn9)) {
            return false;
        }
        bn9 bn9Var = (bn9) obj;
        return this.f2871a == bn9Var.f2871a && this.b.equals(bn9Var.b) && this.c.equals(bn9Var.c) && this.d == bn9Var.d && this.e == bn9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f2871a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f2871a, "CalendarTournamentMatchTeamModel(feedId=", ", name=", this.b);
        axq.s(this.d, ", imageS3=", this.c, ", score=", sbO);
        return f140.n(sbO, ", isWinner=", this.e, Separators.RPAREN);
    }
}
