package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tt80 implements cu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34499a;

    public tt80(int i) {
        this.f34499a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt80) && this.f34499a == ((tt80) obj).f34499a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34499a);
    }

    public final String toString() {
        return ua80.e(this.f34499a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
