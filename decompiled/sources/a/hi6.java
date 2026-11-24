package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hi6 implements ji6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13098a;
    public final long b;
    public final long c;

    public hi6(long j, long j2, ArrayList arrayList) {
        this.f13098a = arrayList;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi6)) {
            return false;
        }
        hi6 hi6Var = (hi6) obj;
        return this.f13098a.equals(hi6Var.f13098a) && this.b == hi6Var.b && this.c == hi6Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f13098a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(marketGroups=");
        sb.append(this.f13098a);
        sb.append(", selectedSubGameId=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", hiddenMarketsCount=", Separators.RPAREN);
    }
}
