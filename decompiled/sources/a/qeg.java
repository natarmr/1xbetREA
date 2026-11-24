package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qeg implements reg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f28581a;

    public qeg(bem bemVar) {
        this.f28581a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qeg) && this.f28581a.equals(((qeg) obj).f28581a);
    }

    public final int hashCode() {
        return this.f28581a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f28581a, Separators.RPAREN);
    }
}
