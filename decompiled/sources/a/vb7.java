package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vb7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37127a;
    public final long b;
    public final long c;

    public vb7(int i, long j, long j2) {
        this.f37127a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb7)) {
            return false;
        }
        vb7 vb7Var = (vb7) obj;
        return this.f37127a == vb7Var.f37127a && this.b == vb7Var.b && this.c == vb7Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Integer.hashCode(this.f37127a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(vqd.q(this.f37127a, this.b, "BetInfoSaleModel(coefTypeId=", ", userBonusId="), this.c, ", dateFrom=", Separators.RPAREN);
    }
}
