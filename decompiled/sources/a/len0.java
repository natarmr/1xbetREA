package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class len0 implements pen0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19912a;

    public len0(int i) {
        this.f19912a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof len0) && this.f19912a == ((len0) obj).f19912a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19912a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return ua80.e(this.f19912a, "Empty(isRefreshing=false, lottieAnimationTypeId=", Separators.RPAREN);
    }
}
