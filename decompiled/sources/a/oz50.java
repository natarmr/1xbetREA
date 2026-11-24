package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f26089a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final y78 k;
    public final wcb l;
    public final List m;
    public final boolean n;
    public final ot0 o;
    public final boolean p;
    public final xte q;
    public final boolean r;

    public oz50(v5l0 v5l0Var, boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, y78 y78Var, wcb wcbVar, List list, boolean z8, ot0 ot0Var, boolean z9, xte xteVar, boolean z10) {
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        xteVar.getClass();
        this.f26089a = v5l0Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = y78Var;
        this.l = wcbVar;
        this.m = list;
        this.n = z8;
        this.o = ot0Var;
        this.p = z9;
        this.q = xteVar;
        this.r = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz50)) {
            return false;
        }
        oz50 oz50Var = (oz50) obj;
        return this.f26089a == oz50Var.f26089a && this.b == oz50Var.b && this.c.equals(oz50Var.c) && this.d.equals(oz50Var.d) && this.e == oz50Var.e && this.f == oz50Var.f && this.g == oz50Var.g && this.h == oz50Var.h && this.i == oz50Var.i && this.j == oz50Var.j && Intrinsics.d(this.k, oz50Var.k) && Intrinsics.d(this.l, oz50Var.l) && Intrinsics.d(this.m, oz50Var.m) && this.n == oz50Var.n && this.o == oz50Var.o && this.p == oz50Var.p && this.q == oz50Var.q && this.r == oz50Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + ((this.q.hashCode() + brm0.e((this.o.hashCode() + brm0.e(dw9.a((this.l.hashCode() + ((this.k.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(brm0.e(this.f26089a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m), 31, this.n)) * 31, 31, this.p)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoTabsDashboardConfig(sportEventCardStyle=");
        sb.append(this.f26089a);
        sb.append(", hasStream=");
        sb.append(this.b);
        sb.append(", accountControlStyle=");
        f140.v(sb, this.c, ", xGamesName=", this.d, ", hasXGames=");
        ua80.u(", hasTeamBet=", ", isVirtual=", sb, this.e, this.f);
        ua80.u(", isAggregator=", ", isNewEventParams=", sb, this.g, this.h);
        ua80.u(", bettingDisabled=", ", gameUtilsProvider=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", champImagesHolder=");
        sb.append(this.l);
        sb.append(", specialEvents=");
        rz4.z(sb, ", isTablet=", this.m, ", aggregatorGameCardCollectionStyle=", this.n);
        sb.append(this.o);
        sb.append(", supportRtl=");
        sb.append(this.p);
        sb.append(", couponCardStyleType=");
        sb.append(this.q);
        sb.append(", altStyleEnabled=");
        sb.append(this.r);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
