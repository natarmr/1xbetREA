package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ifs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg30 f14703a;

    public ifs(hg30 hg30Var) {
        this.f14703a = hg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifs) && this.f14703a.equals(((ifs) obj).f14703a);
    }

    public final int hashCode() {
        return this.f14703a.hashCode();
    }

    public final String toString() {
        return "TimerChanged(matchTimerUiModel=" + this.f14703a + Separators.RPAREN;
    }
}
