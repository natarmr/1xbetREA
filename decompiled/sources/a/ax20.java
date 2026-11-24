package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ax20 implements cx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1603a;

    public final boolean equals(Object obj) {
        if (obj instanceof ax20) {
            return this.f1603a == ((ax20) obj).f1603a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1603a);
    }

    public final String toString() {
        return ua80.e(this.f1603a, "GraphNameColor(value=", Separators.RPAREN);
    }
}
