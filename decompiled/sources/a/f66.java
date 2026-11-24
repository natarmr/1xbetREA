package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f66 implements g66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bxs0 f8995a;

    public f66(bxs0 bxs0Var) {
        this.f8995a = bxs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f66) && this.f8995a.equals(((f66) obj).f8995a);
    }

    public final int hashCode() {
        return this.f8995a.hashCode();
    }

    public final String toString() {
        return "TwoPairs(twoPairsModel=" + this.f8995a + Separators.RPAREN;
    }
}
