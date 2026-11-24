package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rra f11820a;
    public final om5 b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final int f;
    public final int g;
    public final dta h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;

    public gsa(rra rraVar, om5 om5Var, boolean z, boolean z2, List list, int i, int i2, dta dtaVar, boolean z3, boolean z4, boolean z5, String str) {
        list.getClass();
        this.f11820a = rraVar;
        this.b = om5Var;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = i;
        this.g = i2;
        this.h = dtaVar;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = str;
    }

    public static gsa a(gsa gsaVar, rra rraVar, om5 om5Var, boolean z, List list, int i, int i2, dta dtaVar, boolean z2, boolean z3, String str, int i3) {
        rra rraVar2 = (i3 & 1) != 0 ? gsaVar.f11820a : rraVar;
        om5 om5Var2 = (i3 & 2) != 0 ? gsaVar.b : om5Var;
        boolean z4 = (i3 & 4) != 0 ? gsaVar.c : false;
        boolean z5 = (i3 & 8) != 0 ? gsaVar.d : z;
        List list2 = (i3 & 16) != 0 ? gsaVar.e : list;
        int i4 = (i3 & 32) != 0 ? gsaVar.f : i;
        int i5 = (i3 & 64) != 0 ? gsaVar.g : i2;
        dta dtaVar2 = (i3 & 128) != 0 ? gsaVar.h : dtaVar;
        boolean z6 = gsaVar.i;
        boolean z7 = (i3 & 512) != 0 ? gsaVar.j : z2;
        boolean z8 = (i3 & 1024) != 0 ? gsaVar.k : z3;
        String str2 = (i3 & 2048) != 0 ? gsaVar.l : str;
        gsaVar.getClass();
        om5Var2.getClass();
        list2.getClass();
        return new gsa(rraVar2, om5Var2, z4, z5, list2, i4, i5, dtaVar2, z6, z7, z8, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsa)) {
            return false;
        }
        gsa gsaVar = (gsa) obj;
        return Intrinsics.d(this.f11820a, gsaVar.f11820a) && this.b.equals(gsaVar.b) && this.c == gsaVar.c && this.d == gsaVar.d && Intrinsics.d(this.e, gsaVar.e) && this.f == gsaVar.f && this.g == gsaVar.g && this.h.equals(gsaVar.h) && this.i == gsaVar.i && this.j == gsaVar.j && this.k == gsaVar.k && this.l.equals(gsaVar.l);
    }

    public final int hashCode() {
        rra rraVar = this.f11820a;
        return this.l.hashCode() + brm0.e(brm0.e(brm0.e((this.h.hashCode() + twn.a(this.g, twn.a(this.f, dw9.a(brm0.e(brm0.e((this.b.hashCode() + ((rraVar == null ? 0 : rraVar.hashCode()) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31)) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardsInHeaderContainerState(config=");
        sb.append(this.f11820a);
        sb.append(", balanceState=");
        sb.append(this.b);
        sb.append(", showShimmers=");
        ua80.u(", connectionError=", ", topGames=", sb, this.c, this.d);
        brm0.v(this.f, ", aggregatorFavoritesCount=", ", xGamesFavoritesCount=", sb, this.e);
        sb.append(this.g);
        sb.append(", openTabState=");
        sb.append(this.h);
        sb.append(", isTablet=");
        ua80.u(", authorizedUser=", ", activeSearchField=", sb, this.i, this.j);
        return twn.q(", searchQuery=", this.l, Separators.RPAREN, sb, this.k);
    }
}
