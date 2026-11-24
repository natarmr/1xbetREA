package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tlc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34136a;
    public final boolean b;

    public tlc0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f34136a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlc0)) {
            return false;
        }
        tlc0 tlc0Var = (tlc0) obj;
        return Intrinsics.d(this.f34136a, tlc0Var.f34136a) && this.b == tlc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f34136a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoInfoUiState(promoInfoList=" + this.f34136a + ", isVisible=" + this.b + Separators.RPAREN;
    }
}
