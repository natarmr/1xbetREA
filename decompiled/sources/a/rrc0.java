package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30977a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final mdm k;
    public final mdm l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    public rrc0(List list, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, mdm mdmVar, mdm mdmVar2, String str2, String str3, String str4, String str5) {
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f30977a = list;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = mdmVar;
        this.l = mdmVar2;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
    }

    public static rrc0 a(rrc0 rrc0Var, List list, int i, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i2) {
        List list2 = (i2 & 1) != 0 ? rrc0Var.f30977a : list;
        int i3 = (i2 & 2) != 0 ? rrc0Var.b : i;
        boolean z6 = (i2 & 4) != 0 ? rrc0Var.c : z;
        boolean z7 = rrc0Var.d;
        boolean z8 = rrc0Var.e;
        boolean z9 = (i2 & 32) != 0 ? rrc0Var.f : z2;
        String str2 = (i2 & 64) != 0 ? rrc0Var.g : str;
        boolean z10 = (i2 & 128) != 0 ? rrc0Var.h : z3;
        boolean z11 = (i2 & 256) != 0 ? rrc0Var.i : z4;
        boolean z12 = (i2 & 512) != 0 ? rrc0Var.j : z5;
        mdm mdmVar = rrc0Var.k;
        mdm mdmVar2 = rrc0Var.l;
        String str3 = rrc0Var.m;
        String str4 = rrc0Var.n;
        String str5 = rrc0Var.o;
        String str6 = rrc0Var.p;
        rrc0Var.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new rrc0(list2, i3, z6, z7, z8, z9, str2, z10, z11, z12, mdmVar, mdmVar2, str3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrc0)) {
            return false;
        }
        rrc0 rrc0Var = (rrc0) obj;
        return Intrinsics.d(this.f30977a, rrc0Var.f30977a) && this.b == rrc0Var.b && this.c == rrc0Var.c && this.d == rrc0Var.d && this.e == rrc0Var.e && this.f == rrc0Var.f && this.g.equals(rrc0Var.g) && this.h == rrc0Var.h && this.i == rrc0Var.i && this.j == rrc0Var.j && this.k.equals(rrc0Var.k) && this.l.equals(rrc0Var.l) && Intrinsics.d(this.m, rrc0Var.m) && Intrinsics.d(this.n, rrc0Var.n) && Intrinsics.d(this.o, rrc0Var.o) && Intrinsics.d(this.p, rrc0Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ua80.b(ua80.b(ua80.b(f140.d(this.l, f140.d(this.k, brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.b, this.f30977a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoShopInternalState(categories=");
        sb.append(this.f30977a);
        sb.append(", pointsCount=");
        sb.append(this.b);
        sb.append(", buttonLoading=");
        ua80.u(", promoPointsVisible=", ", promoRequestVisible=", sb, this.c, this.d);
        ua80.u(", appBarExpanded=", ", appBarSubtitle=", sb, this.e, this.f);
        brm0.C(this.g, ", showShimmers=", ", showEmpty=", sb, this.h);
        ua80.u(", showError=", ", emptyConfig=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", errorEmptyConfig=");
        sb.append(this.l);
        sb.append(", accountInfoLabel=");
        f140.v(sb, this.m, ", ptsSymbol=", this.n, ", requestBonusText=");
        return ua80.m(sb, this.o, ", allCategoryText=", this.p, Separators.RPAREN);
    }
}
