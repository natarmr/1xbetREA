package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11543a;
    public final String b;
    public final String c;
    public final boolean d;

    public gmh(long j, String str, String str2, boolean z) {
        this.f11543a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmh)) {
            return false;
        }
        gmh gmhVar = (gmh) obj;
        return this.f11543a == gmhVar.f11543a && this.b.equals(gmhVar.b) && this.c.equals(gmhVar.c) && this.d == gmhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f11543a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f11543a, "CyberTournamentBracketTeamModel(feedId=", ", name=", this.b);
        w6x.z(", imageS3=", this.c, ", isPartner=", sbO, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
