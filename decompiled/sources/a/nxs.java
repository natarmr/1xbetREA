package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nxs implements txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24297a;

    public final boolean equals(Object obj) {
        if (obj instanceof nxs) {
            return this.f24297a.equals(((nxs) obj).f24297a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24297a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f24297a, Separators.RPAREN);
    }
}
