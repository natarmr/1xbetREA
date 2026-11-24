package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29605a;
    public final long b;
    public final boolean c;

    public r01(long j, boolean z, long j2) {
        this.f29605a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01)) {
            return false;
        }
        r01 r01Var = (r01) obj;
        return this.f29605a == r01Var.f29605a && this.b == r01Var.b && this.c == r01Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f29605a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29605a, "OnCategoryFavoriteClick(gameId=", ", categoryId=");
        hne.t(this.b, ", favorite=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
