package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n9l implements s9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23146a;

    public final boolean equals(Object obj) {
        if (obj instanceof n9l) {
            return this.f23146a == ((n9l) obj).f23146a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23146a);
    }

    public final String toString() {
        return ua80.e(this.f23146a, "Background(value=", Separators.RPAREN);
    }
}
