package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class gua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fua0 f11919a;
    public final rlp b;
    public final String c;
    public final Set d;
    public final List e;
    public final zmb f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final h8l0 j;
    public final boolean k;
    public final boolean l;
    public final a4x m;
    public final ghq0 n;
    public final boolean o;
    public final FeedsChampsItemsSelectionState p;
    public final boolean q;

    public gua0(fua0 fua0Var, rlp rlpVar, String str, Set set, List list, zmb zmbVar, boolean z, String str2, boolean z2, h8l0 h8l0Var, boolean z3, boolean z4, a4x a4xVar, ghq0 ghq0Var, boolean z5, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState, boolean z6) {
        str.getClass();
        set.getClass();
        list.getClass();
        zmbVar.getClass();
        str2.getClass();
        a4xVar.getClass();
        feedsChampsItemsSelectionState.getClass();
        this.f11919a = fua0Var;
        this.b = rlpVar;
        this.c = str;
        this.d = set;
        this.e = list;
        this.f = zmbVar;
        this.g = z;
        this.h = str2;
        this.i = z2;
        this.j = h8l0Var;
        this.k = z3;
        this.l = z4;
        this.m = a4xVar;
        this.n = ghq0Var;
        this.o = z5;
        this.p = feedsChampsItemsSelectionState;
        this.q = z6;
    }

    public static gua0 a(gua0 gua0Var, fua0 fua0Var, String str, LinkedHashSet linkedHashSet, List list, zmb zmbVar, boolean z, boolean z2, ghq0 ghq0Var, boolean z3, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState, boolean z4, int i) {
        fua0 fua0Var2 = (i & 1) != 0 ? gua0Var.f11919a : fua0Var;
        rlp rlpVar = gua0Var.b;
        String str2 = (i & 4) != 0 ? gua0Var.c : str;
        Set set = (i & 8) != 0 ? gua0Var.d : linkedHashSet;
        List list2 = (i & 16) != 0 ? gua0Var.e : list;
        zmb zmbVar2 = (i & 32) != 0 ? gua0Var.f : zmbVar;
        boolean z5 = (i & 64) != 0 ? gua0Var.g : z;
        String str3 = gua0Var.h;
        boolean z6 = (i & 256) != 0 ? gua0Var.i : false;
        h8l0 h8l0Var = gua0Var.j;
        boolean z7 = (i & 1024) != 0 ? gua0Var.k : z2;
        boolean z8 = gua0Var.l;
        a4x a4xVar = gua0Var.m;
        ghq0 ghq0Var2 = (i & 8192) != 0 ? gua0Var.n : ghq0Var;
        boolean z9 = (i & 16384) != 0 ? gua0Var.o : z3;
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState2 = (32768 & i) != 0 ? gua0Var.p : feedsChampsItemsSelectionState;
        boolean z10 = (i & 65536) != 0 ? gua0Var.q : z4;
        gua0Var.getClass();
        str2.getClass();
        set.getClass();
        list2.getClass();
        zmbVar2.getClass();
        str3.getClass();
        a4xVar.getClass();
        ghq0Var2.getClass();
        feedsChampsItemsSelectionState2.getClass();
        return new gua0(fua0Var2, rlpVar, str2, set, list2, zmbVar2, z5, str3, z6, h8l0Var, z7, z8, a4xVar, ghq0Var2, z9, feedsChampsItemsSelectionState2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gua0)) {
            return false;
        }
        gua0 gua0Var = (gua0) obj;
        return this.f11919a.equals(gua0Var.f11919a) && this.b.equals(gua0Var.b) && Intrinsics.d(this.c, gua0Var.c) && Intrinsics.d(this.d, gua0Var.d) && Intrinsics.d(this.e, gua0Var.e) && this.f == gua0Var.f && this.g == gua0Var.g && Intrinsics.d(this.h, gua0Var.h) && this.i == gua0Var.i && this.j == gua0Var.j && this.k == gua0Var.k && this.l == gua0Var.l && Intrinsics.d(this.m, gua0Var.m) && this.n.equals(gua0Var.n) && this.o == gua0Var.o && Intrinsics.d(this.p, gua0Var.p) && this.q == gua0Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + ((this.p.hashCode() + brm0.e((this.n.hashCode() + cs0.b(this.m, brm0.e(brm0.e((this.j.hashCode() + brm0.e(ua80.b(brm0.e((this.f.hashCode() + dw9.a(ohs0.g(this.d, ua80.b((this.b.hashCode() + (this.f11919a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l), 31)) * 31, 31, this.o)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolybetState(champsState=");
        sb.append(this.f11919a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", expandedIds=");
        sb.append(this.d);
        sb.append(", expandedGamesIds=");
        sb.append(this.e);
        sb.append(", champSortType=");
        sb.append(this.f);
        sb.append(", showRefreshing=");
        f140.s(", subtitleText=", this.h, ", scrollToTop=", sb, this.g);
        sb.append(this.i);
        sb.append(", headerStyle=");
        sb.append(this.j);
        sb.append(", navigationBarSearchViewExpanded=");
        ua80.u(", timeFilterChipsVisible=", ", timeFilters=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", timeFilterHolder=");
        sb.append(this.n);
        sb.append(", filtersSelected=");
        sb.append(this.o);
        sb.append(", selection=");
        sb.append(this.p);
        sb.append(", showSelectionButton=");
        return rw2.p(sb, this.q, Separators.RPAREN);
    }
}
