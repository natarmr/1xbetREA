package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ixc implements kxc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15536a;

    public ixc(int i) {
        this.f15536a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixc) && this.f15536a == ((ixc) obj).f15536a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15536a);
    }

    public final String toString() {
        return ua80.e(this.f15536a, "ScrollToPageWithBundlePosition(position=", Separators.RPAREN);
    }
}
