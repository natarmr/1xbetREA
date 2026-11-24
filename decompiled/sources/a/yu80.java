package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class yu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43256a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final kg g;
    public final ot0 h;
    public final hr10 i;
    public final boolean j;
    public final boolean k;
    public final AggregatorScreenModel l;
    public final List m;
    public final Set n;
    public final gu80 o;
    public final ql5 p;
    public final boolean q;

    public yu80(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, kg kgVar, ot0 ot0Var, hr10 hr10Var, boolean z6, boolean z7, AggregatorScreenModel aggregatorScreenModel, List list, Set set, gu80 gu80Var, ql5 ql5Var, boolean z8) {
        kgVar.getClass();
        list.getClass();
        set.getClass();
        this.f43256a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = kgVar;
        this.h = ot0Var;
        this.i = hr10Var;
        this.j = z6;
        this.k = z7;
        this.l = aggregatorScreenModel;
        this.m = list;
        this.n = set;
        this.o = gu80Var;
        this.p = ql5Var;
        this.q = z8;
    }

    public static yu80 a(yu80 yu80Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, Set set, gu80 gu80Var, ql5 ql5Var, int i) {
        boolean z6 = (i & 1) != 0 ? yu80Var.f43256a : z;
        boolean z7 = (i & 2) != 0 ? yu80Var.b : z2;
        boolean z8 = (i & 4) != 0 ? yu80Var.c : z3;
        boolean z9 = (i & 8) != 0 ? yu80Var.d : z4;
        boolean z10 = (i & 16) != 0 ? yu80Var.e : z5;
        int i2 = yu80Var.f;
        kg kgVar = yu80Var.g;
        ot0 ot0Var = yu80Var.h;
        hr10 hr10Var = yu80Var.i;
        boolean z11 = yu80Var.j;
        boolean z12 = yu80Var.k;
        AggregatorScreenModel aggregatorScreenModel = yu80Var.l;
        List list2 = (i & 4096) != 0 ? yu80Var.m : list;
        Set set2 = (i & 8192) != 0 ? yu80Var.n : set;
        gu80 gu80Var2 = (i & 16384) != 0 ? yu80Var.o : gu80Var;
        ql5 ql5Var2 = (i & 32768) != 0 ? yu80Var.p : ql5Var;
        boolean z13 = yu80Var.q;
        yu80Var.getClass();
        kgVar.getClass();
        list2.getClass();
        set2.getClass();
        return new yu80(z6, z7, z8, z9, z10, i2, kgVar, ot0Var, hr10Var, z11, z12, aggregatorScreenModel, list2, set2, gu80Var2, ql5Var2, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu80)) {
            return false;
        }
        yu80 yu80Var = (yu80) obj;
        return this.f43256a == yu80Var.f43256a && this.b == yu80Var.b && this.c == yu80Var.c && this.d == yu80Var.d && this.e == yu80Var.e && this.f == yu80Var.f && this.g == yu80Var.g && this.h == yu80Var.h && this.i == yu80Var.i && this.j == yu80Var.j && this.k == yu80Var.k && this.l.equals(yu80Var.l) && Intrinsics.d(this.m, yu80Var.m) && Intrinsics.d(this.n, yu80Var.n) && this.o.equals(yu80Var.o) && Intrinsics.d(this.p, yu80Var.p) && this.q == yu80Var.q;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + ohs0.g(this.n, dw9.a((this.l.hashCode() + brm0.e(brm0.e((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f43256a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31)) * 31)) * 31)) * 31, 31, this.j), 31, this.k)) * 31, 31, this.m), 31)) * 31;
        ql5 ql5Var = this.p;
        return Boolean.hashCode(this.q) + ((iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PartTypeTwoGamesState(isLoading=", ", isError=", ", isEmpty=", this.f43256a, this.b);
        ua80.u(", isAuthorized=", ", lastConnection=", sbQ, this.c, this.d);
        ua80.q(this.f, ", lottieType=", ", accountSelectionStyle=", sbQ, this.e);
        sbQ.append(this.g);
        sbQ.append(", gameCardCollectionStyle=");
        sbQ.append(this.h);
        sbQ.append(", bannerCollectionStyle=");
        sbQ.append(this.i);
        sbQ.append(", isVirtual=");
        sbQ.append(this.j);
        sbQ.append(", isNewBanners=");
        sbQ.append(this.k);
        sbQ.append(", aggregatorScreenModel=");
        sbQ.append(this.l);
        sbQ.append(", games=");
        sbQ.append(this.m);
        sbQ.append(", favorites=");
        sbQ.append(this.n);
        sbQ.append(", bannerModel=");
        sbQ.append(this.o);
        sbQ.append(", balanceModel=");
        sbQ.append(this.p);
        sbQ.append(", shouldShowNavBar=");
        return rw2.p(sbQ, this.q, Separators.RPAREN);
    }
}
