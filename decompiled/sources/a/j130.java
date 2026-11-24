package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15713a;
    public final String b;
    public final String c;

    public j130(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f15713a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j130)) {
            return false;
        }
        j130 j130Var = (j130) obj;
        return Intrinsics.d(this.f15713a, j130Var.f15713a) && Intrinsics.d(this.b, j130Var.b) && Intrinsics.d(this.c, j130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f15713a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("CouponMaxItemsLimitExceed(title=", this.f15713a, ", message=", this.b, ", textForButton="), this.c, Separators.RPAREN);
    }
}
