package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lyo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6n f20873a;
    public final a4x b;
    public final dxh0 c;
    public final j3p0 d;

    public lyo0(q6n q6nVar, a4x a4xVar, dxh0 dxh0Var, j3p0 j3p0Var) {
        q6nVar.getClass();
        a4xVar.getClass();
        j3p0Var.getClass();
        this.f20873a = q6nVar;
        this.b = a4xVar;
        this.c = dxh0Var;
        this.d = j3p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyo0)) {
            return false;
        }
        lyo0 lyo0Var = (lyo0) obj;
        return Intrinsics.d(this.f20873a, lyo0Var.f20873a) && Intrinsics.d(this.b, lyo0Var.b) && this.c.equals(lyo0Var.c) && this.d == lyo0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + hne.h(this.c, cs0.b(this.b, this.f20873a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TeamBetContainerUiState(headerModel=" + this.f20873a + ", tabs=" + this.b + ", segmentedControlStyle=" + this.c + ", selectedTab=" + this.d + Separators.RPAREN;
    }
}
