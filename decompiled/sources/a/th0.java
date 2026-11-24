package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class th0 implements a2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f33939a;
    public final String b;

    public th0(zll zllVar) {
        this.f33939a = zllVar;
        this.b = String.valueOf(zllVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th0) && this.f33939a.equals(((th0) obj).f33939a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f33939a.hashCode();
    }

    public final String toString() {
        return "AggregatorCategoryGamesContainer(content=" + this.f33939a + Separators.RPAREN;
    }
}
