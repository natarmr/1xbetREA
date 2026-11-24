package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a5a0 implements j5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f262a;
    public final long b;
    public final boolean c;
    public final cap d;

    public a5a0(d280 d280Var, long j, boolean z, cap capVar) {
        this.f262a = d280Var;
        this.b = j;
        this.c = z;
        this.d = capVar;
    }

    @Override // a.j5a0
    public final d280 a() {
        return this.f262a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5a0)) {
            return false;
        }
        a5a0 a5a0Var = (a5a0) obj;
        return this.f262a.equals(a5a0Var.f262a) && this.b == a5a0Var.b && this.c == a5a0Var.c && this.d == a5a0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(rw2.b(this.f262a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "WithFavouriteIcon(playerIcon=" + this.f262a + ", id=" + this.b + ", isFavourite=" + this.c + ", favoriteIconPos=" + this.d + Separators.RPAREN;
    }
}
