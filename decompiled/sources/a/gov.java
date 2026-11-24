package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gov implements jov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11652a;

    public final boolean equals(Object obj) {
        if (obj instanceof gov) {
            return this.f11652a.equals(((gov) obj).f11652a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11652a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstTeamWinCount(value=", this.f11652a, Separators.RPAREN);
    }
}
