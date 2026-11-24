package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w7d0 implements a8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38667a;
    public final boolean b;

    public w7d0(boolean z, long j) {
        this.f38667a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7d0)) {
            return false;
        }
        w7d0 w7d0Var = (w7d0) obj;
        return this.f38667a == w7d0Var.f38667a && this.b == w7d0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f38667a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f38667a, "OnFavoriteClicked(gameId=", ", isFavorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
