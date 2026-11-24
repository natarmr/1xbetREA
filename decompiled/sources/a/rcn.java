package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rcn implements tcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g130 f30247a;

    public rcn(g130 g130Var) {
        this.f30247a = g130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcn) && this.f30247a.equals(((rcn) obj).f30247a);
    }

    public final int hashCode() {
        return this.f30247a.hashCode();
    }

    public final String toString() {
        return "Market(delegateAction=" + this.f30247a + Separators.RPAREN;
    }
}
