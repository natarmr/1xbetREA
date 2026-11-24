package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11277a;
    public final int b;
    public final String c;
    public final jg10 d;
    public final boolean e;
    public final i1w0 f;
    public final boolean g;

    public gh10(String str, int i, String str2, jg10 jg10Var, boolean z, i1w0 i1w0Var, boolean z2) {
        str.getClass();
        i1w0Var.getClass();
        this.f11277a = str;
        this.b = i;
        this.c = str2;
        this.d = jg10Var;
        this.e = z;
        this.f = i1w0Var;
        this.g = z2;
    }

    public static gh10 a(gh10 gh10Var, jg10 jg10Var, boolean z, int i) {
        String str = gh10Var.f11277a;
        gh10Var.getClass();
        int i2 = gh10Var.b;
        String str2 = gh10Var.c;
        if ((i & 16) != 0) {
            jg10Var = gh10Var.d;
        }
        jg10 jg10Var2 = jg10Var;
        boolean z2 = gh10Var.e;
        i1w0 i1w0Var = gh10Var.f;
        if ((i & 128) != 0) {
            z = gh10Var.g;
        }
        gh10Var.getClass();
        str.getClass();
        i1w0Var.getClass();
        return new gh10(str, i2, str2, jg10Var2, z2, i1w0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh10)) {
            return false;
        }
        gh10 gh10Var = (gh10) obj;
        return Intrinsics.d(this.f11277a, gh10Var.f11277a) && this.b == gh10Var.b && this.c.equals(gh10Var.c) && this.d.equals(gh10Var.d) && this.e == gh10Var.e && Intrinsics.d(this.f, gh10Var.f) && this.g == gh10Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + brm0.e((this.d.hashCode() + ua80.b(twn.a(this.b, twn.a(1, this.f11277a.hashCode() * 31, 31), 31), 31, this.c)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "LoyaltyProgramBasicState(title=", this.f11277a, ", refId=1, lottieAnimationType=", ", language=");
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
