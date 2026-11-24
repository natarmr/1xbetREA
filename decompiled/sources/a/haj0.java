package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class haj0 implements taj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12727a;
    public final boolean b;

    public haj0(double d, boolean z) {
        this.f12727a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haj0)) {
            return false;
        }
        haj0 haj0Var = (haj0) obj;
        return Double.compare(this.f12727a, haj0Var.f12727a) == 0 && this.b == haj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.f12727a) * 31);
    }

    public final String toString() {
        return "CheckCacheSize(cacheSize=" + this.f12727a + ", canClear=" + this.b + Separators.RPAREN;
    }
}
