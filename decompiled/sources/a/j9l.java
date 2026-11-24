package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j9l implements k9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16145a;

    public final boolean equals(Object obj) {
        if (obj instanceof j9l) {
            return this.f16145a.equals(((j9l) obj).f16145a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16145a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamImage(value=", this.f16145a, Separators.RPAREN);
    }
}
