package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qf8 implements uf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d270 f28618a;
    public final boolean b;
    public final String c;

    public qf8(d270 d270Var, boolean z, String str) {
        this.f28618a = d270Var;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf8)) {
            return false;
        }
        qf8 qf8Var = (qf8) obj;
        return this.f28618a == qf8Var.f28618a && this.b == qf8Var.b && this.c.equals(qf8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f28618a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CraftingBonus(oneXGamesPromoType=");
        sb.append(this.f28618a);
        sb.append(", underMaintenance=");
        sb.append(this.b);
        sb.append(", imagePath=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
