package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bk0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2727a;
    public final boolean b;

    public bk0(boolean z, long j) {
        this.f2727a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return this.f2727a == bk0Var.f2727a && this.b == bk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f2727a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f2727a, "PromoGameFavoriteClick(gameId=", ", isFavorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
