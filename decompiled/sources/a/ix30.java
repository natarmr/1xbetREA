package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ix30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15522a;
    public final String b;
    public final String c;

    public ix30(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f15522a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix30)) {
            return false;
        }
        ix30 ix30Var = (ix30) obj;
        return Intrinsics.d(this.f15522a, ix30Var.f15522a) && Intrinsics.d(this.b, ix30Var.b) && this.c.equals(ix30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f15522a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowHideCouponDialogBetId(title=", this.f15522a, ", message=", this.b, ", betId="), this.c, Separators.RPAREN);
    }
}
