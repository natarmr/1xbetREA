package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l8k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19608a;
    public final String b;
    public final x6q0 c;
    public final imm d;
    public final mtl e;
    public final boolean f;
    public final mdm g;

    public l8k(boolean z, String str, x6q0 x6q0Var, imm immVar, mtl mtlVar, boolean z2, mdm mdmVar) {
        str.getClass();
        this.f19608a = z;
        this.b = str;
        this.c = x6q0Var;
        this.d = immVar;
        this.e = mtlVar;
        this.f = z2;
        this.g = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8k)) {
            return false;
        }
        l8k l8kVar = (l8k) obj;
        return this.f19608a == l8kVar.f19608a && Intrinsics.d(this.b, l8kVar.b) && Intrinsics.d(this.c, l8kVar.c) && this.d.equals(l8kVar.d) && this.e.equals(l8kVar.e) && this.f == l8kVar.f && this.g.equals(l8kVar.g);
    }

    public final int hashCode() {
        int iB = ua80.b(Boolean.hashCode(this.f19608a) * 31, 31, this.b);
        x6q0 x6q0Var = this.c;
        return this.g.hashCode() + brm0.e(cs0.b(this.e.f22376a, h97.a(this.d, (iB + (x6q0Var == null ? 0 : x6q0Var.hashCode())) * 31, 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("DepositLimitIeUiState(isLoading=", ", depositLimitLabel=", this.b, this.f19608a, ", depositLimitValueUiModel=");
        sbQ.append(this.c);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.d);
        sbQ.append(", bottomUiModel=");
        sbQ.append(this.e);
        sbQ.append(", hasErrorWhileLoadingLimits=");
        sbQ.append(this.f);
        sbQ.append(", dsEmptyConfig=");
        return cs0.m(sbQ, this.g, Separators.RPAREN);
    }
}
