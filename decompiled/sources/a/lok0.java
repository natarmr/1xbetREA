package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lok0 implements Serializable {
    public static final kok0 Companion = new kok0();
    public static final a8z[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20396a;
    public final String b;
    public final long c;
    public final long d;
    public final oho e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final List s;
    public final List t;
    public final String u;

    static {
        wez wezVar = wez.f39042a;
        v = new a8z[]{null, null, null, null, maz.a(wezVar, new pdk0((byte) 10)), null, null, null, null, maz.a(wezVar, new pdk0((byte) 11)), maz.a(wezVar, new pdk0((byte) 12)), maz.a(wezVar, new pdk0((byte) 13)), maz.a(wezVar, new pdk0((byte) 14)), null, null, null, null, null, maz.a(wezVar, new pdk0((byte) 15)), maz.a(wezVar, new pdk0((byte) 16)), null};
    }

    public /* synthetic */ lok0(int i, int i2, String str, long j, long j2, oho ohoVar, long j3, long j4, boolean z, boolean z2, List list, List list2, List list3, List list4, boolean z3, boolean z4, boolean z5, int i3, boolean z6, List list5, List list6, String str2) {
        if (2097151 != (i & 2097151)) {
            m2x.I(i, 2097151, jok0.f16862a.getDescriptor());
            throw null;
        }
        this.f20396a = i2;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = ohoVar;
        this.f = j3;
        this.g = j4;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.k = list2;
        this.l = list3;
        this.m = list4;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = i3;
        this.r = z6;
        this.s = list5;
        this.t = list6;
        this.u = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lok0)) {
            return false;
        }
        lok0 lok0Var = (lok0) obj;
        return this.f20396a == lok0Var.f20396a && Intrinsics.d(this.b, lok0Var.b) && this.c == lok0Var.c && this.d == lok0Var.d && this.e == lok0Var.e && this.f == lok0Var.f && this.g == lok0Var.g && this.h == lok0Var.h && this.i == lok0Var.i && Intrinsics.d(this.j, lok0Var.j) && Intrinsics.d(this.k, lok0Var.k) && Intrinsics.d(this.l, lok0Var.l) && Intrinsics.d(this.m, lok0Var.m) && this.n == lok0Var.n && this.o == lok0Var.o && this.p == lok0Var.p && this.q == lok0Var.q && this.r == lok0Var.r && Intrinsics.d(this.s, lok0Var.s) && Intrinsics.d(this.t, lok0Var.t) && Intrinsics.d(this.u, lok0Var.u);
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(this.q, brm0.e(brm0.e(brm0.e(dw9.a(dw9.a(dw9.a(dw9.a(brm0.e(brm0.e(rw2.b(rw2.b((this.e.hashCode() + rw2.b(rw2.b(ua80.b(Integer.hashCode(this.f20396a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), 31, this.r);
        List list = this.s;
        return this.u.hashCode() + dw9.a((iE + (list == null ? 0 : list.hashCode())) * 31, 31, this.t);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f20396a, "SpecialEventInfoModel(id=", ", title=", this.b, ", dateStart=");
        sbR.append(this.c);
        kng0.A(sbR, ", dateEnd=", this.d, ", eventStyle=");
        sbR.append(this.e);
        sbR.append(", sportId=");
        sbR.append(this.f);
        kng0.A(sbR, ", subSportId=", this.g, ", imageFromStatic=");
        ua80.u(", hasFinals=", ", scheduleContentOrderIds=", sbR, this.h, this.i);
        b1j.y(", myGamesContentOrderIds=", ", statisticContentOrderIds=", sbR, this.j, this.k);
        b1j.y(", tournamentContentOrderIds=", ", customSportIcon=", sbR, this.l, this.m);
        ua80.u(", customChampIcon=", ", topIcon=", sbR, this.n, this.o);
        ua80.q(this.q, ", bannerCategoryId=", ", hasTimer=", sbR, this.p);
        vqd.y(sbR, ", socialNets=", this.s, ", location=", this.r);
        sbR.append(this.t);
        sbR.append(", overrideImagesId=");
        sbR.append(this.u);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    public lok0(int i, String str, long j, long j2, oho ohoVar, long j3, long j4, boolean z, boolean z2, List list, List list2, List list3, List list4, boolean z3, boolean z4, boolean z5, int i2, boolean z6, List list5, List list6, String str2) {
        rz4.B(list, list2, list3, list4, list6);
        this.f20396a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = ohoVar;
        this.f = j3;
        this.g = j4;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.k = list2;
        this.l = list3;
        this.m = list4;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = i2;
        this.r = z6;
        this.s = list5;
        this.t = list6;
        this.u = str2;
    }
}
