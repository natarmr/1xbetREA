package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tli0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34147a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final i4 f;
    public final int g;
    public final imm h;
    public final mdm i;
    public final mtl j;

    public tli0(boolean z, boolean z2, boolean z3, boolean z4, String str, i4 i4Var, int i, imm immVar, mdm mdmVar, mtl mtlVar) {
        str.getClass();
        i4Var.getClass();
        this.f34147a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = i4Var;
        this.g = i;
        this.h = immVar;
        this.i = mdmVar;
        this.j = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tli0)) {
            return false;
        }
        tli0 tli0Var = (tli0) obj;
        return this.f34147a == tli0Var.f34147a && this.b == tli0Var.b && this.c == tli0Var.c && this.d == tli0Var.d && Intrinsics.d(this.e, tli0Var.e) && Intrinsics.d(this.f, tli0Var.f) && this.g == tli0Var.g && this.h.equals(tli0Var.h) && this.i.equals(tli0Var.i) && Intrinsics.d(this.j, tli0Var.j);
    }

    public final int hashCode() {
        int iD = f140.d(this.i, h97.a(this.h, twn.a(this.g, f140.c(this.f, ua80.b(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f34147a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31);
        mtl mtlVar = this.j;
        return iD + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SessionTimeLimitsRsUiState(isLoading=", ", isApplyingLimit=", ", hasErrorWhileLoadingLimits=", this.f34147a, this.b);
        ua80.u(", isEmpty=", ", description=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", limitValues=");
        sbQ.append(this.f);
        sbQ.append(", selectedValueIndex=");
        sbQ.append(this.g);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.h);
        sbQ.append(", dsEmptyConfig=");
        sbQ.append(this.i);
        sbQ.append(", bottomUiModel=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
