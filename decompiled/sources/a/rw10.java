package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rw10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31199a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Integer h;
    public final i8m0 i;
    public final qw10 j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;

    public rw10(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, i8m0 i8m0Var, qw10 qw10Var, String str3, String str4, String str5, boolean z6) {
        this.f31199a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = num;
        this.i = i8m0Var;
        this.j = qw10Var;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = z6;
    }

    public static rw10 a(rw10 rw10Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, i8m0 i8m0Var, qw10 qw10Var, String str3, String str4, String str5, int i) {
        String str6 = (i & 1) != 0 ? rw10Var.f31199a : str;
        String str7 = (i & 2) != 0 ? rw10Var.b : str2;
        boolean z6 = (i & 4) != 0 ? rw10Var.c : z;
        boolean z7 = (i & 8) != 0 ? rw10Var.d : z2;
        boolean z8 = (i & 16) != 0 ? rw10Var.e : z3;
        boolean z9 = (i & 32) != 0 ? rw10Var.f : z4;
        boolean z10 = (i & 64) != 0 ? rw10Var.g : z5;
        Integer num2 = (i & 128) != 0 ? rw10Var.h : num;
        i8m0 i8m0Var2 = (i & 256) != 0 ? rw10Var.i : i8m0Var;
        qw10 qw10Var2 = (i & 512) != 0 ? rw10Var.j : qw10Var;
        String str8 = (i & 1024) != 0 ? rw10Var.k : str3;
        String str9 = (i & 2048) != 0 ? rw10Var.l : str4;
        String str10 = (i & 4096) != 0 ? rw10Var.m : str5;
        rw10Var.getClass();
        boolean z11 = rw10Var.n;
        rw10Var.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        return new rw10(str6, str7, z6, z7, z8, z9, z10, num2, i8m0Var2, qw10Var2, str8, str9, str10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw10)) {
            return false;
        }
        rw10 rw10Var = (rw10) obj;
        return this.f31199a.equals(rw10Var.f31199a) && this.b.equals(rw10Var.b) && this.c == rw10Var.c && this.d == rw10Var.d && this.e == rw10Var.e && this.f == rw10Var.f && this.g == rw10Var.g && Intrinsics.d(this.h, rw10Var.h) && this.i == rw10Var.i && this.j.equals(rw10Var.j) && this.k.equals(rw10Var.k) && this.l.equals(rw10Var.l) && this.m.equals(rw10Var.m) && this.n == rw10Var.n;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(this.f31199a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        i8m0 i8m0Var = this.i;
        return Boolean.hashCode(this.n) + twn.a(1357, ua80.b(ua80.b(ua80.b((this.j.hashCode() + ((iHashCode + (i8m0Var != null ? i8m0Var.hashCode() : 0)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UiState(title=", this.f31199a, ", subtitle=", this.b, ", authButtonsVisible=");
        ua80.u(", profileInfoVisible=", ", sessionTimerVisible=", sbN, this.c, this.d);
        ua80.u(", accountSelectionVisible=", ", menuMessageVisible=", sbN, this.e, this.f);
        sbN.append(this.g);
        sbN.append(", messagesCount=");
        sbN.append(this.h);
        sbN.append(", settingsIconStatus=");
        sbN.append(this.i);
        sbN.append(", profileIcon=");
        sbN.append(this.j);
        sbN.append(", balanceTitle=");
        f140.v(sbN, this.k, ", money=", this.l, ", currency=");
        return defpackage.c.c(this.m, ", groupId=1357, isUseStaticImage=", Separators.RPAREN, sbN, this.n);
    }
}
