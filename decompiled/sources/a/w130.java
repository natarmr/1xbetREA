package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh7 f38380a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public w130(zh7 zh7Var, String str, String str2, long j, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        zh7Var.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.f38380a = zh7Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w130)) {
            return false;
        }
        w130 w130Var = (w130) obj;
        return Intrinsics.d(this.f38380a, w130Var.f38380a) && Intrinsics.d(this.b, w130Var.b) && this.c.equals(w130Var.c) && this.d == w130Var.d && this.e == w130Var.e && Intrinsics.d(this.f, w130Var.f) && Intrinsics.d(this.g, w130Var.g) && Intrinsics.d(this.h, w130Var.h) && Intrinsics.d(this.i, w130Var.i) && Intrinsics.d(this.j, w130Var.j) && Intrinsics.d(this.k, w130Var.k) && Intrinsics.d(this.l, w130Var.l) && Intrinsics.d(this.m, w130Var.m);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(ua80.b(ua80.b(this.f38380a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowQuickBetSuccess(betResult=");
        sb.append(this.f38380a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", possibleWinSum=");
        defpackage.c.i(sb, this.d, this.c, ", balanceId=");
        hne.u(", isAvailablePossibleWinTax=", ", titleName=", this.f, sb, this.e);
        f140.v(sb, ", betType=", this.g, ", coefficientTitle=", this.h);
        f140.v(sb, ", possibleWinTitle=", this.i, ", betSumTitle=", this.j);
        f140.v(sb, ", optiCoefTitle=", this.k, ", optiCoef=", this.l);
        return rw2.o(sb, ", shareText=", this.m, Separators.RPAREN);
    }
}
