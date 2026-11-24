package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mip0 {
    public static final lip0 Companion = new lip0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21855a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final b5p0 g;
    public final String h;
    public final b5p0 i;
    public final String j;

    public /* synthetic */ mip0(int i, Integer num, String str, Integer num2, Integer num3, Integer num4, String str2, b5p0 b5p0Var, String str3, b5p0 b5p0Var2, String str4) {
        if ((i & 1) == 0) {
            this.f21855a = null;
        } else {
            this.f21855a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = b5p0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = b5p0Var2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mip0)) {
            return false;
        }
        mip0 mip0Var = (mip0) obj;
        return Intrinsics.d(this.f21855a, mip0Var.f21855a) && Intrinsics.d(this.b, mip0Var.b) && Intrinsics.d(this.c, mip0Var.c) && Intrinsics.d(this.d, mip0Var.d) && Intrinsics.d(this.e, mip0Var.e) && Intrinsics.d(this.f, mip0Var.f) && Intrinsics.d(this.g, mip0Var.g) && Intrinsics.d(this.h, mip0Var.h) && Intrinsics.d(this.i, mip0Var.i) && Intrinsics.d(this.j, mip0Var.j);
    }

    public final int hashCode() {
        Integer num = this.f21855a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b5p0 b5p0Var = this.g;
        int iHashCode7 = (iHashCode6 + (b5p0Var == null ? 0 : b5p0Var.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b5p0 b5p0Var2 = this.i;
        int iHashCode9 = (iHashCode8 + (b5p0Var2 == null ? 0 : b5p0Var2.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f21855a, "TeamResultsResponse(dateStart=", ", id=", this.b, ", score1=");
        rz4.y(sbN, this.c, ", score2=", this.d, ", status=");
        b1j.u(this.e, ", stringStageTitle=", this.f, ", team1=", sbN);
        sbN.append(this.g);
        sbN.append(", team1Id=");
        sbN.append(this.h);
        sbN.append(", team2=");
        sbN.append(this.i);
        sbN.append(", team2Id=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
