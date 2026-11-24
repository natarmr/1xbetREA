package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dse implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6608a;

    public final boolean equals(Object obj) {
        if (obj instanceof dse) {
            return this.f6608a == ((dse) obj).f6608a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6608a);
    }

    public final String toString() {
        return ua80.e(this.f6608a, "MarketDescriptionTextStyle(value=", Separators.RPAREN);
    }
}
