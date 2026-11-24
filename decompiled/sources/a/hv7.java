package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hv7 {
    public static final gv7 Companion = new gv7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13712a;
    public final Long b;
    public final Long c;
    public final Double d;
    public final Double e;
    public final Double f;

    public /* synthetic */ hv7(int i, Integer num, Long l, Long l2, Double d, Double d2, Double d3) {
        if ((i & 1) == 0) {
            this.f13712a = null;
        } else {
            this.f13712a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv7)) {
            return false;
        }
        hv7 hv7Var = (hv7) obj;
        return Intrinsics.d(this.f13712a, hv7Var.f13712a) && Intrinsics.d(this.b, hv7Var.b) && Intrinsics.d(this.c, hv7Var.c) && Intrinsics.d(this.d, hv7Var.d) && Intrinsics.d(this.e, hv7Var.e) && Intrinsics.d(this.f, hv7Var.f);
    }

    public final int hashCode() {
        Integer num = this.f13712a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f;
        return iHashCode5 + (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f13712a, this.b, "BetsSummaryInfo(count=", ", startDate=", ", endDate=");
        sbM.append(this.c);
        sbM.append(", betsSum=");
        sbM.append(this.d);
        sbM.append(", payoutWithSellSum=");
        sbM.append(this.e);
        sbM.append(", unsettledSum=");
        sbM.append(this.f);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
