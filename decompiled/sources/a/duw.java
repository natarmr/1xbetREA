package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class duw {
    public static final duw d = new duw(0.0d, 0.0d, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6716a;
    public final double b;
    public final double c;

    public duw(double d2, double d3, int i) {
        this.f6716a = i;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duw)) {
            return false;
        }
        duw duwVar = (duw) obj;
        return this.f6716a == duwVar.f6716a && Double.compare(this.b, duwVar.b) == 0 && Double.compare(this.c, duwVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + brm0.d(this.b, Integer.hashCode(this.f6716a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HyperBonusModel(percent=");
        sb.append(this.f6716a);
        sb.append(", min=");
        sb.append(this.b);
        return brm0.m(sb, this.c, ", max=", Separators.RPAREN);
    }
}
