package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class bwz implements cwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3351a;

    public final boolean equals(Object obj) {
        if (obj instanceof bwz) {
            return this.f3351a == ((bwz) obj).f3351a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3351a);
    }

    public final String toString() {
        return ua80.e(this.f3351a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
