package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ad2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f657a;
    public final Set b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mdm g;
    public final mdm h;
    public final boolean i;
    public final String j;
    public final j8l0 k;
    public final i8l0 l;

    public ad2(List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, mdm mdmVar, mdm mdmVar2, boolean z5, String str, j8l0 j8l0Var, i8l0 i8l0Var) {
        list.getClass();
        set.getClass();
        this.f657a = list;
        this.b = set;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = mdmVar;
        this.h = mdmVar2;
        this.i = z5;
        this.j = str;
        this.k = j8l0Var;
        this.l = i8l0Var;
    }

    public static ad2 a(ad2 ad2Var, List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, String str, int i) {
        List list2 = (i & 1) != 0 ? ad2Var.f657a : list;
        Set set2 = (i & 2) != 0 ? ad2Var.b : set;
        boolean z5 = (i & 4) != 0 ? ad2Var.c : z;
        boolean z6 = (i & 8) != 0 ? ad2Var.d : false;
        boolean z7 = (i & 16) != 0 ? ad2Var.e : z2;
        boolean z8 = (i & 32) != 0 ? ad2Var.f : z3;
        mdm mdmVar = ad2Var.g;
        mdm mdmVar2 = ad2Var.h;
        boolean z9 = (i & 256) != 0 ? ad2Var.i : z4;
        String str2 = (i & 512) != 0 ? ad2Var.j : str;
        j8l0 j8l0Var = ad2Var.k;
        i8l0 i8l0Var = ad2Var.l;
        ad2Var.getClass();
        list2.getClass();
        set2.getClass();
        return new ad2(list2, set2, z5, z6, z7, z8, mdmVar, mdmVar2, z9, str2, j8l0Var, i8l0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad2)) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return Intrinsics.d(this.f657a, ad2Var.f657a) && Intrinsics.d(this.b, ad2Var.b) && this.c == ad2Var.c && this.d == ad2Var.d && this.e == ad2Var.e && this.f == ad2Var.f && this.g.equals(ad2Var.g) && this.h.equals(ad2Var.h) && this.i == ad2Var.i && this.j.equals(ad2Var.j) && this.k == ad2Var.k && this.l == ad2Var.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ua80.b(brm0.e(f140.d(this.h, f140.d(this.g, brm0.e(brm0.e(brm0.e(brm0.e(ohs0.g(this.b, this.f657a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltLiveResultsState(sportItems=");
        sb.append(this.f657a);
        sb.append(", selectedSportItems=");
        sb.append(this.b);
        sb.append(", isMultiSelectShow=");
        ua80.u(", loading=", ", isRefreshing=", sb, this.c, this.d);
        ua80.u(", showError=", ", lottieErrorConfig=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", lottieEmptyConfig=");
        sb.append(this.h);
        sb.append(", isConnection=");
        f140.s(", searchQuery=", this.j, ", sportFeedListStyle=", sb, this.i);
        sb.append(this.k);
        sb.append(", sportFeedListIconStyle=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
