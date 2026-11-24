package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m7o implements n7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f21330a;

    public m7o(bem bemVar) {
        this.f21330a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7o) && this.f21330a.equals(((m7o) obj).f21330a);
    }

    public final int hashCode() {
        return this.f21330a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f21330a, Separators.RPAREN);
    }
}
