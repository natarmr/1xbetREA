package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30972a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final y78 k;
    public final wcb l;
    public final List m;
    public final boolean n;

    public rra(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, y78 y78Var, wcb wcbVar, List list, boolean z9) {
        str.getClass();
        str2.getClass();
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        this.f30972a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = str2;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = y78Var;
        this.l = wcbVar;
        this.m = list;
        this.n = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rra)) {
            return false;
        }
        rra rraVar = (rra) obj;
        return this.f30972a == rraVar.f30972a && this.b == rraVar.b && Intrinsics.d(this.c, rraVar.c) && this.d == rraVar.d && this.e == rraVar.e && Intrinsics.d(this.f, rraVar.f) && this.g == rraVar.g && this.h == rraVar.h && this.i == rraVar.i && this.j == rraVar.j && Intrinsics.d(this.k, rraVar.k) && Intrinsics.d(this.l, rraVar.l) && Intrinsics.d(this.m, rraVar.m) && this.n == rraVar.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + dw9.a((this.l.hashCode() + ((this.k.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(ua80.b(brm0.e(Boolean.hashCode(this.f30972a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CardsInHeaderContainerConfig(hasPopularBalance=", ", hasSectionXGames=", ", xGamesName=", this.f30972a, this.b);
        brm0.C(this.c, ", hasSectionAggregator=", ", hasSectionVirtual=", sbQ, this.d);
        f140.s(", accountControlStyle=", this.f, ", hasStream=", sbQ, this.e);
        ua80.u(", isNewEventParams=", ", bettingDisabled=", sbQ, this.g, this.h);
        ua80.u(", hasTeamBet=", ", gameUtilsProvider=", sbQ, this.i, this.j);
        sbQ.append(this.k);
        sbQ.append(", champImagesHolder=");
        sbQ.append(this.l);
        sbQ.append(", specialEvents=");
        sbQ.append(this.m);
        sbQ.append(", supportRtl=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
