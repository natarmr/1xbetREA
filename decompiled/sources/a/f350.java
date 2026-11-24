package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8845a;

    public f350(int i) {
        this.f8845a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f350) && this.f8845a == ((f350) obj).f8845a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8845a);
    }

    public final String toString() {
        return ua80.e(this.f8845a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
