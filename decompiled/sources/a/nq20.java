package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nq20 implements pq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23938a;

    public final boolean equals(Object obj) {
        if (obj instanceof nq20) {
            return this.f23938a.equals(((nq20) obj).f23938a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23938a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamImage(value=", this.f23938a, Separators.RPAREN);
    }
}
