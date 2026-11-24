package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pz4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27827a;
    public final double b;

    public pz4(double d, boolean z) {
        this.f27827a = z;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz4)) {
            return false;
        }
        pz4 pz4Var = (pz4) obj;
        return this.f27827a == pz4Var.f27827a && Double.compare(this.b, pz4Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Boolean.hashCode(this.f27827a) * 31);
    }

    public final String toString() {
        return "AutoMaxModel(isAutoMaxEnabled=" + this.f27827a + ", autoMaxValue=" + this.b + Separators.RPAREN;
    }
}
