package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ixo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15552a;
    public final String b;
    public final bxo0 c;
    public final String d;
    public final tn7 e;

    public ixo0(boolean z, String str, bxo0 bxo0Var, String str2, tn7 tn7Var) {
        str.getClass();
        str2.getClass();
        this.f15552a = z;
        this.b = str;
        this.c = bxo0Var;
        this.d = str2;
        this.e = tn7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixo0)) {
            return false;
        }
        ixo0 ixo0Var = (ixo0) obj;
        return this.f15552a == ixo0Var.f15552a && Intrinsics.d(this.b, ixo0Var.b) && Intrinsics.d(this.c, ixo0Var.c) && Intrinsics.d(this.d, ixo0Var.d) && this.e.equals(ixo0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(Boolean.hashCode(this.f15552a) * 31, 31, this.b);
        bxo0 bxo0Var = this.c;
        return this.e.hashCode() + ua80.b((iB + (bxo0Var == null ? 0 : bxo0Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("TaxesUiState(isVisible=", ", titleTax=", this.b, this.f15552a, ", taxSumUiModel=");
        sbQ.append(this.c);
        sbQ.append(", betTooltipTitle=");
        sbQ.append(this.d);
        sbQ.append(", betTooltipState=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
