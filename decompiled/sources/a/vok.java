package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vok implements wok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f37771a;

    public vok(bem bemVar) {
        this.f37771a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vok) && this.f37771a.equals(((vok) obj).f37771a);
    }

    public final int hashCode() {
        return this.f37771a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f37771a, Separators.RPAREN);
    }
}
