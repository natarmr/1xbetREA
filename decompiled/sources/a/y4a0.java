package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y4a0 implements h5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f41992a;
    public final long b;
    public final boolean c;
    public final aap d;

    public y4a0(d280 d280Var, long j, boolean z, aap aapVar) {
        this.f41992a = d280Var;
        this.b = j;
        this.c = z;
        this.d = aapVar;
    }

    @Override // a.h5a0
    public final d280 a() {
        return this.f41992a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4a0)) {
            return false;
        }
        y4a0 y4a0Var = (y4a0) obj;
        return this.f41992a.equals(y4a0Var.f41992a) && this.b == y4a0Var.b && this.c == y4a0Var.c && this.d == y4a0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(rw2.b(this.f41992a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "WithFavouriteIcon(playerIcon=" + this.f41992a + ", id=" + this.b + ", isFavourite=" + this.c + ", favoriteIconPos=" + this.d + Separators.RPAREN;
    }
}
