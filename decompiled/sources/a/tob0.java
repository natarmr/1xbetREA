package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34276a;
    public final double b;
    public final double c;

    public tob0(double d, double d2, int i) {
        this.f34276a = i;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tob0)) {
            return false;
        }
        tob0 tob0Var = (tob0) obj;
        return this.f34276a == tob0Var.f34276a && Double.compare(this.b, tob0Var.b) == 0 && Double.compare(this.c, tob0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + brm0.d(this.b, Integer.hashCode(this.f34276a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerBetParamsModel(type=");
        sb.append(this.f34276a);
        sb.append(", param=");
        sb.append(this.b);
        return brm0.m(sb, this.c, ", sum=", Separators.RPAREN);
    }
}
