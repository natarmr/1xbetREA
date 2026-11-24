package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lf10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19931a;
    public final int b;
    public final String c;
    public final we10 d;
    public final boolean e;
    public final i1w0 f;
    public final boolean g;

    public lf10(String str, int i, String str2, we10 we10Var, boolean z, i1w0 i1w0Var, boolean z2) {
        str.getClass();
        i1w0Var.getClass();
        this.f19931a = str;
        this.b = i;
        this.c = str2;
        this.d = we10Var;
        this.e = z;
        this.f = i1w0Var;
        this.g = z2;
    }

    public static lf10 a(lf10 lf10Var, we10 we10Var, boolean z, int i) {
        String str = lf10Var.f19931a;
        lf10Var.getClass();
        int i2 = lf10Var.b;
        String str2 = lf10Var.c;
        if ((i & 16) != 0) {
            we10Var = lf10Var.d;
        }
        we10 we10Var2 = we10Var;
        boolean z2 = lf10Var.e;
        i1w0 i1w0Var = lf10Var.f;
        if ((i & 128) != 0) {
            z = lf10Var.g;
        }
        lf10Var.getClass();
        str.getClass();
        i1w0Var.getClass();
        return new lf10(str, i2, str2, we10Var2, z2, i1w0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf10)) {
            return false;
        }
        lf10 lf10Var = (lf10) obj;
        return Intrinsics.d(this.f19931a, lf10Var.f19931a) && this.b == lf10Var.b && this.c.equals(lf10Var.c) && this.d.equals(lf10Var.d) && this.e == lf10Var.e && Intrinsics.d(this.f, lf10Var.f) && this.g == lf10Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + brm0.e((this.d.hashCode() + ua80.b(twn.a(this.b, twn.a(1, this.f19931a.hashCode() * 31, 31), 31), 31, this.c)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "LoyaltyProgramAlternativeState(title=", this.f19931a, ", refId=1, lottieAnimationType=", ", language=");
        sbP.append(this.c);
        sbP.append(", dataState=");
        sbP.append(this.d);
        sbP.append(", fromAggregator=");
        sbP.append(this.e);
        sbP.append(", currentRouter=");
        sbP.append(this.f);
        sbP.append(", operationProgress=");
        return rw2.p(sbP, this.g, Separators.RPAREN);
    }
}
