package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kbv0 implements lbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18033a;
    public final Integer b;
    public final long c;
    public final int d;

    public kbv0(int i, Integer num, long j, int i2) {
        this.f18033a = i;
        this.b = num;
        this.c = j;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbv0)) {
            return false;
        }
        kbv0 kbv0Var = (kbv0) obj;
        return this.f18033a == kbv0Var.f18033a && Intrinsics.d(this.b, kbv0Var.b) && this.c == kbv0Var.c && this.d == kbv0Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18033a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.d) + rw2.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMarketLongClicked(opponentId=");
        sb.append(this.f18033a);
        sb.append(", gameId=");
        sb.append(this.b);
        sb.append(", sportId=");
        ua80.v(sb, this.c, ", champId=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
