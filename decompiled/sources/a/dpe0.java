package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dpe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6463a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;

    public dpe0(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        cs0.x(str, str2, str4, str5);
        this.f6463a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpe0)) {
            return false;
        }
        dpe0 dpe0Var = (dpe0) obj;
        return Intrinsics.d(this.f6463a, dpe0Var.f6463a) && Intrinsics.d(this.b, dpe0Var.b) && this.c.equals(dpe0Var.c) && Intrinsics.d(this.d, dpe0Var.d) && this.e == dpe0Var.e && Intrinsics.d(this.f, dpe0Var.f) && this.g == dpe0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f6463a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ReferralUserUiModel(referralNetworkSize=", this.f6463a, ", invitedUserId=", this.b, ", invitedUserRegistrationDate=");
        f140.v(sbN, this.c, ", invitedUserProfit=", this.d, ", invitedUserProfitTextColor=");
        kng0.w(this.e, ", invitedUserCountBets=", this.f, ", deleted=", sbN);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
