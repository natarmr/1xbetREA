package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k09 implements y09 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17453a;

    public k09(int i) {
        this.f17453a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k09) && this.f17453a == ((k09) obj).f17453a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17453a);
    }

    public final String toString() {
        return ua80.e(this.f17453a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
