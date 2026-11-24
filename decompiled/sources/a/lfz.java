package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lfz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qgz f19981a;

    public lfz(qgz qgzVar) {
        this.f19981a = qgzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfz) && this.f19981a == ((lfz) obj).f19981a;
    }

    public final int hashCode() {
        return this.f19981a.hashCode();
    }

    public final String toString() {
        return "OnRegionSelect(selectedRegion=" + this.f19981a + Separators.RPAREN;
    }
}
