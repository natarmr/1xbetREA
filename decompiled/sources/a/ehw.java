package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ehw implements ghw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f7828a;

    public ehw(bem bemVar) {
        this.f7828a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehw) && this.f7828a.equals(((ehw) obj).f7828a);
    }

    public final int hashCode() {
        return this.f7828a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f7828a, Separators.RPAREN);
    }
}
