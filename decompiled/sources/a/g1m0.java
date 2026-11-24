package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g1m0 implements j1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1m0 f10520a;
    public final a1m0 b;

    public g1m0(a1m0 a1m0Var, a1m0 a1m0Var2) {
        this.f10520a = a1m0Var;
        this.b = a1m0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1m0)) {
            return false;
        }
        g1m0 g1m0Var = (g1m0) obj;
        return this.f10520a.equals(g1m0Var.f10520a) && this.b.equals(g1m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10520a.hashCode() * 31);
    }

    public final String toString() {
        return "Double(upper=" + this.f10520a + ", lower=" + this.b + Separators.RPAREN;
    }
}
