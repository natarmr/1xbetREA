package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uda0 extends vda0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35468a;

    public uda0(mdm mdmVar) {
        this.f35468a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uda0) && this.f35468a.equals(((uda0) obj).f35468a);
    }

    public final int hashCode() {
        return this.f35468a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f35468a, Separators.RPAREN);
    }
}
