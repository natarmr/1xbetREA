package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p5c0 implements s5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26399a;

    public final boolean equals(Object obj) {
        if (obj instanceof p5c0) {
            return this.f26399a == ((p5c0) obj).f26399a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26399a);
    }

    public final String toString() {
        return ua80.e(this.f26399a, "PromoBalance(value=", Separators.RPAREN);
    }
}
