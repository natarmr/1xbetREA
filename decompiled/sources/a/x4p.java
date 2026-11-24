package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40278a;
    public final List b;
    public final List c;
    public final f4p d;
    public final wcb e;
    public final mdm f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final v5l0 l;
    public final boolean m;
    public final boolean n;

    public x4p(String str, List list, List list2, f4p f4pVar, wcb wcbVar, mdm mdmVar, List list3, boolean z, boolean z2, boolean z3, boolean z4, v5l0 v5l0Var, boolean z5, boolean z6) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f40278a = str;
        this.b = list;
        this.c = list2;
        this.d = f4pVar;
        this.e = wcbVar;
        this.f = mdmVar;
        this.g = list3;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = v5l0Var;
        this.m = z5;
        this.n = z6;
    }

    public static x4p a(x4p x4pVar, String str, List list, List list2, f4p f4pVar, wcb wcbVar, List list3, boolean z, boolean z2, boolean z3, boolean z4, v5l0 v5l0Var, boolean z5, boolean z6, int i) {
        String str2 = (i & 1) != 0 ? x4pVar.f40278a : str;
        List list4 = (i & 2) != 0 ? x4pVar.b : list;
        List list5 = (i & 4) != 0 ? x4pVar.c : list2;
        f4p f4pVar2 = (i & 8) != 0 ? x4pVar.d : f4pVar;
        wcb wcbVar2 = (i & 16) != 0 ? x4pVar.e : wcbVar;
        mdm mdmVar = x4pVar.f;
        List list6 = (i & 64) != 0 ? x4pVar.g : list3;
        boolean z7 = (i & 128) != 0 ? x4pVar.h : z;
        boolean z8 = (i & 256) != 0 ? x4pVar.i : z2;
        boolean z9 = (i & 512) != 0 ? x4pVar.j : z3;
        boolean z10 = (i & 1024) != 0 ? x4pVar.k : z4;
        v5l0 v5l0Var2 = (i & 2048) != 0 ? x4pVar.l : v5l0Var;
        boolean z11 = (i & 4096) != 0 ? x4pVar.m : z5;
        boolean z12 = (i & 8192) != 0 ? x4pVar.n : z6;
        x4pVar.getClass();
        str2.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new x4p(str2, list4, list5, f4pVar2, wcbVar2, mdmVar, list6, z7, z8, z9, z10, v5l0Var2, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4p)) {
            return false;
        }
        x4p x4pVar = (x4p) obj;
        return Intrinsics.d(this.f40278a, x4pVar.f40278a) && Intrinsics.d(this.b, x4pVar.b) && Intrinsics.d(this.c, x4pVar.c) && this.d == x4pVar.d && Intrinsics.d(this.e, x4pVar.e) && this.f.equals(x4pVar.f) && Intrinsics.d(this.g, x4pVar.g) && this.h == x4pVar.h && this.i == x4pVar.i && this.j == x4pVar.j && this.k == x4pVar.k && this.l == x4pVar.l && this.m == x4pVar.m && this.n == x4pVar.n;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + dw9.a(dw9.a(this.f40278a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        wcb wcbVar = this.e;
        return Boolean.hashCode(this.n) + brm0.e(axq.c(this.l, brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(f140.d(this.f, (iHashCode + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("FavoriteCategoryScreenState(headerTitle=", this.f40278a, ", eventCardList=", this.b, ", recommendedEventCardList=");
        sbF.append(this.c);
        sbF.append(", errorType=");
        sbF.append(this.d);
        sbF.append(", champImagesHolder=");
        sbF.append(this.e);
        sbF.append(", lottieHeader=");
        sbF.append(this.f);
        sbF.append(", specialEventList=");
        rz4.z(sbF, ", isBettingDisabled=", this.g, ", isRefreshing=", this.h);
        ua80.u(", hasStream=", ", searchFieldVisible=", sbF, this.i, this.j);
        sbF.append(this.k);
        sbF.append(", sportEventCardStyle=");
        sbF.append(this.l);
        sbF.append(", isTablet=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sbF, this.m, this.n);
    }
}
