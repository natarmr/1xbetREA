package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43704a;
    public final boolean b;
    public final x4t c;

    public z350(long j, boolean z, x4t x4tVar) {
        this.f43704a = j;
        this.b = z;
        this.c = x4tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z350)) {
            return false;
        }
        z350 z350Var = (z350) obj;
        return this.f43704a == z350Var.f43704a && this.b == z350Var.b && this.c.equals(z350Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Long.hashCode(this.f43704a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f43704a, "OnFavoriteGameClick(gameId=", ", isFavorite=", this.b);
        sbR.append(", categoryType=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
