package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ikq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14941a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final siq0 e;
    public final int f;
    public final int g;
    public final xrz h;

    public ikq0(boolean z, boolean z2, boolean z3, boolean z4, siq0 siq0Var, int i, int i2, xrz xrzVar) {
        xrzVar.getClass();
        this.f14941a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = siq0Var;
        this.f = i;
        this.g = i2;
        this.h = xrzVar;
    }

    public static ikq0 a(ikq0 ikq0Var, boolean z, boolean z2, boolean z3, boolean z4, siq0 siq0Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = ikq0Var.f14941a;
        }
        boolean z5 = z;
        if ((i3 & 2) != 0) {
            z2 = ikq0Var.b;
        }
        boolean z6 = z2;
        if ((i3 & 4) != 0) {
            z3 = ikq0Var.c;
        }
        boolean z7 = z3;
        if ((i3 & 8) != 0) {
            z4 = ikq0Var.d;
        }
        boolean z8 = z4;
        if ((i3 & 16) != 0) {
            siq0Var = ikq0Var.e;
        }
        siq0 siq0Var2 = siq0Var;
        if ((i3 & 32) != 0) {
            i = ikq0Var.f;
        }
        int i4 = i;
        int i5 = (i3 & 64) != 0 ? ikq0Var.g : i2;
        xrz xrzVar = ikq0Var.h;
        ikq0Var.getClass();
        xrzVar.getClass();
        return new ikq0(z5, z6, z7, z8, siq0Var2, i4, i5, xrzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikq0)) {
            return false;
        }
        ikq0 ikq0Var = (ikq0) obj;
        return this.f14941a == ikq0Var.f14941a && this.b == ikq0Var.b && this.c == ikq0Var.c && this.d == ikq0Var.d && Intrinsics.d(this.e, ikq0Var.e) && this.f == ikq0Var.f && this.g == ikq0Var.g && Intrinsics.d(this.h, ikq0Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f14941a) * 31, 31, this.b), 31, this.c), 31, this.d);
        siq0 siq0Var = this.e;
        return this.h.hashCode() + twn.a(this.g, twn.a(this.f, (iE + (siq0Var == null ? 0 : siq0Var.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TimeLimitsIeState(isLoading=", ", isApplyingLimit=", ", hasErrorWhileLoadingLimits=", this.f14941a, this.b);
        ua80.u(", isEmpty=", ", currentLimitModel=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", initialValueIndex=");
        sbQ.append(this.f);
        sbQ.append(", selectedValueIndex=");
        sbQ.append(this.g);
        sbQ.append(", limitType=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
