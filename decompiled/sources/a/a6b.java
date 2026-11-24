package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a6b implements d6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g130 f309a;

    public a6b(g130 g130Var) {
        this.f309a = g130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6b) && this.f309a.equals(((a6b) obj).f309a);
    }

    public final int hashCode() {
        return this.f309a.hashCode();
    }

    public final String toString() {
        return "Market(delegateAction=" + this.f309a + Separators.RPAREN;
    }
}
