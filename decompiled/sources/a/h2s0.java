package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12351a;
    public final List b;
    public final List c;

    public h2s0(long j, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f12351a = j;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2s0)) {
            return false;
        }
        h2s0 h2s0Var = (h2s0) obj;
        return this.f12351a == h2s0Var.f12351a && Intrinsics.d(this.b, h2s0Var.b) && Intrinsics.d(this.c, h2s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(Long.hashCode(this.f12351a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(cs0.p(this.f12351a, "TournamentLolFeedStatisticModel(id=", ", players=", this.b), ", heroes=", this.c, Separators.RPAREN);
    }
}
