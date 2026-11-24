package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ed80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f7604a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final y78 j;
    public final wcb k;
    public final List l;
    public final boolean m;
    public final ot0 n;
    public final boolean o;

    public ed80(v5l0 v5l0Var, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, y78 y78Var, wcb wcbVar, List list, boolean z8, ot0 ot0Var, boolean z9) {
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        this.f7604a = v5l0Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = y78Var;
        this.k = wcbVar;
        this.l = list;
        this.m = z8;
        this.n = ot0Var;
        this.o = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed80)) {
            return false;
        }
        ed80 ed80Var = (ed80) obj;
        return this.f7604a == ed80Var.f7604a && this.b == ed80Var.b && this.c.equals(ed80Var.c) && this.d == ed80Var.d && this.e == ed80Var.e && this.f == ed80Var.f && this.g == ed80Var.g && this.h == ed80Var.h && this.i == ed80Var.i && Intrinsics.d(this.j, ed80Var.j) && Intrinsics.d(this.k, ed80Var.k) && Intrinsics.d(this.l, ed80Var.l) && this.m == ed80Var.m && this.n == ed80Var.n && this.o == ed80Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + brm0.e(dw9.a((this.k.hashCode() + ((this.j.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(this.f7604a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31, 31, this.l), 31, this.m)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherStateConfig(sportEventCardStyle=");
        sb.append(this.f7604a);
        sb.append(", hasStream=");
        sb.append(this.b);
        sb.append(", xGamesName=");
        brm0.C(this.c, ", hasXGames=", ", hasTeamBet=", sb, this.d);
        ua80.u(", isVirtual=", ", isAggregator=", sb, this.e, this.f);
        ua80.u(", isNewEventParams=", ", bettingDisabled=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", gameUtilsProvider=");
        sb.append(this.j);
        sb.append(", champImagesHolder=");
        sb.append(this.k);
        sb.append(", specialEvents=");
        sb.append(this.l);
        sb.append(", isTablet=");
        sb.append(this.m);
        sb.append(", aggregatorGameCardCollectionStyle=");
        sb.append(this.n);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.o, Separators.RPAREN);
    }
}
