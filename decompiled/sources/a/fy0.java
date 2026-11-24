package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fy0 implements jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10337a;
    public final long b;
    public final boolean c;

    public fy0(long j, boolean z, long j2) {
        this.f10337a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy0)) {
            return false;
        }
        fy0 fy0Var = (fy0) obj;
        return this.f10337a == fy0Var.f10337a && this.b == fy0Var.b && this.c == fy0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f10337a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f10337a, "OnFavoriteClick(gameId=", ", categoryId=");
        hne.t(this.b, ", isFavorite=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
