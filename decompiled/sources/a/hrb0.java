package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final znq0 f13522a;
    public final String b;
    public final String c;
    public final String d;
    public final double e;
    public final double f;
    public final e4f g;
    public final boolean h;
    public final String i;
    public final frb0 j;
    public final frb0 k;
    public final boolean l;

    public hrb0(znq0 znq0Var, String str, String str2, String str3, double d, double d2, e4f e4fVar, boolean z, String str4, frb0 frb0Var, frb0 frb0Var2, boolean z2) {
        cs0.x(str, str2, str3, str4);
        this.f13522a = znq0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = d;
        this.f = d2;
        this.g = e4fVar;
        this.h = z;
        this.i = str4;
        this.j = frb0Var;
        this.k = frb0Var2;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrb0)) {
            return false;
        }
        hrb0 hrb0Var = (hrb0) obj;
        return this.f13522a.equals(hrb0Var.f13522a) && Intrinsics.d(this.b, hrb0Var.b) && Intrinsics.d(this.c, hrb0Var.c) && Intrinsics.d(this.d, hrb0Var.d) && Double.compare(this.e, hrb0Var.e) == 0 && Double.compare(this.f, hrb0Var.f) == 0 && this.g == hrb0Var.g && this.h == hrb0Var.h && Intrinsics.d(this.i, hrb0Var.i) && this.j.equals(hrb0Var.j) && this.k.equals(hrb0Var.k) && this.l == hrb0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + ((this.j.hashCode() + ua80.b(brm0.e((this.g.hashCode() + brm0.d(this.f, brm0.d(this.e, ua80.b(ua80.b(ua80.b(Long.hashCode(this.f13522a.f44687a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31, 31, this.h), 31, this.i)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerbetUiModel(couponDate=");
        sb.append(this.f13522a);
        sb.append(", couponId=");
        sb.append(this.b);
        sb.append(", couponType=");
        f140.v(sb, this.c, ", coefficient=", this.d, ", stake=");
        sb.append(this.e);
        ohs0.A(sb, this.f, ", possibleWin=", ", status=");
        sb.append(this.g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", currencySymbol=");
        sb.append(this.i);
        sb.append(", oldMarket=");
        sb.append(this.j);
        sb.append(", newMarket=");
        sb.append(this.k);
        sb.append(", is24HourFormat=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
