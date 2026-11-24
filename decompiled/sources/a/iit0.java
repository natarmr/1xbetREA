package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class iit0 {
    public static final hit0 Companion = new hit0();
    public static final a8z[] y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14845a;
    public final long b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;
    public final List l;
    public final int m;
    public final boolean n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final List s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;

    static {
        wez wezVar = wez.f39042a;
        y = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new tht0((byte) 2)), null, null, null, null, null, null, maz.a(wezVar, new tht0((byte) 3)), null, null, null, null, null};
    }

    public /* synthetic */ iit0(int i, long j, long j2, String str, int i2, long j3, String str2, int i3, int i4, int i5, String str3, boolean z, List list, int i6, boolean z2, String str4, String str5, boolean z3, boolean z4, List list2, boolean z5, boolean z6, boolean z7, int i7, int i8) {
        if (16776959 != (i & 16776959)) {
            m2x.I(i, 16776959, git0.f11367a.getDescriptor());
            throw null;
        }
        this.f14845a = j;
        this.b = j2;
        this.c = str;
        this.d = i2;
        this.e = j3;
        this.f = str2;
        this.g = i3;
        this.h = i4;
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i5;
        }
        this.j = str3;
        this.k = z;
        this.l = list;
        this.m = i6;
        this.n = z2;
        this.o = str4;
        this.p = str5;
        this.q = z3;
        this.r = z4;
        this.s = list2;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = i7;
        this.x = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iit0)) {
            return false;
        }
        iit0 iit0Var = (iit0) obj;
        return this.f14845a == iit0Var.f14845a && this.b == iit0Var.b && Intrinsics.d(this.c, iit0Var.c) && this.d == iit0Var.d && this.e == iit0Var.e && Intrinsics.d(this.f, iit0Var.f) && this.g == iit0Var.g && this.h == iit0Var.h && this.i == iit0Var.i && Intrinsics.d(this.j, iit0Var.j) && this.k == iit0Var.k && Intrinsics.d(this.l, iit0Var.l) && this.m == iit0Var.m && this.n == iit0Var.n && Intrinsics.d(this.o, iit0Var.o) && Intrinsics.d(this.p, iit0Var.p) && this.q == iit0Var.q && this.r == iit0Var.r && Intrinsics.d(this.s, iit0Var.s) && this.t == iit0Var.t && this.u == iit0Var.u && this.v == iit0Var.v && this.w == iit0Var.w && this.x == iit0Var.x;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x) + twn.a(this.w, brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(brm0.e(ua80.b(ua80.b(brm0.e(twn.a(this.m, dw9.a(brm0.e(ua80.b(twn.a(this.i, twn.a(this.h, twn.a(this.g, ua80.b(rw2.b(twn.a(this.d, ua80.b(rw2.b(Long.hashCode(this.f14845a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31), 31), 31), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f14845a, "UpdateCouponRequest(userId=", ", userBonusId=");
        kng0.z(sbQ, this.b, ", appGUID=", this.c);
        rw2.x(sbQ, ", vid=", this.d, ", expressNum=");
        kng0.z(sbQ, this.e, ", sum=", this.f);
        rw2.s(this.g, this.h, ", source=", ", refId=", sbQ);
        w6x.w(this.i, ", checkCoef=", ", lng=", this.j, sbQ);
        esw0.l(sbQ, ", noWait=", this.k, ", betEvents=", this.l);
        dw9.v(this.m, ", type=", ", advanceBet=", sbQ, this.n);
        f140.v(sbQ, ", saleBetId=", this.o, ", minBetSystem=", this.p);
        w6x.A(", addPromoCodes=", ", isPowerBet=", sbQ, this.q, this.r);
        esw0.k(sbQ, ", eventsIndexes=", this.s, ", withLobby=", this.t);
        w6x.A(", calcSystemsMin=", ", isExpressBoost=", sbQ, this.u, this.v);
        rw2.s(this.w, this.x, ", country=", ", specialTypes=", sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public iit0(long j, long j2, String str, int i, long j3, String str2, List list, int i2, String str3, String str4, boolean z, boolean z2, List list2, boolean z3, boolean z4, boolean z5, int i3, int i4) {
        list.getClass();
        str4.getClass();
        list2.getClass();
        this.f14845a = j;
        this.b = j2;
        this.c = str;
        this.d = i;
        this.e = j3;
        this.f = "0.0";
        this.g = 22;
        this.h = 1;
        this.i = 0;
        this.j = str2;
        this.k = true;
        this.l = list;
        this.m = i2;
        this.n = false;
        this.o = str3;
        this.p = str4;
        this.q = z;
        this.r = z2;
        this.s = list2;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        this.w = i3;
        this.x = i4;
    }
}
