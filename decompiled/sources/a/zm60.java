package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zm60 implements dn60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44610a;
    public final boolean b;
    public final int c;

    public zm60(int i, long j, boolean z) {
        this.f44610a = j;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm60)) {
            return false;
        }
        zm60 zm60Var = (zm60) obj;
        return this.f44610a == zm60Var.f44610a && this.b == zm60Var.b && this.c == zm60Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(Long.hashCode(this.f44610a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f44610a, "OnFavoriteGameSelected(gameId=", ", addToFavorite=", this.b), ", categoryId=", this.c, Separators.RPAREN);
    }
}
