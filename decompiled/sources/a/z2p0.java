package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1p0 f43682a;
    public final nfp0 b;
    public final String c;
    public final boolean d;
    public final x2p0 e;
    public final boolean f;
    public final boolean g;

    public z2p0(t1p0 t1p0Var, nfp0 nfp0Var, String str, boolean z, x2p0 x2p0Var, boolean z2, boolean z3) {
        str.getClass();
        this.f43682a = t1p0Var;
        this.b = nfp0Var;
        this.c = str;
        this.d = z;
        this.e = x2p0Var;
        this.f = z2;
        this.g = z3;
    }

    public static z2p0 a(z2p0 z2p0Var, t1p0 t1p0Var, nfp0 nfp0Var, boolean z, x2p0 x2p0Var, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            t1p0Var = z2p0Var.f43682a;
        }
        t1p0 t1p0Var2 = t1p0Var;
        if ((i & 2) != 0) {
            nfp0Var = z2p0Var.b;
        }
        nfp0 nfp0Var2 = nfp0Var;
        String str = z2p0Var.c;
        if ((i & 8) != 0) {
            z = z2p0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            x2p0Var = z2p0Var.e;
        }
        x2p0 x2p0Var2 = x2p0Var;
        if ((i & 32) != 0) {
            z2 = z2p0Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = z2p0Var.g;
        }
        z2p0Var.getClass();
        str.getClass();
        return new z2p0(t1p0Var2, nfp0Var2, str, z4, x2p0Var2, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2p0)) {
            return false;
        }
        z2p0 z2p0Var = (z2p0) obj;
        return Intrinsics.d(this.f43682a, z2p0Var.f43682a) && Intrinsics.d(this.b, z2p0Var.b) && Intrinsics.d(this.c, z2p0Var.c) && this.d == z2p0Var.d && Intrinsics.d(this.e, z2p0Var.e) && this.f == z2p0Var.f && this.g == z2p0Var.g;
    }

    public final int hashCode() {
        t1p0 t1p0Var = this.f43682a;
        int iHashCode = (t1p0Var == null ? 0 : t1p0Var.hashCode()) * 31;
        nfp0 nfp0Var = this.b;
        int iE = brm0.e(ua80.b((iHashCode + (nfp0Var == null ? 0 : nfp0Var.hashCode())) * 31, 31, this.c), 31, this.d);
        x2p0 x2p0Var = this.e;
        return Boolean.hashCode(this.g) + brm0.e((iE + (x2p0Var != null ? x2p0Var.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetStatisticsScreenState(statistic=");
        sb.append(this.f43682a);
        sb.append(", menu=");
        sb.append(this.b);
        sb.append(", teamId=");
        brm0.C(this.c, ", allRequestsFailed=", ", config=", sb, this.d);
        sb.append(this.e);
        sb.append(", loading=");
        sb.append(this.f);
        sb.append(", isRefreshing=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
