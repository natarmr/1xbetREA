package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rmd extends umd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f30738a;

    public rmd(ank0 ank0Var) {
        this.f30738a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmd) && this.f30738a.equals(((rmd) obj).f30738a);
    }

    public final int hashCode() {
        return this.f30738a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("FirstTeamScoreChanged(firstTeamScore=", this.f30738a, Separators.RPAREN);
    }
}
