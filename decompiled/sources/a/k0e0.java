package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k0e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17462a;
    public final long b;
    public final String c;
    public final String d;

    public k0e0(int i, long j, String str, String str2) {
        this.f17462a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0e0)) {
            return false;
        }
        k0e0 k0e0Var = (k0e0) obj;
        return this.f17462a == k0e0Var.f17462a && this.b == k0e0Var.b && this.c.equals(k0e0Var.c) && this.d.equals(k0e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(Integer.hashCode(this.f17462a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f17462a, this.b, "RainbowStatisticMatchesTeamModel(id=", ", feedId=");
        f140.v(sbQ, ", name=", this.c, ", image=", this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
