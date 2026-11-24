package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jy20 implements ny20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g130 f17339a;

    public jy20(g130 g130Var) {
        this.f17339a = g130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy20) && this.f17339a.equals(((jy20) obj).f17339a);
    }

    public final int hashCode() {
        return this.f17339a.hashCode();
    }

    public final String toString() {
        return "Market(delegateAction=" + this.f17339a + Separators.RPAREN;
    }
}
