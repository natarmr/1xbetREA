package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vk60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xkb0 f37559a;
    public final ak60 b;

    public vk60(xkb0 xkb0Var, ak60 ak60Var) {
        this.f37559a = xkb0Var;
        this.b = ak60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk60)) {
            return false;
        }
        vk60 vk60Var = (vk60) obj;
        return Intrinsics.d(this.f37559a, vk60Var.f37559a) && Intrinsics.d(this.b, vk60Var.b);
    }

    public final int hashCode() {
        xkb0 xkb0Var = this.f37559a;
        int iHashCode = (xkb0Var == null ? 0 : xkb0Var.hashCode()) * 31;
        ak60 ak60Var = this.b;
        return iHashCode + (ak60Var != null ? ak60Var.hashCode() : 0);
    }

    public final String toString() {
        return "OnboardingUiState(onboardingStepInfo=" + this.f37559a + ", onboardingSceneUiModel=" + this.b + Separators.RPAREN;
    }
}
