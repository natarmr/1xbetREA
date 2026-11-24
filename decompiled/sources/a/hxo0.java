package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13820a;
    public final String b;
    public final axo0 c;
    public final String d;
    public final tn7 e;

    public hxo0(boolean z, String str, axo0 axo0Var, String str2, tn7 tn7Var) {
        str.getClass();
        str2.getClass();
        this.f13820a = z;
        this.b = str;
        this.c = axo0Var;
        this.d = str2;
        this.e = tn7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxo0)) {
            return false;
        }
        hxo0 hxo0Var = (hxo0) obj;
        return this.f13820a == hxo0Var.f13820a && Intrinsics.d(this.b, hxo0Var.b) && Intrinsics.d(this.c, hxo0Var.c) && Intrinsics.d(this.d, hxo0Var.d) && this.e.equals(hxo0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(Boolean.hashCode(this.f13820a) * 31, 31, this.b);
        axo0 axo0Var = this.c;
        return this.e.hashCode() + ua80.b((iB + (axo0Var == null ? 0 : axo0Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("TaxesUiState(isVisible=", ", titleTax=", this.b, this.f13820a, ", taxSumUiModel=");
        sbQ.append(this.c);
        sbQ.append(", betTooltipTitle=");
        sbQ.append(this.d);
        sbQ.append(", betTooltipState=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
