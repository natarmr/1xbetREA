package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xou0 implements you0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f41239a;

    public xou0(bem bemVar) {
        this.f41239a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xou0) && this.f41239a.equals(((xou0) obj).f41239a);
    }

    public final int hashCode() {
        return this.f41239a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f41239a, Separators.RPAREN);
    }
}
