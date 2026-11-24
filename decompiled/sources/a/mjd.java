package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mjd implements sjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21892a;
    public final int b;

    public mjd(String str, int i) {
        str.getClass();
        this.f21892a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjd)) {
            return false;
        }
        mjd mjdVar = (mjd) obj;
        return Intrinsics.d(this.f21892a, mjdVar.f21892a) && this.b == mjdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f21892a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "CouponTypeMaxItemsLimitExceed(curCouponTypeName=", this.f21892a, ", maxEventCount=", Separators.RPAREN);
    }
}
