package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jh5 implements lh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16512a;
    public final String b;
    public final double c;
    public final String d;
    public final boolean e;

    public jh5(String str, String str2, double d, String str3, boolean z) {
        brm0.B(str, str2, str3);
        this.f16512a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5)) {
            return false;
        }
        jh5 jh5Var = (jh5) obj;
        return Intrinsics.d(this.f16512a, jh5Var.f16512a) && Intrinsics.d(this.b, jh5Var.b) && Double.compare(this.c, jh5Var.c) == 0 && Intrinsics.d(this.d, jh5Var.d) && this.e == jh5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.d(this.c, ua80.b(this.f16512a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(balanceIdText=", this.f16512a, ", balanceName=", this.b, ", balance=");
        hne.w(sbN, this.c, ", currencySymbol=", this.d);
        return f140.n(sbN, ", expanded=", this.e, Separators.RPAREN);
    }
}
