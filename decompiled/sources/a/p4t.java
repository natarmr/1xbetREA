package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f26372a;

    /* JADX WARN: Multi-variable type inference failed */
    public p4t(int i) {
        this.f26372a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4t) && this.f26372a == ((p4t) obj).f26372a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26372a);
    }

    public final String toString() {
        return ua80.e(this.f26372a, "Favorites(limit=", Separators.RPAREN);
    }
}
