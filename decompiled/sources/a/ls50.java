package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ls50 implements os50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20562a;

    public ls50(int i) {
        this.f20562a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls50) && this.f20562a == ((ls50) obj).f20562a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20562a);
    }

    public final String toString() {
        return ua80.e(this.f20562a, "OnTopBannerInteractionFinish(newPageIndex=", Separators.RPAREN);
    }
}
