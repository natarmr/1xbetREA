package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p8o implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f26566a;

    public p8o(i4 i4Var) {
        i4Var.getClass();
        this.f26566a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8o) && Intrinsics.d(this.f26566a, ((p8o) obj).f26566a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "PROMO";
    }

    public final int hashCode() {
        return this.f26566a.hashCode() - 1926476559;
    }

    public final String toString() {
        return h97.i(this.f26566a, "EsportsWorldCupPromoUiModel(key=PROMO, items=", Separators.RPAREN);
    }
}
