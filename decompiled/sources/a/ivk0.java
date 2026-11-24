package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ivk0 implements lvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f15449a;
    public final l7m0 b;
    public final cpm c;
    public final t3r0 d;
    public final i9h0 e;
    public final boolean f;

    public ivk0(i4 i4Var, l7m0 l7m0Var, cpm cpmVar, t3r0 t3r0Var, i9h0 i9h0Var, boolean z) {
        i4Var.getClass();
        l7m0Var.getClass();
        i9h0Var.getClass();
        this.f15449a = i4Var;
        this.b = l7m0Var;
        this.c = cpmVar;
        this.d = t3r0Var;
        this.e = i9h0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivk0)) {
            return false;
        }
        ivk0 ivk0Var = (ivk0) obj;
        return Intrinsics.d(this.f15449a, ivk0Var.f15449a) && Intrinsics.d(this.b, ivk0Var.b) && Intrinsics.d(this.c, ivk0Var.c) && Intrinsics.d(this.d, ivk0Var.d) && this.e == ivk0Var.e && this.f == ivk0Var.f;
    }

    public final int hashCode() {
        int iC = h97.c(this.b, this.f15449a.hashCode() * 31, 31);
        cpm cpmVar = this.c;
        int iHashCode = (iC + (cpmVar == null ? 0 : cpmVar.hashCode())) * 31;
        t3r0 t3r0Var = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode + (t3r0Var != null ? t3r0Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(list=" + this.f15449a + ", scrollToTop=" + this.b + ", calendarUiModel=" + this.c + ", sportFilterUiState=" + this.d + ", screenStyle=" + this.e + ", rtlSupport=" + this.f + Separators.RPAREN;
    }
}
