package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class u6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dzc0 f35131a;
    public final boolean b;

    public u6c0(dzc0 dzc0Var, boolean z) {
        this.f35131a = dzc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6c0)) {
            return false;
        }
        u6c0 u6c0Var = (u6c0) obj;
        return this.f35131a.equals(u6c0Var.f35131a) && this.b == u6c0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35131a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoBetTabKeyModel(promocodeState=" + this.f35131a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
