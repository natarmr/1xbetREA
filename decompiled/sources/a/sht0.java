package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class sht0 {
    public static final rht0 Companion = new rht0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32231a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final yb9 g;
    public final String h;
    public final boolean i;
    public final int j;
    public final int k;
    public final long l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    static {
        xb9 xb9Var = yb9.Companion;
    }

    public /* synthetic */ sht0(int i, String str, String str2, int i2, boolean z, boolean z2, boolean z3, yb9 yb9Var, String str3, boolean z4, int i3, int i4, long j, long j2, int i5, int i6, int i7, int i8) {
        if (131071 != (i & 131071)) {
            m2x.I(i, 131071, qht0.f28757a.getDescriptor());
            throw null;
        }
        this.f32231a = str;
        this.b = str2;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = yb9Var;
        this.h = str3;
        this.i = z4;
        this.j = i3;
        this.k = i4;
        this.l = j;
        this.m = j2;
        this.n = i5;
        this.o = i6;
        this.p = i7;
        this.q = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sht0)) {
            return false;
        }
        sht0 sht0Var = (sht0) obj;
        return Intrinsics.d(this.f32231a, sht0Var.f32231a) && Intrinsics.d(this.b, sht0Var.b) && this.c == sht0Var.c && this.d == sht0Var.d && this.e == sht0Var.e && this.f == sht0Var.f && Intrinsics.d(this.g, sht0Var.g) && Intrinsics.d(this.h, sht0Var.h) && this.i == sht0Var.i && this.j == sht0Var.j && this.k == sht0Var.k && this.l == sht0Var.l && this.m == sht0Var.m && this.n == sht0Var.n && this.o == sht0Var.o && this.p == sht0Var.p && this.q == sht0Var.q;
    }

    public final int hashCode() {
        return Integer.hashCode(this.q) + twn.a(this.p, twn.a(this.o, twn.a(this.n, rw2.b(rw2.b(twn.a(this.k, twn.a(this.j, brm0.e(ua80.b((this.g.hashCode() + brm0.e(brm0.e(brm0.e(twn.a(this.c, ua80.b(this.f32231a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UpdateCouponBuilderRequest(appGUID=", this.f32231a, ", sum=", this.b, ", checkCoef=");
        brm0.w(this.c, ", noWait=", ", advanceBet=", sbN, this.d);
        ua80.u(", addPromoCodes=", ", builderCoupon=", sbN, this.e, this.f);
        sbN.append(this.g);
        sbN.append(", lng=");
        sbN.append(this.h);
        sbN.append(", isNewBuilder=");
        ua80.q(this.j, ", cfView=", ", kind=", sbN, this.i);
        sbN.append(this.k);
        sbN.append(", userId=");
        sbN.append(this.l);
        kng0.A(sbN, ", userBonusId=", this.m, ", source=");
        axq.r(this.n, this.o, ", refId=", ", country=", sbN);
        return w6x.o(this.p, this.q, ", vid=", Separators.RPAREN, sbN);
    }

    public sht0(String str, boolean z, yb9 yb9Var, String str2, int i, int i2, long j, long j2, int i3, int i4) {
        this.f32231a = str;
        this.b = "0.0";
        this.c = 0;
        this.d = true;
        this.e = false;
        this.f = z;
        this.g = yb9Var;
        this.h = str2;
        this.i = true;
        this.j = i;
        this.k = i2;
        this.l = j;
        this.m = j2;
        this.n = 22;
        this.o = 1;
        this.p = i3;
        this.q = i4;
    }
}
