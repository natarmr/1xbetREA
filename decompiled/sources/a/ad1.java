package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ad1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f655a;

    public ad1(int i) {
        this.f655a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad1) && this.f655a == ((ad1) obj).f655a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f655a);
    }

    public final String toString() {
        return ua80.e(this.f655a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
