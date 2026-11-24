package a;

import android.gov.nist.core.Separators;
import java.util.AbstractList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34938a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final ot0 g;
    public final boolean h;
    public final boolean i;
    public final Set j;
    public final hus k;
    public final List l;

    public u2b0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, ot0 ot0Var, boolean z6, boolean z7, Set set, hus husVar, List list) {
        set.getClass();
        list.getClass();
        this.f34938a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = ot0Var;
        this.h = z6;
        this.i = z7;
        this.j = set;
        this.k = husVar;
        this.l = list;
    }

    public static u2b0 a(u2b0 u2b0Var, boolean z, boolean z2, boolean z3, boolean z4, Set set, hus husVar, AbstractList abstractList, int i) {
        boolean z5 = (i & 1) != 0 ? u2b0Var.f34938a : z;
        boolean z6 = (i & 2) != 0 ? u2b0Var.b : z2;
        boolean z7 = u2b0Var.c;
        boolean z8 = (i & 8) != 0 ? u2b0Var.d : z3;
        boolean z9 = (i & 16) != 0 ? u2b0Var.e : z4;
        int i2 = u2b0Var.f;
        ot0 ot0Var = u2b0Var.g;
        boolean z10 = u2b0Var.h;
        boolean z11 = u2b0Var.i;
        Set set2 = (i & 512) != 0 ? u2b0Var.j : set;
        hus husVar2 = (i & 1024) != 0 ? u2b0Var.k : husVar;
        List list = (i & 2048) != 0 ? u2b0Var.l : abstractList;
        u2b0Var.getClass();
        set2.getClass();
        list.getClass();
        return new u2b0(z5, z6, z7, z8, z9, i2, ot0Var, z10, z11, set2, husVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2b0)) {
            return false;
        }
        u2b0 u2b0Var = (u2b0) obj;
        return this.f34938a == u2b0Var.f34938a && this.b == u2b0Var.b && this.c == u2b0Var.c && this.d == u2b0Var.d && this.e == u2b0Var.e && this.f == u2b0Var.f && this.g == u2b0Var.g && this.h == u2b0Var.h && this.i == u2b0Var.i && Intrinsics.d(this.j, u2b0Var.j) && Intrinsics.d(this.k, u2b0Var.k) && Intrinsics.d(this.l, u2b0Var.l);
    }

    public final int hashCode() {
        int iG = ohs0.g(this.j, brm0.e(brm0.e((this.g.hashCode() + twn.a(this.f, brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f34938a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31)) * 31, 31, this.h), 31, this.i), 31);
        hus husVar = this.k;
        return this.l.hashCode() + ((iG + (husVar == null ? 0 : husVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularClassicAggregatorState(isAuth=", ", lastConnection=", ", isVirtual=", this.f34938a, this.b);
        ua80.u(", nightMode=", ", isCountryBlocking=", sbQ, this.c, this.d);
        ua80.q(this.f, ", lottieType=", ", gameCardCollectionStyle=", sbQ, this.e);
        sbQ.append(this.g);
        sbQ.append(", hasProvidersAggregator=");
        sbQ.append(this.h);
        sbQ.append(", hasAggregatorBrandsFullInfo=");
        sbQ.append(this.i);
        sbQ.append(", favoritesGameIdList=");
        sbQ.append(this.j);
        sbQ.append(", gameToOpen=");
        sbQ.append(this.k);
        sbQ.append(", middleItemsState=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
