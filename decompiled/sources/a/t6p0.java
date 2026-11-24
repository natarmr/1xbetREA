package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33430a;
    public final List b;

    public t6p0(long j, List list) {
        list.getClass();
        this.f33430a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6p0)) {
            return false;
        }
        t6p0 t6p0Var = (t6p0) obj;
        return this.f33430a == t6p0Var.f33430a && Intrinsics.d(this.b, t6p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33430a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f33430a, "TeamCompletedMatchModel(sportId=", ", completedMatchesList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
