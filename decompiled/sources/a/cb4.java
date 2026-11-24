package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4045a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final boolean n;
    public final List o;

    public cb4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, List list2, boolean z7, boolean z8, boolean z9, String str, String str2, boolean z10, List list3) {
        b1j.B(list, list2, list3);
        this.f4045a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = list;
        this.h = list2;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = str;
        this.m = str2;
        this.n = z10;
        this.o = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb4)) {
            return false;
        }
        cb4 cb4Var = (cb4) obj;
        return this.f4045a == cb4Var.f4045a && this.b == cb4Var.b && this.c == cb4Var.c && this.d == cb4Var.d && this.e == cb4Var.e && this.f == cb4Var.f && Intrinsics.d(this.g, cb4Var.g) && Intrinsics.d(this.h, cb4Var.h) && this.i == cb4Var.i && this.j == cb4Var.j && this.k == cb4Var.k && this.l.equals(cb4Var.l) && this.m.equals(cb4Var.m) && this.n == cb4Var.n && Intrinsics.d(this.o, cb4Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f4045a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginDefaultSettings(isNewApi=", ", isLoginByPhoneAvailable=", ", isLoginByEmailAndIdAvailable=", this.f4045a, this.b);
        ua80.u(", isLoginByLoginAvailable=", ", isActivatePhoneNecessarily=", sbQ, this.c, this.d);
        ua80.u(", isConsultantAvailable=", ", restorePasswordAllowedCountries=", sbQ, this.e, this.f);
        b1j.y(", restorePasswordForbiddenCountries=", ", redirectToVerificationAfterLogin=", sbQ, this.g, this.h);
        ua80.u(", redirectToPaymentAfterLogin=", ", hasBlockAuthVerification=", sbQ, this.i, this.j);
        f140.s(", socialAppKey=", this.l, ", xSocialAppKey=", sbQ, this.k);
        brm0.C(this.m, ", hasSocial=", ", regTypesOrdering=", sbQ, this.n);
        return dw9.r(sbQ, this.o, Separators.RPAREN);
    }
}
