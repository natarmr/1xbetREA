package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g0m implements i0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf5 f10466a;

    public g0m(uf5 uf5Var) {
        this.f10466a = uf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0m) && this.f10466a.equals(((g0m) obj).f10466a);
    }

    public final int hashCode() {
        return this.f10466a.hashCode();
    }

    public final String toString() {
        return "Badge(badgeStyle=" + this.f10466a + Separators.RPAREN;
    }
}
