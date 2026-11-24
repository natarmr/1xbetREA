package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31689a;
    public final String b;
    public final String c;

    public s67(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f31689a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s67)) {
            return false;
        }
        s67 s67Var = (s67) obj;
        return Intrinsics.d(this.f31689a, s67Var.f31689a) && Intrinsics.d(this.b, s67Var.b) && Intrinsics.d(this.c, s67Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31689a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowHideCouponDialogBetId(title=", this.f31689a, ", message=", this.b, ", betId="), this.c, Separators.RPAREN);
    }
}
