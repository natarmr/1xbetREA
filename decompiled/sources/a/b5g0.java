package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2002a;
    public final boolean b;

    public b5g0(i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f2002a = i4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5g0)) {
            return false;
        }
        b5g0 b5g0Var = (b5g0) obj;
        return Intrinsics.d(this.f2002a, b5g0Var.f2002a) && this.b == b5g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f2002a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultUiState(items=" + this.f2002a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
