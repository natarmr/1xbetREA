package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a29 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f114a;
    public final b19 b;
    public final c19 c;
    public final g19 d;

    public a29(imm immVar, b19 b19Var, c19 c19Var, g19 g19Var) {
        immVar.getClass();
        b19Var.getClass();
        g19Var.getClass();
        this.f114a = immVar;
        this.b = b19Var;
        this.c = c19Var;
        this.d = g19Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a29)) {
            return false;
        }
        a29 a29Var = (a29) obj;
        return Intrinsics.d(this.f114a, a29Var.f114a) && Intrinsics.d(this.b, a29Var.b) && Intrinsics.d(this.c, a29Var.c) && Intrinsics.d(this.d, a29Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f114a.hashCode() * 31)) * 31;
        c19 c19Var = this.c;
        return this.d.hashCode() + ((iHashCode + (c19Var == null ? 0 : c19Var.hashCode())) * 31);
    }

    public final String toString() {
        return "BrandsListUiState(navigationBarUiModel=" + this.f114a + ", authSectionUiState=" + this.b + ", bannersUiState=" + this.c + ", contentUiState=" + this.d + Separators.RPAREN;
    }
}
