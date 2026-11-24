package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43968a;
    public final niq0 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public z8i0(boolean z, niq0 niq0Var, int i, boolean z2, boolean z3, boolean z4) {
        this.f43968a = z;
        this.b = niq0Var;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static z8i0 a(z8i0 z8i0Var, boolean z, niq0 niq0Var, int i, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            z = z8i0Var.f43968a;
        }
        boolean z5 = z;
        if ((i2 & 2) != 0) {
            niq0Var = z8i0Var.b;
        }
        niq0 niq0Var2 = niq0Var;
        if ((i2 & 4) != 0) {
            i = z8i0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z2 = z8i0Var.d;
        }
        boolean z6 = z2;
        if ((i2 & 16) != 0) {
            z3 = z8i0Var.e;
        }
        boolean z7 = z3;
        if ((i2 & 32) != 0) {
            z4 = z8i0Var.f;
        }
        z8i0Var.getClass();
        return new z8i0(z5, niq0Var2, i3, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8i0)) {
            return false;
        }
        z8i0 z8i0Var = (z8i0) obj;
        return this.f43968a == z8i0Var.f43968a && Intrinsics.d(this.b, z8i0Var.b) && this.c == z8i0Var.c && this.d == z8i0Var.d && this.e == z8i0Var.e && this.f == z8i0Var.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f43968a) * 31;
        niq0 niq0Var = this.b;
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(twn.a(this.c, (iHashCode + (niq0Var == null ? 0 : niq0Var.hashCode())) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfExclusionRsState(isEmpty=");
        sb.append(this.f43968a);
        sb.append(", currentLimitModel=");
        sb.append(this.b);
        sb.append(", selectedValueIndex=");
        brm0.w(this.c, ", isVerified=", ", hasEmail=", sb, this.d);
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.e, this.f);
    }
}
