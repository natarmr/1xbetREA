package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class cmn implements gmn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4613a;

    public cmn(mdm mdmVar) {
        this.f4613a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmn) && this.f4613a.equals(((cmn) obj).f4613a);
    }

    public final int hashCode() {
        return this.f4613a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(dsEmptyConfig=", this.f4613a, Separators.RPAREN);
    }
}
