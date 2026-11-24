package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ahv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f894a;

    public final boolean equals(Object obj) {
        if (obj instanceof ahv0) {
            return this.f894a.equals(((ahv0) obj).f894a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f894a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondTeamMapsCount(value=", this.f894a, Separators.RPAREN);
    }
}
