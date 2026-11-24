package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z5p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43829a;
    public final zdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final cpp0 h;

    public z5p0(long j, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, cpp0 cpp0Var) {
        this.f43829a = j;
        this.b = zdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = cpp0Var;
    }

    public static z5p0 a(z5p0 z5p0Var, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, cpp0 cpp0Var, int i) {
        long j = z5p0Var.f43829a;
        if ((i & 2) != 0) {
            zdm0Var = z5p0Var.b;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 4) != 0) {
            nc5Var = z5p0Var.c;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 8) != 0) {
            z = z5p0Var.d;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            z2 = z5p0Var.e;
        }
        boolean z6 = z2;
        boolean z7 = (i & 32) != 0 ? z5p0Var.f : z3;
        boolean z8 = (i & 64) != 0 ? z5p0Var.g : z4;
        cpp0 cpp0Var2 = (i & 128) != 0 ? z5p0Var.h : cpp0Var;
        z5p0Var.getClass();
        return new z5p0(j, zdm0Var2, nc5Var2, z5, z6, z7, z8, cpp0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5p0)) {
            return false;
        }
        z5p0 z5p0Var = (z5p0) obj;
        return this.f43829a == z5p0Var.f43829a && this.b.equals(z5p0Var.b) && this.c.equals(z5p0Var.c) && this.d == z5p0Var.d && this.e == z5p0Var.e && this.f == z5p0Var.f && this.g == z5p0Var.g && Intrinsics.d(this.h, z5p0Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + kng0.a(this.b, Long.hashCode(this.f43829a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        cpp0 cpp0Var = this.h;
        return iE + (cpp0Var == null ? 0 : cpp0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamCharacteristicsState(sportId=");
        sb.append(this.f43829a);
        sb.append(", statisticHeaderUiModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        w6x.A(", isError=", ", isEmpty=", sb, this.e, this.f);
        sb.append(", isLive=");
        sb.append(this.g);
        sb.append(", characteristics=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
