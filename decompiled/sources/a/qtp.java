package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qtp implements utp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f29308a;

    public qtp(mdm mdmVar) {
        this.f29308a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtp) && this.f29308a.equals(((qtp) obj).f29308a);
    }

    public final int hashCode() {
        return this.f29308a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f29308a, Separators.RPAREN);
    }
}
