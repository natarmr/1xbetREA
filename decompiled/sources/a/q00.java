package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27870a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public q00(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        cs0.x(str, str2, str3, str4);
        this.f27870a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    public static q00 a(q00 q00Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = q00Var.f27870a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = q00Var.b;
        }
        String str = q00Var.c;
        String str2 = q00Var.d;
        String str3 = q00Var.e;
        String str4 = q00Var.f;
        int i2 = q00Var.g;
        int i3 = q00Var.h;
        int i4 = q00Var.i;
        int i5 = q00Var.j;
        q00Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new q00(z3, z2, str, str2, str3, str4, i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return this.f27870a == q00Var.f27870a && this.b == q00Var.b && Intrinsics.d(this.c, q00Var.c) && Intrinsics.d(this.d, q00Var.d) && Intrinsics.d(this.e, q00Var.e) && Intrinsics.d(this.f, q00Var.f) && this.g == q00Var.g && this.h == q00Var.h && this.i == q00Var.i && this.j == q00Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, twn.a(this.h, twn.a(this.g, ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f27870a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AdditionalTopPresetDsModel(startIsPositive=", ", endIsPositive=", ", startPositiveText=", this.f27870a, this.b);
        f140.v(sbQ, this.c, ", startNegativeText=", this.d, ", endPositiveText=");
        f140.v(sbQ, this.e, ", endNegativeText=", this.f, ", startPositiveIcon=");
        axq.r(this.g, this.h, ", startNegativeIcon=", ", endPositiveIcon=", sbQ);
        return w6x.o(this.i, this.j, ", endNegativeIcon=", Separators.RPAREN, sbQ);
    }
}
