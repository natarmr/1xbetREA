package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34237a;
    public final d270 b;
    public final String c;

    public tnj(long j, d270 d270Var, String str) {
        this.f34237a = j;
        this.b = d270Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnj)) {
            return false;
        }
        tnj tnjVar = (tnj) obj;
        return this.f34237a == tnjVar.f34237a && this.b == tnjVar.b && this.c.equals(tnjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + brm0.e(Long.hashCode(this.f34237a) * 31, 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesPromoGroup(id=");
        sb.append(this.f34237a);
        sb.append(", hasBackStack=false, type=");
        sb.append(this.b);
        return rw2.o(sb, ", fromScreen=", this.c, Separators.RPAREN);
    }
}
