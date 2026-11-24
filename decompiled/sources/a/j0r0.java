package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f15695a;
    public final List b;

    public j0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f15695a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0r0)) {
            return false;
        }
        j0r0 j0r0Var = (j0r0) obj;
        return Intrinsics.d(this.f15695a, j0r0Var.f15695a) && Intrinsics.d(this.b, j0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15695a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorRecommendedGames(status=" + this.f15695a + ", value=" + this.b + Separators.RPAREN;
    }
}
