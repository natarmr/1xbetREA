package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rlr implements amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f30711a;

    public rlr(hdb hdbVar) {
        this.f30711a = hdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlr) && this.f30711a.equals(((rlr) obj).f30711a);
    }

    public final int hashCode() {
        return this.f30711a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f30711a + Separators.RPAREN;
    }
}
