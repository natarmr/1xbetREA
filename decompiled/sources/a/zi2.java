package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zi2 implements dj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44420a;
    public final boolean b;

    public zi2(boolean z, long j) {
        this.f44420a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi2)) {
            return false;
        }
        zi2 zi2Var = (zi2) obj;
        return this.f44420a == zi2Var.f44420a && this.b == zi2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f44420a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f44420a, "OnFavoriteClick(id=", ", favorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
