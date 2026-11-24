package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xa50 extends cb50 {
    public final String b;
    public final boolean c;

    public xa50(String str, boolean z) {
        super("COUPON");
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa50)) {
            return false;
        }
        xa50 xa50Var = (xa50) obj;
        return Intrinsics.d(this.b, xa50Var.b) && this.c == xa50Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Coupon(couponIdToOpen=", this.b, ", afterBet=", this.c, Separators.RPAREN);
    }

    public /* synthetic */ xa50() {
        this("", false);
    }
}
