package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg30 f23402a;

    public nes(hg30 hg30Var) {
        this.f23402a = hg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nes) && this.f23402a.equals(((nes) obj).f23402a);
    }

    public final int hashCode() {
        return this.f23402a.hashCode();
    }

    public final String toString() {
        return "TimerChanged(matchTimerUiModel=" + this.f23402a + Separators.RPAREN;
    }
}
