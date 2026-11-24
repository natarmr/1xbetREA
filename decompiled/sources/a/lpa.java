package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class lpa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f20430a;

    public lpa(ank0 ank0Var) {
        this.f20430a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpa) && this.f20430a.equals(((lpa) obj).f20430a);
    }

    public final int hashCode() {
        return this.f20430a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("ScoreChanged(score=", this.f20430a, Separators.RPAREN);
    }
}
