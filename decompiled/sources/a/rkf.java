package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rkf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30646a;

    public final boolean equals(Object obj) {
        if (obj instanceof rkf) {
            return this.f30646a == ((rkf) obj).f30646a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30646a);
    }

    public final String toString() {
        return ua80.e(this.f30646a, "Background(value=", Separators.RPAREN);
    }
}
