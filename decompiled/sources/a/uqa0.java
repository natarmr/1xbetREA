package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f36110a;

    public uqa0(ygq0 ygq0Var) {
        this.f36110a = ygq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqa0) && this.f36110a == ((uqa0) obj).f36110a;
    }

    public final int hashCode() {
        return this.f36110a.hashCode();
    }

    public final String toString() {
        return "SetTimeFilterState(timeFilter=" + this.f36110a + Separators.RPAREN;
    }
}
