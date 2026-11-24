package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gl0 implements pl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11469a;
    public final long b;
    public final boolean c;

    public gl0(long j, boolean z, long j2) {
        this.f11469a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl0)) {
            return false;
        }
        gl0 gl0Var = (gl0) obj;
        return this.f11469a == gl0Var.f11469a && this.b == gl0Var.b && this.c == gl0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f11469a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f11469a, "OnFavoriteClick(gameId=", ", categoryId=");
        hne.t(this.b, ", isFavorite=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
