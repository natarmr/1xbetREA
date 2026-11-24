package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nne0 {
    public static final mne0 Companion = new mne0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new o6e0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f23817a;
    public final Double b;
    public final Double c;
    public final String d;
    public final List e;

    public /* synthetic */ nne0(int i, Double d, Double d2, Double d3, String str, List list) {
        if ((i & 1) == 0) {
            this.f23817a = null;
        } else {
            this.f23817a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nne0)) {
            return false;
        }
        nne0 nne0Var = (nne0) obj;
        return Intrinsics.d(this.f23817a, nne0Var.f23817a) && Intrinsics.d(this.b, nne0Var.b) && Intrinsics.d(this.c, nne0Var.c) && Intrinsics.d(this.d, nne0Var.d) && Intrinsics.d(this.e, nne0Var.e);
    }

    public final int hashCode() {
        Double d = this.f23817a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralNetworkInfoResponse(userBalance=");
        sb.append(this.f23817a);
        sb.append(", userFullBalance=");
        sb.append(this.b);
        sb.append(", userHoldBalance=");
        ua80.w(sb, this.c, ", referralUrl=", this.d, ", referralUsersData=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
