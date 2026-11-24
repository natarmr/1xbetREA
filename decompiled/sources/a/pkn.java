package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pkn implements vkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27143a;

    public final boolean equals(Object obj) {
        if (obj instanceof pkn) {
            return this.f27143a == ((pkn) obj).f27143a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27143a);
    }

    public final String toString() {
        return ua80.e(this.f27143a, "OnCoefCheckTypeSelectClick(position=", Separators.RPAREN);
    }
}
