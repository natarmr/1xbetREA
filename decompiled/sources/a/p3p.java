package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p3p implements q3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f26309a;

    public p3p(bem bemVar) {
        this.f26309a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3p) && this.f26309a.equals(((p3p) obj).f26309a);
    }

    public final int hashCode() {
        return this.f26309a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f26309a, Separators.RPAREN);
    }
}
