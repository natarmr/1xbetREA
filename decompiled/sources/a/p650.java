package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi0 f26438a;
    public final h650 b;
    public final zf1 c;
    public final ot0 d;
    public final kg e;
    public final int f;
    public final ql5 g;
    public final List h;
    public final Set i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final q250 q;

    public p650(mi0 mi0Var, h650 h650Var, zf1 zf1Var, ot0 ot0Var, kg kgVar, int i, ql5 ql5Var, List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, q250 q250Var) {
        set.getClass();
        this.f26438a = mi0Var;
        this.b = h650Var;
        this.c = zf1Var;
        this.d = ot0Var;
        this.e = kgVar;
        this.f = i;
        this.g = ql5Var;
        this.h = list;
        this.i = set;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = q250Var;
    }

    public static p650 a(p650 p650Var, ql5 ql5Var, ArrayList arrayList, Set set, boolean z, int i) {
        mi0 mi0Var = p650Var.f26438a;
        h650 h650Var = p650Var.b;
        zf1 zf1Var = p650Var.c;
        ot0 ot0Var = p650Var.d;
        kg kgVar = p650Var.e;
        int i2 = p650Var.f;
        ql5 ql5Var2 = (i & 64) != 0 ? p650Var.g : ql5Var;
        List list = (i & 128) != 0 ? p650Var.h : arrayList;
        Set set2 = (i & 256) != 0 ? p650Var.i : set;
        boolean z2 = p650Var.j;
        ql5 ql5Var3 = ql5Var2;
        List list2 = list;
        Set set3 = set2;
        boolean z3 = p650Var.k;
        boolean z4 = p650Var.l;
        boolean z5 = p650Var.m;
        boolean z6 = (i & 8192) != 0 ? p650Var.n : z;
        boolean z7 = p650Var.o;
        boolean z8 = p650Var.p;
        p650Var.getClass();
        q250 q250Var = (i & 131072) != 0 ? p650Var.q : null;
        p650Var.getClass();
        set3.getClass();
        return new p650(mi0Var, h650Var, zf1Var, ot0Var, kgVar, i2, ql5Var3, list2, set3, z2, z3, z4, z5, z6, z7, z8, q250Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p650)) {
            return false;
        }
        p650 p650Var = (p650) obj;
        return this.f26438a == p650Var.f26438a && this.b == p650Var.b && this.c == p650Var.c && this.d == p650Var.d && this.e == p650Var.e && this.f == p650Var.f && Intrinsics.d(this.g, p650Var.g) && this.h.equals(p650Var.h) && Intrinsics.d(this.i, p650Var.i) && this.j == p650Var.j && this.k == p650Var.k && this.l == p650Var.l && this.m == p650Var.m && this.n == p650Var.n && this.o == p650Var.o && this.p == p650Var.p && Intrinsics.d(this.q, p650Var.q);
    }

    public final int hashCode() {
        int iA = twn.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f26438a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
        ql5 ql5Var = this.g;
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ohs0.g(this.i, dw9.a((iA + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 961, this.p);
        q250 q250Var = this.q;
        return iE + (q250Var != null ? q250Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyAggregatorStateModel(configScreenType=");
        sb.append(this.f26438a);
        sb.append(", promotionsCarouselStyle=");
        sb.append(this.b);
        sb.append(", tournamentsCarouselStyle=");
        sb.append(this.c);
        sb.append(", gamesCarouselStyle=");
        sb.append(this.d);
        sb.append(", accountSelectionStyle=");
        sb.append(this.e);
        sb.append(", lottieAnimationType=");
        sb.append(this.f);
        sb.append(", balanceModel=");
        sb.append(this.g);
        sb.append(", contentModelItems=");
        sb.append(this.h);
        sb.append(", favoriteGamesIds=");
        sb.append(this.i);
        sb.append(", isNewBannersService=");
        sb.append(this.j);
        sb.append(", hasLoyaltyProgram=");
        ua80.u(", aggregatorPromoEnabled=", ", loyaltyProgramBasicWidgetEnabled=", sb, this.k, this.l);
        ua80.u(", isAuth=", ", hasAggregatorPlayerTasks=", sb, this.m, this.n);
        ua80.u(", hasAggregatorPlayerTasksHistory=", ", cashbackUpdateKey=null, deeplinkModel=", sb, this.o, this.p);
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
