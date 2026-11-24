package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jhs implements khs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f16543a;

    public jhs(bem bemVar) {
        this.f16543a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhs) && this.f16543a.equals(((jhs) obj).f16543a);
    }

    public final int hashCode() {
        return this.f16543a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f16543a, Separators.RPAREN);
    }
}
