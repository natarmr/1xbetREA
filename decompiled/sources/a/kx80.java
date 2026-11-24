package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kx80 implements mx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19041a;

    public final boolean equals(Object obj) {
        if (obj instanceof kx80) {
            return this.f19041a == ((kx80) obj).f19041a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19041a);
    }

    public final String toString() {
        return ua80.e(this.f19041a, "Res(value=", Separators.RPAREN);
    }
}
