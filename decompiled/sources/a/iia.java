package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14819a;
    public final long b;
    public final u8d c;
    public final boolean d;
    public final long e;
    public final long f;

    public iia(long j, long j2, u8d u8dVar, boolean z, long j3, long j4) {
        this.f14819a = j;
        this.b = j2;
        this.c = u8dVar;
        this.d = z;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iia)) {
            return false;
        }
        iia iiaVar = (iia) obj;
        return this.f14819a == iiaVar.f14819a && this.b == iiaVar.b && this.c.equals(iiaVar.c) && this.d == iiaVar.d && this.e == iiaVar.e && this.f == iiaVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b(brm0.e((this.c.hashCode() + rw2.b(Long.hashCode(this.f14819a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f14819a, "CardGameBetClickUiModel(gameId=", ", champId=");
        sbQ.append(this.b);
        sbQ.append(", bet=");
        sbQ.append(this.c);
        rz4.A(sbQ, ", live=", this.d, ", sportId=");
        sbQ.append(this.e);
        return rw2.n(sbQ, this.f, ", subSportId=", Separators.RPAREN);
    }
}
