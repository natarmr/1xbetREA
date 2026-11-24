package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t8s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33527a;
    public final List b;

    public t8s0(long j, List list) {
        list.getClass();
        this.f33527a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8s0)) {
            return false;
        }
        t8s0 t8s0Var = (t8s0) obj;
        return this.f33527a == t8s0Var.f33527a && Intrinsics.d(this.b, t8s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33527a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f33527a, "TournamentValorantFeedStatisticModel(id=", ", mapPool=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
