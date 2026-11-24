package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class chl0 implements ehl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4366a;
    public final String b;
    public final k0d c;
    public final a65 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final xgl0 i;

    public chl0(String str, String str2, k0d k0dVar, a65 a65Var, boolean z, boolean z2, boolean z3, boolean z4, xgl0 xgl0Var) {
        str.getClass();
        str2.getClass();
        this.f4366a = str;
        this.b = str2;
        this.c = k0dVar;
        this.d = a65Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = xgl0Var;
    }

    public static chl0 a(chl0 chl0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = chl0Var.f4366a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = chl0Var.b;
        }
        String str4 = str2;
        k0d k0dVar = chl0Var.c;
        a65 a65Var = chl0Var.d;
        boolean z = chl0Var.e;
        boolean z2 = chl0Var.f;
        boolean z3 = chl0Var.g;
        boolean z4 = chl0Var.h;
        xgl0 xgl0Var = chl0Var.i;
        chl0Var.getClass();
        str3.getClass();
        str4.getClass();
        return new chl0(str3, str4, k0dVar, a65Var, z, z2, z3, z4, xgl0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chl0)) {
            return false;
        }
        chl0 chl0Var = (chl0) obj;
        return Intrinsics.d(this.f4366a, chl0Var.f4366a) && Intrinsics.d(this.b, chl0Var.b) && this.c == chl0Var.c && this.d == chl0Var.d && this.e == chl0Var.e && this.f == chl0Var.f && this.g == chl0Var.g && this.h == chl0Var.h && this.i.equals(chl0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f4366a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(marketLabel=", this.f4366a, ", coefficientLabel=", this.b, ", coefficientState=");
        sbN.append(this.c);
        sbN.append(", availabilityState=");
        sbN.append(this.d);
        sbN.append(", isInCoupon=");
        ua80.u(", isTracked=", ", isPopular=", sbN, this.e, this.f);
        ua80.u(", isHighlight=", ", coefParams=", sbN, this.g, this.h);
        sbN.append(this.i);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
