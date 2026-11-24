package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9213a;
    public final String b;
    public final String c;
    public final long d;

    public fal(long j, long j2, String str, String str2) {
        this.f9213a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fal)) {
            return false;
        }
        fal falVar = (fal) obj;
        return this.f9213a == falVar.f9213a && this.b.equals(falVar.b) && this.c.equals(falVar.c) && this.d == falVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f9213a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f9213a, "DotaTeamsLeaderBoardModel(feedId=", ", image=", this.b);
        hne.B(sbO, ", name=", this.c, ", points=");
        return brm0.k(this.d, Separators.RPAREN, sbO);
    }
}
