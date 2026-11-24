package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ut80 implements cu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36246a;
    public final boolean b;

    public ut80(boolean z, long j) {
        this.f36246a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut80)) {
            return false;
        }
        ut80 ut80Var = (ut80) obj;
        return this.f36246a == ut80Var.f36246a && this.b == ut80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f36246a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f36246a, "OnFavoriteClick(gameId=", ", isFavorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
