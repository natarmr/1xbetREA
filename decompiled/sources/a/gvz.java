package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gvz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11998a;
    public final Map b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final qn40 h;
    public final String i;

    public gvz(Map map, Map map2, int i, boolean z, boolean z2, boolean z3, boolean z4, qn40 qn40Var, String str) {
        this.f11998a = map;
        this.b = map2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = qn40Var;
        this.i = str;
    }

    public static gvz a(gvz gvzVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i, boolean z, boolean z2, qn40 qn40Var, String str, int i2) {
        Map map = linkedHashMap;
        if ((i2 & 1) != 0) {
            map = gvzVar.f11998a;
        }
        Map map2 = map;
        Map map3 = linkedHashMap2;
        if ((i2 & 2) != 0) {
            map3 = gvzVar.b;
        }
        Map map4 = map3;
        if ((i2 & 4) != 0) {
            i = gvzVar.c;
        }
        int i3 = i;
        boolean z3 = (i2 & 8) != 0 ? gvzVar.d : z;
        boolean z4 = (i2 & 16) != 0 ? gvzVar.e : z2;
        boolean z5 = gvzVar.f;
        boolean z6 = gvzVar.g;
        qn40 qn40Var2 = (i2 & 128) != 0 ? gvzVar.h : qn40Var;
        String str2 = (i2 & 256) != 0 ? gvzVar.i : str;
        gvzVar.getClass();
        return new gvz(map2, map4, i3, z3, z4, z5, z6, qn40Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvz)) {
            return false;
        }
        gvz gvzVar = (gvz) obj;
        return this.f11998a.equals(gvzVar.f11998a) && this.b.equals(gvzVar.b) && this.c == gvzVar.c && this.d == gvzVar.d && this.e == gvzVar.e && this.f == gvzVar.f && this.g == gvzVar.g && Intrinsics.d(this.h, gvzVar.h) && this.i.equals(gvzVar.i);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, ohs0.f(this.b, this.f11998a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        qn40 qn40Var = this.h;
        return this.i.hashCode() + ((iE + (qn40Var == null ? 0 : qn40Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsEeState(moneyLimitModels=");
        sb.append(this.f11998a);
        sb.append(", timeLimitModels=");
        sb.append(this.b);
        sb.append(", currentTab=");
        brm0.w(this.c, ", isLoading=", ", hasErrorWhileLoadingLimits=", sb, this.d);
        ua80.u(", hasFinancialSecurityLossLimits=", ", hasFinancialSecuritySelfLimits=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", selectedLimit=");
        sb.append(this.h);
        sb.append(", initialLimitValue=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
