package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class oa8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24917a;

    public final boolean equals(Object obj) {
        if (obj instanceof oa8) {
            return this.f24917a == ((oa8) obj).f24917a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24917a);
    }

    public final String toString() {
        return ua80.e(this.f24917a, "BlockId(value=", Separators.RPAREN);
    }
}
