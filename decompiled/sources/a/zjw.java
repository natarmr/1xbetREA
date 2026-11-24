package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44501a;
    public final sff0 b;
    public final List c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final ekw g;
    public final Map h;
    public final boolean i;
    public final Map j;
    public final boolean k;
    public final Map l;
    public final Map m;
    public final Map n;
    public final Map o;
    public final Map p;
    public final Map q;
    public final boolean r;
    public final boolean s;

    public zjw(List list, sff0 sff0Var, List list2, List list3, boolean z, boolean z2, ekw ekwVar, Map map, boolean z3, Map map2, boolean z4, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, boolean z5, boolean z6) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        map3.getClass();
        this.f44501a = list;
        this.b = sff0Var;
        this.c = list2;
        this.d = list3;
        this.e = z;
        this.f = z2;
        this.g = ekwVar;
        this.h = map;
        this.i = z3;
        this.j = map2;
        this.k = z4;
        this.l = map3;
        this.m = map4;
        this.n = map5;
        this.o = map6;
        this.p = map7;
        this.q = map8;
        this.r = z5;
        this.s = z6;
    }

    public static zjw a(zjw zjwVar, List list, ekw ekwVar, LinkedHashMap linkedHashMap, boolean z, LinkedHashMap linkedHashMap2, boolean z2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6, LinkedHashMap linkedHashMap7, LinkedHashMap linkedHashMap8, int i) {
        List list2 = zjwVar.f44501a;
        sff0 sff0Var = zjwVar.b;
        List list3 = zjwVar.c;
        List list4 = (i & 8) != 0 ? zjwVar.d : list;
        boolean z3 = zjwVar.e;
        List list5 = list4;
        boolean z4 = zjwVar.f;
        ekw ekwVar2 = (i & 64) != 0 ? zjwVar.g : ekwVar;
        Map map = (i & 128) != 0 ? zjwVar.h : linkedHashMap;
        boolean z5 = (i & 256) != 0 ? zjwVar.i : z;
        Map map2 = (i & 512) != 0 ? zjwVar.j : linkedHashMap2;
        boolean z6 = (i & 1024) != 0 ? zjwVar.k : z2;
        Map map3 = (i & 2048) != 0 ? zjwVar.l : linkedHashMap3;
        Map map4 = (i & 4096) != 0 ? zjwVar.m : linkedHashMap4;
        Map map5 = (i & 8192) != 0 ? zjwVar.n : linkedHashMap5;
        Map map6 = (i & 16384) != 0 ? zjwVar.o : linkedHashMap6;
        Map map7 = (i & 32768) != 0 ? zjwVar.p : linkedHashMap7;
        Map map8 = (i & 65536) != 0 ? zjwVar.q : linkedHashMap8;
        boolean z7 = zjwVar.r;
        boolean z8 = zjwVar.s;
        zjwVar.getClass();
        list2.getClass();
        list3.getClass();
        list5.getClass();
        map3.getClass();
        return new zjw(list2, sff0Var, list3, list5, z3, z4, ekwVar2, map, z5, map2, z6, map3, map4, map5, map6, map7, map8, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjw)) {
            return false;
        }
        zjw zjwVar = (zjw) obj;
        return Intrinsics.d(this.f44501a, zjwVar.f44501a) && this.b.equals(zjwVar.b) && Intrinsics.d(this.c, zjwVar.c) && Intrinsics.d(this.d, zjwVar.d) && this.e == zjwVar.e && this.f == zjwVar.f && this.g.equals(zjwVar.g) && this.h.equals(zjwVar.h) && this.i == zjwVar.i && this.j.equals(zjwVar.j) && this.k == zjwVar.k && Intrinsics.d(this.l, zjwVar.l) && this.m.equals(zjwVar.m) && this.n.equals(zjwVar.n) && this.o.equals(zjwVar.o) && this.p.equals(zjwVar.p) && this.q.equals(zjwVar.q) && this.r == zjwVar.r && this.s == zjwVar.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + brm0.e(ohs0.f(this.q, ohs0.f(this.p, ohs0.f(this.o, ohs0.f(this.n, ohs0.f(this.m, ohs0.f(this.l, brm0.e(ohs0.f(this.j, brm0.e(ohs0.f(this.h, (this.g.hashCode() + brm0.e(brm0.e(dw9.a(dw9.a(cs0.c(this.b, this.f44501a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31), 31, this.i), 31), 31, this.k), 31), 31), 31), 31), 31), 31), 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeStateModel(pages=");
        sb.append(this.f44501a);
        sb.append(", remoteConfig=");
        sb.append(this.b);
        sb.append(", specialEventList=");
        b1j.y(", subSports=", ", bettingDisabled=", sb, this.c, this.d);
        ua80.u(", popularScreen=", ", selectedToolbarPage=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", topScenarioModel=");
        sb.append(this.h);
        sb.append(", connected=");
        sb.append(this.i);
        sb.append(", stockVisible=");
        sb.append(this.j);
        sb.append(", stockWithFire=");
        sb.append(this.k);
        sb.append(", liveSwitchSelectedMap=");
        sb.append(this.l);
        sb.append(", liveSelectedDisciplineSportIdsMap=");
        sb.append(this.m);
        sb.append(", lineSelectedDisciplineIdMap=");
        sb.append(this.n);
        sb.append(", liveDisciplineFilterOrderMap=");
        sb.append(this.o);
        sb.append(", lineDisciplineFilterOrderMap=");
        sb.append(this.p);
        sb.append(", hasVirtualCategories=");
        sb.append(this.q);
        sb.append(", tablet=");
        sb.append(this.r);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.s, Separators.RPAREN);
    }
}
