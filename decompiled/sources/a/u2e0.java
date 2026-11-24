package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34941a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;

    public u2e0(int i, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5) {
        cs0.x(str2, str3, str4, str5);
        this.f34941a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e0)) {
            return false;
        }
        u2e0 u2e0Var = (u2e0) obj;
        return this.f34941a == u2e0Var.f34941a && this.b.equals(u2e0Var.b) && Intrinsics.d(this.c, u2e0Var.c) && this.d == u2e0Var.d && this.e == u2e0Var.e && this.f == u2e0Var.f && Intrinsics.d(this.g, u2e0Var.g) && Intrinsics.d(this.h, u2e0Var.h) && Intrinsics.d(this.i, u2e0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f34941a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f34941a, "RateAppUiState(rating=", ", emoji=", this.b, ", title=");
        brm0.C(this.c, ", isDialogVisible=", ", isDescriptionVisible=", sbR, this.d);
        ua80.u(", isRateAppButtonEnabled=", ", description=", sbR, this.e, this.f);
        f140.v(sbR, this.g, ", rateAppBtnText=", this.h, ", cancelBtnText=");
        return axq.n(sbR, this.i, Separators.RPAREN);
    }
}
