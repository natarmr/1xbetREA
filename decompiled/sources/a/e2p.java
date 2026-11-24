package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7097a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final List j;
    public final ot0 k;
    public final mdm l;
    public final mdm m;
    public final mdm n;
    public final boolean o;

    public e2p(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, List list2, ot0 ot0Var, mdm mdmVar, mdm mdmVar2, mdm mdmVar3, boolean z8) {
        list.getClass();
        list2.getClass();
        this.f7097a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = list;
        this.j = list2;
        this.k = ot0Var;
        this.l = mdmVar;
        this.m = mdmVar2;
        this.n = mdmVar3;
        this.o = z8;
    }

    public static e2p a(e2p e2pVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, List list2, ot0 ot0Var, boolean z7, int i) {
        String str = e2pVar.f7097a;
        boolean z8 = (i & 2) != 0 ? e2pVar.b : z;
        boolean z9 = (i & 4) != 0 ? e2pVar.c : false;
        e2pVar.getClass();
        boolean z10 = (i & 16) != 0 ? e2pVar.d : z2;
        boolean z11 = (i & 32) != 0 ? e2pVar.e : z3;
        boolean z12 = (i & 64) != 0 ? e2pVar.f : z4;
        boolean z13 = (i & 128) != 0 ? e2pVar.g : z5;
        boolean z14 = (i & 256) != 0 ? e2pVar.h : z6;
        List list3 = (i & 512) != 0 ? e2pVar.i : list;
        List list4 = (i & 1024) != 0 ? e2pVar.j : list2;
        ot0 ot0Var2 = (i & 2048) != 0 ? e2pVar.k : ot0Var;
        mdm mdmVar = e2pVar.l;
        boolean z15 = z8;
        boolean z16 = z9;
        boolean z17 = z10;
        boolean z18 = z11;
        boolean z19 = z12;
        boolean z20 = z13;
        boolean z21 = z14;
        List list5 = list3;
        List list6 = list4;
        ot0 ot0Var3 = ot0Var2;
        mdm mdmVar2 = e2pVar.m;
        mdm mdmVar3 = e2pVar.n;
        boolean z22 = (i & 32768) != 0 ? e2pVar.o : z7;
        e2pVar.getClass();
        list5.getClass();
        list6.getClass();
        return new e2p(str, z15, z16, z17, z18, z19, z20, z21, list5, list6, ot0Var3, mdmVar, mdmVar2, mdmVar3, z22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2p)) {
            return false;
        }
        e2p e2pVar = (e2p) obj;
        return this.f7097a.equals(e2pVar.f7097a) && this.b == e2pVar.b && this.c == e2pVar.c && this.d == e2pVar.d && this.e == e2pVar.e && this.f == e2pVar.f && this.g == e2pVar.g && this.h == e2pVar.h && Intrinsics.d(this.i, e2pVar.i) && Intrinsics.d(this.j, e2pVar.j) && this.k == e2pVar.k && this.l.equals(e2pVar.l) && this.m.equals(e2pVar.m) && this.n.equals(e2pVar.n) && this.o == e2pVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + f140.d(this.n, f140.d(this.m, f140.d(this.l, (this.k.hashCode() + dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(this.f7097a.hashCode() * 31, 31, this.b), 31, this.c), 31, false), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("FavoriteAggregatorState(screenName=", this.f7097a, ", showRefreshing=", this.b, ", showShimmers=");
        ua80.u(", scrollToTop=false, scrollTop=", ", authorized=", sbU, this.c, this.d);
        ua80.u(", showConnectionError=", ", showDataError=", sbU, this.e, this.f);
        ua80.u(", isVirtual=", ", defaultGames=", sbU, this.g, this.h);
        b1j.y(", favoriteAggregatorGames=", ", aggregatorGameCardCollectionStyle=", sbU, this.i, this.j);
        sbU.append(this.k);
        sbU.append(", lottieConfigConnectionError=");
        sbU.append(this.l);
        sbU.append(", lottieConfigEmptyWithGames=");
        sbU.append(this.m);
        sbU.append(", lottieConfigDataError=");
        sbU.append(this.n);
        sbU.append(", connected=");
        return rw2.p(sbU, this.o, Separators.RPAREN);
    }
}
