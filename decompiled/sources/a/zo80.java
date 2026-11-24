package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class zo80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44708a;
    public final String b;
    public final String c;
    public final GenerateCouponTypeUiModel d;
    public final GenerateCouponTypeUiModel e;
    public final String f;

    public zo80(String str, String str2, String str3, GenerateCouponTypeUiModel generateCouponTypeUiModel, GenerateCouponTypeUiModel generateCouponTypeUiModel2, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f44708a = str;
        this.b = str2;
        this.c = str3;
        this.d = generateCouponTypeUiModel;
        this.e = generateCouponTypeUiModel2;
        this.f = str4;
    }

    public static zo80 a(zo80 zo80Var, String str, String str2, GenerateCouponTypeUiModel generateCouponTypeUiModel, GenerateCouponTypeUiModel generateCouponTypeUiModel2, int i) {
        String str3 = zo80Var.f44708a;
        if ((i & 2) != 0) {
            str = zo80Var.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = zo80Var.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            generateCouponTypeUiModel = zo80Var.d;
        }
        GenerateCouponTypeUiModel generateCouponTypeUiModel3 = generateCouponTypeUiModel;
        if ((i & 16) != 0) {
            generateCouponTypeUiModel2 = zo80Var.e;
        }
        String str6 = zo80Var.f;
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new zo80(str3, str4, str5, generateCouponTypeUiModel3, generateCouponTypeUiModel2, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo80)) {
            return false;
        }
        zo80 zo80Var = (zo80) obj;
        return Intrinsics.d(this.f44708a, zo80Var.f44708a) && Intrinsics.d(this.b, zo80Var.b) && Intrinsics.d(this.c, zo80Var.c) && this.d.equals(zo80Var.d) && this.e.equals(zo80Var.e) && Intrinsics.d(this.f, zo80Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f44708a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ParamsGenerateCouponsUiModel(minSumBet=", this.f44708a, ", betSum=", this.b, ", wontedWin=");
        sbN.append(this.c);
        sbN.append(", timeToStart=");
        sbN.append(this.d);
        sbN.append(", typeOfCoupon=");
        sbN.append(this.e);
        sbN.append(", currencySymbol=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
