package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jbv0 implements lbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16249a;
    public final Integer b;
    public final long c;
    public final int d;

    public jbv0(int i, Integer num, long j, int i2) {
        this.f16249a = i;
        this.b = num;
        this.c = j;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbv0)) {
            return false;
        }
        jbv0 jbv0Var = (jbv0) obj;
        return this.f16249a == jbv0Var.f16249a && Intrinsics.d(this.b, jbv0Var.b) && this.c == jbv0Var.c && this.d == jbv0Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16249a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.d) + rw2.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMarketClicked(opponentId=");
        sb.append(this.f16249a);
        sb.append(", gameId=");
        sb.append(this.b);
        sb.append(", sportId=");
        ua80.v(sb, this.c, ", champId=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
