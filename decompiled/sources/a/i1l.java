package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f14004a;

    public final boolean equals(Object obj) {
        if (obj instanceof i1l) {
            return this.f14004a.equals(((i1l) obj).f14004a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14004a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f14004a + Separators.RPAREN;
    }
}
