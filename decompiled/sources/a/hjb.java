package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hjb implements ijb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f13153a;

    public hjb(bem bemVar) {
        this.f13153a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjb) && this.f13153a.equals(((hjb) obj).f13153a);
    }

    public final int hashCode() {
        return this.f13153a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f13153a, Separators.RPAREN);
    }
}
