package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18099a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;

    public kdc0(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        brm0.B(str, str2, str3);
        this.f18099a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public static kdc0 a(kdc0 kdc0Var, int i, boolean z, int i2) {
        boolean z2 = kdc0Var.f18099a;
        boolean z3 = kdc0Var.b;
        if ((i2 & 4) != 0) {
            i = kdc0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = kdc0Var.d;
        }
        String str = kdc0Var.e;
        String str2 = kdc0Var.f;
        String str3 = kdc0Var.g;
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new kdc0(i3, str, str2, str3, z2, z3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc0)) {
            return false;
        }
        kdc0 kdc0Var = (kdc0) obj;
        return this.f18099a == kdc0Var.f18099a && this.b == kdc0Var.b && this.c == kdc0Var.c && this.d == kdc0Var.d && Intrinsics.d(this.e, kdc0Var.e) && Intrinsics.d(this.f, kdc0Var.f) && Intrinsics.d(this.g, kdc0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(brm0.e(twn.a(this.c, brm0.e(Boolean.hashCode(this.f18099a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoCodeListAccountInfoState(hasListPromoPoints=", ", hasListPromoRequest=", ", pointsCount=", this.f18099a, this.b);
        brm0.w(this.c, ", buttonLoading=", ", accountInfoLabel=", sbQ, this.d);
        f140.v(sbQ, this.e, ", ptsSymbol=", this.f, ", requestBonusText=");
        return axq.n(sbQ, this.g, Separators.RPAREN);
    }
}
