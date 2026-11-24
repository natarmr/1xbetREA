package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cpm0 implements fpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4755a;
    public final boolean b;
    public final ank0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public cpm0(String str, boolean z, ank0 ank0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f4755a = str;
        this.b = z;
        this.c = ank0Var;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpm0)) {
            return false;
        }
        cpm0 cpm0Var = (cpm0) obj;
        return Intrinsics.d(this.f4755a, cpm0Var.f4755a) && this.b == cpm0Var.b && this.c.equals(cpm0Var.c) && this.d == cpm0Var.d && this.e == cpm0Var.e && this.f == cpm0Var.f && this.g == cpm0Var.g && this.h == cpm0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(this.f4755a.hashCode() * 31, 31, this.b), 31, this.c.f1159a), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("Value(currentValueText=", this.f4755a, ", isUserInput=", this.b, ", limitsText=");
        sbU.append(this.c);
        sbU.append(", isStepControlsVisible=");
        sbU.append(this.d);
        sbU.append(", isStepUpEnabled=");
        ua80.u(", isStepDownEnabled=", ", isActionButtonEnabled=", sbU, this.e, this.f);
        return ohs0.p(", showError=", Separators.RPAREN, sbU, this.g, this.h);
    }
}
