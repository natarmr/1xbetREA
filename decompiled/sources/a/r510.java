package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r510 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29863a;
    public final long b;
    public final String c;
    public final String d;

    public r510(int i, long j, String str, String str2) {
        this.f29863a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r510)) {
            return false;
        }
        r510 r510Var = (r510) obj;
        return this.f29863a == r510Var.f29863a && this.b == r510Var.b && this.c.equals(r510Var.c) && this.d.equals(r510Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(Integer.hashCode(this.f29863a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f29863a, this.b, "LolStatisticMatchesTeamModel(id=", ", feedId=");
        f140.v(sbQ, ", name=", this.c, ", image=", this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
