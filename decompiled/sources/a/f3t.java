package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8881a;

    public f3t(int i) {
        this.f8881a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3t) && this.f8881a == ((f3t) obj).f8881a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8881a);
    }

    public final String toString() {
        return ua80.e(this.f8881a, "ChangeMantissa(mantissa=", Separators.RPAREN);
    }
}
