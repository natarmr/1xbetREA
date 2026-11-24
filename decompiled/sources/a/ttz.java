package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ttz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34526a;
    public final Map b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final tn40 j;
    public final String k;

    public ttz(Map map, Map map2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, tn40 tn40Var, String str) {
        this.f34526a = map;
        this.b = map2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = tn40Var;
        this.k = str;
    }

    public static ttz a(ttz ttzVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i, boolean z, boolean z2, boolean z3, tn40 tn40Var, String str, int i2) {
        Map map = linkedHashMap;
        if ((i2 & 1) != 0) {
            map = ttzVar.f34526a;
        }
        Map map2 = map;
        Map map3 = (i2 & 2) != 0 ? ttzVar.b : linkedHashMap2;
        int i3 = (i2 & 4) != 0 ? ttzVar.c : i;
        boolean z4 = (i2 & 8) != 0 ? ttzVar.d : z;
        boolean z5 = (i2 & 16) != 0 ? ttzVar.e : z2;
        boolean z6 = ttzVar.f;
        boolean z7 = ttzVar.g;
        boolean z8 = ttzVar.h;
        boolean z9 = (i2 & 256) != 0 ? ttzVar.i : z3;
        tn40 tn40Var2 = (i2 & 512) != 0 ? ttzVar.j : tn40Var;
        String str2 = (i2 & 1024) != 0 ? ttzVar.k : str;
        ttzVar.getClass();
        return new ttz(map2, map3, i3, z4, z5, z6, z7, z8, z9, tn40Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttz)) {
            return false;
        }
        ttz ttzVar = (ttz) obj;
        return this.f34526a.equals(ttzVar.f34526a) && this.b.equals(ttzVar.b) && this.c == ttzVar.c && this.d == ttzVar.d && this.e == ttzVar.e && this.f == ttzVar.f && this.g == ttzVar.g && this.h == ttzVar.h && this.i == ttzVar.i && Intrinsics.d(this.j, ttzVar.j) && this.k.equals(ttzVar.k);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, ohs0.f(this.b, this.f34526a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        tn40 tn40Var = this.j;
        return this.k.hashCode() + ((iE + (tn40Var == null ? 0 : tn40Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsAfricaState(moneyLimitModels=");
        sb.append(this.f34526a);
        sb.append(", timeLimitModels=");
        sb.append(this.b);
        sb.append(", currentTab=");
        brm0.w(this.c, ", isLoading=", ", hasErrorWhileLoadingLimits=", sb, this.d);
        ua80.u(", hasFinancialSecurityBetsLimits=", ", hasFinancialSecurityDepositLimits=", sb, this.e, this.f);
        ua80.u(", hasFinancialSecuritySelfLimits=", ", isSetLimitBottomSheetVisible=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", selectedLimit=");
        sb.append(this.j);
        sb.append(", initialLimitValue=");
        return axq.n(sb, this.k, Separators.RPAREN);
    }
}
