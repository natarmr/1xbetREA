package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f12243a;
    public final boolean b;

    public h0m0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f12243a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0m0)) {
            return false;
        }
        h0m0 h0m0Var = (h0m0) obj;
        return Intrinsics.d(this.f12243a, h0m0Var.f12243a) && this.b == h0m0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12243a.hashCode() * 31);
    }

    public final String toString() {
        return "StageNetBottomUiState(items=" + this.f12243a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
