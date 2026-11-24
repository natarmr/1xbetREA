package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yk0 f20321a;
    public final boolean b;
    public final ql5 c;
    public final kg d;
    public final zvh0 e;
    public final boolean f;
    public final ot0 g;
    public final String h;
    public final int i;
    public final Map j;
    public final Set k;
    public final List l;
    public final un0 m;
    public final un0 n;
    public final long o;
    public final boolean p;

    public ln0(yk0 yk0Var, boolean z, ql5 ql5Var, kg kgVar, zvh0 zvh0Var, boolean z2, ot0 ot0Var, String str, int i, Map map, Set set, List list, un0 un0Var, un0 un0Var2, long j, boolean z3) {
        kgVar.getClass();
        set.getClass();
        list.getClass();
        this.f20321a = yk0Var;
        this.b = z;
        this.c = ql5Var;
        this.d = kgVar;
        this.e = zvh0Var;
        this.f = z2;
        this.g = ot0Var;
        this.h = str;
        this.i = i;
        this.j = map;
        this.k = set;
        this.l = list;
        this.m = un0Var;
        this.n = un0Var2;
        this.o = j;
        this.p = z3;
    }

    public static ln0 a(ln0 ln0Var, yk0 yk0Var, boolean z, ql5 ql5Var, LinkedHashMap linkedHashMap, Set set, List list, un0 un0Var, un0 un0Var2, long j, boolean z2, int i) {
        yk0 yk0Var2 = (i & 1) != 0 ? ln0Var.f20321a : yk0Var;
        boolean z3 = (i & 2) != 0 ? ln0Var.b : z;
        ql5 ql5Var2 = (i & 4) != 0 ? ln0Var.c : ql5Var;
        kg kgVar = ln0Var.d;
        zvh0 zvh0Var = ln0Var.e;
        boolean z4 = ln0Var.f;
        ot0 ot0Var = ln0Var.g;
        String str = ln0Var.h;
        int i2 = ln0Var.i;
        Map map = (i & 512) != 0 ? ln0Var.j : linkedHashMap;
        Set set2 = (i & 1024) != 0 ? ln0Var.k : set;
        List list2 = (i & 2048) != 0 ? ln0Var.l : list;
        un0 un0Var3 = (i & 4096) != 0 ? ln0Var.m : un0Var;
        un0 un0Var4 = (i & 8192) != 0 ? ln0Var.n : un0Var2;
        long j2 = (i & 16384) != 0 ? ln0Var.o : j;
        boolean z5 = (i & 32768) != 0 ? ln0Var.p : z2;
        ln0Var.getClass();
        yk0Var2.getClass();
        kgVar.getClass();
        set2.getClass();
        list2.getClass();
        un0Var3.getClass();
        un0Var4.getClass();
        return new ln0(yk0Var2, z3, ql5Var2, kgVar, zvh0Var, z4, ot0Var, str, i2, map, set2, list2, un0Var3, un0Var4, j2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return this.f20321a == ln0Var.f20321a && this.b == ln0Var.b && Intrinsics.d(this.c, ln0Var.c) && this.d == ln0Var.d && this.e == ln0Var.e && this.f == ln0Var.f && this.g == ln0Var.g && this.h.equals(ln0Var.h) && this.i == ln0Var.i && this.j.equals(ln0Var.j) && Intrinsics.d(this.k, ln0Var.k) && Intrinsics.d(this.l, ln0Var.l) && this.m.equals(ln0Var.m) && this.n.equals(ln0Var.n) && this.o == ln0Var.o && this.p == ln0Var.p;
    }

    public final int hashCode() {
        int iE = brm0.e(this.f20321a.hashCode() * 31, 31, this.b);
        ql5 ql5Var = this.c;
        return Boolean.hashCode(this.p) + rw2.b((this.n.hashCode() + ((this.m.hashCode() + dw9.a(ohs0.g(this.k, ohs0.f(this.j, twn.a(this.i, ua80.b((this.g.hashCode() + brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((iE + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31)) * 31, 31, this.f)) * 31, 31, this.h), 31), 31), 31), 31, this.l)) * 31)) * 31, 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorFavoritesState(selectedTab=");
        sb.append(this.f20321a);
        sb.append(", isLoggedIn=");
        sb.append(this.b);
        sb.append(", balance=");
        sb.append(this.c);
        sb.append(", accountSelectionStyleConfigType=");
        sb.append(this.d);
        sb.append(", segmentControlStyleModel=");
        sb.append(this.e);
        sb.append(", isVirtual=");
        sb.append(this.f);
        sb.append(", aggregatorGameCardCollectionStyleType=");
        sb.append(this.g);
        sb.append(", screenName=");
        sb.append(this.h);
        sb.append(", lottieTypeId=");
        sb.append(this.i);
        sb.append(", gamesMap=");
        sb.append(this.j);
        sb.append(", favoriteGameIds=");
        sb.append(this.k);
        sb.append(", recommendedCategories=");
        sb.append(this.l);
        sb.append(", favoritesTabContent=");
        sb.append(this.m);
        sb.append(", viewedTabContent=");
        sb.append(this.n);
        sb.append(", gameCategoryIdToOpen=");
        hne.t(this.o, ", recommendedCategoriesLoaded=", sb, this.p);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
