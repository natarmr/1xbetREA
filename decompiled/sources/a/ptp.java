package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ptp implements utp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f27576a;

    public ptp(mdm mdmVar) {
        this.f27576a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptp) && this.f27576a.equals(((ptp) obj).f27576a);
    }

    public final int hashCode() {
        return this.f27576a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(dsEmptyConfig=", this.f27576a, Separators.RPAREN);
    }
}
