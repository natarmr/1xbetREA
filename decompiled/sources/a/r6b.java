package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class r6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29927a;
    public final Map b;
    public final List c;
    public final Map d;
    public final l9s e;
    public final js20 f;
    public final js20 g;
    public final List h;
    public final xvm0 i;
    public final xvm0 j;
    public final List k;
    public final n6b l;
    public final aw20 m;
    public final boolean n;
    public final ycs o;
    public final String p;
    public final boolean q;
    public final oxk0 r;
    public final boolean s;

    public r6b(List list, Map map, List list2, Map map2, l9s l9sVar, js20 js20Var, js20 js20Var2, List list3, xvm0 xvm0Var, xvm0 xvm0Var2, List list4, n6b n6bVar, aw20 aw20Var, boolean z, ycs ycsVar, String str, boolean z2, oxk0 oxk0Var, boolean z3) {
        b1j.B(list, list3, list4);
        this.f29927a = list;
        this.b = map;
        this.c = list2;
        this.d = map2;
        this.e = l9sVar;
        this.f = js20Var;
        this.g = js20Var2;
        this.h = list3;
        this.i = xvm0Var;
        this.j = xvm0Var2;
        this.k = list4;
        this.l = n6bVar;
        this.m = aw20Var;
        this.n = z;
        this.o = ycsVar;
        this.p = str;
        this.q = z2;
        this.r = oxk0Var;
        this.s = z3;
    }

    public static r6b a(r6b r6bVar, List list, Map map, List list2, Map map2, l9s l9sVar, js20 js20Var, js20 js20Var2, List list3, xvm0 xvm0Var, xvm0 xvm0Var2, List list4, aw20 aw20Var, ycs ycsVar, String str, boolean z, boolean z2, int i) {
        List list5 = (i & 1) != 0 ? r6bVar.f29927a : list;
        Map map3 = (i & 2) != 0 ? r6bVar.b : map;
        List list6 = (i & 4) != 0 ? r6bVar.c : list2;
        Map map4 = (i & 8) != 0 ? r6bVar.d : map2;
        l9s l9sVar2 = (i & 16) != 0 ? r6bVar.e : l9sVar;
        js20 js20Var3 = (i & 32) != 0 ? r6bVar.f : js20Var;
        js20 js20Var4 = (i & 64) != 0 ? r6bVar.g : js20Var2;
        List list7 = (i & 128) != 0 ? r6bVar.h : list3;
        xvm0 xvm0Var3 = (i & 256) != 0 ? r6bVar.i : xvm0Var;
        xvm0 xvm0Var4 = (i & 512) != 0 ? r6bVar.j : xvm0Var2;
        List list8 = (i & 1024) != 0 ? r6bVar.k : list4;
        n6b n6bVar = r6bVar.l;
        aw20 aw20Var2 = (i & 4096) != 0 ? r6bVar.m : aw20Var;
        boolean z3 = r6bVar.n;
        ycs ycsVar2 = (i & 16384) != 0 ? r6bVar.o : ycsVar;
        String str2 = (32768 & i) != 0 ? r6bVar.p : str;
        boolean z4 = (65536 & i) != 0 ? r6bVar.q : z;
        oxk0 oxk0Var = r6bVar.r;
        boolean z5 = (i & 262144) != 0 ? r6bVar.s : z2;
        r6bVar.getClass();
        list5.getClass();
        js20Var3.getClass();
        list7.getClass();
        xvm0Var3.getClass();
        list8.getClass();
        aw20Var2.getClass();
        str2.getClass();
        return new r6b(list5, map3, list6, map4, l9sVar2, js20Var3, js20Var4, list7, xvm0Var3, xvm0Var4, list8, n6bVar, aw20Var2, z3, ycsVar2, str2, z4, oxk0Var, z5);
    }

    public final RelatedParams b() {
        l9s l9sVar = this.e;
        boolean z = l9sVar != null && l9sVar.e();
        long jA = l9sVar != null ? l9sVar.a() : -1L;
        long jB = l9sVar != null ? l9sVar.b() : -1L;
        tef0 tef0Var = tef0.f33818a;
        xuz xuzVar = pb10.c;
        return new RelatedParams(z, jA, l9sVar != null ? l9sVar.c() : -1L, l9sVar != null ? l9sVar.d() : -1L, jB, tef0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6b)) {
            return false;
        }
        r6b r6bVar = (r6b) obj;
        return Intrinsics.d(this.f29927a, r6bVar.f29927a) && this.b.equals(r6bVar.b) && Intrinsics.d(this.c, r6bVar.c) && this.d.equals(r6bVar.d) && Intrinsics.d(this.e, r6bVar.e) && this.f.equals(r6bVar.f) && Intrinsics.d(this.g, r6bVar.g) && Intrinsics.d(this.h, r6bVar.h) && this.i.equals(r6bVar.i) && Intrinsics.d(this.j, r6bVar.j) && Intrinsics.d(this.k, r6bVar.k) && this.l.equals(r6bVar.l) && this.m.equals(r6bVar.m) && this.n == r6bVar.n && Intrinsics.d(this.o, r6bVar.o) && this.p.equals(r6bVar.p) && this.q == r6bVar.q && this.r == r6bVar.r && this.s == r6bVar.s;
    }

    public final int hashCode() {
        int iF = ohs0.f(this.b, this.f29927a.hashCode() * 31, 31);
        List list = this.c;
        int iF2 = ohs0.f(this.d, (iF + (list == null ? 0 : list.hashCode())) * 31, 31);
        l9s l9sVar = this.e;
        int iHashCode = (this.f.hashCode() + ((iF2 + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31)) * 31;
        js20 js20Var = this.g;
        int iHashCode2 = (this.i.hashCode() + dw9.a((iHashCode + (js20Var == null ? 0 : js20Var.hashCode())) * 31, 31, this.h)) * 31;
        xvm0 xvm0Var = this.j;
        int iE = brm0.e((this.m.hashCode() + ((this.l.hashCode() + dw9.a((iHashCode2 + (xvm0Var == null ? 0 : xvm0Var.hashCode())) * 31, 31, this.k)) * 31)) * 31, 31, this.n);
        ycs ycsVar = this.o;
        return Boolean.hashCode(this.s) + ((this.r.hashCode() + brm0.e(ua80.b((iE + (ycsVar != null ? ycsVar.hashCode() : 0)) * 31, 31, this.p), 31, this.q)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryMarketsStateModel(totalExactSelectedModels=");
        sb.append(this.f29927a);
        sb.append(", bettingMarkets=");
        sb.append(this.b);
        sb.append(", insights=");
        sb.append(this.c);
        sb.append(", categoryMarkets=");
        sb.append(this.d);
        sb.append(", gameDetailsModel=");
        sb.append(this.e);
        sb.append(", selectedCategory=");
        sb.append(this.f);
        sb.append(", previousSelectedCategory=");
        sb.append(this.g);
        sb.append(", categories=");
        sb.append(this.h);
        sb.append(", selectedSubGame=");
        sb.append(this.i);
        sb.append(", previousSelectedSubGame=");
        sb.append(this.j);
        sb.append(", subGames=");
        sb.append(this.k);
        sb.append(", settings=");
        sb.append(this.l);
        sb.append(", marketPropertiesModel=");
        sb.append(this.m);
        sb.append(", rtlSupport=");
        sb.append(this.n);
        sb.append(", gameHighlightModel=");
        sb.append(this.o);
        sb.append(", subGamesSearchQuery=");
        sb.append(this.p);
        sb.append(", isSubGamesSearchActive=");
        sb.append(this.q);
        sb.append(", supportedSpecialType=");
        sb.append(this.r);
        sb.append(", isBetBuilderModeEnabled=");
        return rw2.p(sb, this.s, Separators.RPAREN);
    }
}
