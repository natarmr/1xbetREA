package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bhx implements ehx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g130 f2630a;

    public bhx(g130 g130Var) {
        this.f2630a = g130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhx) && this.f2630a.equals(((bhx) obj).f2630a);
    }

    public final int hashCode() {
        return this.f2630a.hashCode();
    }

    public final String toString() {
        return "Market(delegateAction=" + this.f2630a + Separators.RPAREN;
    }
}
