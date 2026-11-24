package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14351a;

    public i8p0(int i) {
        this.f14351a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8p0) && this.f14351a == ((i8p0) obj).f14351a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14351a);
    }

    public final String toString() {
        return ua80.e(this.f14351a, "OnSegmentClick(index=", Separators.RPAREN);
    }
}
