package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n6e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22994a;
    public final List b;

    public n6e0(long j, List list) {
        list.getClass();
        this.f22994a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6e0)) {
            return false;
        }
        n6e0 n6e0Var = (n6e0) obj;
        return this.f22994a == n6e0Var.f22994a && Intrinsics.d(this.b, n6e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f22994a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f22994a, "RatingRowModel(id=", ", ratingValueCol=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
