package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgn f22841a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public n3a0(vgn vgnVar, int i, int i2, int i3, boolean z, boolean z2) {
        this.f22841a = vgnVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
    }

    public static n3a0 a(n3a0 n3a0Var, vgn vgnVar, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        if ((i4 & 1) != 0) {
            vgnVar = n3a0Var.f22841a;
        }
        vgn vgnVar2 = vgnVar;
        if ((i4 & 2) != 0) {
            i = n3a0Var.b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = n3a0Var.c;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = n3a0Var.d;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            z = n3a0Var.e;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = n3a0Var.f;
        }
        n3a0Var.getClass();
        return new n3a0(vgnVar2, i5, i6, i7, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3a0)) {
            return false;
        }
        n3a0 n3a0Var = (n3a0) obj;
        return Intrinsics.d(this.f22841a, n3a0Var.f22841a) && this.b == n3a0Var.b && this.c == n3a0Var.c && this.d == n3a0Var.d && this.e == n3a0Var.e && this.f == n3a0Var.f;
    }

    public final int hashCode() {
        vgn vgnVar = this.f22841a;
        return Boolean.hashCode(this.f) + brm0.e(twn.a(this.d, twn.a(this.c, twn.a(this.b, (vgnVar == null ? 0 : vgnVar.f37389a.hashCode()) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerEarnedPointsState(earnedPointsModel=");
        sb.append(this.f22841a);
        sb.append(", mainTabPosition=");
        sb.append(this.b);
        sb.append(", subTabPositionLeft=");
        axq.r(this.c, this.d, ", subTabPositionRight=", ", isLoading=", sb);
        return ohs0.p(", isError=", Separators.RPAREN, sb, this.e, this.f);
    }
}
