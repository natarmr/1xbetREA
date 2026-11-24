package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lfs extends mfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg30 f19973a;

    public lfs(hg30 hg30Var) {
        this.f19973a = hg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfs) && this.f19973a.equals(((lfs) obj).f19973a);
    }

    public final int hashCode() {
        return this.f19973a.hashCode();
    }

    public final String toString() {
        return "TimerChanged(matchTimerUiModel=" + this.f19973a + Separators.RPAREN;
    }
}
