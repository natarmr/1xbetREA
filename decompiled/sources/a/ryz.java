package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ryz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f31334a;
    public final Map b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final rn40 i;
    public final String j;

    public ryz(Map map, Map map2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, rn40 rn40Var, String str) {
        this.f31334a = map;
        this.b = map2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = rn40Var;
        this.j = str;
    }

    public static ryz a(ryz ryzVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i, boolean z, boolean z2, rn40 rn40Var, String str, int i2) {
        Map map = linkedHashMap;
        if ((i2 & 1) != 0) {
            map = ryzVar.f31334a;
        }
        Map map2 = map;
        Map map3 = linkedHashMap2;
        if ((i2 & 2) != 0) {
            map3 = ryzVar.b;
        }
        Map map4 = map3;
        int i3 = (i2 & 4) != 0 ? ryzVar.c : i;
        boolean z3 = (i2 & 8) != 0 ? ryzVar.d : z;
        boolean z4 = (i2 & 16) != 0 ? ryzVar.e : z2;
        boolean z5 = ryzVar.f;
        boolean z6 = ryzVar.g;
        boolean z7 = ryzVar.h;
        ryzVar.getClass();
        rn40 rn40Var2 = (i2 & 512) != 0 ? ryzVar.i : rn40Var;
        String str2 = (i2 & 1024) != 0 ? ryzVar.j : str;
        ryzVar.getClass();
        return new ryz(map2, map4, i3, z3, z4, z5, z6, z7, rn40Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryz)) {
            return false;
        }
        ryz ryzVar = (ryz) obj;
        return this.f31334a.equals(ryzVar.f31334a) && this.b.equals(ryzVar.b) && this.c == ryzVar.c && this.d == ryzVar.d && this.e == ryzVar.e && this.f == ryzVar.f && this.g == ryzVar.g && this.h == ryzVar.h && Intrinsics.d(this.i, ryzVar.i) && this.j.equals(ryzVar.j);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, ohs0.f(this.b, this.f31334a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, false);
        rn40 rn40Var = this.i;
        return this.j.hashCode() + ((iE + (rn40Var != null ? rn40Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsKenyaState(moneyLimitModels=");
        sb.append(this.f31334a);
        sb.append(", timeLimitModels=");
        sb.append(this.b);
        sb.append(", currentTab=");
        brm0.w(this.c, ", isLoading=", ", hasErrorWhileLoadingLimits=", sb, this.d);
        ua80.u(", hasFinancialSecurityBetsLimits=", ", hasFinancialSecurityDepositLimits=", sb, this.e, this.f);
        ua80.u(", hasFinancialSecuritySelfLimits=", ", isSetLimitBottomSheetVisible=false, selectedLimit=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", newLimitValue=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
