package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ldc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19845a;
    public final se b;

    public ldc0(boolean z, se seVar) {
        this.f19845a = z;
        this.b = seVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldc0)) {
            return false;
        }
        ldc0 ldc0Var = (ldc0) obj;
        return this.f19845a == ldc0Var.f19845a && Intrinsics.d(this.b, ldc0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19845a) * 31;
        se seVar = this.b;
        return iHashCode + (seVar == null ? 0 : seVar.hashCode());
    }

    public final String toString() {
        return "PromoCodeListAccountInfoUiModel(isVisible=" + this.f19845a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
