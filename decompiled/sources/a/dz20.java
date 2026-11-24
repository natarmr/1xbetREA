package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dz20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6921a;
    public final js20 b;
    public final Long c;
    public final List d;
    public final Long e;
    public final xvm0 f;
    public final udl0 g;
    public final boolean h;
    public final String i;
    public final px7 j;
    public final sf6 k;
    public final boolean l;

    public dz20(List list, js20 js20Var, Long l, List list2, Long l2, xvm0 xvm0Var, udl0 udl0Var, boolean z, String str, px7 px7Var, sf6 sf6Var, boolean z2) {
        this.f6921a = list;
        this.b = js20Var;
        this.c = l;
        this.d = list2;
        this.e = l2;
        this.f = xvm0Var;
        this.g = udl0Var;
        this.h = z;
        this.i = str;
        this.j = px7Var;
        this.k = sf6Var;
        this.l = z2;
    }

    public static dz20 a(dz20 dz20Var, List list, js20 js20Var, Long l, List list2, Long l2, xvm0 xvm0Var, boolean z, String str, px7 px7Var, sf6 sf6Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = dz20Var.f6921a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            js20Var = dz20Var.b;
        }
        js20 js20Var2 = js20Var;
        Long l3 = (i & 4) != 0 ? dz20Var.c : l;
        List list4 = (i & 8) != 0 ? dz20Var.d : list2;
        Long l4 = (i & 16) != 0 ? dz20Var.e : l2;
        xvm0 xvm0Var2 = (i & 32) != 0 ? dz20Var.f : xvm0Var;
        udl0 udl0Var = dz20Var.g;
        boolean z3 = (i & 128) != 0 ? dz20Var.h : z;
        String str2 = (i & 256) != 0 ? dz20Var.i : str;
        px7 px7Var2 = (i & 512) != 0 ? dz20Var.j : px7Var;
        sf6 sf6Var2 = (i & 1024) != 0 ? dz20Var.k : sf6Var;
        boolean z4 = (i & 2048) != 0 ? dz20Var.l : z2;
        dz20Var.getClass();
        px7Var2.getClass();
        return new dz20(list3, js20Var2, l3, list4, l4, xvm0Var2, udl0Var, z3, str2, px7Var2, sf6Var2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz20)) {
            return false;
        }
        dz20 dz20Var = (dz20) obj;
        return Intrinsics.d(this.f6921a, dz20Var.f6921a) && Intrinsics.d(this.b, dz20Var.b) && Intrinsics.d(this.c, dz20Var.c) && Intrinsics.d(this.d, dz20Var.d) && Intrinsics.d(this.e, dz20Var.e) && Intrinsics.d(this.f, dz20Var.f) && this.g == dz20Var.g && this.h == dz20Var.h && this.i.equals(dz20Var.i) && this.j.equals(dz20Var.j) && this.k.equals(dz20Var.k) && this.l == dz20Var.l;
    }

    public final int hashCode() {
        List list = this.f6921a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        js20 js20Var = this.b;
        int iHashCode2 = (iHashCode + (js20Var == null ? 0 : js20Var.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        xvm0 xvm0Var = this.f;
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + ((this.j.hashCode() + ua80.b(brm0.e((this.g.hashCode() + ((iHashCode5 + (xvm0Var != null ? xvm0Var.hashCode() : 0)) * 31)) * 31, 31, this.h), 31, this.i)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsCategoriesStateModel(marketCategories=");
        sb.append(this.f6921a);
        sb.append(", selectedCategory=");
        sb.append(this.b);
        sb.append(", selectedCategoryId=");
        twn.z(sb, this.c, ", subGames=", this.d, ", selectedSubGameId=");
        sb.append(this.e);
        sb.append(", selectedSubGame=");
        sb.append(this.f);
        sb.append(", sportGameType=");
        sb.append(this.g);
        sb.append(", isSearchVisible=");
        sb.append(this.h);
        sb.append(", searchQuery=");
        sb.append(this.i);
        sb.append(", bettingStateModel=");
        sb.append(this.j);
        sb.append(", betBuilder=");
        sb.append(this.k);
        sb.append(", isCategoriesReloading=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
