package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18327a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final String f;
    public final long g;

    public kia(long j, long j2, long j3, long j4, long j5, String str, boolean z) {
        this.f18327a = j;
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
        if (!(obj instanceof kia)) {
            return false;
        }
        kia kiaVar = (kia) obj;
        return this.f18327a == kiaVar.f18327a && this.b == kiaVar.b && this.c == kiaVar.c && this.d == kiaVar.d && this.e == kiaVar.e && this.f.equals(kiaVar.f) && this.g == kiaVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ua80.b(brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f18327a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f18327a, "CardGameClickUiModel(gameId=", ", constId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        hne.B(sbQ, ", champName=", this.f, ", champId=");
        return brm0.k(this.g, Separators.RPAREN, sbQ);
    }
}
