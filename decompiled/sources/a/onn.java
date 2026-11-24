package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class onn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25555a;
    public final gmn b;
    public final jln c;
    public final boolean d;

    public onn(imm immVar, gmn gmnVar, jln jlnVar, boolean z) {
        immVar.getClass();
        gmnVar.getClass();
        this.f25555a = immVar;
        this.b = gmnVar;
        this.c = jlnVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onn)) {
            return false;
        }
        onn onnVar = (onn) obj;
        return Intrinsics.d(this.f25555a, onnVar.f25555a) && Intrinsics.d(this.b, onnVar.b) && Intrinsics.d(this.c, onnVar.c) && this.d == onnVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f25555a.hashCode() * 31)) * 31;
        jln jlnVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (jlnVar == null ? 0 : jlnVar.hashCode())) * 31);
    }

    public final String toString() {
        return "EditCouponUiState(navigationBarUiModel=" + this.f25555a + ", editCouponEventsUiState=" + this.b + ", editCouponBottomSheetUiState=" + this.c + ", showLoader=" + this.d + Separators.RPAREN;
    }
}
