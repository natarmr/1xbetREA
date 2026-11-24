package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16322a;
    public final double b;
    public final String c;
    public final String d;
    public final int e;

    public jdc0(double d, int i, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f16322a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdc0)) {
            return false;
        }
        jdc0 jdc0Var = (jdc0) obj;
        return Intrinsics.d(this.f16322a, jdc0Var.f16322a) && Double.compare(this.b, jdc0Var.b) == 0 && Intrinsics.d(this.c, jdc0Var.c) && Intrinsics.d(this.d, jdc0Var.d) && this.e == jdc0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(ua80.b(brm0.d(this.b, this.f16322a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeInfoModel(promoCode=");
        sb.append(this.f16322a);
        sb.append(", amount=");
        sb.append(this.b);
        f140.v(sb, ", minCoef=", this.c, ", currencySymbol=", this.d);
        return vqd.p(sb, ", payoutType=", this.e, Separators.RPAREN);
    }
}
