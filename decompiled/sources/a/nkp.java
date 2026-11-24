package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f23691a;

    public nkp(mdm mdmVar) {
        this.f23691a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nkp) && this.f23691a.equals(((nkp) obj).f23691a);
    }

    public final int hashCode() {
        return this.f23691a.hashCode();
    }

    public final String toString() {
        return b1j.j("NoInternetConnection(config=", this.f23691a, Separators.RPAREN);
    }
}
