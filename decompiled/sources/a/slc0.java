package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class slc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f32393a;
    public final boolean b;

    public slc0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f32393a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slc0)) {
            return false;
        }
        slc0 slc0Var = (slc0) obj;
        return Intrinsics.d(this.f32393a, slc0Var.f32393a) && this.b == slc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32393a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoInfoUiState(promoInfoList=" + this.f32393a + ", isVisible=" + this.b + Separators.RPAREN;
    }
}
