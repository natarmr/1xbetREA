package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23510a;
    public final List b;

    public nh1(long j, List list) {
        list.getClass();
        this.f23510a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh1)) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        return this.f23510a == nh1Var.f23510a && Intrinsics.d(this.b, nh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f23510a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f23510a, "AggregatorPromotedCategoriesModel(partitionId=", ", categoriesList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
