package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tmd extends umd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f34188a;

    public tmd(ank0 ank0Var) {
        this.f34188a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmd) && this.f34188a.equals(((tmd) obj).f34188a);
    }

    public final int hashCode() {
        return this.f34188a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("SecondTeamScoreChanged(secondTeamScore=", this.f34188a, Separators.RPAREN);
    }
}
