package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rct implements tct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn60 f30256a;

    public rct(tn60 tn60Var) {
        this.f30256a = tn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rct) && this.f30256a.equals(((rct) obj).f30256a);
    }

    public final int hashCode() {
        return this.f30256a.hashCode();
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f30256a + Separators.RPAREN;
    }
}
