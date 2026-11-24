package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cpe0 {
    public static final bpe0 Companion = new bpe0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4741a;
    public final String b;
    public final String c;
    public final Double d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ cpe0(int i, Double d, Integer num, Integer num2, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f4741a = null;
        } else {
            this.f4741a = str;
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
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpe0)) {
            return false;
        }
        cpe0 cpe0Var = (cpe0) obj;
        return Intrinsics.d(this.f4741a, cpe0Var.f4741a) && Intrinsics.d(this.b, cpe0Var.b) && Intrinsics.d(this.c, cpe0Var.c) && Intrinsics.d(this.d, cpe0Var.d) && Intrinsics.d(this.e, cpe0Var.e) && Intrinsics.d(this.f, cpe0Var.f);
    }

    public final int hashCode() {
        String str = this.f4741a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ReferralUserResponse(referralNetworkSize=", this.f4741a, ", invitedUserId=", this.b, ", invitedUserRegistrationDate=");
        sbN.append(this.c);
        sbN.append(", invitedUserProfit=");
        sbN.append(this.d);
        sbN.append(", invitedUserCountBets=");
        return ua80.l(sbN, this.e, ", deleted=", this.f, Separators.RPAREN);
    }
}
