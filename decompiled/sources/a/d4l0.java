package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d4l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5461a;
    public final String b;
    public final k0d c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final xgl0 g;

    public d4l0(String str, String str2, k0d k0dVar, boolean z, boolean z2, boolean z3, xgl0 xgl0Var) {
        a65 a65Var = a65.f301a;
        str.getClass();
        str2.getClass();
        this.f5461a = str;
        this.b = str2;
        this.c = k0dVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4l0)) {
            return false;
        }
        d4l0 d4l0Var = (d4l0) obj;
        if (!Intrinsics.d(this.f5461a, d4l0Var.f5461a) || !Intrinsics.d(this.b, d4l0Var.b) || this.c != d4l0Var.c) {
            return false;
        }
        a65 a65Var = a65.f301a;
        return this.d == d4l0Var.d && this.e == d4l0Var.e && this.f == d4l0Var.f && this.g.equals(d4l0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e((a65.f301a.hashCode() + ((this.c.hashCode() + ua80.b(this.f5461a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, false);
    }

    public final String toString() {
        a65 a65Var = a65.f301a;
        StringBuilder sbN = b1j.n("Default(marketLabel=", this.f5461a, ", coefficientLabel=", this.b, ", coefficientState=");
        sbN.append(this.c);
        sbN.append(", availabilityState=");
        sbN.append(a65Var);
        sbN.append(", isInCoupon=");
        ua80.u(", isTracked=", ", isPopular=", sbN, this.d, this.e);
        sbN.append(this.f);
        sbN.append(", isHighlight=false, coefParams=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
