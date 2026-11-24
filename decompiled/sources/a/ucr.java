package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ucr implements vcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35443a;

    public ucr(mdm mdmVar) {
        this.f35443a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucr) && this.f35443a.equals(((ucr) obj).f35443a);
    }

    public final int hashCode() {
        return this.f35443a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f35443a, Separators.RPAREN);
    }
}
