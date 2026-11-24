package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jim implements kim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16582a;

    public jim(int i) {
        this.f16582a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jim) && this.f16582a == ((jim) obj).f16582a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16582a);
    }

    public final String toString() {
        return ua80.e(this.f16582a, "OnTabSelect(selectedTab=", Separators.RPAREN);
    }
}
