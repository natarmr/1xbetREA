package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dk0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6210a;
    public final boolean b;

    public dk0(boolean z, long j) {
        this.f6210a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk0)) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        return this.f6210a == dk0Var.f6210a && this.b == dk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f6210a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f6210a, "RecommendedGameFavoriteClick(gameId=", ", isFavorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
