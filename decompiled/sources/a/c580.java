package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ubv0 f3759a;

    public c580(ubv0 ubv0Var) {
        this.f3759a = ubv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c580) && this.f3759a.equals(((c580) obj).f3759a);
    }

    public final int hashCode() {
        return this.f3759a.hashCode();
    }

    public final String toString() {
        return "SendWhoWinGameCardSideEffect(internalEffect=" + this.f3759a + Separators.RPAREN;
    }
}
