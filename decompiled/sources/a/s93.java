package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cnew f31833a;
    public final da10 b;
    public final long c;

    public s93(Cnew cnew, da10 da10Var, long j) {
        this.f31833a = cnew;
        this.b = da10Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s93)) {
            return false;
        }
        s93 s93Var = (s93) obj;
        return Intrinsics.d(this.f31833a, s93Var.f31833a) && this.b == s93Var.b && this.c == s93Var.c;
    }

    public final int hashCode() {
        Cnew cnew = this.f31833a;
        int iHashCode = cnew == null ? 0 : cnew.hashCode();
        return Long.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnotherAwardsStateModel(scenarioModel=");
        sb.append(this.f31833a);
        sb.append(", lottieButtonState=");
        sb.append(this.b);
        sb.append(", selectedCategoryId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
