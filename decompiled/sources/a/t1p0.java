package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33178a;
    public final long b;
    public final List c;
    public final c1p0 d;
    public final s0p0 e;
    public final List f;

    public t1p0(long j, long j2, List list, c1p0 c1p0Var, s0p0 s0p0Var, List list2) {
        list.getClass();
        list2.getClass();
        this.f33178a = j;
        this.b = j2;
        this.c = list;
        this.d = c1p0Var;
        this.e = s0p0Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1p0)) {
            return false;
        }
        t1p0 t1p0Var = (t1p0) obj;
        return this.f33178a == t1p0Var.f33178a && this.b == t1p0Var.b && Intrinsics.d(this.c, t1p0Var.c) && this.d.equals(t1p0Var.d) && this.e.equals(t1p0Var.e) && Intrinsics.d(this.f, t1p0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + dw9.a(rw2.b(Long.hashCode(this.f33178a) * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f33178a, "TeamBetStatisticModel(sportId=", ", subSportId=");
        hne.x(sbQ, this.b, ", teams=", this.c);
        sbQ.append(", overall=");
        sbQ.append(this.d);
        sbQ.append(", indicators=");
        sbQ.append(this.e);
        return ohs0.s(sbQ, ", lastGames=", this.f, Separators.RPAREN);
    }
}
