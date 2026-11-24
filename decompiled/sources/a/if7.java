package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class if7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14673a;
    public final String b;
    public final x6q0 c;
    public final String d;
    public final imm e;
    public final x6q0 f;
    public final mtl g;
    public final boolean h;
    public final mdm i;

    public if7(boolean z, String str, x6q0 x6q0Var, String str2, imm immVar, x6q0 x6q0Var2, mtl mtlVar, boolean z2, mdm mdmVar) {
        str.getClass();
        str2.getClass();
        this.f14673a = z;
        this.b = str;
        this.c = x6q0Var;
        this.d = str2;
        this.e = immVar;
        this.f = x6q0Var2;
        this.g = mtlVar;
        this.h = z2;
        this.i = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if7)) {
            return false;
        }
        if7 if7Var = (if7) obj;
        return this.f14673a == if7Var.f14673a && Intrinsics.d(this.b, if7Var.b) && Intrinsics.d(this.c, if7Var.c) && Intrinsics.d(this.d, if7Var.d) && this.e.equals(if7Var.e) && Intrinsics.d(this.f, if7Var.f) && this.g.equals(if7Var.g) && this.h == if7Var.h && this.i.equals(if7Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b(Boolean.hashCode(this.f14673a) * 31, 31, this.b);
        x6q0 x6q0Var = this.c;
        int iA = h97.a(this.e, ua80.b((iB + (x6q0Var == null ? 0 : x6q0Var.hashCode())) * 31, 31, this.d), 31);
        x6q0 x6q0Var2 = this.f;
        return this.i.hashCode() + brm0.e(cs0.b(this.g.f22376a, (iA + (x6q0Var2 != null ? x6q0Var2.hashCode() : 0)) * 31, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("BetLimitIeUiState(isLoading=", ", betLimitLabel=", this.b, this.f14673a, ", betLimitValueUiModel=");
        sbQ.append(this.c);
        sbQ.append(", betLimitPeriodLabel=");
        sbQ.append(this.d);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.e);
        sbQ.append(", betLimitPeriodValueUiModel=");
        sbQ.append(this.f);
        sbQ.append(", bottomUiModel=");
        sbQ.append(this.g);
        sbQ.append(", hasErrorWhileLoadingLimits=");
        sbQ.append(this.h);
        sbQ.append(", dsEmptyConfig=");
        return cs0.m(sbQ, this.i, Separators.RPAREN);
    }
}
