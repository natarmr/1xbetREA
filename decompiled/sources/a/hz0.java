package a;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13884a;
    public final g9h0 b;
    public final String c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final int g;
    public final Map h;
    public final ot0 i;

    public hz0(String str, g9h0 g9h0Var, String str2, boolean z, List list, boolean z2, int i, Map map, ot0 ot0Var) {
        list.getClass();
        this.f13884a = str;
        this.b = g9h0Var;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = z2;
        this.g = i;
        this.h = map;
        this.i = ot0Var;
    }

    public static hz0 a(hz0 hz0Var, String str, g9h0 g9h0Var, String str2, List list, boolean z, int i, jo20 jo20Var, int i2) {
        if ((i2 & 1) != 0) {
            str = hz0Var.f13884a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            g9h0Var = hz0Var.b;
        }
        g9h0 g9h0Var2 = g9h0Var;
        if ((i2 & 4) != 0) {
            str2 = hz0Var.c;
        }
        String str4 = str2;
        boolean z2 = hz0Var.d;
        List list2 = (i2 & 16) != 0 ? hz0Var.e : list;
        boolean z3 = (i2 & 32) != 0 ? hz0Var.f : z;
        int i3 = (i2 & 64) != 0 ? hz0Var.g : i;
        Map map = (i2 & 128) != 0 ? hz0Var.h : jo20Var;
        ot0 ot0Var = hz0Var.i;
        hz0Var.getClass();
        hz0Var.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        return new hz0(str3, g9h0Var2, str4, z2, list2, z3, i3, map, ot0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz0)) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return this.f13884a.equals(hz0Var.f13884a) && this.b.equals(hz0Var.b) && this.c.equals(hz0Var.c) && this.d == hz0Var.d && Intrinsics.d(this.e, hz0Var.e) && this.f == hz0Var.f && this.g == hz0Var.g && this.h.equals(hz0Var.h) && this.i == hz0Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(-1L) + ((this.i.hashCode() + ohs0.f(this.h, twn.a(this.g, brm0.e(dw9.a(brm0.e(ua80.b((this.b.hashCode() + (this.f13884a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorGamesSearchState(query=");
        sb.append(this.f13884a);
        sb.append(", screenState=");
        sb.append(this.b);
        sb.append(", lastQuery=");
        brm0.C(this.c, ", hasSectionVirtual=", ", favoriteGames=", sb, this.d);
        rz4.z(sb, ", hasSearchResult=", this.e, ", subCategoryId=", this.f);
        sb.append(this.g);
        sb.append(", gamesMap=");
        sb.append(this.h);
        sb.append(", searchAggregatorCardStyle=");
        sb.append(this.i);
        sb.append(", gameCategoryIdToOpen=-1)");
        return sb.toString();
    }
}
