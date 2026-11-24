package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ijk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14879a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ijk0(boolean z, int i) {
        this.f14879a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijk0)) {
            return false;
        }
        ijk0 ijk0Var = (ijk0) obj;
        return this.f14879a == ijk0Var.f14879a && this.b == ijk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f14879a) * 31);
    }

    public final String toString() {
        return "SocialState(hasAdded=" + this.f14879a + ", social=" + ((int) this.b) + Separators.RPAREN;
    }
}
