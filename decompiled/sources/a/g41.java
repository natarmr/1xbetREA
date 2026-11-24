package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10639a;
    public final String b;

    public g41(String str, boolean z) {
        this.f10639a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g41)) {
            return false;
        }
        g41 g41Var = (g41) obj;
        return this.f10639a == g41Var.f10639a && this.b.equals(g41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f10639a) * 31);
    }

    public final String toString() {
        return ua80.k("AggregatorJackpotModel(shouldShow=", this.f10639a, ", amount=", this.b, Separators.RPAREN);
    }
}
