package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class vds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg30 f37246a;

    public vds(hg30 hg30Var) {
        this.f37246a = hg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vds) && this.f37246a.equals(((vds) obj).f37246a);
    }

    public final int hashCode() {
        return this.f37246a.hashCode();
    }

    public final String toString() {
        return "TimerChanged(matchTimerUiModel=" + this.f37246a + Separators.RPAREN;
    }
}
