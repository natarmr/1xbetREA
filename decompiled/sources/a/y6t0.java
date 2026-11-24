package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f42117a;
    public final a4x b;

    public y6t0(a4x a4xVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f42117a = a4xVar;
        this.b = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6t0)) {
            return false;
        }
        y6t0 y6t0Var = (y6t0) obj;
        return Intrinsics.d(this.f42117a, y6t0Var.f42117a) && Intrinsics.d(this.b, y6t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42117a.hashCode() * 31);
    }

    public final String toString() {
        return "UiState(chipTypeUiModelList=" + this.f42117a + ", chipPeriodUiModelList=" + this.b + Separators.RPAREN;
    }
}
