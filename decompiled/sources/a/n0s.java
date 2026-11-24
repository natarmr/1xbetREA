package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n0s implements p0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22715a;

    public n0s(int i) {
        this.f22715a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0s) && this.f22715a == ((n0s) obj).f22715a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22715a);
    }

    public final String toString() {
        return ua80.e(this.f22715a, "InfiniteFromCount(count=", Separators.RPAREN);
    }
}
