package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ron implements uon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f30847a;

    public ron(mdm mdmVar) {
        this.f30847a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ron) && this.f30847a.equals(((ron) obj).f30847a);
    }

    public final int hashCode() {
        return this.f30847a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f30847a, Separators.RPAREN);
    }
}
