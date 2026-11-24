package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eoa0 implements hoa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8130a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final a4x l;
    public final String m;
    public final long n;

    public eoa0(String str, String str2, long j, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i, a4x a4xVar, String str5, long j3) {
        w6x.x(a4xVar, str, str2);
        this.f8130a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = i;
        this.l = a4xVar;
        this.m = str5;
        this.n = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoa0)) {
            return false;
        }
        eoa0 eoa0Var = (eoa0) obj;
        if (!Intrinsics.d(this.f8130a, eoa0Var.f8130a) || !Intrinsics.d(this.b, eoa0Var.b)) {
            return false;
        }
        long j = eoa0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, eoa0Var.d) && this.e.equals(eoa0Var.e) && this.f.equals(eoa0Var.f) && this.g == eoa0Var.g && this.h == eoa0Var.h && this.i == eoa0Var.i && this.j == eoa0Var.j && this.k == eoa0Var.k && Intrinsics.d(this.l, eoa0Var.l) && this.m.equals(eoa0Var.m) && h2t0.a(this.n, eoa0Var.n);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f8130a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.n) + ua80.b(cs0.b(this.l, twn.a(this.k, brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.d);
        String strI3 = y3d.i(this.n);
        StringBuilder sbN = b1j.n("PointByPointsCommonUiModel(scoreOne=", this.f8130a, ", scoreTwo=", this.b, ", scoreOneTextColor=");
        f140.v(sbN, strI, ", scoreTwoTextColor=", strI2, ", subScoreOne=");
        f140.v(sbN, this.e, ", subScoreTwo=", this.f, ", teamOneServing=");
        ua80.u(", teamTwoServing=", ", teamOneLoseServing=", sbN, this.g, this.h);
        ua80.u(", teamTwoLoseServing=", ", loseServingTextResId=", sbN, this.i, this.j);
        sbN.append(this.k);
        sbN.append(", points=");
        sbN.append(this.l);
        sbN.append(", sportImageUrl=");
        return ua80.m(sbN, this.m, ", sportImageColor=", strI3, Separators.RPAREN);
    }
}
