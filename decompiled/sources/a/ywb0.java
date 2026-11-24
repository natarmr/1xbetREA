package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ywb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f43364a;
    public final int b;

    public ywb0(csr csrVar, int i) {
        this.f43364a = csrVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywb0)) {
            return false;
        }
        ywb0 ywb0Var = (ywb0) obj;
        return this.f43364a.equals(ywb0Var.f43364a) && this.b == ywb0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f43364a.hashCode() * 31);
    }

    public final String toString() {
        return "Prize(bonus=" + this.f43364a + ", count=" + this.b + Separators.RPAREN;
    }
}
