package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class izh implements ozh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15635a;
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
    public final qll s;
    public final long t;

    public izh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, n0x n0xVar, n0x n0xVar2, String str12, String str13, String str14, int i, String str15, qll qllVar, long j) {
        ohs0.z(str3, str4, str5, str6, str7);
        ohs0.z(str8, str9, str10, str11, str12);
        str13.getClass();
        str14.getClass();
        this.f15635a = str;
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
        this.s = qllVar;
        this.t = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izh)) {
            return false;
        }
        izh izhVar = (izh) obj;
        return Intrinsics.d(this.f15635a, izhVar.f15635a) && Intrinsics.d(this.b, izhVar.b) && Intrinsics.d(this.c, izhVar.c) && Intrinsics.d(this.d, izhVar.d) && Intrinsics.d(this.e, izhVar.e) && Intrinsics.d(this.f, izhVar.f) && Intrinsics.d(this.g, izhVar.g) && Intrinsics.d(this.h, izhVar.h) && Intrinsics.d(this.i, izhVar.i) && Intrinsics.d(this.j, izhVar.j) && Intrinsics.d(this.k, izhVar.k) && this.l.equals(izhVar.l) && this.m.equals(izhVar.m) && Intrinsics.d(this.n, izhVar.n) && Intrinsics.d(this.o, izhVar.o) && Intrinsics.d(this.p, izhVar.p) && this.q == izhVar.q && Intrinsics.d(this.r, izhVar.r) && this.s == izhVar.s && this.t == izhVar.t;
    }

    public final int hashCode() {
        String str = this.f15635a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iA = twn.a(100, twn.a(this.q, ua80.b(ua80.b(ua80.b(f140.f(this.m, f140.f(this.l, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31, this.p), 31), 31);
        String str3 = this.r;
        return rw2.b((this.s.hashCode() + brm0.e(brm0.e((iA + (str3 == null ? 0 : str3.hashCode())) * 31, 31, true), 31, false)) * 31, 31, this.t);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CurrentActive(headerText=", this.f15635a, ", tagText=", this.b, ", titleText=");
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
        kng0.w(this.q, ", maxProgress=100, maxProgressCurrency=", this.r, ", isAuthorized=true, isNoTask=false, taskKind=", sbN);
        sbN.append(this.s);
        sbN.append(", productId=");
        sbN.append(this.t);
        sbN.append(", taskId=null)");
        return sbN.toString();
    }
}
