package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44607a;
    public final String b;
    public final String c;
    public final boolean d;

    public zm5(String str, String str2, String str3, boolean z) {
        this.f44607a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static zm5 a(zm5 zm5Var, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = zm5Var.f44607a;
        }
        if ((i & 2) != 0) {
            str2 = zm5Var.b;
        }
        if ((i & 4) != 0) {
            str3 = zm5Var.c;
        }
        if ((i & 8) != 0) {
            z = zm5Var.d;
        }
        return new zm5(str, str2, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm5)) {
            return false;
        }
        zm5 zm5Var = (zm5) obj;
        return Intrinsics.d(this.f44607a, zm5Var.f44607a) && Intrinsics.d(this.b, zm5Var.b) && Intrinsics.d(this.c, zm5Var.c) && this.d == zm5Var.d;
    }

    public final int hashCode() {
        String str = this.f44607a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", showBalance=", Separators.RPAREN, b1j.n("BalanceStateModel(money=", this.f44607a, ", currency=", this.b, ", balanceName="), this.d);
    }
}
