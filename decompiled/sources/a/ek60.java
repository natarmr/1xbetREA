package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ek60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7939a;
    public final boolean b;
    public final a4x c;

    public ek60(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f7939a = z;
        this.b = z2;
        this.c = a4xVar;
    }

    public static ek60 a(ek60 ek60Var, boolean z, a4x a4xVar, int i) {
        boolean z2 = ek60Var.f7939a;
        if ((i & 2) != 0) {
            z = ek60Var.b;
        }
        ek60Var.getClass();
        if ((i & 8) != 0) {
            a4xVar = ek60Var.c;
        }
        ek60Var.getClass();
        a4xVar.getClass();
        return new ek60(a4xVar, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek60)) {
            return false;
        }
        ek60 ek60Var = (ek60) obj;
        return this.f7939a == ek60Var.f7939a && this.b == ek60Var.b && Intrinsics.d(this.c, ek60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f7939a) * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        return cs0.n(f140.q("OnboardingScreenUiState(hideContent=", ", nextButtonEnabled=", ", showProgress=false, onboardingInfoList=", this.f7939a, this.b), this.c, Separators.RPAREN);
    }
}
