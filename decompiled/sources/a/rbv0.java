package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rbv0 implements ubv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30209a;
    public final int b;

    public rbv0(String str, int i) {
        str.getClass();
        this.f30209a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbv0)) {
            return false;
        }
        rbv0 rbv0Var = (rbv0) obj;
        return Intrinsics.d(this.f30209a, rbv0Var.f30209a) && this.b == rbv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f30209a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "CouponTypeMaxItemsLimitExceed(curCouponTypeName=", this.f30209a, ", maxEventCount=", Separators.RPAREN);
    }
}
