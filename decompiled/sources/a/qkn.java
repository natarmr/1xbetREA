package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qkn implements vkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28894a;

    public final boolean equals(Object obj) {
        if (obj instanceof qkn) {
            return this.f28894a == ((qkn) obj).f28894a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28894a);
    }

    public final String toString() {
        return ua80.e(this.f28894a, "OnCouponTypeSelectClick(position=", Separators.RPAREN);
    }
}
