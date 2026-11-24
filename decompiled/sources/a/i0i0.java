package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i0i0 implements k0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f13950a;

    public final boolean equals(Object obj) {
        if (obj instanceof i0i0) {
            return this.f13950a == ((i0i0) obj).f13950a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13950a);
    }

    public final String toString() {
        return ua80.e(this.f13950a, "SelectCashback(value=", Separators.RPAREN);
    }
}
