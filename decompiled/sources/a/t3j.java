package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class t3j implements z3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sba0 f33270a;
    public final long b;
    public final int c;
    public final String d;

    public t3j(sba0 sba0Var, long j, int i, String str) {
        this.f33270a = sba0Var;
        this.b = j;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3j)) {
            return false;
        }
        t3j t3jVar = (t3j) obj;
        return this.f33270a == t3jVar.f33270a && this.b == t3jVar.b && this.c == t3jVar.c && this.d.equals(t3jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, rw2.b(this.f33270a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnClickMoreInfo(playerTaskKind=");
        sb.append(this.f33270a);
        sb.append(", productId=");
        sb.append(this.b);
        w6x.w(this.c, ", progress=", ", stateOption=", this.d, sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
