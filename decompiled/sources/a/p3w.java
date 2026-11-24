package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p3w implements o8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26320a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;
    public final a4x g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final tvw k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final boolean w;

    public p3w(String str, String str2, String str3, String str4, String str5, i4 i4Var, i4 i4Var2, boolean z, int i, boolean z2, tvw tvwVar, boolean z3, String str6, boolean z4, boolean z5, boolean z6, int i2, String str7, String str8, String str9, String str10, String str11, boolean z7) {
        ohs0.z(str, str2, str3, str4, str5);
        i4Var.getClass();
        i4Var2.getClass();
        str6.getClass();
        str7.getClass();
        str10.getClass();
        this.f26320a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i4Var;
        this.g = i4Var2;
        this.h = z;
        this.i = i;
        this.j = z2;
        this.k = tvwVar;
        this.l = z3;
        this.m = str6;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = i2;
        this.r = str7;
        this.s = str8;
        this.t = str9;
        this.u = str10;
        this.v = str11;
        this.w = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3w)) {
            return false;
        }
        p3w p3wVar = (p3w) obj;
        return Intrinsics.d(this.f26320a, p3wVar.f26320a) && Intrinsics.d(this.b, p3wVar.b) && Intrinsics.d(this.c, p3wVar.c) && Intrinsics.d(this.d, p3wVar.d) && Intrinsics.d(this.e, p3wVar.e) && Intrinsics.d(this.f, p3wVar.f) && Intrinsics.d(this.g, p3wVar.g) && this.h == p3wVar.h && this.i == p3wVar.i && this.j == p3wVar.j && this.k.equals(p3wVar.k) && this.l == p3wVar.l && Intrinsics.d(this.m, p3wVar.m) && this.n == p3wVar.n && this.o == p3wVar.o && this.p == p3wVar.p && this.q == p3wVar.q && Intrinsics.d(this.r, p3wVar.r) && this.s.equals(p3wVar.s) && this.t.equals(p3wVar.t) && Intrinsics.d(this.u, p3wVar.u) && this.v.equals(p3wVar.v) && this.w == p3wVar.w;
    }

    @Override // a.o8w
    public final String getKey() {
        return this.f26320a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.q, brm0.e(brm0.e(brm0.e(ua80.b(brm0.e((this.k.hashCode() + brm0.e(twn.a(this.i, brm0.e(cs0.b(this.g, cs0.b(this.f, ua80.b(ua80.b(ua80.b(ua80.b(this.f26320a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HistoryItemUiModel(key=", this.f26320a, ", betId=", this.b, ", date=");
        f140.v(sbN, this.c, ", type=", this.d, ", betNumber=");
        cs0.B(sbN, this.e, ", tagList=", this.f, ", itemsDescriptionList=");
        sbN.append(this.g);
        sbN.append(", notificationVisibility=");
        sbN.append(this.h);
        sbN.append(", notificationIconResId=");
        brm0.w(this.i, ", isNotificationEnable=", ", iconBetUiModel=", sbN, this.j);
        sbN.append(this.k);
        sbN.append(", sellVisibility=");
        sbN.append(this.l);
        sbN.append(", sellTitleButton=");
        brm0.C(this.m, ", aggregatorVisibility=", ", moreVisibility=", sbN, this.n);
        ua80.u(", middleVisibility=", ", couponStatusRes=", sbN, this.o, this.p);
        kng0.w(this.q, ", betCount=", this.r, ", eventInfo=", sbN);
        f140.v(sbN, this.s, ", coefficient=", this.t, ", marketInfo=");
        f140.v(sbN, this.u, ", subMarketInfo=", this.v, ", copyVisibility=");
        return rw2.p(sbN, this.w, Separators.RPAREN);
    }
}
