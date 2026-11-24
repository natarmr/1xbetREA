package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f4439a;
    public final li1 b;

    public cj1(imm immVar, li1 li1Var) {
        immVar.getClass();
        this.f4439a = immVar;
        this.b = li1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj1)) {
            return false;
        }
        cj1 cj1Var = (cj1) obj;
        return Intrinsics.d(this.f4439a, cj1Var.f4439a) && this.b.equals(cj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4439a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorProvidersUiState(navigationBarUiModel=" + this.f4439a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
