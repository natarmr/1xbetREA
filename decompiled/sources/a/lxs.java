package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lxs implements txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20831a;

    public final boolean equals(Object obj) {
        if (obj instanceof lxs) {
            return this.f20831a.equals(((lxs) obj).f20831a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20831a.hashCode();
    }

    public final String toString() {
        return kng0.l("AccessForbidden(message=", this.f20831a, Separators.RPAREN);
    }
}
