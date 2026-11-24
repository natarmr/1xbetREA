package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nog implements sog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23864a;

    public final boolean equals(Object obj) {
        if (obj instanceof nog) {
            return this.f23864a == ((nog) obj).f23864a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23864a);
    }

    public final String toString() {
        return ua80.e(this.f23864a, "Background(value=", Separators.RPAREN);
    }
}
