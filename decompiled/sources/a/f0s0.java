package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8730a;
    public final List b;
    public final List c;

    public f0s0(long j, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f8730a = j;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0s0)) {
            return false;
        }
        f0s0 f0s0Var = (f0s0) obj;
        return this.f8730a == f0s0Var.f8730a && Intrinsics.d(this.b, f0s0Var.b) && Intrinsics.d(this.c, f0s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(Long.hashCode(this.f8730a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(cs0.p(this.f8730a, "TournamentCsFeedStatisticModel(id=", ", topPlayers=", this.b), ", mapStatistic=", this.c, Separators.RPAREN);
    }
}
