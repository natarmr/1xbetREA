package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cmr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4621a;
    public final a4x b;

    public cmr0(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f4621a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmr0)) {
            return false;
        }
        cmr0 cmr0Var = (cmr0) obj;
        return Intrinsics.d(this.f4621a, cmr0Var.f4621a) && Intrinsics.d(this.b, cmr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4621a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("TotoBetTypeBottomSheetUiState(title=", this.f4621a, ", totoBetTypeCellUiStateList=", this.b, Separators.RPAREN);
    }
}
