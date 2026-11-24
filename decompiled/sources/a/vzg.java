package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38297a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;

    public vzg(int i, int i2, long j, long j2, String str, String str2, boolean z) {
        this.f38297a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = j2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzg)) {
            return false;
        }
        vzg vzgVar = (vzg) obj;
        return this.f38297a == vzgVar.f38297a && this.b == vzgVar.b && this.c == vzgVar.c && this.d.equals(vzgVar.d) && this.e.equals(vzgVar.e) && this.f == vzgVar.f && this.g == vzgVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + rw2.b(ua80.b(ua80.b(twn.a(this.c, twn.a(this.b, Long.hashCode(this.f38297a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f38297a, "CyberGamesOrganizationLeaderBoardModel(teamId=", ", position=");
        w6x.w(this.c, ", year=", ", name=", this.d, sbQ);
        hne.B(sbQ, ", logo=", this.e, ", earnings=");
        hne.t(this.f, ", hasStat=", sbQ, this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
