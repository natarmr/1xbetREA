package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class apm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1260a;
    public final ank0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final pz4 g;
    public final boolean h;
    public final boolean i;

    public apm0(String str, ank0 ank0Var, boolean z, boolean z2, boolean z3, boolean z4, pz4 pz4Var, boolean z5, boolean z6) {
        str.getClass();
        this.f1260a = str;
        this.b = ank0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = pz4Var;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apm0)) {
            return false;
        }
        apm0 apm0Var = (apm0) obj;
        return Intrinsics.d(this.f1260a, apm0Var.f1260a) && this.b.equals(apm0Var.b) && this.c == apm0Var.c && this.d == apm0Var.d && this.e == apm0Var.e && this.f == apm0Var.f && this.g.equals(apm0Var.g) && this.h == apm0Var.h && this.i == apm0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e((this.g.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(this.f1260a.hashCode() * 31, 31, this.b.f1159a), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepInputScreenStateModel(value=");
        sb.append(this.f1260a);
        sb.append(", limitsText=");
        sb.append(this.b);
        sb.append(", isStepUpDownActionsVisible=");
        ua80.u(", isStepUpEnabled=", ", isStepDownEnabled=", sb, this.c, this.d);
        ua80.u(", isStepActionButtonEnabled=", ", autoMaxModel=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", hasError=");
        sb.append(this.h);
        sb.append(", isLoading=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
