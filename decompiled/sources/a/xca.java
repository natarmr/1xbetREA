package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xca implements mca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpp0 f40636a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List h;
    public final List i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;
    public final String r;
    public final String s;

    public xca(rpp0 rpp0Var, int i, int i2, int i3, int i4, int i5, int i6, List list, List list2, String str, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, String str8) {
        list.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        this.f40636a = rpp0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = list;
        this.i = list2;
        this.j = str;
        this.k = str2;
        this.l = z;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = z2;
        this.r = str7;
        this.s = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xca)) {
            return false;
        }
        xca xcaVar = (xca) obj;
        return this.f40636a.equals(xcaVar.f40636a) && this.b == xcaVar.b && this.c == xcaVar.c && this.d == xcaVar.d && this.e == xcaVar.e && this.f == xcaVar.f && this.g == xcaVar.g && Intrinsics.d(this.h, xcaVar.h) && Intrinsics.d(this.i, xcaVar.i) && this.j.equals(xcaVar.j) && this.k.equals(xcaVar.k) && this.l == xcaVar.l && this.m.equals(xcaVar.m) && this.n.equals(xcaVar.n) && Intrinsics.d(this.o, xcaVar.o) && Intrinsics.d(this.p, xcaVar.p) && this.q == xcaVar.q && this.r.equals(xcaVar.r) && Intrinsics.d(this.s, xcaVar.s);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(dw9.a(dw9.a(twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f40636a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        String str = this.s;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCommonLiveModel(teamsInfoModel=");
        sb.append(this.f40636a);
        sb.append(", teamOneRedCards=");
        sb.append(this.b);
        sb.append(", teamOneYellowCards=");
        axq.r(this.c, this.d, ", teamOneCorners=", ", teamTwoRedCards=", sb);
        axq.r(this.e, this.f, ", teamTwoYellowCards=", ", teamTwoCorners=", sb);
        ohs0.v(this.g, ", teamOneImageUrls=", ", teamTwoImageUrls=", sb, this.h);
        h97.y(", tournamentStage=", this.j, ", seriesScore=", sb, this.i);
        brm0.C(this.k, ", finished=", ", surfaceDescription=", sb, this.l);
        f140.v(sb, this.m, ", matchFormat=", this.n, ", vid=");
        f140.v(sb, this.o, ", dopInfo=", this.p, ", hostsVsGuests=");
        f140.s(", locationCountry=", this.r, ", subGameName=", sb, this.q);
        return axq.n(sb, this.s, Separators.RPAREN);
    }
}
