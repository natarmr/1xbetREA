package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class reh0 implements xeh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f30335a;

    public reh0(bem bemVar) {
        this.f30335a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof reh0) && this.f30335a.equals(((reh0) obj).f30335a);
    }

    public final int hashCode() {
        return this.f30335a.hashCode();
    }

    public final String toString() {
        return twn.n("DsGameCardAction(action=", this.f30335a, Separators.RPAREN);
    }
}
