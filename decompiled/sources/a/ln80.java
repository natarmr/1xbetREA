package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ln80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uaq0 f20333a;
    public final taq0 b;
    public final v9c c;
    public final boolean d;

    public ln80(uaq0 uaq0Var, taq0 taq0Var, v9c v9cVar, boolean z) {
        taq0Var.getClass();
        this.f20333a = uaq0Var;
        this.b = taq0Var;
        this.c = v9cVar;
        this.d = z;
    }

    public static ln80 a(ln80 ln80Var, uaq0 uaq0Var, taq0 taq0Var, v9c v9cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            uaq0Var = ln80Var.f20333a;
        }
        if ((i & 2) != 0) {
            taq0Var = ln80Var.b;
        }
        if ((i & 4) != 0) {
            v9cVar = ln80Var.c;
        }
        if ((i & 8) != 0) {
            z = ln80Var.d;
        }
        taq0Var.getClass();
        return new ln80(uaq0Var, taq0Var, v9cVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln80)) {
            return false;
        }
        ln80 ln80Var = (ln80) obj;
        return this.f20333a == ln80Var.f20333a && Intrinsics.d(this.b, ln80Var.b) && this.c.equals(ln80Var.c) && this.d == ln80Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f20333a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaletteUiState(theme=" + this.f20333a + ", composeTheme=" + this.b + ", chessboardUiState=" + this.c + ", compose=" + this.d + Separators.RPAREN;
    }
}
