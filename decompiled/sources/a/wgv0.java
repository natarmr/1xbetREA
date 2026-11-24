package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wgv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39135a;

    public final boolean equals(Object obj) {
        if (obj instanceof wgv0) {
            return this.f39135a.equals(((wgv0) obj).f39135a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39135a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstTeamMapsCount(value=", this.f39135a, Separators.RPAREN);
    }
}
