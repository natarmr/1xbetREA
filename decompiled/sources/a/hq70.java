package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hq70 implements pq70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13472a;

    public final boolean equals(Object obj) {
        if (obj instanceof hq70) {
            return this.f13472a.equals(((hq70) obj).f13472a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13472a.hashCode();
    }

    public final String toString() {
        return kng0.l("PermissionRequest(value=", this.f13472a, Separators.RPAREN);
    }
}
