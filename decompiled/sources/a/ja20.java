package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ja20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16168a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final gnb0 g;
    public final String h;
    public final String i;

    public ja20(String str, String str2, long j, String str3, String str4, boolean z, gnb0 gnb0Var, String str5, String str6) {
        cs0.x(str, str2, str3, str4);
        this.f16168a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = gnb0Var;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja20)) {
            return false;
        }
        ja20 ja20Var = (ja20) obj;
        return Intrinsics.d(this.f16168a, ja20Var.f16168a) && Intrinsics.d(this.b, ja20Var.b) && this.c == ja20Var.c && Intrinsics.d(this.d, ja20Var.d) && Intrinsics.d(this.e, ja20Var.e) && this.f == ja20Var.f && Intrinsics.d(this.g, ja20Var.g) && Intrinsics.d(this.h, ja20Var.h) && Intrinsics.d(this.i, ja20Var.i);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(ua80.b(rw2.b(ua80.b(this.f16168a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        gnb0 gnb0Var = this.g;
        int iHashCode = (iE + (gnb0Var == null ? 0 : gnb0Var.hashCode())) * 31;
        String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShowSuccess(betSum=", this.f16168a, ", coefficient=", this.b, ", balanceId=");
        kng0.z(sbN, this.c, ", symbol=", this.d);
        w6x.z(", betNumber=", this.e, ", isShowSum=", sbN, this.f);
        sbN.append(", possibleWinInfoModel=");
        sbN.append(this.g);
        sbN.append(", optiCoef=");
        sbN.append(this.h);
        return rw2.o(sbN, ", shareText=", this.i, Separators.RPAREN);
    }
}
