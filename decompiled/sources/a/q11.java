package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27928a;
    public final d7v b;
    public final d7v c;
    public final Integer d;
    public final boolean e;
    public final b7v f;
    public final m7v g;
    public final List h;
    public final List i;
    public final List j;
    public final Map k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final g7v o;
    public final int p;
    public final boolean q;
    public final String r;
    public final ql5 s;
    public final c01 t;
    public final kg u;
    public final boolean v;
    public final List w;
    public final ot0 x;
    public final Set y;

    public q11(long j, d7v d7vVar, d7v d7vVar2, Integer num, boolean z, b7v b7vVar, m7v m7vVar, List list, List list2, List list3, Map map, boolean z2, boolean z3, boolean z4, g7v g7vVar, int i, boolean z5, String str, ql5 ql5Var, c01 c01Var, kg kgVar, boolean z6, List list4, ot0 ot0Var, Set set) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        str.getClass();
        kgVar.getClass();
        list4.getClass();
        set.getClass();
        this.f27928a = j;
        this.b = d7vVar;
        this.c = d7vVar2;
        this.d = num;
        this.e = z;
        this.f = b7vVar;
        this.g = m7vVar;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = map;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = g7vVar;
        this.p = i;
        this.q = z5;
        this.r = str;
        this.s = ql5Var;
        this.t = c01Var;
        this.u = kgVar;
        this.v = z6;
        this.w = list4;
        this.x = ot0Var;
        this.y = set;
    }

    public static q11 a(q11 q11Var, long j, d7v d7vVar, Integer num, b7v b7vVar, m7v m7vVar, List list, List list2, List list3, LinkedHashMap linkedHashMap, boolean z, boolean z2, boolean z3, g7v g7vVar, boolean z4, ql5 ql5Var, ArrayList arrayList, Set set, int i) {
        long j2 = (i & 1) != 0 ? q11Var.f27928a : j;
        d7v d7vVar2 = (i & 2) != 0 ? q11Var.b : d7vVar;
        d7v d7vVar3 = q11Var.c;
        q11Var.getClass();
        Integer num2 = (i & 16) != 0 ? q11Var.d : num;
        q11Var.getClass();
        q11Var.getClass();
        boolean z5 = q11Var.e;
        b7v b7vVar2 = (i & 256) != 0 ? q11Var.f : b7vVar;
        m7v m7vVar2 = (i & 512) != 0 ? q11Var.g : m7vVar;
        List list4 = (i & 1024) != 0 ? q11Var.h : list;
        List list5 = (i & 2048) != 0 ? q11Var.i : list2;
        List list6 = (i & 4096) != 0 ? q11Var.j : list3;
        Map map = (i & 8192) != 0 ? q11Var.k : linkedHashMap;
        boolean z6 = (i & 16384) != 0 ? q11Var.l : z;
        boolean z7 = (32768 & i) != 0 ? q11Var.m : z2;
        boolean z8 = (65536 & i) != 0 ? q11Var.n : z3;
        g7v g7vVar2 = (131072 & i) != 0 ? q11Var.o : g7vVar;
        int i2 = q11Var.p;
        boolean z9 = (524288 & i) != 0 ? q11Var.q : z4;
        String str = q11Var.r;
        ql5 ql5Var2 = (2097152 & i) != 0 ? q11Var.s : ql5Var;
        c01 c01Var = q11Var.t;
        kg kgVar = q11Var.u;
        boolean z10 = q11Var.v;
        q11Var.getClass();
        List list7 = (i & 67108864) != 0 ? q11Var.w : arrayList;
        ot0 ot0Var = q11Var.x;
        Set set2 = (i & 268435456) != 0 ? q11Var.y : set;
        q11Var.getClass();
        d7vVar2.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        str.getClass();
        kgVar.getClass();
        list7.getClass();
        set2.getClass();
        return new q11(j2, d7vVar2, d7vVar3, num2, z5, b7vVar2, m7vVar2, list4, list5, list6, map, z6, z7, z8, g7vVar2, i2, z9, str, ql5Var2, c01Var, kgVar, z10, list7, ot0Var, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q11)) {
            return false;
        }
        q11 q11Var = (q11) obj;
        return this.f27928a == q11Var.f27928a && this.b == q11Var.b && this.c == q11Var.c && Intrinsics.d(this.d, q11Var.d) && this.e == q11Var.e && this.f.equals(q11Var.f) && this.g.equals(q11Var.g) && Intrinsics.d(this.h, q11Var.h) && Intrinsics.d(this.i, q11Var.i) && Intrinsics.d(this.j, q11Var.j) && this.k.equals(q11Var.k) && this.l == q11Var.l && this.m == q11Var.m && this.n == q11Var.n && this.o.equals(q11Var.o) && this.p == q11Var.p && this.q == q11Var.q && Intrinsics.d(this.r, q11Var.r) && Intrinsics.d(this.s, q11Var.s) && this.t == q11Var.t && this.u == q11Var.u && this.v == q11Var.v && Intrinsics.d(this.w, q11Var.w) && this.x == q11Var.x && Intrinsics.d(this.y, q11Var.y);
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f27928a) * 31)) * 31)) * 31, 31, false);
        Integer num = this.d;
        int iB = ua80.b(brm0.e(twn.a(this.p, (this.o.hashCode() + brm0.e(brm0.e(brm0.e(ohs0.f(this.k, dw9.a(dw9.a(dw9.a((this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e(brm0.e((iE + (num == null ? 0 : num.hashCode())) * 31, 31, false), 31, false), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n)) * 31, 31), 31, this.q), 31, this.r);
        ql5 ql5Var = this.s;
        return this.y.hashCode() + ((this.x.hashCode() + dw9.a(brm0.e(brm0.e((this.u.hashCode() + ((this.t.hashCode() + ((iB + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.v), 31, true), 31, this.w)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorGiftsState(currentAccountId=");
        sb.append(this.f27928a);
        sb.append(", currentActiveChipType=");
        sb.append(this.b);
        sb.append(", primaryBalanceChipType=");
        sb.append(this.c);
        sb.append(", topGamesIsLoaded=false, bonusIdForDelete=");
        sb.append(this.d);
        sb.append(", giftsIsUpdate=false, dataIsLoaded=false, hasSocial=");
        sb.append(this.e);
        sb.append(", bonusesState=");
        sb.append(this.f);
        sb.append(", freeSpinsState=");
        sb.append(this.g);
        sb.append(", bonusesByAccount=");
        sb.append(this.h);
        hne.v(", freeSpinsByAccount=", ", topGames=", sb, this.i, this.j);
        sb.append(", gamesMap=");
        sb.append(this.k);
        sb.append(", lastConnection=");
        sb.append(this.l);
        w6x.A(", isAuth=", ", resetScroll=", sb, this.m, this.n);
        sb.append(", chips=");
        sb.append(this.o);
        sb.append(", lottieAnimationTypeId=");
        sb.append(this.p);
        hne.u(", hasBlockingError=", ", pageTitle=", this.r, sb, this.q);
        sb.append(", balance=");
        sb.append(this.s);
        sb.append(", giftsStyle=");
        sb.append(this.t);
        sb.append(", accountSelectionConfigType=");
        sb.append(this.u);
        sb.append(", hasSectionVirtual=");
        sb.append(this.v);
        sb.append(", allClickAlwaysEnable=true, launchEntitiesGifts=");
        sb.append(this.w);
        sb.append(", aggregatorGameCardCollectionStyle=");
        sb.append(this.x);
        sb.append(", favoriteIdList=");
        sb.append(this.y);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
