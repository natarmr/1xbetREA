package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class na00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l800 f23166a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;

    public na00(l800 l800Var, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3) {
        this.f23166a = l800Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = j3;
    }

    public static na00 a(na00 na00Var, l800 l800Var, int i, long j, long j2, boolean z, boolean z2, long j3, int i2) {
        l800 l800Var2 = (i2 & 1) != 0 ? na00Var.f23166a : l800Var;
        int i3 = (i2 & 2) != 0 ? na00Var.b : i;
        long j4 = (i2 & 4) != 0 ? na00Var.c : j;
        long j5 = (i2 & 8) != 0 ? na00Var.d : j2;
        boolean z3 = (i2 & 16) != 0 ? na00Var.e : z;
        boolean z4 = (i2 & 32) != 0 ? na00Var.f : false;
        boolean z5 = (i2 & 64) != 0 ? na00Var.g : z2;
        boolean z6 = (i2 & 128) != 0 ? na00Var.h : true;
        long j6 = (i2 & 256) != 0 ? na00Var.i : j3;
        l800Var2.getClass();
        return new na00(l800Var2, i3, j4, j5, z3, z4, z5, z6, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na00)) {
            return false;
        }
        na00 na00Var = (na00) obj;
        return this.f23166a.equals(na00Var.f23166a) && this.b == na00Var.b && this.c == na00Var.c && this.d == na00Var.d && this.e == na00Var.e && this.f == na00Var.f && this.g == na00Var.g && this.h == na00Var.h && this.i == na00Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + brm0.e(brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(twn.a(this.b, this.f23166a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineupsState(lineupModel=");
        sb.append(this.f23166a);
        sb.append(", selectedTab=");
        sb.append(this.b);
        sb.append(", selectedFirstChip=");
        sb.append(this.c);
        kng0.A(sb, ", selectedSecondChip=", this.d, ", hasError=");
        ua80.u(", isLoading=", ", isExpanded=", sb, this.e, this.f);
        ua80.u(", isImplemented=", ", lineupLottieTimerEnd=", sb, this.g, this.h);
        return brm0.k(this.i, Separators.RPAREN, sb);
    }
}
