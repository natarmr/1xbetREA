package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ejw implements gjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7927a;

    public ejw(mdm mdmVar) {
        this.f7927a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejw) && this.f7927a.equals(((ejw) obj).f7927a);
    }

    public final int hashCode() {
        return this.f7927a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f7927a, Separators.RPAREN);
    }
}
