package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class frc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10013a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final wul f;
    public final wul g;
    public final wul h;
    public final String i;

    public frc0(String str, String str2, String str3, String str4, String str5, wul wulVar, wul wulVar2, wul wulVar3, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f10013a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = wulVar;
        this.g = wulVar2;
        this.h = wulVar3;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frc0)) {
            return false;
        }
        frc0 frc0Var = (frc0) obj;
        return Intrinsics.d(this.f10013a, frc0Var.f10013a) && Intrinsics.d(this.b, frc0Var.b) && Intrinsics.d(this.c, frc0Var.c) && Intrinsics.d(this.d, frc0Var.d) && Intrinsics.d(this.e, frc0Var.e) && this.f.equals(frc0Var.f) && this.g.equals(frc0Var.g) && this.h.equals(frc0Var.h) && Intrinsics.d(this.i, frc0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + i8i.a(this.h, i8i.a(this.g, i8i.a(this.f, ua80.b(ua80.b(ua80.b(ua80.b(this.f10013a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoShopDetailUiModel(subtitle=", this.f10013a, ", description=", this.b, ", purchaseLabel=");
        f140.v(sbN, this.c, ", promoCount=", this.d, ", promoBalance=");
        sbN.append(this.e);
        sbN.append(", promoButton=");
        sbN.append(this.f);
        sbN.append(", increaseButton=");
        sbN.append(this.g);
        sbN.append(", decreaseButton=");
        sbN.append(this.h);
        sbN.append(", freeSpinBalance=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
