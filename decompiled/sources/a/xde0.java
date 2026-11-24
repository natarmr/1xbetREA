package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40690a;
    public final Long b;
    public final String c;
    public final String d;

    public xde0(long j, Long l, String str, String str2) {
        this.f40690a = j;
        this.b = l;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xde0)) {
            return false;
        }
        xde0 xde0Var = (xde0) obj;
        return this.f40690a == xde0Var.f40690a && this.b.equals(xde0Var.b) && this.c.equals(xde0Var.c) && this.d.equals(xde0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f40690a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendTeam(id=");
        sb.append(this.f40690a);
        sb.append(", subSportId=");
        sb.append(this.b);
        f140.v(sb, ", name=", this.c, ", image=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
