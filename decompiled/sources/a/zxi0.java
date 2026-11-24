package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zxi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f45160a;
    public final boolean b;

    public zxi0(double d, boolean z) {
        this.f45160a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxi0)) {
            return false;
        }
        zxi0 zxi0Var = (zxi0) obj;
        return Double.compare(this.f45160a, zxi0Var.f45160a) == 0 && this.b == zxi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.f45160a) * 31);
    }

    public final String toString() {
        return "CheckCacheSize(cacheSize=" + this.f45160a + ", canClear=" + this.b + Separators.RPAREN;
    }
}
