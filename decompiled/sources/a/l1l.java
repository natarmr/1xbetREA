package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19259a;

    public final boolean equals(Object obj) {
        if (obj instanceof l1l) {
            return this.f19259a.equals(((l1l) obj).f19259a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19259a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMatchClick(value=", this.f19259a, Separators.RPAREN);
    }
}
