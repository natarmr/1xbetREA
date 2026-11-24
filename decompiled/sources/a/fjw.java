package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fjw implements gjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f9664a;

    public fjw(mdm mdmVar) {
        this.f9664a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjw) && this.f9664a.equals(((fjw) obj).f9664a);
    }

    public final int hashCode() {
        return this.f9664a.hashCode();
    }

    public final String toString() {
        return b1j.j("Loading(loadingConfig=", this.f9664a, Separators.RPAREN);
    }
}
