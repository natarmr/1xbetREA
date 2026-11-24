package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kr5 implements Serializable {
    public static final kr5 B;
    public final String A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18749a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;
    public final oo5 n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final List s;
    public final List t;
    public final int u;
    public final String v;
    public final String w;
    public final int x;
    public final String y;
    public final String z;

    static {
        iun iunVar = iun.f15405a;
        oo5 oo5Var = oo5.ACTION_INFO;
        us5[] us5VarArr = us5.f36194a;
        B = new kr5(iunVar, 0, 0, "", "", "", "", "", "", "", "", false, 0, oo5Var, "", "", "", "", iunVar, iunVar, 0, "", "", 9, "", "", "");
    }

    public kr5(List list, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i3, oo5 oo5Var, String str9, String str10, String str11, String str12, List list2, List list3, int i4, String str13, String str14, int i5, String str15, String str16, String str17) {
        list.getClass();
        str3.getClass();
        list2.getClass();
        list3.getClass();
        this.f18749a = list;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = z;
        this.m = i3;
        this.n = oo5Var;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = str12;
        this.s = list2;
        this.t = list3;
        this.u = i4;
        this.v = str13;
        this.w = str14;
        this.x = i5;
        this.y = str15;
        this.z = str16;
        this.A = str17;
    }

    public static kr5 b(kr5 kr5Var, int i) {
        List list = kr5Var.f18749a;
        int i2 = kr5Var.b;
        int i3 = kr5Var.c;
        String str = kr5Var.d;
        String str2 = kr5Var.e;
        String str3 = kr5Var.f;
        String str4 = kr5Var.g;
        String str5 = kr5Var.h;
        String str6 = kr5Var.i;
        String str7 = kr5Var.j;
        String str8 = kr5Var.k;
        boolean z = kr5Var.l;
        int i4 = kr5Var.m;
        oo5 oo5Var = kr5Var.n;
        String str9 = kr5Var.o;
        String str10 = kr5Var.p;
        String str11 = kr5Var.q;
        String str12 = kr5Var.r;
        List list2 = kr5Var.s;
        List list3 = kr5Var.t;
        int i5 = kr5Var.u;
        String str13 = kr5Var.v;
        String str14 = kr5Var.w;
        String str15 = kr5Var.y;
        String str16 = kr5Var.z;
        String str17 = kr5Var.A;
        kr5Var.getClass();
        list.getClass();
        str3.getClass();
        list2.getClass();
        list3.getClass();
        return new kr5(list, i2, i3, str, str2, str3, str4, str5, str6, str7, str8, z, i4, oo5Var, str9, str10, str11, str12, list2, list3, i5, str13, str14, i, str15, str16, str17);
    }

    public final boolean a() {
        return this.n == oo5.ACTION_INFO && this.m != 0 && this.u == 3;
    }

    public final boolean d() {
        return this.l || this.n != oo5.ACTION_INFO || a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr5)) {
            return false;
        }
        kr5 kr5Var = (kr5) obj;
        return Intrinsics.d(this.f18749a, kr5Var.f18749a) && this.b == kr5Var.b && this.c == kr5Var.c && this.d.equals(kr5Var.d) && this.e.equals(kr5Var.e) && Intrinsics.d(this.f, kr5Var.f) && this.g.equals(kr5Var.g) && this.h.equals(kr5Var.h) && this.i.equals(kr5Var.i) && this.j.equals(kr5Var.j) && this.k.equals(kr5Var.k) && this.l == kr5Var.l && this.m == kr5Var.m && this.n == kr5Var.n && this.o.equals(kr5Var.o) && this.p.equals(kr5Var.p) && this.q.equals(kr5Var.q) && this.r.equals(kr5Var.r) && Intrinsics.d(this.s, kr5Var.s) && Intrinsics.d(this.t, kr5Var.t) && this.u == kr5Var.u && this.v.equals(kr5Var.v) && this.w.equals(kr5Var.w) && this.x == kr5Var.x && this.y.equals(kr5Var.y) && this.z.equals(kr5Var.z) && this.A.equals(kr5Var.A);
    }

    public final int hashCode() {
        return this.A.hashCode() + ua80.b(ua80.b(twn.a(this.x, ua80.b(ua80.b(twn.a(this.u, dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b((this.n.hashCode() + twn.a(this.m, brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.c, twn.a(this.b, this.f18749a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31), 31, this.v), 31, this.w), 31), 31, this.y), 31, this.z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerModel(ref=");
        sb.append(this.f18749a);
        sb.append(", bannerId=");
        sb.append(this.b);
        sb.append(", sortID=");
        kng0.w(this.c, ", translateId=", this.d, ", prizeId=", sb);
        f140.v(sb, this.e, ", url=", this.f, ", previewUrl=");
        f140.v(sb, this.g, ", squareImageUrl=", this.h, ", bigSquareImageUrl=");
        f140.v(sb, this.i, ", verticalImageUrl=", this.j, ", horizontalImage=");
        brm0.C(this.k, ", action=", ", lotteryId=", sb, this.l);
        sb.append(this.m);
        sb.append(", actionType=");
        sb.append(this.n);
        sb.append(", title=");
        f140.v(sb, this.o, ", description=", this.p, ", ruleDescription=");
        f140.v(sb, this.q, ", gameDescription=", this.r, ", types=");
        b1j.y(", tabs=", ", prizeFlag=", sb, this.s, this.t);
        kng0.w(this.u, ", deeplink=", this.v, ", siteLink=", sb);
        twn.w(this.x, this.w, ", bannerType=", ", ticketsChipsName=", sb);
        f140.v(sb, this.y, ", content=", this.z, ", info=");
        return axq.n(sb, this.A, Separators.RPAREN);
    }
}
