package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jzh implements ozh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17412a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final n0x l;
    public final n0x m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final String r;

    public jzh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, n0x n0xVar, n0x n0xVar2, String str12, String str13, String str14, int i, String str15) {
        ohs0.z(str3, str4, str5, str6, str7);
        ohs0.z(str8, str9, str10, str11, str12);
        str13.getClass();
        str14.getClass();
        this.f17412a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = n0xVar;
        this.m = n0xVar2;
        this.n = str12;
        this.o = str13;
        this.p = str14;
        this.q = i;
        this.r = str15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzh)) {
            return false;
        }
        jzh jzhVar = (jzh) obj;
        return Intrinsics.d(this.f17412a, jzhVar.f17412a) && Intrinsics.d(this.b, jzhVar.b) && Intrinsics.d(this.c, jzhVar.c) && Intrinsics.d(this.d, jzhVar.d) && Intrinsics.d(this.e, jzhVar.e) && Intrinsics.d(this.f, jzhVar.f) && Intrinsics.d(this.g, jzhVar.g) && Intrinsics.d(this.h, jzhVar.h) && Intrinsics.d(this.i, jzhVar.i) && Intrinsics.d(this.j, jzhVar.j) && Intrinsics.d(this.k, jzhVar.k) && this.l.equals(jzhVar.l) && this.m.equals(jzhVar.m) && Intrinsics.d(this.n, jzhVar.n) && Intrinsics.d(this.o, jzhVar.o) && Intrinsics.d(this.p, jzhVar.p) && this.q == jzhVar.q && Intrinsics.d(this.r, jzhVar.r);
    }

    public final int hashCode() {
        String str = this.f17412a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iA = twn.a(100, twn.a(this.q, ua80.b(ua80.b(ua80.b(f140.f(this.m, f140.f(this.l, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31, this.p), 31), 31);
        String str3 = this.r;
        return brm0.e(brm0.e((iA + (str3 == null ? 0 : str3.hashCode())) * 31, 31, true), 29791, false);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CurrentCompleted(headerText=", this.f17412a, ", tagText=", this.b, ", titleText=");
        f140.v(sbN, this.c, ", titleTextPlaceholderNoTask=", this.d, ", titleTextPlaceholderTask=");
        f140.v(sbN, this.e, ", labelText=", this.f, ", labelTextPlaceholderTask=");
        f140.v(sbN, this.g, ", labelTextPlaceholderNoTask=", this.h, ", buttonTextActive=");
        f140.v(sbN, this.i, ", buttonTextInactive=", this.j, ", buttonTextPlaceholder=");
        sbN.append(this.k);
        sbN.append(", linkCurrent=");
        sbN.append(this.l);
        sbN.append(", linkPlaceholder=");
        sbN.append(this.m);
        sbN.append(", tagCompleteText=");
        sbN.append(this.n);
        sbN.append(", textCurrentProgress=");
        f140.v(sbN, this.o, ", textMaxProgress=", this.p, ", progress=");
        return rw2.k(this.q, ", maxProgress=100, maxProgressCurrency=", this.r, ", isAuthorized=true, isNoTask=false, taskKind=null, productId=null, taskId=null)", sbN);
    }
}
