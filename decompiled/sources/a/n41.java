package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n41 {
    public static final m41 Companion = new m41();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22876a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;
    public final Double h;
    public final String i;

    public /* synthetic */ n41(int i, Long l, Integer num, Integer num2, Long l2, Long l3, String str, String str2, Double d, String str3) {
        if ((i & 1) == 0) {
            this.f22876a = null;
        } else {
            this.f22876a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n41)) {
            return false;
        }
        n41 n41Var = (n41) obj;
        return Intrinsics.d(this.f22876a, n41Var.f22876a) && Intrinsics.d(this.b, n41Var.b) && Intrinsics.d(this.c, n41Var.c) && Intrinsics.d(this.d, n41Var.d) && Intrinsics.d(this.e, n41Var.e) && Intrinsics.d(this.f, n41Var.f) && Intrinsics.d(this.g, n41Var.g) && Intrinsics.d(this.h, n41Var.h) && Intrinsics.d(this.i, n41Var.i);
    }

    public final int hashCode() {
        Long l = this.f22876a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.h;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f22876a, "AggregatorJackpotResponse(campaignId=", ", iterationId=", ", status=");
        cs0.w(this.c, this.d, ", secondsToStart=", ", secondsToEnd=", sbQ);
        rz4.v(this.e, ", name=", this.f, ", currentJackpot=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", totalAmountJackpots=");
        sbQ.append(this.h);
        sbQ.append(", currency=");
        return axq.n(sbQ, this.i, Separators.RPAREN);
    }
}
