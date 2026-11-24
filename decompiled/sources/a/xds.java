package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xds extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f40710a;

    public xds(ank0 ank0Var) {
        this.f40710a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xds) && this.f40710a.equals(((xds) obj).f40710a);
    }

    public final int hashCode() {
        return this.f40710a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchPeriodChanged(matchPeriodInfo=", this.f40710a, Separators.RPAREN);
    }
}
