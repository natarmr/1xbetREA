package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c8p0 implements d8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f3925a;

    public c8p0(bem bemVar) {
        this.f3925a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8p0) && this.f3925a.equals(((c8p0) obj).f3925a);
    }

    public final int hashCode() {
        return this.f3925a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f3925a, Separators.RPAREN);
    }
}
