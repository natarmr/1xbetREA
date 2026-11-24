package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pes extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f26868a;

    public pes(ank0 ank0Var) {
        this.f26868a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pes) && this.f26868a.equals(((pes) obj).f26868a);
    }

    public final int hashCode() {
        return this.f26868a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchPeriodChanged(matchPeriodInfo=", this.f26868a, Separators.RPAREN);
    }
}
