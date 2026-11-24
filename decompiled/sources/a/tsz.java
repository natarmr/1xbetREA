package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tsz implements usz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34485a;

    public final boolean equals(Object obj) {
        if (obj instanceof tsz) {
            return this.f34485a == ((tsz) obj).f34485a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34485a);
    }

    public final String toString() {
        return ua80.e(this.f34485a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
