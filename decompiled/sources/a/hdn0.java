package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12878a;
    public final boolean b;
    public final bdn0 c;
    public final cdn0 d;
    public final wcb e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final v5l0 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public hdn0(List list, boolean z, bdn0 bdn0Var, cdn0 cdn0Var, wcb wcbVar, List list2, boolean z2, boolean z3, boolean z4, v5l0 v5l0Var, boolean z5, boolean z6, boolean z7) {
        list.getClass();
        list2.getClass();
        this.f12878a = list;
        this.b = z;
        this.c = bdn0Var;
        this.d = cdn0Var;
        this.e = wcbVar;
        this.f = list2;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = v5l0Var;
        this.k = z5;
        this.l = z6;
        this.m = z7;
    }

    public static hdn0 a(hdn0 hdn0Var, List list, boolean z, bdn0 bdn0Var, cdn0 cdn0Var, wcb wcbVar, List list2, boolean z2, boolean z3, boolean z4, v5l0 v5l0Var, boolean z5, boolean z6, boolean z7, int i) {
        if ((i & 1) != 0) {
            list = hdn0Var.f12878a;
        }
        List list3 = list;
        boolean z8 = (i & 2) != 0 ? hdn0Var.b : z;
        bdn0 bdn0Var2 = (i & 4) != 0 ? hdn0Var.c : bdn0Var;
        cdn0 cdn0Var2 = (i & 8) != 0 ? hdn0Var.d : cdn0Var;
        wcb wcbVar2 = (i & 16) != 0 ? hdn0Var.e : wcbVar;
        List list4 = (i & 32) != 0 ? hdn0Var.f : list2;
        boolean z9 = (i & 64) != 0 ? hdn0Var.g : z2;
        boolean z10 = (i & 128) != 0 ? hdn0Var.h : z3;
        boolean z11 = (i & 256) != 0 ? hdn0Var.i : z4;
        v5l0 v5l0Var2 = (i & 512) != 0 ? hdn0Var.j : v5l0Var;
        boolean z12 = (i & 1024) != 0 ? hdn0Var.k : z5;
        boolean z13 = (i & 2048) != 0 ? hdn0Var.l : z6;
        boolean z14 = (i & 4096) != 0 ? hdn0Var.m : z7;
        hdn0Var.getClass();
        list3.getClass();
        list4.getClass();
        return new hdn0(list3, z8, bdn0Var2, cdn0Var2, wcbVar2, list4, z9, z10, z11, v5l0Var2, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdn0)) {
            return false;
        }
        hdn0 hdn0Var = (hdn0) obj;
        return Intrinsics.d(this.f12878a, hdn0Var.f12878a) && this.b == hdn0Var.b && this.c == hdn0Var.c && this.d == hdn0Var.d && Intrinsics.d(this.e, hdn0Var.e) && Intrinsics.d(this.f, hdn0Var.f) && this.g == hdn0Var.g && this.h == hdn0Var.h && this.i == hdn0Var.i && this.j == hdn0Var.j && this.k == hdn0Var.k && this.l == hdn0Var.l && this.m == hdn0Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f12878a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        wcb wcbVar = this.e;
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(axq.c(this.j, brm0.e(brm0.e(brm0.e(dw9.a((iHashCode + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionsTeamBetEventsState(eventCardList=");
        sb.append(this.f12878a);
        sb.append(", needScrollTop=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", errorType=");
        sb.append(this.d);
        sb.append(", champImagesHolder=");
        sb.append(this.e);
        sb.append(", specialEventList=");
        sb.append(this.f);
        sb.append(", isBettingDisabled=");
        ua80.u(", isRefreshing=", ", hasStream=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", sportEventCardStyle=");
        sb.append(this.j);
        sb.append(", isTablet=");
        ua80.u(", connected=", ", supportRtl=", sb, this.k, this.l);
        return rw2.p(sb, this.m, Separators.RPAREN);
    }
}
