package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd5 f17439a;
    public final q4f b;
    public final long c;
    public final int d;

    public k00(jd5 jd5Var, q4f q4fVar, long j, int i) {
        q4fVar.getClass();
        this.f17439a = jd5Var;
        this.b = q4fVar;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return this.f17439a.equals(k00Var.f17439a) && this.b == k00Var.b && this.c == k00Var.c && this.d == k00Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rw2.b(vqd.b(this.b, Integer.hashCode(this.f17439a.f16314a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalTopKeyModel(backgroundStateModel=");
        sb.append(this.f17439a);
        sb.append(", couponTypeModel=");
        sb.append(this.b);
        sb.append(", eventsCount=");
        ua80.v(sb, this.c, ", blocksCount=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
