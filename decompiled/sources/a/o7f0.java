package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24784a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public o7f0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        cs0.x(str, str2, str3, str4);
        this.f24784a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
    }

    public static o7f0 a(o7f0 o7f0Var, boolean z, boolean z2, int i) {
        String str = o7f0Var.f24784a;
        String str2 = o7f0Var.b;
        String str3 = o7f0Var.c;
        String str4 = o7f0Var.d;
        boolean z3 = o7f0Var.e;
        if ((i & 32) != 0) {
            z = o7f0Var.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            z2 = o7f0Var.g;
        }
        boolean z5 = o7f0Var.h;
        boolean z6 = o7f0Var.i;
        boolean z7 = o7f0Var.j;
        boolean z8 = o7f0Var.k;
        o7f0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new o7f0(str, str2, str3, str4, z3, z4, z2, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7f0)) {
            return false;
        }
        o7f0 o7f0Var = (o7f0) obj;
        return Intrinsics.d(this.f24784a, o7f0Var.f24784a) && Intrinsics.d(this.b, o7f0Var.b) && Intrinsics.d(this.c, o7f0Var.c) && Intrinsics.d(this.d, o7f0Var.d) && this.e == o7f0Var.e && this.f == o7f0Var.f && this.g == o7f0Var.g && this.h == o7f0Var.h && this.i == o7f0Var.i && this.j == o7f0Var.j && this.k == o7f0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(this.f24784a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RegistrationSuccessState(login=", this.f24784a, ", password=", this.b, ", phoneCode=");
        f140.v(sbN, this.c, ", phoneBody=", this.d, ", isNewApi=");
        ua80.u(", isLoading=", ", isContentVisible=", sbN, this.e, this.f);
        ua80.u(", isActivatePhoneNecessarily=", ", redirectToPaymentAfterLogin=", sbN, this.g, this.h);
        ua80.u(", hasBlockAuthVerification=", ", redirectToVerificationAfterLogin=", sbN, this.i, this.j);
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
