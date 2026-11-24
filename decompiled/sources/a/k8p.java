package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17883a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final xvs g;

    public k8p(long j, long j2, long j3, String str, String str2, long j4, xvs xvsVar) {
        xvsVar.getClass();
        this.f17883a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = j4;
        this.g = xvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8p)) {
            return false;
        }
        k8p k8pVar = (k8p) obj;
        return this.f17883a == k8pVar.f17883a && this.b == k8pVar.b && this.c == k8pVar.c && this.d.equals(k8pVar.d) && this.e.equals(k8pVar.e) && this.f == k8pVar.f && this.g == k8pVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f17883a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17883a, "FavoriteGameModel(mainConstId=", ", mainGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", sportName=");
        f140.v(sbQ, this.d, ", statId=", this.e, ", dateStart=");
        sbQ.append(this.f);
        sbQ.append(", type=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
