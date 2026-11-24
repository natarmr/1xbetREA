package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zlm implements bmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44587a;

    public final boolean equals(Object obj) {
        if (obj instanceof zlm) {
            return this.f44587a == ((zlm) obj).f44587a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44587a);
    }

    public final String toString() {
        return ua80.e(this.f44587a, "LocalRes(value=", Separators.RPAREN);
    }
}
