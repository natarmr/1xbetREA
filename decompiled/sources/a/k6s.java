package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17786a;

    public final boolean equals(Object obj) {
        if (obj instanceof k6s) {
            return this.f17786a == ((k6s) obj).f17786a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17786a);
    }

    public final String toString() {
        return ua80.e(this.f17786a, "BroadcastingTabClick(index=", Separators.RPAREN);
    }
}
