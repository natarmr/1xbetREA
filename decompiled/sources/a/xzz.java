package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xzz implements yzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41776a;

    public final boolean equals(Object obj) {
        if (obj instanceof xzz) {
            return this.f41776a == ((xzz) obj).f41776a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41776a);
    }

    public final String toString() {
        return ua80.e(this.f41776a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
