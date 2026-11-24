package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5459a;

    public final boolean equals(Object obj) {
        if (obj instanceof d4k0) {
            return this.f5459a == ((d4k0) obj).f5459a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5459a);
    }

    public final String toString() {
        return ua80.e(this.f5459a, "Background(value=", Separators.RPAREN);
    }
}
