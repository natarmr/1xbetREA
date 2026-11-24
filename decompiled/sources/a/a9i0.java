package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a9i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f479a;
    public final i4 b;
    public final boolean c;
    public final imm d;
    public final mdm e;
    public final mtl f;

    public a9i0(boolean z, i4 i4Var, boolean z2, imm immVar, mdm mdmVar, mtl mtlVar) {
        i4Var.getClass();
        this.f479a = z;
        this.b = i4Var;
        this.c = z2;
        this.d = immVar;
        this.e = mdmVar;
        this.f = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9i0)) {
            return false;
        }
        a9i0 a9i0Var = (a9i0) obj;
        return this.f479a == a9i0Var.f479a && Intrinsics.d(this.b, a9i0Var.b) && this.c == a9i0Var.c && this.d.equals(a9i0Var.d) && this.e.equals(a9i0Var.e) && Intrinsics.d(this.f, a9i0Var.f);
    }

    public final int hashCode() {
        int iD = f140.d(this.e, h97.a(this.d, brm0.e(f140.c(this.b, Boolean.hashCode(this.f479a) * 31, 31), 31, this.c), 31), 31);
        mtl mtlVar = this.f;
        return iD + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "SelfExclusionRsUiState(isEmpty=" + this.f479a + ", limitValues=" + this.b + ", isLoading=" + this.c + ", dsNavigationBarUiModel=" + this.d + ", dsEmptyConfig=" + this.e + ", bottomUiModel=" + this.f + Separators.RPAREN;
    }
}
