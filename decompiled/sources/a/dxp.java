package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dxp implements fxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6858a;

    public dxp(mdm mdmVar) {
        this.f6858a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxp) && this.f6858a.equals(((dxp) obj).f6858a);
    }

    public final int hashCode() {
        return this.f6858a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f6858a, Separators.RPAREN);
    }
}
