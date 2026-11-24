package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class drr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6578a;
    public final double b;
    public final int c;

    public drr0(double d, int i, int i2) {
        this.f6578a = i;
        this.b = d;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drr0)) {
            return false;
        }
        drr0 drr0Var = (drr0) obj;
        return this.f6578a == drr0Var.f6578a && Double.compare(this.b, drr0Var.b) == 0 && this.c == drr0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.d(this.b, Integer.hashCode(this.f6578a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoJackpotTiragGameOutcomeModel(outcome=");
        sb.append(this.f6578a);
        sb.append(", playerPercentage=");
        sb.append(this.b);
        return vqd.p(sb, ", bukPercentage=", this.c, Separators.RPAREN);
    }
}
