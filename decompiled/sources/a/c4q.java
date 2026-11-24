package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c4q implements i4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg30 f3738a;

    public c4q(lg30 lg30Var) {
        this.f3738a = lg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4q) && this.f3738a == ((c4q) obj).f3738a;
    }

    public final int hashCode() {
        return this.f3738a.hashCode();
    }

    public final String toString() {
        return "OnMatchTypeSelected(matchType=" + this.f3738a + Separators.RPAREN;
    }
}
