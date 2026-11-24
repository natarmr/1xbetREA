package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16183a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final zec0 e;

    public jac0(boolean z, boolean z2, boolean z3, String str, zec0 zec0Var) {
        this.f16183a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = zec0Var;
    }

    public static jac0 a(jac0 jac0Var, boolean z, boolean z2, boolean z3, String str, zec0 zec0Var, int i) {
        if ((i & 1) != 0) {
            z = jac0Var.f16183a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = jac0Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = jac0Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            str = jac0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            zec0Var = jac0Var.e;
        }
        jac0Var.getClass();
        return new jac0(z4, z5, z6, str2, zec0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jac0)) {
            return false;
        }
        jac0 jac0Var = (jac0) obj;
        return this.f16183a == jac0Var.f16183a && this.b == jac0Var.b && this.c == jac0Var.c && this.d.equals(jac0Var.d) && Intrinsics.d(this.e, jac0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f16183a) * 31, 31, this.b), 31, this.c), 31, this.d);
        zec0 zec0Var = this.e;
        return iB + (zec0Var == null ? 0 : zec0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoCheckStateModel(showLoading=", ", isNetworkAvailable=", ", showPromoNotFound=", this.f16183a, this.b);
        f140.s(", enteredPromoValue=", this.d, ", promoCodeModel=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
