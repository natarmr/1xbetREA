package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vyo0 implements wyo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f38258a;

    public vyo0(bem bemVar) {
        this.f38258a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyo0) && this.f38258a.equals(((vyo0) obj).f38258a);
    }

    public final int hashCode() {
        return this.f38258a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f38258a, Separators.RPAREN);
    }
}
