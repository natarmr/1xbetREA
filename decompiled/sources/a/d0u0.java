package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d0u0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1u0 f5283a;
    public final g2u0 b;
    public final g2u0 c;
    public final boolean d;
    public final String e;

    public d0u0(i1u0 i1u0Var, g2u0 g2u0Var, g2u0 g2u0Var2, boolean z, String str) {
        this.f5283a = i1u0Var;
        this.b = g2u0Var;
        this.c = g2u0Var2;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0u0)) {
            return false;
        }
        d0u0 d0u0Var = (d0u0) obj;
        return this.f5283a.equals(d0u0Var.f5283a) && this.b.equals(d0u0Var.b) && this.c.equals(d0u0Var.c) && this.d == d0u0Var.d && this.e.equals(d0u0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f5283a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValorantStatisticInfoModel(gameStatisticModel=");
        sb.append(this.f5283a);
        sb.append(", firstTeamStatisticModel=");
        sb.append(this.b);
        sb.append(", secondTeamStatisticModel=");
        sb.append(this.c);
        sb.append(", hasStatistics=");
        sb.append(this.d);
        sb.append(", mapBackground=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
