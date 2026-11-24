package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qi20 implements ri20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f28769a;
    public final int b;

    public qi20(double d, int i) {
        this.f28769a = d;
        this.b = i;
    }

    @Override // a.ri20
    public final double a() {
        return this.f28769a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi20)) {
            return false;
        }
        qi20 qi20Var = (qi20) obj;
        return Double.compare(this.f28769a, qi20Var.f28769a) == 0 && this.b == qi20Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.f28769a) * 31);
    }

    public final String toString() {
        return "Initial(coefficient=" + this.f28769a + ", enCoefViewId=" + this.b + Separators.RPAREN;
    }
}
