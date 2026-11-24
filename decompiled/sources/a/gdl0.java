package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gdl0 implements kdl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11109a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public gdl0(boolean z, boolean z2, boolean z3, boolean z4, lc00 lc00Var) {
        lc00Var.getClass();
        this.f11109a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lc00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdl0)) {
            return false;
        }
        gdl0 gdl0Var = (gdl0) obj;
        return this.f11109a == gdl0Var.f11109a && this.b == gdl0Var.b && this.c == gdl0Var.c && this.d == gdl0Var.d && Intrinsics.d(this.e, gdl0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f11109a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Data(hasDiscardBtnEnable=", ", hasApplyBtnEnable=", ", hasMenuDiscardBtnEnabled=", this.f11109a, this.b);
        ua80.u(", hasSearchFieldExpanded=", ", items=", sbQ, this.c, this.d);
        return dw9.r(sbQ, this.e, Separators.RPAREN);
    }
}
