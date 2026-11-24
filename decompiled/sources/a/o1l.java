package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24485a;

    public final boolean equals(Object obj) {
        if (obj instanceof o1l) {
            return this.f24485a == ((o1l) obj).f24485a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24485a);
    }

    public final String toString() {
        return ua80.e(this.f24485a, "OnPreviousMapClick(value=", Separators.RPAREN);
    }
}
