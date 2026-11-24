package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class evp implements fvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f8482a;

    public evp(bem bemVar) {
        this.f8482a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evp) && this.f8482a.equals(((evp) obj).f8482a);
    }

    public final int hashCode() {
        return this.f8482a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f8482a, Separators.RPAREN);
    }
}
