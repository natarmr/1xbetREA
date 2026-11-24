package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bxb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3368a;
    public final axb0 b;
    public final String c;

    public bxb0(String str, axb0 axb0Var, String str2) {
        this.f3368a = str;
        this.b = axb0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxb0)) {
            return false;
        }
        bxb0 bxb0Var = (bxb0) obj;
        return this.f3368a.equals(bxb0Var.f3368a) && this.b.equals(bxb0Var.b) && this.c.equals(bxb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3368a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrizeDistributionModel(place=");
        sb.append(this.f3368a);
        sb.append(", team=");
        sb.append(this.b);
        sb.append(", prize=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
