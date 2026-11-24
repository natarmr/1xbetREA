package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ep7 implements jp7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8173a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final String f;

    public ep7(long j, long j2, long j3, String str, boolean z, boolean z2) {
        this.f8173a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = j3;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep7)) {
            return false;
        }
        ep7 ep7Var = (ep7) obj;
        return this.f8173a == ep7Var.f8173a && this.b == ep7Var.b && this.c == ep7Var.c && this.d == ep7Var.d && this.e == ep7Var.e && this.f.equals(ep7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(brm0.e(brm0.e(rw2.b(Long.hashCode(this.f8173a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8173a, "OnItemClick(gameId=", ", sportId=");
        hne.t(this.b, ", isLive=", sbQ, this.c);
        rz4.A(sbQ, ", isFinished=", this.d, ", subSportId=");
        kng0.z(sbQ, this.e, ", champName=", this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
