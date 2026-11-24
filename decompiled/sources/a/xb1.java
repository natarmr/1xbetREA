package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db1 f40578a;
    public final f02 b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final String i;
    public final Set j;
    public final boolean k;

    public xb1(db1 db1Var, f02 f02Var, boolean z, boolean z2, long j, long j2, long j3, boolean z3, String str, Set set, boolean z4) {
        str.getClass();
        this.f40578a = db1Var;
        this.b = f02Var;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z3;
        this.i = str;
        this.j = set;
        this.k = z4;
    }

    public static xb1 a(xb1 xb1Var, db1 db1Var, f02 f02Var, boolean z, long j, long j2, long j3, boolean z2, int i) {
        db1 db1Var2 = (i & 1) != 0 ? xb1Var.f40578a : db1Var;
        f02 f02Var2 = (i & 2) != 0 ? xb1Var.b : f02Var;
        boolean z3 = (i & 4) != 0 ? xb1Var.c : z;
        boolean z4 = xb1Var.d;
        long j4 = (i & 16) != 0 ? xb1Var.e : j;
        long j5 = (i & 32) != 0 ? xb1Var.f : j2;
        long j6 = (i & 64) != 0 ? xb1Var.g : j3;
        boolean z5 = (i & 128) != 0 ? xb1Var.h : z2;
        String str = xb1Var.i;
        Set set = xb1Var.j;
        boolean z6 = xb1Var.k;
        xb1Var.getClass();
        str.getClass();
        return new xb1(db1Var2, f02Var2, z3, z4, j4, j5, j6, z5, str, set, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb1)) {
            return false;
        }
        xb1 xb1Var = (xb1) obj;
        return this.f40578a.equals(xb1Var.f40578a) && Intrinsics.d(this.b, xb1Var.b) && this.c == xb1Var.c && this.d == xb1Var.d && this.e == xb1Var.e && this.f == xb1Var.f && this.g == xb1Var.g && this.h == xb1Var.h && Intrinsics.d(this.i, xb1Var.i) && this.j.equals(xb1Var.j) && this.k == xb1Var.k;
    }

    public final int hashCode() {
        int iHashCode = this.f40578a.hashCode() * 31;
        f02 f02Var = this.b;
        return Boolean.hashCode(this.k) + ohs0.g(this.j, ua80.b(brm0.e(rw2.b(rw2.b(rw2.b(brm0.e(brm0.e((iHashCode + (f02Var == null ? 0 : f02Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorPreloadGameStateModel(loadingModel=");
        sb.append(this.f40578a);
        sb.append(", webGameResult=");
        sb.append(this.b);
        sb.append(", playDemo=");
        ua80.u(", isAuth=", ", providerId=", sb, this.c, this.d);
        sb.append(this.e);
        kng0.A(sb, ", productId=", this.f, ", currentBalanceId=");
        hne.t(this.g, ", loadingEnable=", sb, this.h);
        sb.append(", giftInfoSubtitle=");
        sb.append(this.i);
        sb.append(", currentLimitedListeners=");
        sb.append(this.j);
        return f140.n(sb, ", shouldShowNavBar=", this.k, Separators.RPAREN);
    }
}
