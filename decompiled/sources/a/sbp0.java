package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f31946a;
    public final l7m0 b;
    public final l7m0 c;

    public sbp0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        this.f31946a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbp0)) {
            return false;
        }
        sbp0 sbp0Var = (sbp0) obj;
        return Intrinsics.d(this.f31946a, sbp0Var.f31946a) && Intrinsics.d(this.b, sbp0Var.b) && Intrinsics.d(this.c, sbp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h97.c(this.b, this.f31946a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TeamDetailsUiState(toolbarState=" + this.f31946a + ", segmentsState=" + this.b + ", screenState=" + this.c + Separators.RPAREN;
    }
}
