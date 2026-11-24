package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qfg0 implements rfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28632a;

    public final boolean equals(Object obj) {
        if (obj instanceof qfg0) {
            return this.f28632a == ((qfg0) obj).f28632a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28632a);
    }

    public final String toString() {
        return ua80.e(this.f28632a, "RouletteImage(value=", Separators.RPAREN);
    }
}
