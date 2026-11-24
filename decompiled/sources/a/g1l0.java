package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g1l0 implements i1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f10519a;
    public final mdm b;

    public g1l0(pzu pzuVar, mdm mdmVar) {
        this.f10519a = pzuVar;
        this.b = mdmVar;
    }

    @Override // a.i1l0
    public final pzu e() {
        return this.f10519a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1l0) {
            g1l0 g1l0Var = (g1l0) obj;
            if (this.f10519a == g1l0Var.f10519a && this.b.equals(g1l0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10519a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(strings=" + this.f10519a + ", emptyConfig=" + this.b + Separators.RPAREN;
    }
}
