package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34744a;
    public final long b;
    public final fza0 c;
    public final Integer d;

    public tya0(long j, long j2, fza0 fza0Var, Integer num) {
        this.f34744a = j;
        this.b = j2;
        this.c = fza0Var;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tya0)) {
            return false;
        }
        tya0 tya0Var = (tya0) obj;
        return this.f34744a == tya0Var.f34744a && this.b == tya0Var.b && this.c == tya0Var.c && Intrinsics.d(this.d, tya0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + rw2.b(Long.hashCode(this.f34744a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34744a, "OnGameClick(gameId=", ", partitionId=");
        sbQ.append(this.b);
        sbQ.append(", popularCategory=");
        sbQ.append(this.c);
        sbQ.append(", subCategoryId=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
