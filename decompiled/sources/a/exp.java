package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class exp implements fxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f8590a;

    public exp(mdm mdmVar) {
        this.f8590a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exp) && this.f8590a.equals(((exp) obj).f8590a);
    }

    public final int hashCode() {
        return this.f8590a.hashCode();
    }

    public final String toString() {
        return b1j.j("Loading(loadingConfig=", this.f8590a, Separators.RPAREN);
    }
}
