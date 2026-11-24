package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16604a;
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

    public jj4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, List list2, boolean z8, boolean z9, boolean z10, String str, String str2, String str3, boolean z11) {
        list.getClass();
        list2.getClass();
        str3.getClass();
        this.f16604a = z;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj4)) {
            return false;
        }
        jj4 jj4Var = (jj4) obj;
        return this.f16604a == jj4Var.f16604a && this.b == jj4Var.b && this.c == jj4Var.c && this.d == jj4Var.d && this.e == jj4Var.e && this.f == jj4Var.f && this.g == jj4Var.g && Intrinsics.d(this.h, jj4Var.h) && Intrinsics.d(this.i, jj4Var.i) && this.j == jj4Var.j && this.k == jj4Var.k && this.l == jj4Var.l && this.m.equals(jj4Var.m) && this.n.equals(jj4Var.n) && Intrinsics.d(this.o, jj4Var.o) && this.p == jj4Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f16604a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginVisualSettings(isNewApi=", ", isLoginByPhoneAvailable=", ", isLoginByEmailAndIdAvailable=", this.f16604a, this.b);
        ua80.u(", isLoginByLoginAvailable=", ", isActivatePhoneNecessarily=", sbQ, this.c, this.d);
        ua80.u(", isConsultantAvailable=", ", isAllowAppWithoutAuth=", sbQ, this.e, this.f);
        vqd.y(sbQ, ", restorePasswordAllowedCountries=", this.h, ", restorePasswordForbiddenCountries=", this.g);
        rz4.z(sbQ, ", redirectToVerificationAfterLogin=", this.i, ", redirectToPaymentAfterLogin=", this.j);
        ua80.u(", hasAuthenticator=", ", socialAppKey=", sbQ, this.k, this.l);
        f140.v(sbQ, this.m, ", xSocialAppKey=", this.n, ", appName=");
        return defpackage.c.c(this.o, ", hasAllowedAppWithoutAuth=", Separators.RPAREN, sbQ, this.p);
    }
}
