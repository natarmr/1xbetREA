package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hs1 implements ss1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13558a;
    public final boolean b;
    public final bv1 c;

    public hs1(long j, boolean z, bv1 bv1Var) {
        bv1Var.getClass();
        this.f13558a = j;
        this.b = z;
        this.c = bv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs1)) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        return this.f13558a == hs1Var.f13558a && this.b == hs1Var.b && this.c == hs1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Long.hashCode(this.f13558a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f13558a, "OnFavoriteClick(gameId=", ", isFavorite=", this.b);
        sbR.append(", tab=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
