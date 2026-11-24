package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f33630a;
    public final jas0 b;

    public tas0(imm immVar, jas0 jas0Var) {
        immVar.getClass();
        jas0Var.getClass();
        this.f33630a = immVar;
        this.b = jas0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tas0)) {
            return false;
        }
        tas0 tas0Var = (tas0) obj;
        return Intrinsics.d(this.f33630a, tas0Var.f33630a) && Intrinsics.d(this.b, tas0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33630a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentsProvidersUiState(navigationBarUiModel=" + this.f33630a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
