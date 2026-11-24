package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uhf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35674a;

    public final boolean equals(Object obj) {
        if (obj instanceof uhf) {
            return this.f35674a.equals(((uhf) obj).f35674a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35674a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerOneResult(value=", this.f35674a, Separators.RPAREN);
    }
}
