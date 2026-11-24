package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24656a;

    /* JADX WARN: Multi-variable type inference failed */
    public o4t(int i) {
        this.f24656a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4t) && this.f24656a == ((o4t) obj).f24656a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24656a);
    }

    public final String toString() {
        return ua80.e(this.f24656a, "CrashPopular(limit=", Separators.RPAREN);
    }
}
