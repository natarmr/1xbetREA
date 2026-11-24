package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ue0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35503a;

    public ue0(int i) {
        this.f35503a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue0) && this.f35503a == ((ue0) obj).f35503a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35503a);
    }

    public final String toString() {
        return ua80.e(this.f35503a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
