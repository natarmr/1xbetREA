package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rhi0 f33862a;
    public final boolean b;

    public tff0(rhi0 rhi0Var, boolean z) {
        this.f33862a = rhi0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tff0)) {
            return false;
        }
        tff0 tff0Var = (tff0) obj;
        return this.f33862a == tff0Var.f33862a && this.b == tff0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + brm0.e(this.f33862a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "ConfigCacheKey(serverEndpointType=" + this.f33862a + ", demoMode=false, testSectionOverrideConfigEnable=" + this.b + Separators.RPAREN;
    }
}
