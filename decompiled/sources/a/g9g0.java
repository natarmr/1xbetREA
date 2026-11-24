package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g9g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad50 f10913a;
    public final jje b;

    public g9g0(ad50 ad50Var, jje jjeVar) {
        ad50Var.getClass();
        this.f10913a = ad50Var;
        this.b = jjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9g0)) {
            return false;
        }
        g9g0 g9g0Var = (g9g0) obj;
        return Intrinsics.d(this.f10913a, g9g0Var.f10913a) && this.b.equals(g9g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10913a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultsUiState(navigationBarUiModel=" + this.f10913a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
