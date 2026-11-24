package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f34059a;

    public tjp(ygq0 ygq0Var) {
        this.f34059a = ygq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjp) && this.f34059a == ((tjp) obj).f34059a;
    }

    public final int hashCode() {
        return this.f34059a.hashCode();
    }

    public final String toString() {
        return "SetTimeFilterState(timeFilter=" + this.f34059a + Separators.RPAREN;
    }
}
