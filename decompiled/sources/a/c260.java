package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3609a;
    public final oz50 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final om5 f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final tz50 j;
    public final mdm k;
    public final mdm l;
    public final boolean m;
    public final mdm n;
    public final s4i0 o;
    public final s4i0 p;

    public c260(String str, oz50 oz50Var, boolean z, boolean z2, boolean z3, om5 om5Var, boolean z4, boolean z5, List list, tz50 tz50Var, mdm mdmVar, mdm mdmVar2, boolean z6, mdm mdmVar3, s4i0 s4i0Var, s4i0 s4i0Var2) {
        str.getClass();
        list.getClass();
        this.f3609a = str;
        this.b = oz50Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = om5Var;
        this.g = z4;
        this.h = z5;
        this.i = list;
        this.j = tz50Var;
        this.k = mdmVar;
        this.l = mdmVar2;
        this.m = z6;
        this.n = mdmVar3;
        this.o = s4i0Var;
        this.p = s4i0Var2;
    }

    public static c260 a(c260 c260Var, oz50 oz50Var, boolean z, boolean z2, boolean z3, om5 om5Var, boolean z4, List list, tz50 tz50Var, s4i0 s4i0Var, s4i0 s4i0Var2, int i) {
        String str = c260Var.f3609a;
        oz50 oz50Var2 = (i & 2) != 0 ? c260Var.b : oz50Var;
        c260Var.getClass();
        boolean z5 = (i & 8) != 0 ? c260Var.c : z;
        c260Var.getClass();
        boolean z6 = (i & 32) != 0 ? c260Var.d : z2;
        boolean z7 = (i & 64) != 0 ? c260Var.e : z3;
        om5 om5Var2 = (i & 128) != 0 ? c260Var.f : om5Var;
        boolean z8 = (i & 256) != 0 ? c260Var.g : false;
        boolean z9 = (i & 512) != 0 ? c260Var.h : z4;
        List list2 = (i & 1024) != 0 ? c260Var.i : list;
        tz50 tz50Var2 = (i & 2048) != 0 ? c260Var.j : tz50Var;
        boolean z10 = false;
        List list3 = list2;
        mdm mdmVar = c260Var.k;
        oz50 oz50Var3 = oz50Var2;
        boolean z11 = z5;
        boolean z12 = z6;
        boolean z13 = z7;
        om5 om5Var3 = om5Var2;
        boolean z14 = z8;
        boolean z15 = z9;
        tz50 tz50Var3 = tz50Var2;
        mdm mdmVar2 = c260Var.l;
        if ((i & 16384) != 0) {
            z10 = c260Var.m;
        }
        mdm mdmVar3 = c260Var.n;
        s4i0 s4i0Var3 = (i & 65536) != 0 ? c260Var.o : s4i0Var;
        s4i0 s4i0Var4 = (i & 131072) != 0 ? c260Var.p : s4i0Var2;
        c260Var.getClass();
        str.getClass();
        om5Var3.getClass();
        list3.getClass();
        tz50Var3.getClass();
        return new c260(str, oz50Var3, z11, z12, z13, om5Var3, z14, z15, list3, tz50Var3, mdmVar, mdmVar2, z10, mdmVar3, s4i0Var3, s4i0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c260)) {
            return false;
        }
        c260 c260Var = (c260) obj;
        return Intrinsics.d(this.f3609a, c260Var.f3609a) && Intrinsics.d(this.b, c260Var.b) && this.c == c260Var.c && this.d == c260Var.d && this.e == c260Var.e && this.f.equals(c260Var.f) && this.g == c260Var.g && this.h == c260Var.h && Intrinsics.d(this.i, c260Var.i) && this.j.equals(c260Var.j) && this.k.equals(c260Var.k) && this.l.equals(c260Var.l) && this.m == c260Var.m && this.n.equals(c260Var.n) && Intrinsics.d(this.o, c260Var.o) && Intrinsics.d(this.p, c260Var.p);
    }

    public final int hashCode() {
        int iHashCode = this.f3609a.hashCode() * 31;
        oz50 oz50Var = this.b;
        int iD = f140.d(this.n, brm0.e(f140.d(this.l, f140.d(this.k, (this.j.hashCode() + dw9.a(brm0.e(brm0.e((this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (oz50Var == null ? 0 : oz50Var.hashCode())) * 31, 31, false), 31, this.c), 31, false), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31), 31), 31, this.m), 31);
        s4i0 s4i0Var = this.o;
        int iHashCode2 = (iD + (s4i0Var == null ? 0 : s4i0Var.hashCode())) * 31;
        s4i0 s4i0Var2 = this.p;
        return iHashCode2 + (s4i0Var2 != null ? s4i0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoTabsDashboardState(title=");
        sb.append(this.f3609a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", showGamesUM=false, showRefreshing=");
        ua80.u(", scrollToTop=false, authorized=", ", connected=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", balanceState=");
        sb.append(this.f);
        sb.append(", recommendedGamesFirstRequest=");
        ua80.u(", showConnectionError=", ", itemsOrder=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", gameModel=");
        sb.append(this.j);
        sb.append(", lottieConfigConnectionError=");
        sb.append(this.k);
        sb.append(", lottieConfigEmptyWithGames=");
        sb.append(this.l);
        sb.append(", favoriteGamesFirstRequest=");
        sb.append(this.m);
        sb.append(", lottieConfigDataError=");
        sb.append(this.n);
        sb.append(", selectedTrackCoefItem=");
        sb.append(this.o);
        sb.append(", removingTrackCoefItem=");
        sb.append(this.p);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
