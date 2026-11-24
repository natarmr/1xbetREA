package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ug2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg2 f35602a;
    public final boolean b;
    public final hat c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Set h;
    public final List i;
    public final String j;
    public final boolean k;

    public ug2(hg2 hg2Var, boolean z, hat hatVar, boolean z2, boolean z3, boolean z4, boolean z5, Set set, List list, String str, boolean z6) {
        set.getClass();
        this.f35602a = hg2Var;
        this.b = z;
        this.c = hatVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = set;
        this.i = list;
        this.j = str;
        this.k = z6;
    }

    public static ug2 a(ug2 ug2Var, hg2 hg2Var, boolean z, hat hatVar, boolean z2, boolean z3, boolean z4, boolean z5, Set set, List list, String str, boolean z6, int i) {
        if ((i & 1) != 0) {
            hg2Var = ug2Var.f35602a;
        }
        hg2 hg2Var2 = hg2Var;
        if ((i & 2) != 0) {
            z = ug2Var.b;
        }
        boolean z7 = z;
        if ((i & 4) != 0) {
            hatVar = ug2Var.c;
        }
        hat hatVar2 = hatVar;
        boolean z8 = (i & 8) != 0 ? ug2Var.d : z2;
        boolean z9 = (i & 16) != 0 ? ug2Var.e : z3;
        boolean z10 = (i & 32) != 0 ? ug2Var.f : z4;
        boolean z11 = (i & 64) != 0 ? ug2Var.g : z5;
        Set set2 = (i & 128) != 0 ? ug2Var.h : set;
        List list2 = (i & 256) != 0 ? ug2Var.i : list;
        String str2 = (i & 512) != 0 ? ug2Var.j : str;
        boolean z12 = (i & 1024) != 0 ? ug2Var.k : z6;
        ug2Var.getClass();
        set2.getClass();
        return new ug2(hg2Var2, z7, hatVar2, z8, z9, z10, z11, set2, list2, str2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug2)) {
            return false;
        }
        ug2 ug2Var = (ug2) obj;
        return Intrinsics.d(this.f35602a, ug2Var.f35602a) && this.b == ug2Var.b && this.c.equals(ug2Var.c) && this.d == ug2Var.d && this.e == ug2Var.e && this.f == ug2Var.f && this.g == ug2Var.g && Intrinsics.d(this.h, ug2Var.h) && Intrinsics.d(this.i, ug2Var.i) && this.j.equals(ug2Var.j) && this.k == ug2Var.k;
    }

    public final int hashCode() {
        hg2 hg2Var = this.f35602a;
        int iG = ohs0.g(this.h, brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + brm0.e((hg2Var == null ? 0 : hg2Var.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
        List list = this.i;
        return Boolean.hashCode(this.k) + ua80.b((iG + (list != null ? list.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportEventsState(config=");
        sb.append(this.f35602a);
        sb.append(", connected=");
        sb.append(this.b);
        sb.append(", gamesModel=");
        sb.append(this.c);
        sb.append(", scrollToTop=");
        sb.append(this.d);
        sb.append(", refreshing=");
        ua80.u(", favoriteGamesFirstRequest=", ", recommendedGamesFirstRequest=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", expandedHistoryGamesIds=");
        sb.append(this.h);
        sb.append(", pendingForDeleteGameGroups=");
        h97.y(", searchQuery=", this.j, ", activateSearch=", sb, this.i);
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
