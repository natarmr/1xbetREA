package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ic20 implements zc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14515a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final gnb0 h;
    public final hg7 i;
    public final String j;
    public final String k;

    public ic20(String str, String str2, long j, String str3, String str4, boolean z, String str5, gnb0 gnb0Var, hg7 hg7Var, String str6, String str7) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f14515a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = gnb0Var;
        this.i = hg7Var;
        this.j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic20)) {
            return false;
        }
        ic20 ic20Var = (ic20) obj;
        return Intrinsics.d(this.f14515a, ic20Var.f14515a) && Intrinsics.d(this.b, ic20Var.b) && this.c == ic20Var.c && Intrinsics.d(this.d, ic20Var.d) && Intrinsics.d(this.e, ic20Var.e) && this.f == ic20Var.f && Intrinsics.d(this.g, ic20Var.g) && Intrinsics.d(this.h, ic20Var.h) && this.i == ic20Var.i && this.j.equals(ic20Var.j) && Intrinsics.d(this.k, ic20Var.k);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(ua80.b(rw2.b(ua80.b(this.f14515a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        gnb0 gnb0Var = this.h;
        int iB2 = ua80.b((this.i.hashCode() + ((iB + (gnb0Var == null ? 0 : gnb0Var.hashCode())) * 31)) * 31, 31, this.j);
        String str = this.k;
        return iB2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShowMakeBetResult(betSum=", this.f14515a, ", coefficient=", this.b, ", balanceId=");
        kng0.z(sbN, this.c, ", symbol=", this.d);
        w6x.z(", betNumber=", this.e, ", isShowSum=", sbN, this.f);
        sbN.append(", snackBarTitle=");
        sbN.append(this.g);
        sbN.append(", possibleWinInfoModel=");
        sbN.append(this.h);
        sbN.append(", betModeModel=");
        sbN.append(this.i);
        sbN.append(", optiCoef=");
        sbN.append(this.j);
        return rw2.o(sbN, ", shareText=", this.k, Separators.RPAREN);
    }
}
