package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ow8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25957a;
    public final rv8 b;

    public ow8(imm immVar, rv8 rv8Var) {
        immVar.getClass();
        this.f25957a = immVar;
        this.b = rv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow8)) {
            return false;
        }
        ow8 ow8Var = (ow8) obj;
        return Intrinsics.d(this.f25957a, ow8Var.f25957a) && this.b.equals(ow8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25957a.hashCode() * 31);
    }

    public final String toString() {
        return "BrandGamesFiltersUiState(dsNavigationBarUiModel=" + this.f25957a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
