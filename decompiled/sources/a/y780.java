package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42141a;
    public final int b;
    public final List c;
    public final bt9 d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public y780(String str, int i, List list, bt9 bt9Var, String str2, Integer num, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, boolean z3, boolean z4, boolean z5) {
        list.getClass();
        this.f42141a = str;
        this.b = i;
        this.c = list;
        this.d = bt9Var;
        this.e = str2;
        this.f = num;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = z;
        this.l = str7;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }

    public static y780 a(y780 y780Var, String str, int i, List list, bt9 bt9Var, String str2, Integer num, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        String str8 = (i2 & 1) != 0 ? y780Var.f42141a : str;
        int i3 = (i2 & 2) != 0 ? y780Var.b : i;
        List list2 = (i2 & 4) != 0 ? y780Var.c : list;
        bt9 bt9Var2 = (i2 & 8) != 0 ? y780Var.d : bt9Var;
        y780Var.getClass();
        String str9 = (i2 & 32) != 0 ? y780Var.e : str2;
        Integer num2 = (i2 & 64) != 0 ? y780Var.f : num;
        String str10 = (i2 & 128) != 0 ? y780Var.g : str3;
        String str11 = (i2 & 256) != 0 ? y780Var.h : str4;
        String str12 = (i2 & 512) != 0 ? y780Var.i : str5;
        String str13 = (i2 & 1024) != 0 ? y780Var.j : str6;
        boolean z6 = (i2 & 2048) != 0 ? y780Var.k : z;
        y780Var.getClass();
        String str14 = (i2 & 8192) != 0 ? y780Var.l : str7;
        boolean z7 = (i2 & 16384) != 0 ? y780Var.m : z2;
        boolean z8 = (32768 & i2) != 0 ? y780Var.n : z3;
        boolean z9 = (i2 & 65536) != 0 ? y780Var.o : z4;
        boolean z10 = (i2 & 131072) != 0 ? y780Var.p : z5;
        y780Var.getClass();
        list2.getClass();
        str9.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        return new y780(str8, i3, list2, bt9Var2, str9, num2, str10, str11, str12, str13, z6, str14, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y780)) {
            return false;
        }
        y780 y780Var = (y780) obj;
        return this.f42141a.equals(y780Var.f42141a) && this.b == y780Var.b && Intrinsics.d(this.c, y780Var.c) && Intrinsics.d(this.d, y780Var.d) && this.e.equals(y780Var.e) && Intrinsics.d(this.f, y780Var.f) && this.g.equals(y780Var.g) && Intrinsics.d(this.h, y780Var.h) && this.i.equals(y780Var.i) && this.j.equals(y780Var.j) && this.k == y780Var.k && this.l.equals(y780Var.l) && this.m == y780Var.m && this.n == y780Var.n && this.o == y780Var.o && this.p == y780Var.p;
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.b, this.f42141a.hashCode() * 31, 31), 31, this.c);
        bt9 bt9Var = this.d;
        int iB = ua80.b(brm0.e((iA + (bt9Var == null ? 0 : bt9Var.hashCode())) * 31, 31, true), 31, this.e);
        Integer num = this.f;
        int iB2 = ua80.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b((iB2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, false), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "OrderCallBackState(phoneNumber=", this.f42141a, ", phoneMaxLength=", ", languages=");
        sbP.append(this.c);
        sbP.append(", selectedLanguage=");
        sbP.append(this.d);
        sbP.append(", phoneCodeEnabled=true, phoneError=");
        axq.x(this.f, this.e, ", countryId=", ", flagUrl=", sbP);
        f140.v(sbP, this.g, ", phoneCode=", this.h, ", rawPhoneMask=");
        f140.v(sbP, this.i, ", phoneMask=", this.j, ", isCountryAllowed=");
        f140.s(", isOperatorFieldVisible=false, message=", this.l, ", isShimmers=", sbP, this.k);
        ua80.u(", isLoading=", ", isError=", sbP, this.m, this.n);
        return ohs0.p(", showLottie=", Separators.RPAREN, sbP, this.o, this.p);
    }
}
