package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gk6 {
    public static final fk6 Companion = new fk6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11430a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final hl6 f;
    public final di6 g;
    public final sm6 h;

    public /* synthetic */ gk6(int i, String str, String str2, String str3, String str4, String str5, hl6 hl6Var, di6 di6Var, sm6 sm6Var) {
        if ((i & 1) == 0) {
            this.f11430a = null;
        } else {
            this.f11430a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = hl6Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = di6Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = sm6Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk6)) {
            return false;
        }
        gk6 gk6Var = (gk6) obj;
        return Intrinsics.d(this.f11430a, gk6Var.f11430a) && Intrinsics.d(this.b, gk6Var.b) && Intrinsics.d(this.c, gk6Var.c) && Intrinsics.d(this.d, gk6Var.d) && Intrinsics.d(this.e, gk6Var.e) && Intrinsics.d(this.f, gk6Var.f) && Intrinsics.d(this.g, gk6Var.g) && Intrinsics.d(this.h, gk6Var.h);
    }

    public final int hashCode() {
        String str = this.f11430a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        hl6 hl6Var = this.f;
        int iHashCode6 = (iHashCode5 + (hl6Var == null ? 0 : hl6Var.hashCode())) * 31;
        di6 di6Var = this.g;
        int iHashCode7 = (iHashCode6 + (di6Var == null ? 0 : di6Var.hashCode())) * 31;
        sm6 sm6Var = this.h;
        return iHashCode7 + (sm6Var != null ? sm6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetBuilderMatchInfoDetailResponse(tournamentStage=", this.f11430a, ", matchFormat=", this.b, ", seriesScore=");
        f140.v(sbN, this.c, ", unplayedBalls=", this.d, ", tennisSetsCountDescription=");
        sbN.append(this.e);
        sbN.append(", seeds=");
        sbN.append(this.f);
        sbN.append(", location=");
        sbN.append(this.g);
        sbN.append(", weather=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
