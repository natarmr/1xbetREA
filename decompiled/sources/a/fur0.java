package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fur0 implements iur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f10179a;

    public fur0(mdm mdmVar) {
        this.f10179a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fur0) && this.f10179a.equals(((fur0) obj).f10179a);
    }

    public final int hashCode() {
        return this.f10179a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f10179a, Separators.RPAREN);
    }
}
