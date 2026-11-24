package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f75 implements k75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9043a;
    public final boolean b;

    public f75(boolean z, long j) {
        this.f9043a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f75)) {
            return false;
        }
        f75 f75Var = (f75) obj;
        return this.f9043a == f75Var.f9043a && this.b == f75Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f9043a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f9043a, "OnFavoriteClicked(gameId=", ", isFavorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
