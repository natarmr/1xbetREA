package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38219a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public vxu0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        ohs0.z(str, str2, str3, str4, str7);
        str8.getClass();
        str9.getClass();
        this.f38219a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxu0)) {
            return false;
        }
        vxu0 vxu0Var = (vxu0) obj;
        return Intrinsics.d(this.f38219a, vxu0Var.f38219a) && Intrinsics.d(this.b, vxu0Var.b) && Intrinsics.d(this.c, vxu0Var.c) && Intrinsics.d(this.d, vxu0Var.d) && Intrinsics.d(this.e, vxu0Var.e) && Intrinsics.d(this.f, vxu0Var.f) && Intrinsics.d(this.g, vxu0Var.g) && Intrinsics.d(this.h, vxu0Var.h) && Intrinsics.d(this.i, vxu0Var.i) && this.j == vxu0Var.j && this.k == vxu0Var.k && this.l == vxu0Var.l;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f38219a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.l) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("WalletMoneyUiState(title=", this.f38219a, ", balanceTitle=", this.b, ", balanceAmount=");
        f140.v(sbN, this.c, ", inputValue=", this.d, ", helperText=");
        f140.v(sbN, this.e, ", inputErrorText=", this.f, ", transferAmountTitle=");
        f140.v(sbN, this.g, ", transferAmountValue=", this.h, ", actionButtonText=");
        brm0.C(this.i, ", actionButtonEnabled=", ", autoFocus=", sbN, this.j);
        return ohs0.p(", isLoading=", Separators.RPAREN, sbN, this.k, this.l);
    }
}
