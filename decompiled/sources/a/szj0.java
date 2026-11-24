package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class szj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33073a;
    public final sip b;
    public final long c;
    public final Long d;
    public final rzj0 e;
    public final znq0 f;

    public szj0(Long l, sip sipVar, long j, Long l2, rzj0 rzj0Var, znq0 znq0Var) {
        this.f33073a = l;
        this.b = sipVar;
        this.c = j;
        this.d = l2;
        this.e = rzj0Var;
        this.f = znq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szj0)) {
            return false;
        }
        szj0 szj0Var = (szj0) obj;
        return this.f33073a.equals(szj0Var.f33073a) && this.b == szj0Var.b && this.c == szj0Var.c && Intrinsics.d(this.d, szj0Var.d) && this.e.equals(szj0Var.e) && Intrinsics.d(this.f, szj0Var.f);
    }

    public final int hashCode() {
        int iB = rw2.b((this.b.hashCode() + (this.f33073a.hashCode() * 31)) * 31, 31, this.c);
        Long l = this.d;
        int iHashCode = (this.e.hashCode() + ((iB + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        znq0 znq0Var = this.f;
        return iHashCode + (znq0Var != null ? Long.hashCode(znq0Var.f44687a) : 0);
    }

    public final String toString() {
        return "SimulationEventModel(gameId=" + this.f33073a + ", feedKind=" + this.b + ", sportId=" + this.c + ", subSportId=" + this.d + ", destination=" + this.e + ", timeStart=" + this.f + Separators.RPAREN;
    }
}
