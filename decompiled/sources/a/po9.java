package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class po9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27318a;
    public final String b;
    public final String c;
    public final boolean d;

    public po9(long j, String str, String str2, boolean z) {
        this.f27318a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po9)) {
            return false;
        }
        po9 po9Var = (po9) obj;
        return this.f27318a == po9Var.f27318a && this.b.equals(po9Var.b) && this.c.equals(po9Var.c) && this.d == po9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f27318a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27318a, "CalendarTournamentTeamModel(feedId=", ", name=", this.b);
        w6x.z(", imageS3=", this.c, ", isPartner=", sbO, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
