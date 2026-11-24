package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42661a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final px7 m;
    public final boolean n;
    public final boolean o;

    public yi(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, px7 px7Var, boolean z13, boolean z14) {
        this.f42661a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = px7Var;
        this.n = z13;
        this.o = z14;
    }

    public static yi a(yi yiVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, px7 px7Var, int i) {
        boolean z6 = yiVar.f42661a;
        boolean z7 = yiVar.b;
        boolean z8 = (i & 4) != 0 ? yiVar.c : z;
        boolean z9 = yiVar.d;
        boolean z10 = (i & 16) != 0 ? yiVar.e : z2;
        boolean z11 = (i & 32) != 0 ? yiVar.f : z3;
        boolean z12 = yiVar.g;
        boolean z13 = (i & 128) != 0 ? yiVar.h : z4;
        boolean z14 = yiVar.i;
        boolean z15 = (i & 512) != 0 ? yiVar.j : z5;
        boolean z16 = yiVar.k;
        boolean z17 = z8;
        boolean z18 = z10;
        boolean z19 = z11;
        boolean z20 = z13;
        boolean z21 = z15;
        boolean z22 = yiVar.l;
        px7 px7Var2 = (i & 4096) != 0 ? yiVar.m : px7Var;
        boolean z23 = yiVar.n;
        boolean z24 = yiVar.o;
        yiVar.getClass();
        return new yi(z6, z7, z17, z9, z18, z19, z12, z20, z14, z21, z16, z22, px7Var2, z23, z24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        return this.f42661a == yiVar.f42661a && this.b == yiVar.b && this.c == yiVar.c && this.d == yiVar.d && this.e == yiVar.e && this.f == yiVar.f && this.g == yiVar.g && this.h == yiVar.h && this.i == yiVar.i && this.j == yiVar.j && this.k == yiVar.k && this.l == yiVar.l && Intrinsics.d(this.m, yiVar.m) && this.n == yiVar.n && this.o == yiVar.o;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f42661a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        px7 px7Var = this.m;
        return Boolean.hashCode(this.o) + brm0.e((iE + (px7Var == null ? 0 : px7Var.hashCode())) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ActionMenuStateModel(statisticAvailable=", ", filterAvailable=", ", filteredMarkets=", this.f42661a, this.b);
        ua80.u(", expandAvailable=", ", expandedMarketGroups=", sbQ, this.c, this.d);
        ua80.u(", expandedSubGames=", ", favoriteAvailable=", sbQ, this.e, this.f);
        ua80.u(", favorite=", ", notifyAvailable=", sbQ, this.g, this.h);
        ua80.u(", subscribed=", ", marketChangesAvailable=", sbQ, this.i, this.j);
        ua80.u(", playersDuelAvailable=", ", currentMarketsState=", sbQ, this.k, this.l);
        sbQ.append(this.m);
        sbQ.append(", betsOnPlayersAvailable=");
        sbQ.append(this.n);
        sbQ.append(", cardsInfoSettingsOrderCustomized=");
        return rw2.p(sbQ, this.o, Separators.RPAREN);
    }
}
