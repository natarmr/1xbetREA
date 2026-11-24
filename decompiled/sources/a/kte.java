package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18861a;

    public final boolean equals(Object obj) {
        if (obj instanceof kte) {
            return this.f18861a == ((kte) obj).f18861a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18861a);
    }

    public final String toString() {
        return ua80.e(this.f18861a, "MarketStyle(value=", Separators.RPAREN);
    }
}
