package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t5x implements x5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33390a;

    public final boolean equals(Object obj) {
        if (obj instanceof t5x) {
            return this.f33390a.equals(((t5x) obj).f33390a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33390a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchStatusText(value=", this.f33390a, Separators.RPAREN);
    }
}
