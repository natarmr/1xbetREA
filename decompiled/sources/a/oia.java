package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25300a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final String f;
    public final long g;

    public oia(long j, long j2, long j3, long j4, long j5, String str, boolean z) {
        this.f25300a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = str;
        this.g = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oia)) {
            return false;
        }
        oia oiaVar = (oia) obj;
        return this.f25300a == oiaVar.f25300a && this.b == oiaVar.b && this.c == oiaVar.c && this.d == oiaVar.d && this.e == oiaVar.e && this.f.equals(oiaVar.f) && this.g == oiaVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ua80.b(brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f25300a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25300a, "CardGameVideoClickUiModel(gameId=", ", constId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        hne.B(sbQ, ", champName=", this.f, ", champId=");
        return brm0.k(this.g, Separators.RPAREN, sbQ);
    }
}
