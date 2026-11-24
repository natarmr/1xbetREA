package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12860a;
    public final boolean b;
    public final xvs c;
    public final long d;

    public hd90(long j, boolean z, xvs xvsVar, long j2) {
        xvsVar.getClass();
        this.f12860a = j;
        this.b = z;
        this.c = xvsVar;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd90)) {
            return false;
        }
        hd90 hd90Var = (hd90) obj;
        return this.f12860a == hd90Var.f12860a && this.b == hd90Var.b && this.c == hd90Var.c && this.d == hd90Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + brm0.e(Long.hashCode(this.f12860a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f12860a, "PendingGameModel(id=", ", adding=", this.b);
        sbR.append(", gameType=");
        sbR.append(this.c);
        sbR.append(", lockTimestamp=");
        return brm0.k(this.d, Separators.RPAREN, sbR);
    }
}
