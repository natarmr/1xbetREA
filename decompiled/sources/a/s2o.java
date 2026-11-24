package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s2o implements u2o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f31511a;

    public s2o(bem bemVar) {
        this.f31511a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2o) && this.f31511a.equals(((s2o) obj).f31511a);
    }

    public final int hashCode() {
        return this.f31511a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f31511a, Separators.RPAREN);
    }
}
