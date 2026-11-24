package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d140 {
    public final String A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5292a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final i8m0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final ay10 n;
    public final kg o;
    public final boolean p;
    public final Map q;
    public final Set r;
    public final r040 s;
    public final boolean t;
    public final String u;
    public final aeo0 v;
    public final List w;
    public final List x;
    public final String y;
    public final int z;

    public d140(boolean z, boolean z2, boolean z3, Integer num, i8m0 i8m0Var, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, ay10 ay10Var, kg kgVar, boolean z7, Map map, Set set, r040 r040Var, boolean z8, String str6, aeo0 aeo0Var, List list, List list2, String str7, int i, String str8, boolean z9) {
        kgVar.getClass();
        set.getClass();
        r040Var.getClass();
        list.getClass();
        list2.getClass();
        str8.getClass();
        this.f5292a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = i8m0Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str5;
        this.n = ay10Var;
        this.o = kgVar;
        this.p = z7;
        this.q = map;
        this.r = set;
        this.s = r040Var;
        this.t = z8;
        this.u = str6;
        this.v = aeo0Var;
        this.w = list;
        this.x = list2;
        this.y = str7;
        this.z = i;
        this.A = str8;
        this.B = z9;
    }

    public static d140 a(d140 d140Var, boolean z, boolean z2, boolean z3, Integer num, i8m0 i8m0Var, String str, String str2, String str3, String str4, boolean z4, boolean z5, String str5, boolean z6, Map map, Set set, r040 r040Var, List list, List list2, String str6, int i) {
        boolean z7 = (i & 1) != 0 ? d140Var.f5292a : z;
        boolean z8 = (i & 2) != 0 ? d140Var.b : z2;
        boolean z9 = (i & 4) != 0 ? d140Var.c : z3;
        Integer num2 = (i & 8) != 0 ? d140Var.d : num;
        i8m0 i8m0Var2 = (i & 16) != 0 ? d140Var.e : i8m0Var;
        String str7 = (i & 32) != 0 ? d140Var.f : str;
        String str8 = (i & 64) != 0 ? d140Var.g : str2;
        String str9 = (i & 128) != 0 ? d140Var.h : str3;
        String str10 = (i & 256) != 0 ? d140Var.i : str4;
        d140Var.getClass();
        boolean z10 = d140Var.j;
        boolean z11 = (i & 2048) != 0 ? d140Var.k : z4;
        boolean z12 = (i & 4096) != 0 ? d140Var.l : z5;
        String str11 = (i & 8192) != 0 ? d140Var.m : str5;
        ay10 ay10Var = d140Var.n;
        kg kgVar = d140Var.o;
        boolean z13 = (i & 65536) != 0 ? d140Var.p : z6;
        Map map2 = (i & 131072) != 0 ? d140Var.q : map;
        Set set2 = (i & 262144) != 0 ? d140Var.r : set;
        r040 r040Var2 = (i & 524288) != 0 ? d140Var.s : r040Var;
        boolean z14 = (i & 1048576) != 0 ? d140Var.t : false;
        d140Var.getClass();
        String str12 = d140Var.u;
        aeo0 aeo0Var = d140Var.v;
        List list3 = (i & 16777216) != 0 ? d140Var.w : list;
        List list4 = (i & 33554432) != 0 ? d140Var.x : list2;
        String str13 = (i & 67108864) != 0 ? d140Var.y : str6;
        int i2 = d140Var.z;
        String str14 = d140Var.A;
        boolean z15 = (i & 536870912) != 0 ? d140Var.B : true;
        d140Var.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        kgVar.getClass();
        map2.getClass();
        set2.getClass();
        r040Var2.getClass();
        list3.getClass();
        list4.getClass();
        str13.getClass();
        str14.getClass();
        return new d140(z7, z8, z9, num2, i8m0Var2, str7, str8, str9, str10, z10, z11, z12, str11, ay10Var, kgVar, z13, map2, set2, r040Var2, z14, str12, aeo0Var, list3, list4, str13, i2, str14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d140)) {
            return false;
        }
        d140 d140Var = (d140) obj;
        return this.f5292a == d140Var.f5292a && this.b == d140Var.b && this.c == d140Var.c && Intrinsics.d(this.d, d140Var.d) && this.e == d140Var.e && this.f.equals(d140Var.f) && this.g.equals(d140Var.g) && this.h.equals(d140Var.h) && this.i.equals(d140Var.i) && this.j == d140Var.j && this.k == d140Var.k && this.l == d140Var.l && this.m.equals(d140Var.m) && this.n == d140Var.n && this.o == d140Var.o && this.p == d140Var.p && this.q.equals(d140Var.q) && Intrinsics.d(this.r, d140Var.r) && this.s == d140Var.s && this.t == d140Var.t && this.u.equals(d140Var.u) && this.v == d140Var.v && Intrinsics.d(this.w, d140Var.w) && Intrinsics.d(this.x, d140Var.x) && this.y.equals(d140Var.y) && this.z == d140Var.z && Intrinsics.d(this.A, d140Var.A) && this.B == d140Var.B;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f5292a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        i8m0 i8m0Var = this.e;
        return Boolean.hashCode(this.B) + ua80.b(twn.a(this.z, ua80.b(dw9.a(dw9.a((this.v.hashCode() + ua80.b(brm0.e(brm0.e(w6x.f(this.s, ohs0.g(this.r, ohs0.f(this.q, brm0.e((this.o.hashCode() + ((this.n.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(twn.a(1357, ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (i8m0Var == null ? 0 : i8m0Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31, 31, this.p), 31), 31), 31), 31, this.t), 31, false), 31, this.u)) * 31, 31, this.w), 31, this.x), 31, this.y), 31), 31, this.A);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("MenuState(sessionTimerVisible=", ", accountSelectionVisible=", ", menuMessageVisible=", this.f5292a, this.b);
        sbQ.append(this.c);
        sbQ.append(", messagesCount=");
        sbQ.append(this.d);
        sbQ.append(", settingsIconStatus=");
        sbQ.append(this.e);
        sbQ.append(", profileName=");
        sbQ.append(this.f);
        sbQ.append(", balanceTitle=");
        f140.v(sbQ, this.g, ", money=", this.h, ", currency=");
        brm0.C(this.i, ", groupId=1357, isUseStaticImage=", ", isLoading=", sbQ, this.j);
        ua80.u(", scrollToTop=", ", sessionTime=", sbQ, this.k, this.l);
        sbQ.append(this.m);
        sbQ.append(", menuType=");
        sbQ.append(this.n);
        sbQ.append(", accountSelectionStyle=");
        sbQ.append(this.o);
        sbQ.append(", authorized=");
        sbQ.append(this.p);
        sbQ.append(", menuSections=");
        sbQ.append(this.q);
        sbQ.append(", expandedSections=");
        sbQ.append(this.r);
        sbQ.append(", selectedTab=");
        sbQ.append(this.s);
        sbQ.append(", changeTabWithoutAnimation=");
        sbQ.append(this.t);
        sbQ.append(", isLoadingSections=false, xGamesName=");
        sbQ.append(this.u);
        sbQ.append(", menuTabsStyle=");
        sbQ.append(this.v);
        sbQ.append(", subSports=");
        b1j.y(", markedItems=", ", appName=", sbQ, this.w, this.x);
        twn.w(this.z, this.y, ", profileIconRes=", ", loaltyProgramName=", sbQ);
        return defpackage.c.c(this.A, ", isAggregatorTipsShown=", Separators.RPAREN, sbQ, this.B);
    }
}
