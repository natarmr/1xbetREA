package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b5a0 implements k5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f1993a;
    public final long b;
    public final boolean c;
    public final dap d;

    public b5a0(d280 d280Var, long j, boolean z, dap dapVar) {
        dapVar.getClass();
        this.f1993a = d280Var;
        this.b = j;
        this.c = z;
        this.d = dapVar;
    }

    @Override // a.k5a0
    public final d280 a() {
        return this.f1993a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5a0)) {
            return false;
        }
        b5a0 b5a0Var = (b5a0) obj;
        return this.f1993a.equals(b5a0Var.f1993a) && this.b == b5a0Var.b && this.c == b5a0Var.c && this.d == b5a0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(rw2.b(this.f1993a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "WithFavouriteIcon(playerIcon=" + this.f1993a + ", id=" + this.b + ", isFavourite=" + this.c + ", favoriteIconPos=" + this.d + Separators.RPAREN;
    }
}
