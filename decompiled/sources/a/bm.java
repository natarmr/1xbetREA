package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2815a;
    public final String b;
    public final String c;

    public bm(long j, String str, String str2) {
        this.f2815a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return this.f2815a == bmVar.f2815a && this.b.equals(bmVar.b) && this.c.equals(bmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f2815a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f2815a, "ActiveTeamModel(feedId=", ", teamName=", this.b), ", teamImage=", this.c, Separators.RPAREN);
    }
}
