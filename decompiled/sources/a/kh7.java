package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kh7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18275a;
    public final double b;
    public final double c;

    public kh7(double d, double d2, int i) {
        this.f18275a = i;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh7)) {
            return false;
        }
        kh7 kh7Var = (kh7) obj;
        return this.f18275a == kh7Var.f18275a && Double.compare(this.b, kh7Var.b) == 0 && Double.compare(this.c, kh7Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + brm0.d(this.b, Integer.hashCode(this.f18275a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetOutcomeModel(outcome=");
        sb.append(this.f18275a);
        sb.append(", bukPercentage=");
        sb.append(this.b);
        return brm0.m(sb, this.c, ", playerPercentage=", Separators.RPAREN);
    }
}
