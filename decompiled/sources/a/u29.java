package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u29 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34934a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;

    public u29(int i, long j, long j2, String str, String str2) {
        this.f34934a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u29)) {
            return false;
        }
        u29 u29Var = (u29) obj;
        return this.f34934a == u29Var.f34934a && this.b == u29Var.b && this.c == u29Var.c && this.d.equals(u29Var.d) && this.e.equals(u29Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, rw2.b(Long.hashCode(this.f34934a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34934a, "BreakdownModel(date=", ", dropDate=");
        ua80.v(sbQ, this.b, ", points=", this.c);
        f140.v(sbQ, ", round=", this.d, ", tournamentTitle=", this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
