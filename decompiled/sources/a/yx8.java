package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yx8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wx8 f43408a;
    public final vx8 b;
    public final xx8 c;
    public final boolean d;
    public final ql5 e;
    public final kg f;
    public final ot0 g;
    public final boolean h;
    public final int i;
    public final String j;
    public final vc0 k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public yx8(wx8 wx8Var, vx8 vx8Var, xx8 xx8Var, boolean z, ql5 ql5Var, kg kgVar, ot0 ot0Var, boolean z2, int i, String str, vc0 vc0Var, long j, boolean z3, boolean z4, String str2, String str3, List list, boolean z5, boolean z6, boolean z7) {
        kgVar.getClass();
        ot0Var.getClass();
        list.getClass();
        this.f43408a = wx8Var;
        this.b = vx8Var;
        this.c = xx8Var;
        this.d = z;
        this.e = ql5Var;
        this.f = kgVar;
        this.g = ot0Var;
        this.h = z2;
        this.i = i;
        this.j = str;
        this.k = vc0Var;
        this.l = j;
        this.m = z3;
        this.n = z4;
        this.o = str2;
        this.p = str3;
        this.q = list;
        this.r = z5;
        this.s = z6;
        this.t = z7;
    }

    public static yx8 a(yx8 yx8Var, wx8 wx8Var, vx8 vx8Var, xx8 xx8Var, boolean z, ql5 ql5Var, String str, String str2, List list, boolean z2, int i) {
        wx8 wx8Var2 = (i & 1) != 0 ? yx8Var.f43408a : wx8Var;
        vx8 vx8Var2 = (i & 2) != 0 ? yx8Var.b : vx8Var;
        xx8 xx8Var2 = (i & 4) != 0 ? yx8Var.c : xx8Var;
        boolean z3 = (i & 8) != 0 ? yx8Var.d : z;
        ql5 ql5Var2 = (i & 16) != 0 ? yx8Var.e : ql5Var;
        kg kgVar = yx8Var.f;
        ot0 ot0Var = yx8Var.g;
        boolean z4 = yx8Var.h;
        int i2 = yx8Var.i;
        String str3 = yx8Var.j;
        vc0 vc0Var = yx8Var.k;
        long j = yx8Var.l;
        boolean z5 = yx8Var.m;
        boolean z6 = yx8Var.n;
        String str4 = (i & 16384) != 0 ? yx8Var.o : str;
        String str5 = (32768 & i) != 0 ? yx8Var.p : str2;
        List list2 = (65536 & i) != 0 ? yx8Var.q : list;
        boolean z7 = yx8Var.r;
        boolean z8 = (i & 262144) != 0 ? yx8Var.s : z2;
        boolean z9 = yx8Var.t;
        yx8Var.getClass();
        vx8Var2.getClass();
        kgVar.getClass();
        ot0Var.getClass();
        list2.getClass();
        return new yx8(wx8Var2, vx8Var2, xx8Var2, z3, ql5Var2, kgVar, ot0Var, z4, i2, str3, vc0Var, j, z5, z6, str4, str5, list2, z7, z8, z9);
    }

    public static yx8 b(yx8 yx8Var, boolean z, long j, int i) {
        vx8 vx8Var = yx8Var.b;
        boolean z2 = (i & 1) != 0 ? vx8Var.f38188a : z;
        List list = vx8Var.b;
        long j2 = (i & 4) != 0 ? vx8Var.c : j;
        list.getClass();
        return a(yx8Var, null, new vx8(j2, list, z2), null, false, null, null, null, null, false, 1048573);
    }

    public static yx8 c(yx8 yx8Var, boolean z) {
        xx8 xx8Var = yx8Var.c;
        String str = xx8Var.f41644a;
        String str2 = xx8Var.c;
        String str3 = xx8Var.d;
        String str4 = xx8Var.e;
        yx8Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return a(yx8Var, null, null, new xx8(str, str2, str3, z, str4), false, null, null, null, null, false, 1048571);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx8)) {
            return false;
        }
        yx8 yx8Var = (yx8) obj;
        return this.f43408a.equals(yx8Var.f43408a) && this.b.equals(yx8Var.b) && this.c.equals(yx8Var.c) && this.d == yx8Var.d && Intrinsics.d(this.e, yx8Var.e) && this.f == yx8Var.f && this.g == yx8Var.g && this.h == yx8Var.h && this.i == yx8Var.i && this.j.equals(yx8Var.j) && this.k == yx8Var.k && this.l == yx8Var.l && this.m == yx8Var.m && this.n == yx8Var.n && Intrinsics.d(this.o, yx8Var.o) && Intrinsics.d(this.p, yx8Var.p) && Intrinsics.d(this.q, yx8Var.q) && this.r == yx8Var.r && this.s == yx8Var.s && this.t == yx8Var.t;
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f43408a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ql5 ql5Var = this.e;
        int iE2 = brm0.e(brm0.e(rw2.b((this.k.hashCode() + ua80.b(twn.a(this.i, brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((iE + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31)) * 31, 31, this.h), 31), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n);
        String str = this.o;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        return Boolean.hashCode(this.t) + brm0.e(brm0.e(dw9.a((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandGamesState(contentState=");
        sb.append(this.f43408a);
        sb.append(", chipsState=");
        sb.append(this.b);
        sb.append(", navigationBarState=");
        sb.append(this.c);
        sb.append(", isLoggedIn=");
        sb.append(this.d);
        sb.append(", balance=");
        sb.append(this.e);
        sb.append(", accountSelectionStyle=");
        sb.append(this.f);
        sb.append(", aggregatorGameCardCollectionStyleType=");
        sb.append(this.g);
        sb.append(", isVirtual=");
        sb.append(this.h);
        sb.append(", lottieTypeId=");
        kng0.w(this.i, ", bannerImageUrl=", this.j, ", screenStyle=", sb);
        sb.append(this.k);
        sb.append(", brandId=");
        sb.append(this.l);
        w6x.A(", hasDescription=", ", hasAggregatorBrandsFullInfo=", sb, this.m, this.n);
        f140.v(sb, ", sortingOptionAttribute=", this.o, ", sortingOptionDirection=", this.p);
        esw0.k(sb, ", selectedLanguages=", this.q, ", aggregatorMethodList=", this.r);
        w6x.A(", isHeaderCollapsed=", ", isLargeScreen=", sb, this.s, this.t);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
