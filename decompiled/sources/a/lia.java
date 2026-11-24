package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20093a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public lia(long j, boolean z, long j2, long j3, long j4, long j5, boolean z2, boolean z3) {
        this.f20093a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lia)) {
            return false;
        }
        lia liaVar = (lia) obj;
        return this.f20093a == liaVar.f20093a && this.b == liaVar.b && this.c == liaVar.c && this.d == liaVar.d && this.e == liaVar.e && this.f == liaVar.f && this.g == liaVar.g && this.h == liaVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(rw2.b(rw2.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f20093a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f20093a, "CardGameFavoriteClickUiModel(sportId=", ", canSubscribe=", this.b);
        kng0.A(sbR, ", subSportId=", this.c, ", gameId=");
        sbR.append(this.d);
        kng0.A(sbR, ", mainId=", this.e, ", constId=");
        hne.t(this.f, ", live=", sbR, this.g);
        return f140.n(sbR, ", postEntrance=", this.h, Separators.RPAREN);
    }
}
