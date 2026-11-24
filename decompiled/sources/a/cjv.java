package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cjv {
    public static final bjv Companion = new bjv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4477a;
    public final Integer b;
    public final Long c;
    public final String d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ cjv(int i, Boolean bool, Integer num, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f4477a = null;
        } else {
            this.f4477a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjv)) {
            return false;
        }
        cjv cjvVar = (cjv) obj;
        return Intrinsics.d(this.f4477a, cjvVar.f4477a) && Intrinsics.d(this.b, cjvVar.b) && Intrinsics.d(this.c, cjvVar.c) && Intrinsics.d(this.d, cjvVar.d) && Intrinsics.d(this.e, cjvVar.e) && Intrinsics.d(this.f, cjvVar.f);
    }

    public final int hashCode() {
        String str = this.f4477a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "GuiltyGearRoundResponse(finishType=", this.f4477a, ", round=", ", time=");
        rz4.v(this.c, ", winnerName=", this.d, ", typeOfWin=", sbP);
        sbP.append(this.e);
        sbP.append(", firstTeamWin=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
