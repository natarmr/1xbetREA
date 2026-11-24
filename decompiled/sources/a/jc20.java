package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jc20 implements ad20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16256a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final hg7 j;

    public jc20(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, String str5, String str6, hg7 hg7Var) {
        cs0.x(str, str2, str3, str5);
        this.f16256a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = str6;
        this.j = hg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc20)) {
            return false;
        }
        jc20 jc20Var = (jc20) obj;
        return Intrinsics.d(this.f16256a, jc20Var.f16256a) && Intrinsics.d(this.b, jc20Var.b) && this.c == jc20Var.c && Intrinsics.d(this.d, jc20Var.d) && this.e.equals(jc20Var.e) && this.f == jc20Var.f && this.g == jc20Var.g && Intrinsics.d(this.h, jc20Var.h) && this.i.equals(jc20Var.i) && this.j == jc20Var.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(ua80.b(this.f16256a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShowMakeBetResult(betSum=", this.f16256a, ", coefficient=", this.b, ", balanceId=");
        kng0.z(sbN, this.c, ", symbol=", this.d);
        w6x.z(", betNumber=", this.e, ", isShowSum=", sbN, this.f);
        hne.u(", isAvailablePossibleWinTax=", ", snackBarTitle=", this.h, sbN, this.g);
        sbN.append(", possibleWinSum=");
        sbN.append(this.i);
        sbN.append(", betModeModel=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
