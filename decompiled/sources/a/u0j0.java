package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u0j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34857a;

    public u0j0(String str) {
        this.f34857a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0j0) && this.f34857a.equals(((u0j0) obj).f34857a);
    }

    public final int hashCode() {
        return this.f34857a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenActualDomain(url=", this.f34857a, Separators.RPAREN);
    }
}
