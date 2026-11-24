package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26882a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final List i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final boolean q;

    public pf4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, List list2, boolean z8, boolean z9, boolean z10, String str, String str2, String str3, boolean z11, boolean z12) {
        list.getClass();
        list2.getClass();
        str3.getClass();
        this.f26882a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = list;
        this.i = list2;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = z11;
        this.q = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf4)) {
            return false;
        }
        pf4 pf4Var = (pf4) obj;
        return this.f26882a == pf4Var.f26882a && this.b == pf4Var.b && this.c == pf4Var.c && this.d == pf4Var.d && this.e == pf4Var.e && this.f == pf4Var.f && this.g == pf4Var.g && Intrinsics.d(this.h, pf4Var.h) && Intrinsics.d(this.i, pf4Var.i) && this.j == pf4Var.j && this.k == pf4Var.k && this.l == pf4Var.l && this.m.equals(pf4Var.m) && this.n.equals(pf4Var.n) && Intrinsics.d(this.o, pf4Var.o) && this.p == pf4Var.p && this.q == pf4Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + brm0.e(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f26882a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginSimpleSettings(isNewApi=", ", isLoginByPhoneAvailable=", ", isLoginByEmailAndIdAvailable=", this.f26882a, this.b);
        ua80.u(", isLoginByLoginAvailable=", ", isActivatePhoneNecessarily=", sbQ, this.c, this.d);
        ua80.u(", isConsultantAvailable=", ", isAllowAppWithoutAuth=", sbQ, this.e, this.f);
        vqd.y(sbQ, ", restorePasswordAllowedCountries=", this.h, ", restorePasswordForbiddenCountries=", this.g);
        rz4.z(sbQ, ", redirectToVerificationAfterLogin=", this.i, ", redirectToPaymentAfterLogin=", this.j);
        ua80.u(", hasAuthenticator=", ", socialAppKey=", sbQ, this.k, this.l);
        f140.v(sbQ, this.m, ", xSocialAppKey=", this.n, ", appName=");
        brm0.C(this.o, ", hasAllowedAppWithoutAuth=", ", isFromStartScreen=", sbQ, this.p);
        return rw2.p(sbQ, this.q, Separators.RPAREN);
    }
}
