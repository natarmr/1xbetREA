package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class um implements vm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35897a;

    public um(mdm mdmVar) {
        this.f35897a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um) && this.f35897a.equals(((um) obj).f35897a);
    }

    public final int hashCode() {
        return this.f35897a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f35897a, Separators.RPAREN);
    }
}
