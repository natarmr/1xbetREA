package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41558a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    public xvg0(long j, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2) {
        str.getClass();
        str4.getClass();
        this.f41558a = j;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvg0)) {
            return false;
        }
        xvg0 xvg0Var = (xvg0) obj;
        return this.f41558a == xvg0Var.f41558a && this.b == xvg0Var.b && Intrinsics.d(this.c, xvg0Var.c) && this.d.equals(xvg0Var.d) && this.e.equals(xvg0Var.e) && Intrinsics.d(this.f, xvg0Var.f) && this.g.equals(xvg0Var.g) && this.h.equals(xvg0Var.h) && this.i.equals(xvg0Var.i) && this.j.equals(xvg0Var.j) && this.k.equals(xvg0Var.k) && this.l.equals(xvg0Var.l) && this.m == xvg0Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(Long.hashCode(this.f41558a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f41558a, "SaleUiModel(date=", ", autoSale=", this.b);
        f140.v(sbR, ", typeText=", this.c, ", numberText=", this.d);
        f140.v(sbR, ", betText=", this.e, ", coefficientString=", this.f);
        f140.v(sbR, ", betCurrentText=", this.g, ", couponValue=", this.h);
        f140.v(sbR, ", autoBetValue=", this.i, ", saleText=", this.j);
        f140.v(sbR, ", saleDescriptionText=", this.k, ", buttonSaleText=", this.l);
        return f140.n(sbR, ", is24HourFormat=", this.m, Separators.RPAREN);
    }
}
