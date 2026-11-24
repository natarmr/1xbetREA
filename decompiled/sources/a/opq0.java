package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class opq0 implements rpq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f25656a;
    public final boolean b;

    public opq0(jkm jkmVar, boolean z) {
        this.f25656a = jkmVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opq0)) {
            return false;
        }
        opq0 opq0Var = (opq0) obj;
        return this.f25656a.equals(opq0Var.f25656a) && this.b == opq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f25656a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f25656a + ", showTimeout=" + this.b + Separators.RPAREN;
    }
}
