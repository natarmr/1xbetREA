package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dhw implements fhw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f6112a;

    public dhw(bem bemVar) {
        this.f6112a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhw) && this.f6112a.equals(((dhw) obj).f6112a);
    }

    public final int hashCode() {
        return this.f6112a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f6112a, Separators.RPAREN);
    }
}
