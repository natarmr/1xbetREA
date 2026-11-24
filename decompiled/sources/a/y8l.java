package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42201a;

    public final boolean equals(Object obj) {
        if (obj instanceof y8l) {
            return this.f42201a.equals(((y8l) obj).f42201a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42201a.hashCode();
    }

    public final String toString() {
        return kng0.l("RadiantTeamIcon(value=", this.f42201a, Separators.RPAREN);
    }
}
