package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ves extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f37299a;

    public ves(ank0 ank0Var) {
        this.f37299a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ves) && this.f37299a.equals(((ves) obj).f37299a);
    }

    public final int hashCode() {
        return this.f37299a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("TeamTwoScoreChanged(teamTwoScore=", this.f37299a, Separators.RPAREN);
    }
}
