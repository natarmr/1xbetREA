package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rg10 implements sg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f30411a;

    public rg10(mdm mdmVar) {
        this.f30411a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg10) && this.f30411a.equals(((rg10) obj).f30411a);
    }

    public final int hashCode() {
        return this.f30411a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f30411a, Separators.RPAREN);
    }
}
