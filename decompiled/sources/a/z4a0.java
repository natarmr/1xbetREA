package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z4a0 implements i5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f43761a;
    public final long b;
    public final boolean c;
    public final bap d;

    public z4a0(d280 d280Var, long j, boolean z, bap bapVar) {
        this.f43761a = d280Var;
        this.b = j;
        this.c = z;
        this.d = bapVar;
    }

    @Override // a.i5a0
    public final d280 a() {
        return this.f43761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4a0)) {
            return false;
        }
        z4a0 z4a0Var = (z4a0) obj;
        return this.f43761a.equals(z4a0Var.f43761a) && this.b == z4a0Var.b && this.c == z4a0Var.c && this.d == z4a0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(rw2.b(this.f43761a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "WithFavouriteIcon(playerIcon=" + this.f43761a + ", id=" + this.b + ", isFavourite=" + this.c + ", favoriteIconPos=" + this.d + Separators.RPAREN;
    }
}
