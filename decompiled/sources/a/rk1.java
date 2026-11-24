package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f30624a;
    public final jk1 b;

    public rk1(imm immVar, jk1 jk1Var) {
        immVar.getClass();
        this.f30624a = immVar;
        this.b = jk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1)) {
            return false;
        }
        rk1 rk1Var = (rk1) obj;
        return Intrinsics.d(this.f30624a, rk1Var.f30624a) && this.b.equals(rk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30624a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorPublishersUiState(navigationBarUiModel=" + this.f30624a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
