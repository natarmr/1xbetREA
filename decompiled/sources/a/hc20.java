package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hc20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12799a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final q4f g;
    public final en7 h;
    public final String i;
    public final boolean j;
    public final String k;
    public final hg7 l;
    public final String m;
    public final String n;

    public hc20(String str, String str2, long j, String str3, String str4, String str5, q4f q4fVar, en7 en7Var, String str6, boolean z, String str7, hg7 hg7Var, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        q4fVar.getClass();
        str7.getClass();
        hg7Var.getClass();
        this.f12799a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = q4fVar;
        this.h = en7Var;
        this.i = str6;
        this.j = z;
        this.k = str7;
        this.l = hg7Var;
        this.m = str8;
        this.n = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc20)) {
            return false;
        }
        hc20 hc20Var = (hc20) obj;
        return Intrinsics.d(this.f12799a, hc20Var.f12799a) && Intrinsics.d(this.b, hc20Var.b) && this.c == hc20Var.c && Intrinsics.d(this.d, hc20Var.d) && Intrinsics.d(this.e, hc20Var.e) && Intrinsics.d(this.f, hc20Var.f) && this.g == hc20Var.g && Intrinsics.d(this.h, hc20Var.h) && Intrinsics.d(this.i, hc20Var.i) && this.j == hc20Var.j && Intrinsics.d(this.k, hc20Var.k) && this.l == hc20Var.l && Intrinsics.d(this.m, hc20Var.m) && Intrinsics.d(this.n, hc20Var.n);
    }

    public final int hashCode() {
        int iB = rw2.b(ua80.b(this.f12799a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iB2 = vqd.b(this.g, ua80.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31);
        en7 en7Var = this.h;
        int iHashCode2 = (iB2 + (en7Var == null ? 0 : en7Var.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (this.l.hashCode() + ua80.b(brm0.e(brm0.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j), 31, false), 31, this.k)) * 31;
        String str4 = this.m;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShowMakeBetResult(betSum=", this.f12799a, ", coefficient=", this.b, ", balanceId=");
        kng0.z(sbN, this.c, ", possibleWinTitle=", this.d);
        f140.v(sbN, ", possibleWinSum=", this.e, ", symbol=", this.f);
        sbN.append(", couponTypeModel=");
        sbN.append(this.g);
        sbN.append(", betSystemModel=");
        sbN.append(this.h);
        w6x.z(", betNumber=", this.i, ", isShowSum=", sbN, this.j);
        sbN.append(", isAvailablePossibleWinTax=false, snackBarTitle=");
        sbN.append(this.k);
        sbN.append(", betModeModel=");
        sbN.append(this.l);
        f140.v(sbN, ", optiCoef=", this.m, ", shareText=", this.n);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
