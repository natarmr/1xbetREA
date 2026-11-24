package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rh2 implements vh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30467a;
    public final boolean b;

    public rh2(boolean z, long j) {
        this.f30467a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh2)) {
            return false;
        }
        rh2 rh2Var = (rh2) obj;
        return this.f30467a == rh2Var.f30467a && this.b == rh2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f30467a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f30467a, "OnFavoriteClick(id=", ", favorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
