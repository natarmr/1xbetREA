package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class e100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7016a;
    public final Map b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final sn40 j;
    public final Map k;
    public final LimitNeGroupEnum l;

    public e100(Map map, Map map2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, sn40 sn40Var, Map map3, LimitNeGroupEnum limitNeGroupEnum) {
        this.f7016a = map;
        this.b = map2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = sn40Var;
        this.k = map3;
        this.l = limitNeGroupEnum;
    }

    public static e100 a(e100 e100Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i, boolean z, boolean z2, sn40 sn40Var, Map map, LimitNeGroupEnum limitNeGroupEnum, int i2) {
        Map map2 = (i2 & 1) != 0 ? e100Var.f7016a : linkedHashMap;
        Map map3 = (i2 & 2) != 0 ? e100Var.b : linkedHashMap2;
        int i3 = (i2 & 4) != 0 ? e100Var.c : i;
        boolean z3 = (i2 & 8) != 0 ? e100Var.d : z;
        boolean z4 = (i2 & 16) != 0 ? e100Var.e : z2;
        boolean z5 = e100Var.f;
        boolean z6 = e100Var.g;
        boolean z7 = e100Var.h;
        boolean z8 = e100Var.i;
        sn40 sn40Var2 = (i2 & 512) != 0 ? e100Var.j : sn40Var;
        Map map4 = (i2 & 1024) != 0 ? e100Var.k : map;
        LimitNeGroupEnum limitNeGroupEnum2 = (i2 & 2048) != 0 ? e100Var.l : limitNeGroupEnum;
        e100Var.getClass();
        map4.getClass();
        return new e100(map2, map3, i3, z3, z4, z5, z6, z7, z8, sn40Var2, map4, limitNeGroupEnum2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e100)) {
            return false;
        }
        e100 e100Var = (e100) obj;
        return this.f7016a.equals(e100Var.f7016a) && this.b.equals(e100Var.b) && this.c == e100Var.c && this.d == e100Var.d && this.e == e100Var.e && this.f == e100Var.f && this.g == e100Var.g && this.h == e100Var.h && this.i == e100Var.i && Intrinsics.d(this.j, e100Var.j) && this.k.equals(e100Var.k) && this.l == e100Var.l;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, ohs0.f(this.b, this.f7016a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        sn40 sn40Var = this.j;
        int iF = ohs0.f(this.k, (iE + (sn40Var == null ? 0 : sn40Var.hashCode())) * 31, 31);
        LimitNeGroupEnum limitNeGroupEnum = this.l;
        return iF + (limitNeGroupEnum != null ? limitNeGroupEnum.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsNeState(moneyLimitModels=");
        sb.append(this.f7016a);
        sb.append(", timeLimitModels=");
        sb.append(this.b);
        sb.append(", currentTab=");
        brm0.w(this.c, ", isLoading=", ", hasErrorWhileLoadingLimits=", sb, this.d);
        ua80.u(", hasFinancialSecurityBetsLimits=", ", hasFinancialSecurityDepositLimits=", sb, this.e, this.f);
        ua80.u(", hasFinancialSecuritySelfLimits=", ", hasFinancialSecuritySessionTimeLimits=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", selectedLimit=");
        sb.append(this.j);
        sb.append(", temporaryLimitValues=");
        sb.append(this.k);
        sb.append(", acceptingLimitGroup=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
