package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dzc0 f42092a;
    public final boolean b;

    public y6c0(dzc0 dzc0Var, boolean z) {
        this.f42092a = dzc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6c0)) {
            return false;
        }
        y6c0 y6c0Var = (y6c0) obj;
        return this.f42092a.equals(y6c0Var.f42092a) && this.b == y6c0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f42092a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoBetTabKeyModel(promocodeState=" + this.f42092a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
