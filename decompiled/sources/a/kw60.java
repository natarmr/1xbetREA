package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18986a;
    public final boolean b;

    public kw60(boolean z, long j) {
        this.f18986a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw60)) {
            return false;
        }
        kw60 kw60Var = (kw60) obj;
        return this.f18986a == kw60Var.f18986a && this.b == kw60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f18986a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f18986a, "OnFavoriteSelected(gameId=", ", isActive=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
