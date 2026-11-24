package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sk60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xkb0 f32332a;

    public sk60(xkb0 xkb0Var) {
        this.f32332a = xkb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk60) && Intrinsics.d(this.f32332a, ((sk60) obj).f32332a);
    }

    public final int hashCode() {
        xkb0 xkb0Var = this.f32332a;
        if (xkb0Var == null) {
            return 0;
        }
        return xkb0Var.hashCode();
    }

    public final String toString() {
        return "OnboardingState(onboardingStepInfo=" + this.f32332a + Separators.RPAREN;
    }
}
