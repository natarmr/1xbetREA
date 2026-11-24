package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class iz2 implements gw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15615a;

    public iz2(int i) {
        this.f15615a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz2) && this.f15615a == ((iz2) obj).f15615a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15615a);
    }

    public final String toString() {
        return ua80.e(this.f15615a, "AndroidFontResolveInterceptor(fontWeightAdjustment=", Separators.RPAREN);
    }
}
