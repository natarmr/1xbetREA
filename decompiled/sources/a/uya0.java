package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36479a;
    public final long b;
    public final fza0 c;
    public final Integer d;

    public uya0(long j, long j2, fza0 fza0Var, Integer num) {
        this.f36479a = j;
        this.b = j2;
        this.c = fza0Var;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uya0)) {
            return false;
        }
        uya0 uya0Var = (uya0) obj;
        return this.f36479a == uya0Var.f36479a && this.b == uya0Var.b && this.c == uya0Var.c && Intrinsics.d(this.d, uya0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + rw2.b(Long.hashCode(this.f36479a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f36479a, "OnGameFavoriteClick(gameId=", ", partitionId=");
        sbQ.append(this.b);
        sbQ.append(", popularCategory=");
        sbQ.append(this.c);
        sbQ.append(", subCategoryId=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
