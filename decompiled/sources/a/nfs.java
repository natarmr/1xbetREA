package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg30 f23451a;

    public nfs(hg30 hg30Var) {
        this.f23451a = hg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfs) && this.f23451a.equals(((nfs) obj).f23451a);
    }

    public final int hashCode() {
        return this.f23451a.hashCode();
    }

    public final String toString() {
        return "TimerChanged(matchTimerUiModel=" + this.f23451a + Separators.RPAREN;
    }
}
