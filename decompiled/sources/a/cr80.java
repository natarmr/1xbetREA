package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cr80 implements lr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4832a;
    public final boolean b;

    public cr80(boolean z, long j) {
        this.f4832a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr80)) {
            return false;
        }
        cr80 cr80Var = (cr80) obj;
        return this.f4832a == cr80Var.f4832a && this.b == cr80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f4832a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f4832a, "OnFavoriteClick(gameId=", ", isFavorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
