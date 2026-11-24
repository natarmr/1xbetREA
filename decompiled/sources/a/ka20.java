package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ka20 implements ma20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17943a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final q4f g;
    public final en7 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;

    public ka20(String str, String str2, long j, String str3, String str4, String str5, q4f q4fVar, en7 en7Var, String str6, boolean z, boolean z2, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        q4fVar.getClass();
        this.f17943a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = q4fVar;
        this.h = en7Var;
        this.i = str6;
        this.j = z;
        this.k = z2;
        this.l = str7;
        this.m = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka20)) {
            return false;
        }
        ka20 ka20Var = (ka20) obj;
        return Intrinsics.d(this.f17943a, ka20Var.f17943a) && Intrinsics.d(this.b, ka20Var.b) && this.c == ka20Var.c && Intrinsics.d(this.d, ka20Var.d) && Intrinsics.d(this.e, ka20Var.e) && Intrinsics.d(this.f, ka20Var.f) && this.g == ka20Var.g && Intrinsics.d(this.h, ka20Var.h) && Intrinsics.d(this.i, ka20Var.i) && this.j == ka20Var.j && this.k == ka20Var.k && Intrinsics.d(this.l, ka20Var.l) && Intrinsics.d(this.m, ka20Var.m);
    }

    public final int hashCode() {
        int iB = rw2.b(ua80.b(this.f17943a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iB2 = vqd.b(this.g, ua80.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31);
        en7 en7Var = this.h;
        int iHashCode2 = (iB2 + (en7Var == null ? 0 : en7Var.hashCode())) * 31;
        String str3 = this.i;
        int iE = brm0.e(brm0.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j), 31, this.k);
        String str4 = this.l;
        int iHashCode3 = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShowSuccess(betSum=", this.f17943a, ", coefficient=", this.b, ", balanceId=");
        kng0.z(sbN, this.c, ", possibleWinTitle=", this.d);
        f140.v(sbN, ", possibleWinSum=", this.e, ", symbol=", this.f);
        sbN.append(", couponTypeModel=");
        sbN.append(this.g);
        sbN.append(", betSystemModel=");
        sbN.append(this.h);
        w6x.z(", betNumber=", this.i, ", isShowSum=", sbN, this.j);
        hne.u(", isAvailablePossibleWinTax=", ", optiCoef=", this.l, sbN, this.k);
        return rw2.o(sbN, ", shareText=", this.m, Separators.RPAREN);
    }
}
