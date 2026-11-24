package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22882a;

    public n440(int i) {
        this.f22882a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n440) && this.f22882a == ((n440) obj).f22882a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22882a);
    }

    public final String toString() {
        return ua80.e(this.f22882a, "LimitType(limitType=", Separators.RPAREN);
    }
}
