package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9i0 f14440a;

    public iai0(g9i0 g9i0Var) {
        g9i0Var.getClass();
        this.f14440a = g9i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iai0) && this.f14440a == ((iai0) obj).f14440a;
    }

    public final int hashCode() {
        return this.f14440a.hashCode();
    }

    public final String toString() {
        return "Chosen(limitTypeValue=" + this.f14440a + Separators.RPAREN;
    }
}
