package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k5b implements o5b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx70 f17711a;

    public final boolean equals(Object obj) {
        if (obj instanceof k5b) {
            return this.f17711a.equals(((k5b) obj).f17711a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17711a.hashCode();
    }

    public final String toString() {
        return "DeleteAllSideEffect(openTabState=" + this.f17711a + Separators.RPAREN;
    }
}
