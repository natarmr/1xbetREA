package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class dea0 {
    public static final cea0 Companion = new cea0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5940a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ dea0(int i, Boolean bool, Long l, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f5940a = null;
        } else {
            this.f5940a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
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
        if (!(obj instanceof dea0)) {
            return false;
        }
        dea0 dea0Var = (dea0) obj;
        return Intrinsics.d(this.f5940a, dea0Var.f5940a) && Intrinsics.d(this.b, dea0Var.b) && Intrinsics.d(this.c, dea0Var.c) && Intrinsics.d(this.d, dea0Var.d) && Intrinsics.d(this.e, dea0Var.e) && Intrinsics.d(this.f, dea0Var.f);
    }

    public final int hashCode() {
        Long l = this.f5940a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f5940a, "PlayerTransfersTeamResponse(feedId=", ", name=", this.b, ", teamImageS3=");
        f140.v(sbS, this.c, ", role=", this.d, ", roleGroup=");
        sbS.append(this.e);
        sbS.append(", hasStat=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
