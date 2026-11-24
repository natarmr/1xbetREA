package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ae5 implements be5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f710a;

    public final boolean equals(Object obj) {
        if (obj instanceof ae5) {
            return this.f710a.equals(((ae5) obj).f710a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f710a.hashCode();
    }

    public final String toString() {
        return kng0.l("Small(urn=", this.f710a, Separators.RPAREN);
    }
}
