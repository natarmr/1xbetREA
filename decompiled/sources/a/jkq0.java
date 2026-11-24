package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jkq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16683a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final int f;
    public final String g;
    public final imm h;
    public final mdm i;
    public final itl j;

    public jkq0(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, String str, imm immVar, mdm mdmVar, itl itlVar) {
        list.getClass();
        str.getClass();
        this.f16683a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = i;
        this.g = str;
        this.h = immVar;
        this.i = mdmVar;
        this.j = itlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkq0)) {
            return false;
        }
        jkq0 jkq0Var = (jkq0) obj;
        return this.f16683a == jkq0Var.f16683a && this.b == jkq0Var.b && this.c == jkq0Var.c && this.d == jkq0Var.d && Intrinsics.d(this.e, jkq0Var.e) && this.f == jkq0Var.f && Intrinsics.d(this.g, jkq0Var.g) && this.h.equals(jkq0Var.h) && this.i.equals(jkq0Var.i) && Intrinsics.d(this.j, jkq0Var.j);
    }

    public final int hashCode() {
        int iD = f140.d(this.i, h97.a(this.h, ua80.b(twn.a(this.f, dw9.a(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f16683a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31), 31);
        itl itlVar = this.j;
        return iD + (itlVar == null ? 0 : itlVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TimeLimitsIeUiState(isLoading=", ", isApplyingLimit=", ", hasErrorWhileLoadingLimits=", this.f16683a, this.b);
        ua80.u(", isEmpty=", ", limitValues=", sbQ, this.c, this.d);
        brm0.v(this.f, ", selectedValueIndex=", ", description=", sbQ, this.e);
        sbQ.append(this.g);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.h);
        sbQ.append(", dsEmptyConfig=");
        sbQ.append(this.i);
        sbQ.append(", applyButtonModel=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
