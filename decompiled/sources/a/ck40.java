package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ck40 implements ek40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4489a;

    public final boolean equals(Object obj) {
        if (obj instanceof ck40) {
            return this.f4489a == ((ck40) obj).f4489a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4489a);
    }

    public final String toString() {
        return axq.h(this.f4489a, "TeamClick(value=", Separators.RPAREN);
    }
}
