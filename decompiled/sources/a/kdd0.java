package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kdd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18101a;
    public final boolean b;

    public kdd0(boolean z, long j) {
        this.f18101a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdd0)) {
            return false;
        }
        kdd0 kdd0Var = (kdd0) obj;
        return this.f18101a == kdd0Var.f18101a && this.b == kdd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f18101a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f18101a, "UfcFight(id=", ", live=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
