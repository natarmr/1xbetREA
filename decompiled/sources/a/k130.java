package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17499a;
    public final String b;
    public final String c;
    public final String d;

    public k130(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f17499a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k130)) {
            return false;
        }
        k130 k130Var = (k130) obj;
        return Intrinsics.d(this.f17499a, k130Var.f17499a) && Intrinsics.d(this.b, k130Var.b) && Intrinsics.d(this.c, k130Var.c) && Intrinsics.d(this.d, k130Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f17499a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("CouponTypeMaxItemsLimitExceed(title=", this.f17499a, ", message=", this.b, ", textForFirstButton="), this.c, ", textForSecondButton=", this.d, Separators.RPAREN);
    }
}
