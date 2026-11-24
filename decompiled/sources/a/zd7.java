package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zd7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44199a;

    public final boolean equals(Object obj) {
        if (obj instanceof zd7) {
            return this.f44199a == ((zd7) obj).f44199a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44199a);
    }

    public final String toString() {
        return ua80.e(this.f44199a, "CoefficientColor(value=", Separators.RPAREN);
    }
}
