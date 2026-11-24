package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zfa0 f43600a;
    public final List b;
    public final l9s c;
    public final hao d;
    public final String e;
    public final String f;
    public final Map g;
    public final boolean h;
    public final Long i;
    public final ms2 j;
    public final Map k;
    public final byte l;

    /* JADX WARN: Multi-variable type inference failed */
    public z130(zfa0 zfa0Var, List list, l9s l9sVar, hao haoVar, String str, String str2, Map map, boolean z, Long l, ms2 ms2Var, Map map2, int i) {
        zfa0Var.getClass();
        list.getClass();
        this.f43600a = zfa0Var;
        this.b = list;
        this.c = l9sVar;
        this.d = haoVar;
        this.e = str;
        this.f = str2;
        this.g = map;
        this.h = z;
        this.i = l;
        this.j = ms2Var;
        this.k = map2;
        this.l = i;
    }

    public static z130 a(z130 z130Var, xfa0 xfa0Var, ArrayList arrayList, l9s l9sVar, hao haoVar, String str, LinkedHashMap linkedHashMap, Long l, ms2 ms2Var, LinkedHashMap linkedHashMap2, int i) {
        zfa0 zfa0Var = (i & 1) != 0 ? z130Var.f43600a : xfa0Var;
        List list = (i & 2) != 0 ? z130Var.b : arrayList;
        l9s l9sVar2 = (i & 4) != 0 ? z130Var.c : l9sVar;
        hao haoVar2 = (i & 8) != 0 ? z130Var.d : haoVar;
        String str2 = z130Var.e;
        String str3 = (i & 32) != 0 ? z130Var.f : str;
        Map map = (i & 64) != 0 ? z130Var.g : linkedHashMap;
        boolean z = z130Var.h;
        Long l2 = (i & 256) != 0 ? z130Var.i : l;
        ms2 ms2Var2 = (i & 512) != 0 ? z130Var.j : ms2Var;
        Map map2 = (i & 1024) != 0 ? z130Var.k : linkedHashMap2;
        byte b = z130Var.l;
        z130Var.getClass();
        zfa0Var.getClass();
        list.getClass();
        str3.getClass();
        return new z130(zfa0Var, list, l9sVar2, haoVar2, str2, str3, map, z, l2, ms2Var2, map2, b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z130)) {
            return false;
        }
        z130 z130Var = (z130) obj;
        return Intrinsics.d(this.f43600a, z130Var.f43600a) && Intrinsics.d(this.b, z130Var.b) && Intrinsics.d(this.c, z130Var.c) && Intrinsics.d(this.d, z130Var.d) && this.e.equals(z130Var.e) && this.f.equals(z130Var.f) && this.g.equals(z130Var.g) && this.h == z130Var.h && Intrinsics.d(this.i, z130Var.i) && this.j.equals(z130Var.j) && this.k.equals(z130Var.k) && this.l == z130Var.l;
    }

    public final int hashCode() {
        int iA = dw9.a(this.f43600a.hashCode() * 31, 31, this.b);
        l9s l9sVar = this.c;
        int iHashCode = (iA + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31;
        hao haoVar = this.d;
        int iE = brm0.e(ohs0.f(this.g, ua80.b(ua80.b((iHashCode + (haoVar == null ? 0 : haoVar.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.h);
        Long l = this.i;
        return Integer.hashCode(this.l) + ohs0.f(this.k, (this.j.hashCode() + ((iE + (l != null ? l.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsDelegateStateModel(playersDuelModel=");
        sb.append(this.f43600a);
        sb.append(", eventBetModels=");
        sb.append(this.b);
        sb.append(", gameDetailsModel=");
        sb.append(this.c);
        sb.append(", eventQuickBet=");
        sb.append(this.d);
        sb.append(", screenName=");
        f140.v(sb, this.e, ", subGameName=", this.f, ", insightsNames=");
        sb.append(this.g);
        sb.append(", inBetSlipOnly=");
        sb.append(this.h);
        sb.append(", subGameId=");
        sb.append(this.i);
        sb.append(", entryPointType=");
        sb.append(this.j);
        sb.append(", categoriesMarkets=");
        sb.append(this.k);
        sb.append(", specialTypeParam=");
        sb.append((int) this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
